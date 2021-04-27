package pojo;

public class fangchanjingjiren {
	String agentid;
	String agentname;
	String agentaddress;
	String phone;
	String password;
	public fangchanjingjiren(String agentID, String agentName, String agentAddress, String phone) {
		super();
		this.agentid = agentID;
		this.agentname = agentName;
		this.agentaddress = agentAddress;
		this.phone = phone;
	}
	
	public fangchanjingjiren(String agentid, String password) {
		super();
		this.agentid = agentid;
		this.password = password;
	}

	public fangchanjingjiren(String agentID, String agentName, String agentAddress, String phone, String password) {
		super();
		this.agentid = agentID;
		this.agentname = agentName;
		this.agentaddress = agentAddress;
		this.phone = phone;
		this.password = password;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getAgentname() {
		return agentname;
	}

	public void setAgentname(String agentname) {
		this.agentname = agentname;
	}

	public String getAgentaddress() {
		return agentaddress;
	}

	public void setAgentaddress(String agentaddress) {
		this.agentaddress = agentaddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
