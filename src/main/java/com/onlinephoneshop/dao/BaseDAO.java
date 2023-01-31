package com.onlinephoneshop.dao;

import java.util.*;

public class BaseDAO<E> {
	
	protected int delete(int id) {return 0;}
	
	protected int updateEntity(E entity) {return 0;}
	
	protected int createEntity(E entity) {return 0;}
	
	protected E findEntity(int id) {return null;}
	
	protected List<E> listAllEntity(){return null;}
	
}