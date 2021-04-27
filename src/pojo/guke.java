package pojo;

public class guke{
	String userid;
	String username;
	String sex;
	String idnumber;
	String phone;
	String user;
	String zhuangtai;
	String password;
	public guke(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public guke(String userid, String username, String sex, String idnumber, String phone, String user,
			String zhuangtai, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.sex = sex;
		this.idnumber = idnumber;
		this.phone = phone;
		this.user = user;
		this.zhuangtai = zhuangtai;
		this.password = password;
	}

	public guke(String userid, String username, String sex, String idnumber, String phone, String user,
			String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.sex = sex;
		this.idnumber = idnumber;
		this.phone = phone;
		this.zhuangtai="未过审";
		this.user = user;
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getZhuangtai() {
		return zhuangtai;
	}
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
