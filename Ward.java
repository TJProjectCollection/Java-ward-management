/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 22014687
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Saturday 31-12-2022 19:27
 */

/**
 * @author 22014687
 *
 */
public class Ward {
	private String ward;
	private String description;
	private int bedCount;
	private double bedCharge;
	
	public Ward(String ward,String description, int bedCount, double bedCharge) {
		this.ward=ward;
		this.description=description;
		this.bedCount=bedCount;
		this.bedCharge=bedCharge;
	}
	
	public String getWard(){
		return ward;
	}
	public String getDescription(){
		return description;
	}
	public int getBedCount() {
		return bedCount;
	}
	public double getBedCharge() {
		return bedCharge;
	}
}
