package com.java.otp;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class SignUpDAOImpl implements SignUpDAO{
	PreparedStatement pst;
	Connection connection;

	@Override
	public String createUser(SignUp signup) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String pwd = EncryptPassword.getCode(signup.getCustomer_password());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDate = sdf.format(new Date(0));
		
		String cmd = "Insert into customer(customer_Firstname,customer_LastName,customer_UserName,customer_Password"
				+ "customer_Email,customer_PhoneNo,Customer_Status,Customer_ActivatedOn) values (?,?,?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, signup.getCustomer_firstname());
		pst.setString(2, signup.getCustomer_lastname());
		pst.setString(3, signup.getCustomer_username());
		pst.setString(4, pwd);
		pst.setString(5, signup.getCustomer_email());
		pst.setString(6, signup.getCustomer_email());
		pst.setString(7, "OTP PENDING");
		pst.setDate(8, signup.getCustomer_activation());
		
		pst.executeUpdate();
		return "Account create";
		
	}

}
