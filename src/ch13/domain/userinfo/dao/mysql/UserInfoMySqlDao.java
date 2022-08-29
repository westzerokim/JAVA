package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Inser into MySQL DB userId = " + userInfo.getUserID());
		
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB userId = " + userInfo.getUserID());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete into MySQL DB userId = " + userInfo.getUserID());
	
	}

	
}
