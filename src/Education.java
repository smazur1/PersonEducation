
//Education.java
public class Education {

	private String school;
	private int years;


	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}

	@Override 
	public String toString() {
		String str = "School = " + school + ", years = " + years;
		return str;
	}

}
