## System Requirements

1.Use Case: Mark Attendance 

Actor:  Teacher

Precondition:  Teacher is logged in.

Postcondition:  Students Attendance is marked of the current date 

Basic Flow: 
1.	Teacher logs into the system.
2.	Navigates to the attendance marking section.
3.	Selects the class or student list for the current date.
4.	Marks students as present or absent.
5.	Saves the attendance record.
6.	System updates attendance records.

Alternative Flows:	Exceptions may be that the System is unable to capture attendance, or the teacher selects a future or wrong date.



2. Use Case: Register User

Actor: Administrator

Precondition: Administrator is logged in. 

Postcondition: User profiles are registered, and an email notification is sent to the new with user account details.

Basic flow:
1.	Inputs user details (name, role, contact info, etc.).
2.	Assigns system privileges based on the user role.
3.	Saves the user profile.
4.	System sends an email notification with login credentials.

Alternative Flows:  Username may be in use

3. Use Case: Del User

Actor: Administrator

Precondition: Administrator is logged in. 

Postcondition: User profile has been deleted. 

1.	Searches for the user in the system.
2.	Confirms user deletion.
3.	System removes user and restricts access.

Alternative Flows:  The wrong account may be deleted

4. Use Case: View Report 

Actor: The Teacher, Principal, Student, Administrator, Parent, Department of Education. 

Precondition: User is logged into the system. 

Postcondition: Actor is able to view or download the attendance reports based on their user privileges. 

Basic Flow:
1.	Navigates to the Reports section.
2.	Selects report type.
3.	System retrieves and displays the report.
4.	User can view, download, or print the report based on privileges.

Alternative Flows:  User may not have privileges to view reports.


5. Use Case: View Student Profile 

Actor: Teacher and Administrator 

Precondition: Actor is logged in and has searched for the student

Postcondition: View the Student in questions profile

Basic Flow:
1.	Actor navigates to the student search section.
2.	Inputs search criteria.
3.	System retrieves the student profile.
4.	User selects a student to view full details.

Alternative Flows:  Student of profile not found error.


6. Use Case: Search Students 

Actor: Teacher, Administrator 

Precondition: Actor has logged in

Postcondition: Found the Student's profile in question 

Basic Flow:
1.	Actor navigates to the student search page.
2.	Enters search criteria.
3.	System retrieves and displays matching students.
4.	User selects a student to view profile or attendance records.

Alternative Flows:  Student may not be registered on the system.

7. Use Case: View Graph 

Actor: The Principal, Administrator and Department of Education 

Precondition: Has navigated to the view report use case

Postcondition: A graphical display of attendance patterns. 

Basic Flow:
1.	Actor navigates to the Reports section.
2.	Selects "View Graph" option.
3.	System generates a graph of attendance trends.
4.	User can analyse patterns and export the graph if needed.

Alternative Flows:  No data found error.


8. Use Case: Modify Attendance 

Actor: Teacher and Administrator

Precondition: Actor is logged in. 

Postcondition: Students Attendance has been modified.

Basic Flow:
1.	Actor navigates to the attendance modification page.
2.	Searches for a student or date where correction is needed.
3.	Updates attendance record.
4.	Saves the changes.
5.	System updates attendance records.

Alternative Flows: Teacher may not have permissions set correctly and may be unable to modify.

