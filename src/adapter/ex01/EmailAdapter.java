package adapter.ex01;

// 가짜 객체
public class EmailAdapter implements EmailSend{

	@Override
	public String send() {
		
		// 친구가 만들고 있는 Email 내용
		
		return "고맙습니다";
	}

}

