## Functional Test Cases

| Test Case ID | Requirement ID | Description | Steps | Expected Result |
|-------------|---------------|-------------|-------|----------------|
| TC-001 | FR-001 | Mark Attendance | 1. Teacher logs in. <br> 2. Navigates to attendance section. <br> 3. Selects class and date. <br> 4. Marks attendance. <br> 5. Saves the record. | Attendance successfully recorded and updated. |
| TC-002 | FR-002 | Register New User | 1. Admin logs in. <br> 2. Navigates to user management. <br> 3. Inputs user details. <br> 4. Assigns privileges. <br> 5. Saves user profile. | New user account created, and email notification sent. |
| TC-003 | FR-002 | Delete User | 1. Admin logs in. <br> 2. Searches for user. <br> 3. Confirms deletion. <br> 4. System removes user. | User removed and access revoked. |
| TC-004 | FR-003 | User Login | 1. User navigates to login page. <br> 2. Inputs credentials. <br> 3. System verifies and grants access. | User successfully logs in with correct privileges. |
| TC-005 | FR-004 | View Report | 1. User logs in. <br> 2. Navigates to reports section. <br> 3. Selects report type. <br> 4. Views/downloads report. | Report displayed/downloaded based on user privileges. |
| TC-006 | FR-005 | View Student Profile | 1. Actor logs in. <br> 2. Searches for student. <br> 3. Selects student profile. | Student details displayed. |
| TC-008 | FR-006 | Search Student | 1. Actor logs in. <br> 2. Enters search criteria. <br> 3. System retrieves student details. | Student profile found and displayed. |
| TC-009 | FR-008 | View Graph | 1. Actor logs in. <br> 2. Navigates to reports. <br> 3. Selects graph option. | Graph generated successfully. |
| TC-010 | FR-008 | Modify Attendance | 1. Actor logs in. <br> 2. Searches for attendance record. <br> 3. Updates record. <br> 4. Saves changes. | Attendance record updated successfully. |
| TC-011 | NFR-001 | Performance Test - Concurrent Users | 1. Simulate 1,000 users accessing the system to mark attendance. | The system should handle the load without crashing, and response time should be ≤ 2 seconds. |
| TC-012 | NFR-002 | Performance Test - Student Search | 1. User searches for a particular student. | The system should return search results in ≤ 2 seconds. |

