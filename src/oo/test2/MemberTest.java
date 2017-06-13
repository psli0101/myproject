package oo.test2;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member("A");
		member.setAge(-100);
		System.out.println(member.getAge());
		
		PhoneMember member2 = new PhoneMember("B");
	}

}
