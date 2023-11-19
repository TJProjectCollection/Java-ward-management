/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 22014687
 * Student ID: {type your id here}
 * Class: {type your class here}
 * Date/Time created: Saturday 31-12-2022 19:28
 */

/**
 * @author 22014687
 *
 */
public class Patient {
	private String nric4;
	private String name;
	private String ward;
	private int bed;
	private String dateWarded;
	private String dateDischarged;
	private int visitorCount;
	
	public Patient(String nric4,String name,String ward,int bed,String dateWarded,String dateDischarged,int visitorCount) {
		this.nric4=nric4;
		this.name=name;
		this.ward=ward;
		this.bed=bed;
		this.dateWarded=dateWarded;
		this.dateDischarged=dateDischarged;
		this.visitorCount=visitorCount;
	}
	public Patient(String nric4,String name,String ward,int bed,String dateWarded) {
		this.nric4=nric4;
		this.name=name;
		this.ward=ward;
		this.bed=bed;
		this.dateWarded=dateWarded;
		this.dateDischarged="";
		this.visitorCount=0;
	}
	public String getNric4(){
		return nric4;
	}
	public String getName(){
		return name;
	}
	public String getWard(){
		return ward;
	}
	public int getBed() {
		return bed;
	}
	public String getDateWarded(){
		return dateWarded;
	}
	
	public String getDateDischarged(){
		return dateDischarged;
	}
	public void setDateDischarged(String dateDischarged) {
		this.dateDischarged=dateDischarged;
	}
	
	public int getvisitorCount() {
		return visitorCount;
	}
	public void setvisitorCount(int visitorCount) {
		this.visitorCount=visitorCount;
	}
	public void display() {
		String output = String.format("%-15s : %-15s \n","Patient Name", name);
		output += String.format("%-15s : %-15s \n","Ward", ward);
		output += String.format("%-15s : %-15d \n","Bed", bed);
		output += String.format("%-15s : %-15s \n","Date Warded", dateWarded);
		output += String.format("%-15s : %-15s \n","Date discharged", dateDischarged);
		output += String.format("%-15s : %-15d \n","No of visitor(s)", visitorCount);
		System.out.println(output);
	}
}

