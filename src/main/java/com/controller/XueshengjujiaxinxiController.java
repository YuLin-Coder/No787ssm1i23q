package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.XueshengjujiaxinxiEntity;
import com.entity.view.XueshengjujiaxinxiView;

import com.service.XueshengjujiaxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 学生居家信息
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
@RestController
@RequestMapping("/xueshengjujiaxinxi")
public class XueshengjujiaxinxiController {
    @Autowired
    private XueshengjujiaxinxiService xueshengjujiaxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,XueshengjujiaxinxiEntity xueshengjujiaxinxi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			xueshengjujiaxinxi.setXueshenghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<XueshengjujiaxinxiEntity> ew = new EntityWrapper<XueshengjujiaxinxiEntity>();
		PageUtils page = xueshengjujiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengjujiaxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,XueshengjujiaxinxiEntity xueshengjujiaxinxi, HttpServletRequest request){
        EntityWrapper<XueshengjujiaxinxiEntity> ew = new EntityWrapper<XueshengjujiaxinxiEntity>();
		PageUtils page = xueshengjujiaxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, xueshengjujiaxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( XueshengjujiaxinxiEntity xueshengjujiaxinxi){
       	EntityWrapper<XueshengjujiaxinxiEntity> ew = new EntityWrapper<XueshengjujiaxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( xueshengjujiaxinxi, "xueshengjujiaxinxi")); 
        return R.ok().put("data", xueshengjujiaxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(XueshengjujiaxinxiEntity xueshengjujiaxinxi){
        EntityWrapper< XueshengjujiaxinxiEntity> ew = new EntityWrapper< XueshengjujiaxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( xueshengjujiaxinxi, "xueshengjujiaxinxi")); 
		XueshengjujiaxinxiView xueshengjujiaxinxiView =  xueshengjujiaxinxiService.selectView(ew);
		return R.ok("查询学生居家信息成功").put("data", xueshengjujiaxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        XueshengjujiaxinxiEntity xueshengjujiaxinxi = xueshengjujiaxinxiService.selectById(id);
        return R.ok().put("data", xueshengjujiaxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        XueshengjujiaxinxiEntity xueshengjujiaxinxi = xueshengjujiaxinxiService.selectById(id);
        return R.ok().put("data", xueshengjujiaxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengjujiaxinxiEntity xueshengjujiaxinxi, HttpServletRequest request){
    	xueshengjujiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengjujiaxinxi);

        xueshengjujiaxinxiService.insert(xueshengjujiaxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengjujiaxinxiEntity xueshengjujiaxinxi, HttpServletRequest request){
    	xueshengjujiaxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(xueshengjujiaxinxi);

        xueshengjujiaxinxiService.insert(xueshengjujiaxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengjujiaxinxiEntity xueshengjujiaxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(xueshengjujiaxinxi);
        xueshengjujiaxinxiService.updateById(xueshengjujiaxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        xueshengjujiaxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<XueshengjujiaxinxiEntity> wrapper = new EntityWrapper<XueshengjujiaxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xueshenghao", (String)request.getSession().getAttribute("username"));
		}

		int count = xueshengjujiaxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
