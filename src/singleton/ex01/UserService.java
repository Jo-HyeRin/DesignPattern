package singleton.ex01;

public class UserService {
	public void 회원가입() {
		UserDao dao = new UserDao();
		dao.save();
	}
	public void 회원목록보기() {
		UserDao dao = new UserDao();
		dao.findAll();
	}
}


// 1. UserDao, UserService를 private로 잠근다. 생성자를 만들고 생성자도 private로 잠근다.
// 2. UserService 메서드에서 dao를 new 하지 않고 생성한 getter 소환해서 이용한다.