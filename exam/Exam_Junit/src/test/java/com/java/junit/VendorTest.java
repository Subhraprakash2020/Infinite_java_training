package com.java.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

import org.junit.Test;



public class VendorTest {
	
	@Test
	public void testHascode() {
		 LocalDate startLocalDate = LocalDate.of(2023, 9, 15);
	        Date start = Date.valueOf(startLocalDate);
	        Vendor vendor = new Vendor(1, "subhra", "bbsr", "ss@gmail.com", "738383838", "EL", start, 4.0, "good");
	        int result = Objects.hash(1, "subhra", "bbsr", "ss@gmail.com", "738383838", "EL", start, 4.0, "good");
	        assertEquals(result, vendor.hashCode());			
	}
	@Test
	public void testToString() {
		LocalDate startLocalDate = LocalDate.of(2023, 9, 15);
		Date start = Date.valueOf(startLocalDate);
		
		Vendor vendor = new Vendor(1, "subhra", "bbsr", "ss@gmail.com", "738383838", "EL", start, 4.0, "good");

        String result = "Vendor [vendorId=1, vendorName=subhra, vendorCity=bbsr, vendorEmail=ss@gmail.com, " +
                "vendorMobile=738383838, vendorStatus=EL, vendorStartedDate=" + start + ", vendorRating=4.0, " +
                "vendorReview=good]";
	   assertEquals(result, vendor.toString());
		
	}
	
	
	@Test
	public void testGetterSetter() {
		LocalDate startLocalDate = LocalDate.of(2023, 9, 15);
		Date start = Date.valueOf(startLocalDate);
		
		Vendor vendor = new Vendor();
		vendor.setVendorId(1);
		vendor.setVendorName("subhra");
		vendor.setVendorCity("bbsr");
		vendor.setVendorEmail("ss@gmail.com");
		vendor.setVendorMobile("738383838");
		vendor.setVendorStatus("EL");
		vendor.setVendorStartedDate(start);
		vendor.setVendorRating(4);
		vendor.setVendorReview("good");
		
		assertEquals(1, vendor.getVendorId());
		assertEquals("subhra", vendor.getVendorName());
		assertEquals("bbsr",vendor.getVendorCity());
		assertEquals("ss@gmail.com",vendor.getVendorEmail());
		assertEquals("738383838",vendor.getVendorMobile());
		assertEquals("EL",vendor.getVendorStatus());
		assertEquals(start,vendor.getVendorStartedDate());
		assertEquals(4,vendor.getVendorRating(),0);
		assertEquals("good",vendor.getVendorReview());
		
	}
	
	
	@Test
	public void testConstructor() {
		LocalDate startLocalDate = LocalDate.of(2023, 9, 15);
		
		
		Date start = Date.valueOf(startLocalDate);
		
//		Vendor vendor = new Vendor();
//		assertNotNull(vendor);
		
		Vendor vendor = new Vendor(1,"subhra","bbsr","ss@gmail.com","738383838","EL",start,4,"good");
		assertNotNull(vendor);
		assertEquals(1, vendor.getVendorId());
		assertEquals("subhra", vendor.getVendorName());
		assertEquals("bbsr",vendor.getVendorCity());
		assertEquals("ss@gmail.com",vendor.getVendorEmail());
		assertEquals("738383838",vendor.getVendorMobile());
		assertEquals("EL",vendor.getVendorStatus());
		assertEquals(start,vendor.getVendorStartedDate());
		assertEquals(4,vendor.getVendorRating(),0);
		assertEquals("good",vendor.getVendorReview());
		
	}
	
	@Test
	public void testEquals() {
        LocalDate startLocalDate = LocalDate.of(2023, 9, 15);
		
		
		Date start = Date.valueOf(startLocalDate);
		Vendor vendor1 = new Vendor(1,"subhra","bbsr","ss@gmail.com","738383838","EL",start,4,"good");
		Vendor vendor2 = new Vendor(1,"subhra","bbsr","ss@gmail.com","738383838","EL",start,4,"good");
		
		assertEquals(vendor1, vendor2);

		
		
	}
}
