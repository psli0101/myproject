package oo.test2;

public class PhoneMember extends Member {
	private String phone;
	private boolean verified;

	public PhoneMember() {
		
	}

	public PhoneMember(String name) {
		super(name);
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

}
