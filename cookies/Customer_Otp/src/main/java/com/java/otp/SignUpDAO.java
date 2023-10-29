package com.java.otp;

import java.sql.SQLException;

public interface SignUpDAO {
	String createUser(SignUp signup) throws ClassNotFoundException, SQLException;
}
