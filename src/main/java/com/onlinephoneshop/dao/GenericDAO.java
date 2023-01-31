package com.onlinephoneshop.dao;

import java.util.*;

public interface GenericDAO<E> {
	public void create(E entity);
	public void update(E entity);
	public E get(int id);
	public List<E> listAll();
	public long count();
}


