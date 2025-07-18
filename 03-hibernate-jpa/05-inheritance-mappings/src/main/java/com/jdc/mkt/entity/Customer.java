package com.jdc.mkt.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@DiscriminatorValue("2")
public class Customer extends Account{

	@Enumerated(EnumType.STRING)
	private MemberType memberType;
	
	public Customer() {
		setAccountType(AccountType.CUSTOMER);
	}
	
	public Customer(MemberType memberType) {
		this.memberType = memberType;
		setAccountType(AccountType.CUSTOMER);
	}
	
	public enum MemberType{
		SILVER,GOLD,DIAMOND
	}
}
