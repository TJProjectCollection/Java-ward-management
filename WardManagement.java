import java.util.ArrayList;

/*
 * I declare that this code was written by me. 
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: 
 * Student ID:
 * Class:
 * Date/Time Last modified:
 */


public class WardManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//initialise Ward array with ward objects 
		Ward[] wardArr = new Ward[4];

		//-------------------
		// Complete code here
		wardArr[0] = new Ward("A","1 Bed, attached bath/toilet",10,535.00);
		wardArr[1] = new Ward("B1","4 Bed, attached bath/toilet",20,266.43);
		wardArr[2] = new Ward("B2","6 Bed, common bath/toilet",20,83.00);
		wardArr[3] = new Ward("C","8 Bed, common bath/toilet",50,37.00);

		//-------------------



		//initialise Patient arraylist with patient objects	
		ArrayList<Patient> patientList = new ArrayList<Patient>();

		//-------------------
		// Complete code here
		patientList.add(new Patient("111A","John Lee","A", 2, "01/12/2022"));
		patientList.add(new Patient("222B","Mary Jane","B1", 11, "02/12/2022"));
		patientList.add(new Patient("333C","Abdul Musri","B1", 12, "03/12/2022"));
		patientList.add(new Patient("444D","Jane Tan","B2", 2, "12/12/2022","",3));
		patientList.add(new Patient("555E","Paul Tan","C", 2, "02/11/2022","",4));
		patientList.add(new Patient("666F","Paul Ng","C", 3, "03/11/2022","09/11/2022",0));
		patientList.add(new Patient("777G","Wong Kuan","C", 4, "02/12/2022"));
		//-------------------



		//display standard menu and ask for option
		int option = -99;
		publicMenu();


		//indefinite while loop
		while(option != 9) {
			boolean patientfound = true;
			option = Helper.readInt("\nEnter option or 0 for main menu > ");

			//check for  options
			if(option == 0) {
				//display main menu
				publicMenu();
			} else if (option == 1) {
				//list ward info
				displayWardInfo(wardArr);		
			} else if (option == 2) {
				//display patient in ward
				displayPatientList(patientList);
			} else if (option == 3) {
				//admit patient
				admitPatient(patientList);
			} else if (option == 4) {
				//discharged patient
				patientfound = dischargePatient(patientList);
			} else if (option == 5) {
				//Remove patient visit
				patientfound = removePatient(patientList);
			} else if (option == 6) {
				//register visit
				patientfound = registerVisit(patientList);
			} else if (option == 7) {
				//End visit
				patientfound = endVisit(patientList);
			} else if (option == 8) {
				//Ward overview
				displayWardOverview(patientList, wardArr);
			} else if (option == 9) {
				//log out
				System.out.println("\nGood bye!");
			} else {
				//invalid option chosen
				System.out.println("\n*** Invalid option selected ***\n");
			}

			//if patient does not exist based on return boolean
			if (!patientfound) {
				System.out.println("\n*** No such patient in ward ***\n");
			}

		}

	} // end of main





	//-------------------------------------------------------------------------------------------------------
	//static method to print the standard menu 
	//-------------------------------------------------------------------------------------------------------
	public static void publicMenu() {
		System.out.println();
		Helper.line(45, "*");
		System.out.println("*****     PATIENT  MANAGEMENT  MENU     *****");
		System.out.println("1. View all Ward Info");
		System.out.println("2. Display Patient List");
		System.out.println("3. Admit Patient");
		System.out.println("4. Discharge Patient");
		System.out.println("5. Remove Patient");
		System.out.println("6. Register Visit");
		System.out.println("7. End Visit");
		System.out.println("8. Display Ward Overview");
		System.out.println("9. Logout");
		Helper.line(45, "*");

		//-------------------
		// Complete code here
		//-------------------

	}



	//-------------------------------------------------------------------------------------------------------
	//static method takes in a ward array and list out ward details in a tabular list
	//-------------------------------------------------------------------------------------------------------
	public static void displayWardInfo(Ward[] wardArr) {

		//-------------------
		// Complete code here
		Helper.line(80, "=");
		System.out.println("*****     DISPLAY WARD INFO     *****");
		//Printing header of table
		String output = String.format("%-10s %-30s %-15s %-15s\n", "Ward", "Description", "Bed Count", "Bed Charge");
		//initialize the variable output with its header 
		for (int i = 0;i<wardArr.length;i++) {
			output += String.format("%-10s %-30s %-15d %-15.2f\n",wardArr[i].getWard(),wardArr[i].getDescription(),
					wardArr[i].getBedCount(),wardArr[i].getBedCharge());}
		// Looping through the array to get the details of each ward and adding it to the output string

		System.out.println(output);
		//printing the full ward details in the format
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

	}


	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and display all the patient information in a tabular list
	//-------------------------------------------------------------------------------------------------------
	public static void displayPatientList(ArrayList<Patient> patientList) {

		//-------------------
		// Complete code here
		Helper.line(80, "=");
		System.out.println("*****     DISPLAY PATIENT LIST     *****");
		//Printing header of table
		String output = String.format("%-5s %-13s %-5s %-5s %-13s %-17s %-15s\n", "NRIC4", "Name", "Ward", "Bed", "Date warded", "Date discharged","Visitor count");
		//initialize the variable output with its header
		for (int i = 0;i<patientList.size();i++) {
			output += String.format("%-5s %-13s %-5s %-5d %-13s %-17s %-15d\n",patientList.get(i).getNric4(),patientList.get(i).getName(),
					patientList.get(i).getWard(),patientList.get(i).getBed(),patientList.get(i).getDateWarded(),
					patientList.get(i).getDateDischarged(),patientList.get(i).getvisitorCount() );}
		// Looping through the array to get the details of each patient and adding it to the output string
		System.out.println(output);
		//printing the full patient details in the format
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

	}


	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and performs the admit patient functionality
	//-------------------------------------------------------------------------------------------------------
	public static void admitPatient(ArrayList<Patient> patientList) {

		//-------------------
		// Complete code here
		Helper.line(80, "=");
		System.out.println("*****     ADMIT PATIENT     *****");
		//Printing header of table

		String nric4 = Helper.readString("Enter patient 4 digit NRIC > ");
		String PName = Helper.readString("Enter patient name > ");
		String ward = Helper.readString("Enter ward > ");
		int bed = Helper.readInt("Enter bed > ");
		String dateWarded = Helper.readString("Enter date warded > ");
		//get new patient details

		patientList.add(new Patient(nric4,PName,ward,bed,dateWarded));
		//Create a new patient object and add it to the arraylist

		patientList.get(patientList.size()-1).display();
		//Display details of newly added patient object
		System.out.println("*** Patient has been added ***");
		//Show that the patient object has been added
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

	}



	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and performs the discharge patient functionality
	//It will return 'true' if the patient record exist
	//-------------------------------------------------------------------------------------------------------
	public static boolean dischargePatient(ArrayList<Patient> patientList) {

		boolean patientfound = false;

		//-------------------
		// Complete code here
		Helper.line(80, "=");
		System.out.println("*****     DISCHARGE PATIENT     *****");
		//Printing header of table

		boolean alrdischarged = true;
		int num = 0;
		//initialize the variables
		String PName = Helper.readString("Enter patient name > ");
		//get patient name to be discharged

		for (int i=0; i < patientList.size(); i++) {
			//goes through whole patientlist to find the patient
			if (PName.equalsIgnoreCase(patientList.get(i).getName())) {
				//checks if any name matches the name given
				patientfound = true;
				//makes patient checker true
				if (patientList.get(i).getDateDischarged().equals("")) {
					//checks if patient has been discharged
					alrdischarged = false;
					//makes discharge checker false
					patientList.get(i).display();
					num = i;
					//to store the number to access the same patient outside of loop
					break;
				}}

		}
		if ((patientfound ==true)&&(alrdischarged == false)) {
			//checks for if patient was found and not yet discharged
			String date = Helper.readString("Enter date discharged > ");
			//gets date discharged
			patientList.get(num).setDateDischarged(date);
			patientList.get(num).setvisitorCount(0);
			//update the pateint details
			System.out.println("*** Patient is discharged ***");
			//tell the user that the discharge is done
		}
		else if ((patientfound ==true)&&(alrdischarged == true)) {
			//makes if condition for if patient was found but already discharged
			System.out.println("*** Patient has already been discharged ***");
			//tell the user that the patient has already been discharged
		}
		//-------------------
		Helper.line(80, "=");
		//printing footer of table
		return patientfound;
	}





	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and performs the remove patient functionality
	//It will return 'true' if the patient record exist
	//-------------------------------------------------------------------------------------------------------
	public static boolean removePatient(ArrayList<Patient> patientList) {

		boolean patientfound = false;

		//-------------------
		// Complete code here
		Helper.line(80, "=");
		System.out.println("*****     REMOVE PATIENT     *****");
		//Printing header of table

		int num = 0;
		//initialize the variables
		String PName = Helper.readString("Enter patient name > ");
		//get patiient name tobe removed from list
		for (int i=0; i < patientList.size(); i++) {
			//goes through whole patientlist to find the patient
			if (PName.equalsIgnoreCase(patientList.get(i).getName())) {
				//checks if any name matches the name given
				patientfound = true;
				//makes patient checker true
				patientList.get(i).display();
				num = i;
				//to store the number to access the same patient outside of loop
				break;
			}
		}

		if (patientfound ==true) {
			//makes sure that the patient exists
			char yesorno = Helper.readChar("Confirm deletion (y/n) > ");
			//clarifies if patient deletion to be proceeded
			if ((yesorno=='Y')||(yesorno=='y')) {
				//checks if input confirms deletion
				patientList.remove(num);
				//updates arraylist
				System.out.println("*** Patient has been deleted ***");
				//inform the user 
			}
		}
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

		return patientfound;
	}



	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and performs the register visit functionality
	//It will return 'true' if the patient record exist
	//-------------------------------------------------------------------------------------------------------
	public static boolean registerVisit(ArrayList<Patient> patientList) {

		boolean patientfound = false;

		//-------------------
		boolean alrdischarged = true;
		boolean maxvisitor = true;
		boolean maxward = true;
		//variable checkers
		int visitorallowed = 4;
		int patient = 0;
		int ward = 0;
		int maxwardcapacity = 40;
		//variable storage/ limits
		// Complete code here

		Helper.line(80, "=");
		System.out.println("*****     REGISTER VISIT     *****");
		//Printing header of table

		String PName = Helper.readString("Enter patient name > ");
		//patient name for visitor registration
		for (int i=0; i < patientList.size(); i++) {
			//searches through whole arraylist for patient
			if (PName.equalsIgnoreCase(patientList.get(i).getName())) {
				//checks if any name matches the name given
				patientfound = true;
				//turns the patient exists checker to true
				patient = i;
				//to store the number to access the same patient outside of loop
				patientList.get(i).display();
				if (patientList.get(i).getDateDischarged().equals("")) {
					//checks if patient has been discharged
					alrdischarged = false;
					//turns discharge checker false
					for(int o=0;o<patientList.size();o++) {
						//Goes through loop to get all visitors
						if (patientList.get(i).getWard().equals(patientList.get(o).getWard())) {
							//checks to see if they are of the same ward as the patient
							ward +=patientList.get(o).getvisitorCount(); 
							//adds to the total visitors of the same ward
						}
					}
					if (ward <maxwardcapacity) {
						//checks if the total visitors has reached the maximum ward capacity set
						maxward = false;
						//turns max ward checker false
						System.out.println(String.format("*** Only %d visitor(s) left till ward %s at max capacity ***", maxwardcapacity-ward,patientList.get(i).getWard()));
						//tells user how many visitors left till max capacity reached 
						if (patientList.get(i).getvisitorCount()!=4) {
							//checks if visitor limit of patient has been reached
							maxvisitor = false;
							//turns max visitor checker false
							visitorallowed = 4-patientList.get(i).getvisitorCount();
							//calculate the amount of visitor allowed
							System.out.println(String.format("*** Only %d visitor(s) allowed ***", visitorallowed));
							//tells the user the number
						}}


				}}

		}
		if ((patientfound ==true)&&(alrdischarged == true)) {
			//uses the checkers to see the patient exists and the patient has been discharged
			System.out.println("*** Patient has already been discharged ***");
			//tells the user so
		}
		else if ((patientfound ==true)&&(maxward ==true)) {
			//uses the checkers to see the patient exists and the max ward capacity has been reached
			System.out.println("*** Max ward capacity reached ***");
			//tells the user so
		}
		else if ((patientfound ==true)&&(maxvisitor ==true)) {
			//uses the checkers to see the patient exists and the max visitor per patient has reached
			System.out.println("*** No addtional visitor allowed ***");
			//tells the user so
		}
		else if (maxvisitor ==false) {
			int newvisitor = Helper.readInt("Enter number of new visitors > ");
			//get new visitors entering
			if ((visitorallowed-newvisitor >= 0)&&(ward+newvisitor <= maxwardcapacity)) {
				//makes sure that new visitors does not exceed max ward visitor capacity and patient visitor capacity
				patientList.get(patient).setvisitorCount(newvisitor+patientList.get(patient).getvisitorCount());
				//adds the new number of visitor
				System.out.println("*** Please proceed to ward ***");
			}
			else if (ward+newvisitor > maxwardcapacity) {
				//
				System.out.println("*** Total ward capacity exceeded ***");
			}
			else {
				System.out.println("*** Visitors allowed exceeded ***");
			}

		}
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

		return patientfound;
	}

	//-------------------------------------------------------------------------------------------------------
	//static method takes in a patient arraylist and performs the end visit functionality
	//It will return 'true' if the patient record exist
	//-------------------------------------------------------------------------------------------------------
	public static boolean endVisit(ArrayList<Patient> patientList) {

		boolean patientfound = false;

		//-------------------
		// Complete code here
		boolean alrdischarged = true;
		//variable checker
		int num = 0;
		int maxwardcapacity = 40;
		int ward = 0;
		//variable storage/ limits

		Helper.line(80, "=");
		System.out.println("*****     END VISIT     *****");
		//Printing header of table

		String PName = Helper.readString("Enter patient name > ");
		//patient name for ending visit
		for (int i=0; i < patientList.size(); i++) {
			//searches through whole arraylist for patient
			if (PName.equalsIgnoreCase(patientList.get(i).getName())) {
				//checks if any name matches the name given
				patientfound = true;
				//turns the patient exists checker to true
				num = i;
				//to store the number to access the same patient outside of loop
				patientList.get(i).display();
				if (patientList.get(i).getDateDischarged().equals("")) {
					//checks if patient has been discharged
					alrdischarged = false;
					//turns discharge checker false
					for(int o=0;o<patientList.size();o++) {
						//Goes through loop to get all visitors
						if (patientList.get(i).getWard().equals(patientList.get(o).getWard())) {
							//checks to see if they are of the same ward as the patient
							ward +=patientList.get(o).getvisitorCount(); 
							//adds to the total visitors of the same ward
						}
					}
				}}

		}
		if ((patientfound ==true)&&(alrdischarged == true)) {
			//uses the checkers to see the patient exists and the patient has been discharged
			System.out.println("*** Patient has already been discharged ***");
			//tells the user so
		}
		else if (patientfound ==true) {
			//uses checker to see patient exists
			int leavingvisitor = Helper.readInt("Enter number of visitor(s) leaving > ");
			//visitors leaving
			if (patientList.get(num).getvisitorCount()-leavingvisitor >= 0) {
				//makes sure visitors leaving do not exceed the actual amount of visitors that is there
				patientList.get(num).setvisitorCount(patientList.get(num).getvisitorCount()-leavingvisitor);
				//sets the new visitors
				System.out.println(String.format("*** Total number of visitors still at ward %s : %d/%d ***",patientList.get(num).getWard(),ward-leavingvisitor,maxwardcapacity));
				System.out.println(String.format("*** Number of visitor(s) still visiting patient: %d ***",patientList.get(num).getvisitorCount()));
			//tells users how many visitors are left
			}
			else {
				System.out.println("*** Visitor(s) leaving is more than visited ***");
			}

		}
		Helper.line(80, "=");
		//printing footer of table
		//-------------------

		return patientfound;
	}



	//------------------------------------------------------------------------------------------------------------
	//static method that takes in a patient arraylist, a ward array and display an overview of the ward information
	//------------------------------------------------------------------------------------------------------------
	public static void displayWardOverview (ArrayList<Patient> patientList, Ward[] wardArr) {

		//-------------------
		// Complete code here
		int Totalpatient=0;
		int Totalvisitor=0;
		int Totalbedcount=0;
		//variables to store informations

		Helper.line(67, "=");
		System.out.println("*****     DISPLAY WARD OVERVIEW     *****");
		//Printing header of table

		String output = String.format("|%-4s |%-27s |%-9s |%-8s |%-8s|\n", "Ward", "Description", "Bed Count", "Patients", "Visitors");
//creates header for the output
		for(int i =0;i<wardArr.length;i++) {
			//goes through the ward array for its details 
			int patient=0;
			int visitor=0;
			//variables to store information/needs to be reset every use thus inside loop
			for(int o=0;o<patientList.size();o++) {
				if (patientList.get(o).getWard().equals(wardArr[i].getWard())&&(patientList.get(o).getDateDischarged().equals(""))) {
					//goes through the whole patient arraylist to find patients that have the same ward as the current ward loop
					patient+=1;
					visitor+=patientList.get(o).getvisitorCount();
					Totalpatient +=1;
					Totalvisitor+=patientList.get(o).getvisitorCount();
					//increases the count of visitor and patient.
				}
			}

			output += String.format("|%-4s |%-27s |%-9d |%-8d |%-8d|\n",wardArr[i].getWard(),wardArr[i].getDescription(),
					wardArr[i].getBedCount(),patient,visitor);
			//adds the information into output
			Totalbedcount += wardArr[i].getBedCount();
			//increases total bed count
		}
		output += String.format("___________________________________________________________________\n" );
		output += String.format("%-34s |%-9s |%-8d |%-8d|","Total",Totalbedcount,Totalpatient,Totalvisitor );
		System.out.println(output);
		Helper.line(67, "=");
		//printing footer of table
		//-------------------

	}


}