package project_1.user;


import java.util.HashMap;
import java.util.Map;

/**
 * UserRepository <br>
 * 요구사항에 명시된 유저목록을 저장 <br>
 * static에 HashMap을 하나만 생성해서 <br>
 * UserRepository 객체명 = UserRepository.getInstance(); 로 사용 <br>
 * 생성자 생성 불가
 * @author User
 *
 */
public class UserRepository {
	
	private static final Map<String, User> userList = new HashMap<String, User>(); //static
	//생성자 사용 불가
	private UserRepository() {
		userList.put("admin", new User("admin","1234",true));
		userList.put("root", new User("root","1111",false));
		userList.put("adminstrator", new User("adminstrator","12345",true));
	}
	private static UserRepository instance = new UserRepository(); //static
//	private static final UserRepository instance = new UserRepository(); //static


	/**
	 * getInstance로만 UserRepository 불러오기 가능
	 * @return
	 */
	public static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
		
	}
	

	
	/**
	 * id를 넣으면 해당 User객체가 반환
	 * @param id
	 * @return
	 */
	public User findByKey(String id) {
		return userList.get(id);
	}

}
