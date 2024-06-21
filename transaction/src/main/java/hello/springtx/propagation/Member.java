package hello.springtx.propagation;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Member {

	@Id
	@GeneratedValue
	private Long id;

	private String username;

	public Member() {
	}

	public Member(String username) {
		this.username = username;
	}
}
