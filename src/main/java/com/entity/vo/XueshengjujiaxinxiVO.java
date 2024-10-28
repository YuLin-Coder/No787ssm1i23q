package com.entity.vo;

import com.entity.XueshengjujiaxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 学生居家信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-15 11:56:39
 */
public class XueshengjujiaxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 学生姓名
	 */
	
	private String xueshengxingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
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
	 * 设置：学生姓名
	 */
	 
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
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
