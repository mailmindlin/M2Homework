package com.mindlin.m2hw.sql;

public class SQLForeign<E> {
	protected E obj;
	public SQLForeign(E obj) {
		this.obj = obj;
	}
	public void put(E obj) {
		this.obj = obj;
	}
	public E get() {
		return obj;
	}
}
