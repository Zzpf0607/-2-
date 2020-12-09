package lab_2;

public class renyuan {
	private int bh;
	private String name;
	private String sex;
	public renyuan(int bh,String name,String sex){
		this.bh=bh;
		this.name=name;
		this.sex=sex;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getBh() {
		return bh;
	}
	public void setBh(int bh) {
		this.bh=bh;
	}
	public String getSex() {
		return sex;
	}
	
	public void setSex(String sex) {
		this.sex=sex;
	}@Override
	public String toString() {
		return "学生： 学号：" + bh + "\n"+"姓名：" + name + "\n"+ "性别:" + sex + "\n";
	}

}
