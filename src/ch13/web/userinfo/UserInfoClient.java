package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		

		FileInputStream fis = new FileInputStream("db.properties");
		//���⼭ db�� �ҷ��°���~
		Properties prop = new Properties();
		//�̰� �ӳĸ� key value ������ �о���̴� ���� �����帱 �� �մ� ����� �ִ� ��ü��
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setUserName("�輭��");
		userInfo.setPassWord("���۵���");
		
		UserInfoDao userInfoDao = null;
		//Ŭ���̾��� ���α׷��� ���� �� new interface type���� ������
		if(dbType.equals("ORACLE")) {
			userInfoDao = new UserInfoOracleDao();
		
		}else if(dbType.equals("MYSQL")) {
			userInfoDao = new UserInfoMySqlDao();
		}
		else {
			System.out.println("db erroe");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
	}
}
