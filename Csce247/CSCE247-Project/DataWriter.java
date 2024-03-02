import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



public class DataWriter extends DataConstants {

    /*Save user list to a JSON file */
    public static void saveUsers() {
UserList users = userList.getInstance();
ArrayList<User> userList = users.getUsers();
JSONArray jsonUsers = new JSONArray(); 
/*Creation of Objects in JSON */
for(int i=0; i< userList.size(); i++)
{
    jsonUsers.add(getUsersJSON(userList.get(i)));
}

/*Write the JSON file */
try (FileWriter flie = new FileWriter(User_file_name))
{
    file.write(jsonUsers.toJSONString());
    flie.flush();
}
catch(IOException e)
{
    e.printStackTrace();
}    }
    

     /*
     * Creates a JSONObject from the given User object.
     */
    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_FIRST_NAME, user.getFirstName());
        userDetails.put(USER_LAST_NAME, user.getLastName());
        userDetails.put(USER_USER_NAME, user.getUserName());
        userDetails.put(USER_PASSWORD, user.getPassword());
        userDetails.put(USER_UUID, user.getUUID());

        return userDetails;
    }

    /**
     * Saves the list of courses to a JSON file.
     */
    public static void saveCourses() {
        CourseList courses = CourseList.getInstance();
        ArrayList<Course> courseList = courses.getCourses();
        JSONArray jsonCourses = new JSONArray();

        /* Creation of Objects in JSON */
		for(int i=0; i< courseList.size(); i++) {
			jsonCourses.add(getCourseJSON(courseList.get(i)));
		}


        /*Write the JSON file*/
        try (FileWriter file = new FileWriter(COURSE_FILE_NAME)) { 
            file.write(jsonCourses.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    /*
     * Creates a JSONObject from the given Course object.
     */
    public static JSONObject getCourseJSON(Course course) {
        JSONObject courseDetails = new JSONObject();
        courseDetails.put(COURSE_NAME, course.getName().toString());
        courseDetails.put(COURSE_COURSETYPE, course.getCourseType());
        courseDetails.put(COURSE_CREDITHOUR, course.getCreditHour());
        courseDetails.put(COURSE_DESCRIPTION, course.getDescription());
        courseDetails.put(COURSE_COURSECODE, course.getCourseCode());
        courseDetails.put(COURSE_POPULARITY, course.getPopularity());
        courseDetails.put(COURSE_PASSRATE, course.getPassRate());
        courseDetails.put(COURSE_AVAILABLESEATS, course.getAvailableSeats());
        courseDetails.put(COURSE_AVAILABLILITY, course.getAvailability());
        courseDetails.put(COURSE_COMPLETESTATUS, course.getCompleteStatus());
        }
    }


