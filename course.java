package lab_2;

public class course {
	private String coursename;
	private String didian;
	private String time;
	private String courseteacher;
	
	public course(String coursename,String didian,String time,String courseteacher){
	
		this.coursename=coursename;
		this.didian=didian;
		this.time=time;
		this.courseteacher=courseteacher;
		
	}

	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename=coursename;
	}
	public String getDidian() {
		return didian;
	}
	public void setDidian(String didian) {
		this.didian=didian;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time=time;
	}
	public String getCourseteacher() {
		return courseteacher;
	}
	public void setCourseteacher(String courseteacher) {
		this.courseteacher=courseteacher;
	}

	@Override
	public String toString() {
		return "学课程名：" + coursename+ "\n" + "地点：" + didian+ "\n" + "时间：" + time+ "\n" + "授课老师:"
				+ courseteacher ;
	}

}