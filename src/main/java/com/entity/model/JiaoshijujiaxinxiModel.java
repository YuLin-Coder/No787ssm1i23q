package com.entity.model;

import com.entity.JiaoshijujiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 教师居家信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public class JiaoshijujiaxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 身份证号
	 */
	
	private String shenfenzhenghao;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 现在所在位置
	 */
	
	private String xianzaisuozaiweizhi;
		
	/**
	 * 紧急联系人
	 */
	
	private String jinjilianxiren;
		
	/**
	 * 联系人电话
	 */
	
	private String lianxirendianhua;
		
	/**
	 * 同住人员身体状况
	 */
	
	private String tongzhurenyuanshentizhuangkuang;
		
	/**
	 * 所在地风险等级
	 */
	
	private String suozaidifengxiandengji;
		
	/**
	 * 是否曾集中隔离
	 */
	
	private String shifoucengjizhonggeli;
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：身份证号
	 */
	 
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：现在所在位置
	 */
	 
	public void setXianzaisuozaiweizhi(String xianzaisuozaiweizhi) {
		this.xianzaisuozaiweizhi = xianzaisuozaiweizhi;
	}
	
	/**
	 * 获取：现在所在位置
	 */
	public String getXianzaisuozaiweizhi() {
		return xianzaisuozaiweizhi;
	}
				
	
	/**
	 * 设置：紧急联系人
	 */
	 
	public void setJinjilianxiren(String jinjilianxiren) {
		this.jinjilianxiren = jinjilianxiren;
	}
	
	/**
	 * 获取：紧急联系人
	 */
	public String getJinjilianxiren() {
		return jinjilianxiren;
	}
				
	
	/**
	 * 设置：联系人电话
	 */
	 
	public void setLianxirendianhua(String lianxirendianhua) {
		this.lianxirendianhua = lianxirendianhua;
	}
	
	/**
	 * 获取：联系人电话
	 */
	public String getLianxirendianhua() {
		return lianxirendianhua;
	}
				
	
	/**
	 * 设置：同住人员身体状况
	 */
	 
	public void setTongzhurenyuanshentizhuangkuang(String tongzhurenyuanshentizhuangkuang) {
		this.tongzhurenyuanshentizhuangkuang = tongzhurenyuanshentizhuangkuang;
	}
	
	/**
	 * 获取：同住人员身体状况
	 */
	public String getTongzhurenyuanshentizhuangkuang() {
		return tongzhurenyuanshentizhuangkuang;
	}
				
	
	/**
	 * 设置：所在地风险等级
	 */
	 
	public void setSuozaidifengxiandengji(String suozaidifengxiandengji) {
		this.suozaidifengxiandengji = suozaidifengxiandengji;
	}
	
	/**
	 * 获取：所在地风险等级
	 */
	public String getSuozaidifengxiandengji() {
		return suozaidifengxiandengji;
	}
				
	
	/**
	 * 设置：是否曾集中隔离
	 */
	 
	public void setShifoucengjizhonggeli(String shifoucengjizhonggeli) {
		this.shifoucengjizhonggeli = shifoucengjizhonggeli;
	}
	
	/**
	 * 获取：是否曾集中隔离
	 */
	public String getShifoucengjizhonggeli() {
		return shifoucengjizhonggeli;
	}
			
}
