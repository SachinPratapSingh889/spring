package com.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AutowireWays {
    @Autowired
    @Qualifier("address2")
	private Address address;

	public AutowireWays(Address address) {
		super();
		this.address = address;
	}

	public AutowireWays() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AutowireWays [address=" + address + "]";
	}
    
}
