package com.entity.view;

import com.entity.JiaoshifanxiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教师返校申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
@TableName("jiaoshifanxiaoshenqing")
public class JiaoshifanxiaoshenqingView  extends JiaoshifanxiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoshifanxiaoshenqingView(){
	}
 
 	public JiaoshifanxiaoshenqingView(JiaoshifanxiaoshenqingEntity jiaoshifanxiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoshifanxiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
