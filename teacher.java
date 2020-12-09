package lab_2;

public class teacher extends renyuan{
	public teacher(int bh, String name, String sex) {
		super(bh, name, sex);
		
	}  
	String shouke;
	public String getShouke() {
		return shouke;
	}
	public void setShouke(String shouke) {
		this.shouke=shouke;
	}
}
