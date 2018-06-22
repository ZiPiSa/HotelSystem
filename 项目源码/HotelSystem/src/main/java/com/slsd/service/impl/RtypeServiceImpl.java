package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.RtypeDao;
import com.slsd.entity.Rtype;
import com.slsd.service.RtypeService;
@Service("rtypeService")//通常作用在业务层
public class RtypeServiceImpl implements RtypeService {
	@Resource
	private RtypeDao rtypeDao;
	public List<Rtype> getAllRtype() {
		List<Rtype> rtype=rtypeDao.getAllRtype();
		return rtype;
	}

	public Rtype getRtypeById(int rtypeId) {
		Rtype rtype=rtypeDao.getRtypeById(rtypeId);
		return rtype;
	}

	public boolean addRtype(Rtype rtype) {
		int row=rtypeDao.addRtype(rtype);
		return row>0?true:false;
	}

	public boolean editRtype(Rtype rtype) {
		int row=rtypeDao.editRtype(rtype);
		return row>0?true:false;
	}

	public boolean delRtype(int rtypeId) {
		int row=rtypeDao.delRtype(rtypeId);
		return row>0?true:false;
	}

}
