## Functional Requirements

1. The system should allow users to be registered and deleted.
2. Users should be registered and given system privileges according to their role (i.e. teachers can mark attendance, parents may only view their children’s reports).
3. Teachers should be granted privileges to mark and update attendance.
4. The system should compile weekly, monthly reports on attendance.
5. The system should be able to track attendance and recognise absenteeism patterns.
6. Notifications on attendance should be sent on a month-to-month basis and patterns should be identified in the reports.
7. Users should be able to view attendance reports according to their profile privileges.
8. The system should generate reports which will allow users to gain meaningful information on school attendance.
9. The system should automatically send notifications and reports to the Department of Education’s mainframe according to their schedule.
10. The system should link parent and student accounts.
11. Alert administrators about chronic absenteeism.
12. The system should allow visual presentations such as graphs to display attendance trends.
13. Export reports in different formats to allow them to be viewed on different platforms.
14. Search students by grade, date range or class.
15. Should be able to integrate with the existing school mainframe.

## Non-Functional Requirements
### Usability: 
The user interface shall be easy to understand and navigate. It shall make use of recognition instead of recall and be flexible to use.
### Deployability: 
The system shall be primarily deployed on the Windows OS.
### Maintainability: 
Due to the system being fairly new, an API guide will be maintained for future integrations and development. Since future extensions of the system my be needed for instance facial recognition. GitHub will be used for version control and the SOLID principles will be adhered when coding the artifact.
### Scalability: 
The system should be able to support 1000-5000 users concurrently 
### Security:  
The system will be updated regularly to ensure the system and OS security software is up to date. Access shall be based on the role granted to the user. Multi-factor authentication for logins and user data shall be encrypted using AES-256.
### Performance: 
Search results shall load within 1 second. Reports shall be loaded within 5-20 seconds.

### Reflection


