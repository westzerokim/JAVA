package ch13.domain.userinfo.dao.oracle;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Inser into ORACLE DB userId = " + userInfo.getUserID());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into ORACLE DB userId = " + userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into ORACLE DB userId = " + userInfo.getUserID());
		
	}

	
}
