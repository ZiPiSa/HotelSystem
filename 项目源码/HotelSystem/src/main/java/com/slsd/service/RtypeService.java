package com.slsd.service;

import java.util.List;

import com.slsd.entity.Rtype;

public interface RtypeService {
	/**
	 * 查询所有房屋类型
	 * @return List<Rtype>
	 */
	public List<Rtype> getAllRtype();
	/**
	 * 通过id查询
	 * @param rtypeId
	 * @return Rtype
	 */
	public Rtype getRtypeById(int rtypeId);
	/**
	 * 添加房屋类型
	 * @param rtype
	 * @return boolean
	 */
	public boolean addRtype(Rtype rtype);
	/**
	 * 编辑房屋类型
	 * @param rtype
	 * @return boolean
	 */
	public boolean editRtype(Rtype rtype);
	/**
	 * 根据id删除
	 * @param rtypeId
	 * @return boolean
	 */
	public boolean delRtype(int rtypeId);
}
