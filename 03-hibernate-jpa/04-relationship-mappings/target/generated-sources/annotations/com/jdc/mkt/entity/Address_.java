package com.jdc.mkt.entity;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Address.class)
public abstract class Address_ {

	public static final String ADDRESS = "address";
	public static final String ID = "id";
	public static final String STATE = "state";
	public static final String TOWNSHIP = "township";
	public static final String CUSTOMER = "customer";

	
	/**
	 * @see com.jdc.mkt.entity.Address#address
	 **/
	public static volatile SingularAttribute<Address, String> address;
	
	/**
	 * @see com.jdc.mkt.entity.Address#id
	 **/
	public static volatile SingularAttribute<Address, Integer> id;
	
	/**
	 * @see com.jdc.mkt.entity.Address#state
	 **/
	public static volatile SingularAttribute<Address, String> state;
	
	/**
	 * @see com.jdc.mkt.entity.Address
	 **/
	public static volatile EntityType<Address> class_;
	
	/**
	 * @see com.jdc.mkt.entity.Address#township
	 **/
	public static volatile SingularAttribute<Address, String> township;
	
	/**
	 * @see com.jdc.mkt.entity.Address#customer
	 **/
	public static volatile SingularAttribute<Address, Customer> customer;

}

