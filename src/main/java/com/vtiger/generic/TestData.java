package com.vtiger.generic;

import com.github.javafaker.Faker;

public class TestData {

	/**
	 * @author Kalpana
	 *  This method will retuns the organisationname
	 * @return Organisation name
	 */

	public String getOrganisationName()
	{
		Faker fk=new Faker();
		String OrgName=fk.name().fullName();
		return OrgName;
		
	}
	/**
	 * @author Kalpana
	 * this method will returns the emailaddress
	 * @return
	 */

public String getEmail()
{
	Faker fk=new Faker();
	 String email=fk.internet().emailAddress();
	 return email;
}

}


