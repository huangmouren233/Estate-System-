package pojo;

public class fangchan {
	String houseid;
	String roomtype;
	String address;
	String year;
	String area;
	String sales;
	String status;
	String agentid;
	String userid;
	
	public String getHouseid() {
		return houseid;
	}

	public void setHouseid(String houseid) {
		this.houseid = houseid;
	}

	public String getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAgentid() {
		return agentid;
	}

	public void setAgentid(String agentid) {
		this.agentid = agentid;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public fangchan(String roomtype, String address, String year, String area, String sales, String status,
			String agentid, String userid) {
		super();
		this.roomtype = roomtype;
		this.address = address;
		this.year = year;
		this.area = area;
		this.sales = sales;
		this.status = status;
		this.agentid = agentid;
		this.userid = userid;
	}



}	
