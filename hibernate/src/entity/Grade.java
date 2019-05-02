package entity;

import java.util.HashSet;
import java.util.Set;

/**
 *@auth ������
 *@time 2019��5��2������4:34:27
 */
public class Grade {
	
	private Long gid;//�༶���
	private String gname;//�༶����
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
