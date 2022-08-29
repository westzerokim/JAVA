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
		//여기서 db를 불러온거임~
		Properties prop = new Properties();
		//이게 머냐면 key value 쌍으로 읽어들이는 페어로 읽으드릴 수 잇는 기능이 있는 객체임
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserID("12345");
		userInfo.setUserName("김서영");
		userInfo.setPassWord("동글동글");
		
		UserInfoDao userInfoDao = null;
		//클라이언프 프로그램을 만들 때 new interface type으로 선언함
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
