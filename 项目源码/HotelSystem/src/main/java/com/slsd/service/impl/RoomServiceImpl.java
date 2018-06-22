package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.RoomDao;
import com.slsd.entity.Room;
import com.slsd.service.RoomService;
@Service("roomService")//通常作用在业务层
public class RoomServiceImpl implements RoomService {
	@Resource
	private RoomDao roomDao;
	
	public List<Room> getAllRoom() {
		List<Room> rlist=roomDao.getAllRoom();
		return rlist;
	}

	public Room getRoomById(int roomId) {
		Room room=roomDao.getRoomById(roomId);
		return room;
	}

	public boolean addRoom(Room room) {
		int row=roomDao.addRoom(room);
		return row>0?true:false;
	}

	public boolean editRoom(Room room) {
		int row=roomDao.editRoom(room);
		return row>0?true:false;
		
	}

	public boolean delRoom(int roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Room> page(int pageStart, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
