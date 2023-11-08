package controllers;

import java.util.Scanner;
import views.StudentView;

public class StudentController {
	public void start() {
    	Scanner scanner = new Scanner(System.in);
	    CampServiceController controller = new CampServiceController(CampServiceController.camps);
	    
	    StudentView view = new StudentView();
	    while (true) {
            view.displayMenuView();

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    controller.campStudentService.viewAllCamps(null, null, null);
                    break;
                case 2: 
                	controller.campStudentService.viewAllCampsWithFilters();
                	break;
                case 3:
                	controller.campStudentService.registerCamp();
                    break;
                case 4:
                	controller.campStudentService.withdrawCamp();
                    break;
                case 5:
                	controller.campStudentService.viewRemainingSlots();
                    break;
                case 6:
                	controller.campStudentService.registerAsCommittee();
                    break;
                case 7:
                	controller.campStudentService.withdrawFromCommittee();
                    break;
                case 8:
                	controller.campStudentService.viewRegisteredCamps();
                    break;
                case 9: 
                	controller.campStudentService.submitEnquiry();
                	break;
                case 10: 
                	controller.campStudentService.viewEnquiries();
                	break;
                case 11: 
                	controller.campStudentService.editEnquiry();
                	break;
                case 12: 
                	controller.campStudentService.deleteEnquiry();
                	break;
                case 13: 
                	controller.campStudentService.viewEnquiriesForCamp();
                	break;
                case 14: 
                	controller.campStudentService.submitSuggestion();
                	break;
                default: return;
            }
        }
    }
}
