package project_1.authentication;

import project_1.user.User;
import project_1.user.UserRepository;

/**
 * �α��� ����, ����Ʈ ���� ���� �޼ҵ�
 * @author user
 *
 */
public class Authority {
	private UserRepository ur = UserRepository.getInstance();
	private User user = null;

	/**
	 * �α�������
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean loginAuthenticate (String id, String password) {
		if((user = ur.findByKey(id))!=null) {
			return (user.getId().equals(id)) && (user.getPassword().equals(password));
		}//end if
		return false;
	}//loginAuthenticate

	/**
	 * ����Ʈ ���� ����
	 * @param id
	 * @return
	 */
	public boolean reportAuthenticate (String id) {
		if((user = ur.findByKey(id))!=null) {
			return user.isReportAuthority();
		}//end if
		return false;
	}//reportAuthenticate 
}//class