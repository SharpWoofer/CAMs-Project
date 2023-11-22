
package services;

import java.util.Map;

import enums.UserRole;
import models.Student;
import stores.AuthStore;
import stores.DataStore;
import views.AuthView;

/**
 * The AuthStudentService class extends AuthService and
 * provides the login functionality for students.
 */
public class AuthCampCommitteeService extends AuthService {
    /**
     * Constructs an instance of the AuthStudentService class.
     */
    public AuthCampCommitteeService() {
        AuthView.campCommitteeLoginView();
    };

    @Override
    public boolean login(String userID, String password) {
        Map<String, Student> studentData = DataStore.getStudentData();
        Student student = studentData.get(userID);
        
        if (student == null) {
            return false;
        }

        if (authenticate(student, password) == false){
            return false;
        }

        if(student.getUserRole()!=UserRole.COMMITTEE){
            return false;
        }

        AuthStore.setCurrentUser(student);
        return true;
    }

}