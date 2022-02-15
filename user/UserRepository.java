package project_1.user;


import java.util.HashMap;
import java.util.Map;

/**
 * UserRepository <br>
 * �䱸���׿� ��õ� ��������� ���� <br>
 * static�� HashMap�� �ϳ��� �����ؼ� <br>
 * UserRepository ��ü�� = UserRepository.getInstance(); �� ��� <br>
 * ������ ���� �Ұ�
 * @author User
 *
 */
public class UserRepository {
	
	private static final Map<String, User> userList = new HashMap<String, User>(); //static
	//������ ��� �Ұ�
	private UserRepository() {
		userList.put("admin", new User("admin","1234",true));
		userList.put("root", new User("root","1111",false));
		userList.put("adminstrator", new User("adminstrator","12345",true));
	}
	private static UserRepository instance = new UserRepository(); //static
//	private static final UserRepository instance = new UserRepository(); //static


	/**
	 * getInstance�θ� UserRepository �ҷ����� ����
	 * @return
	 */
	public static UserRepository getInstance() {
		if (instance == null) {
			instance = new UserRepository();
		}
		return instance;
		
	}
	

	
	/**
	 * id�� ������ �ش� User��ü�� ��ȯ
	 * @param id
	 * @return
	 */
	public User findByKey(String id) {
		return userList.get(id);
	}

}
