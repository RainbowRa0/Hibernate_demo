package entity;


public class Student {
	
	private Long sid;//学生编号
    private String sname;//学生姓名
    private String sex;//学生性别
    private String sbirthday;
    private String gid;
  
    public String getGid() {
		return gid;
	}
	public void setGid(String gid) {
		this.gid = gid;
	}
	public Student() {
		super();
	}
	public Student(Long sid, String sname, String sex) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sex = sex;
	}
	public Long getSid() {
		return sid;
	}
	public void setSid(Long sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSbirthday() {
		return sbirthday;
	}
	public void setSbirthday(String sbirthday) {
		this.sbirthday = sbirthday;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sex=" + sex + ", sbirthday=" + sbirthday + ", gid=" + gid
				+ "]";
	}
	
	
}
