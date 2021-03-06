/**
 *@Generated by sagacity-quickvo 4.6
 */
package com.sagframe.sqltoy.showcase.vo;

import java.sql.Timestamp;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;

import com.sagframe.sqltoy.showcase.vo.base.AbstractIdentityTableVO;

/**
 * @project sqltoy-showcase
 * @author zhongxuchen
 * @version 1.0.0
 * Table: SQLTOY_IDENTITY_TABLE,Remark:单主键验证表 	
 */
@SqlToyEntity
public class IdentityTableVO extends AbstractIdentityTableVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3553475895990060653L;
	
	/** default constructor */
	public IdentityTableVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public IdentityTableVO(Integer id)
	{
		this.id=id;
	}


	/** full constructor */
	public IdentityTableVO(Integer id,String name,Timestamp createTime)
	{
		this.id=id;
		this.name=name;
		this.createTime=createTime;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
    @Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public IdentityTableVO clone() {
		try {
			return (IdentityTableVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
