package com.entity.view;

import com.entity.JiaoshijujiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师居家信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
@TableName("jiaoshijujiaxinxi")
public class JiaoshijujiaxinxiView  extends JiaoshijujiaxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshijujiaxinxiView(){
	}
 
 	public JiaoshijujiaxinxiView(JiaoshijujiaxinxiEntity jiaoshijujiaxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshijujiaxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
