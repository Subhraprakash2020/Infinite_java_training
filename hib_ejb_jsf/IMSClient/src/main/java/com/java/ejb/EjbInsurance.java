package com.java.ejb;

import java.util.List;

import javax.naming.NamingException;

public class EjbInsurance {
	public List<Insurance> showEjbInsurance() throws NamingException{
		InsuranceBeanRemote remote = RemoteHelper.lookupRemoteStatelessEmploy();
		return remote.showInsurance();
	}
}
