package adapter.ex01;

// 고객 클레임 들어오면, 사과 이메일 보내고, 이메일 답장을 DB에 저장
// 이라는 책임을 이행하는 클래스다. 
public class CustomerService {
	
	private EmailSend email;	
	
	public CustomerService(EmailSend email) {
		this.email = email;
	}

	// 클레임 받기
	public void acceptClaim(String msg) {
		// 1. 클레임 받기
		String acceptMsg= msg;
		System.out.println("클레임 내용 : " + acceptMsg);
		
		// 2. 이메일 보내기
		sendEmail();
	}
	
	// 이메일 보내기
	public void sendEmail() {
		String result = email.send();
		insertResultEmail(result);
	}
	
	public void insertResultEmail(String result) {
		System.out.println("답장을 디비에 저장했습니다." + result);
	}
	
}


