package entity;

import java.util.HashSet;
import java.util.Set;

/**
 *@auth 饶婷婷
 *@time 2019年5月2日下午4:34:27
 */
public class Grade {
	
	private Long gid;//班级编号
	private String gname;//班级名称
	private Set<Student> stus=new HashSet<Student>();

    public Grade() {
	}
	public Grade(Long i, String gname) {
		super();
		this.gid = i;
		this.gname = gname;
	}
	public Set<Student> getStus() {
		return stus;
	}
	public void setStus(Set<Student> stus) {
		this.stus = stus;
	}
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	@Override
	public String toString() {
		return "Grade [gid=" + gid + ", gname=" + gname + "]";
	}
	

}
