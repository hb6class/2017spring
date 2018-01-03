package com.hb.model;

public class GuestDaoImpl implements GuestDao {

	@Override
	public void listDao() {
		System.out.println("LIST Dao run...");
	}

	@Override
	public void addDao() {
		System.out.println("ADD Dao run...");
	}

	@Override
	public void editDao() {
		System.out.println("EDIT Dao run...");
	}

}
