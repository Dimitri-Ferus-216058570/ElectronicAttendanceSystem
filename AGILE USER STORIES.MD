# User Stories

| Story ID | User Story | Acceptance Criteria | Priority |
|----------|-----------|---------------------|----------|
| US-001  | As an Administrator, I want to delete users so that I can remove inactive users and those that no longer have children in the school. | User is successfully deleted from the system. | Medium |
| US-002  | As an Administrator, I want to register users according to their roles so that they receive appropriate system privileges and do not have unauthorised access to data. | User is registered with role-based privileges. | High |
| US-003  | As a Teacher, I want to mark and update attendance so that I can keep accurate records of student attendance. | Attendance is successfully marked and updated. | High |
| US-004  | As a System, I want to compile weekly and monthly attendance reports so that administrators and stakeholders can track attendance patterns. | Reports are generated automatically on schedule. | High |
| US-005  | As a System, I want to track attendance and recognize absenteeism patterns so that we can identify students who may need intervention. | Absenteeism trends are detected and recorded. | High |
| US-006  | As a System, I want to send monthly notifications on attendance so that parents and administrators are aware of student attendance trends. | Notifications are sent automatically each month. | Medium |
| US-007  | As a Parent, I want to view my child’s attendance report so that I can monitor their attendance patterns. | Parents can access their child's attendance records. | High |
| US-008  | As an Administrator, I want to generate reports that provide meaningful insights on school attendance so that I can analyse patterns and trends, in order to make meaningful and informed decisions. | Reports are generated with detailed attendance insights. | High |
| US-009  | As a System, I want to automatically send attendance reports to the Department of Education’s mainframe so that compliance requirements are met. | Reports are successfully transmitted according to schedule. | High |
| US-010  | As a System, I want to link parent and student accounts so that parents can view relevant information about their child’s attendance and not have unauthorised access to other student details. | Parent accounts are successfully linked to student accounts. | Medium |
| US-012  | As an Administrator, I want to receive alerts about chronic absenteeism so that I can take appropriate action. | Alerts are triggered when absenteeism exceeds a certain threshold. | High |
| US-013  | As a System, I want to provide visual presentations like graphs to display attendance trends so that users can easily interpret data. | Graphs are generated for attendance reports. | Low |
| US-014  | As an Administrator, I want to export reports in different formats so that they can be viewed across various platforms. | Reports can be exported in multiple formats such as pdf, docx, etc. | Medium |
| US-015  | As a User, I want to search for students by grade, date range, or class so that I can quickly retrieve attendance records. | Search functionality returns relevant student data. | Medium |
| US-016  | As a System, I want to integrate with the existing school mainframe so that data can be synchronized seamlessly. | Integration with school mainframe is successful. | High |
| US-017  | As a teacher, I want to mark student attendance so that I can keep track of student participation. | Teacher can mark attendance and system is updated successfully. | High |
| US-018  | As an admin, I want to register new users so that they can access the system with appropriate privileges. | New user account with appropriate privileges created, and email notification sent. | High |
| US-019  | As an admin, I want to delete a user, so that outdated or unauthorised accounts are removed. | Account is removed and access revoked. | Medium |
| US-020  | As a teacher, I want to view student profiles so that I can access student details quickly. | Student successfully searched and profile details displayed. | High |
| US-021  | As an admin, I want to generate reports so that I can analyse data efficiently. | Report is generated within ≤2. | High |
| US-022  | As a teacher, I want to search for a student so that I can find student details efficiently. | Search results are returned within ≤2. | High |
| US-023  | As an admin, I want to view attendance graphs so that I can analyse attendance trends visually and in a better understandable manner. | System generates an attendance graph within ≤2. | Medium |
| US-024  | As a teacher, I want to modify attendance records so that I can correct any mistakes. | Attendance record is updated and saved. | High |

# Backlog

| Story ID | User Story | Priority | Effort Estimate | Dependencies |
|----------|-----------|----------|----------------|--------------|
| US-001  | Delete User | Must have | 2 | - |
| US-002  | Register new user with privileges. | Must have | 4 | - |
| US-003  | Mark Attendance | Must have | 5 | - |
| US-004  | Compile weekly and monthly attendance reports. | Should have | 3 | US-003 |
| US-005  | Track Absenteeism patterns. | Must have | 4 | US-003, US-008 |
| US-006  | Notifications. | Should have | 2 | US-005 |
| US-007  | Parents viewing attendance report. | Should have | 2 | US-004 |
| US-008  | Administrator generating reports. | Must have | 4 | US-003 |
| US-009  | System sends attendance reports to Department of Education’s mainframe. | Must have | 4 | US-008 |
| US-010  | Link parent and student accounts. | Could have | 3 | - |
| US-012  | Chronic absenteeism alerts. | Must have | 4 | US-003, US-005, US-008 |
| US-013  | Generating graphs. | Could have | 2 | US-008 |
| US-014  | Export reports. | Could have | 2 | US-009 |
| US-015  | Search Students | Should have | 3 | US-002 |
| US-016  | Integration with the existing school mainframe. | Must have | 5 | US-009 |
| US-017  | Mark Attendance | Must have | 5 | - |
| US-018  | Register user with privileges. | Must have | 4 | - |
| US-019  | Delete accounts. | Must have | 3 | - |
| US-020  | View Student profiles | Should have | 2 | - |
| US-021  | Generate reports. | Must have | 3 | US-003 |
| US-022  | Teacher searching students. | Must have | 3 | - |
| US-023  | View attendance graphs. | Could have | 2 | US-009, US-008 |
| US-024  | Modify Attendance. | Should have | 3 | US-003 |

# Sprint Backlog

| Task ID | Task Description | Assigned To | Estimated Hours | Status |
|---------|-----------------|-------------|----------------|--------|
| T-001   | Develop Attendance Marking Feature | Dev Team | 20 | To Do |
| T-002   | Develop functionality to generate reports | Dev Team | 10 | To Do |
| T-003   | Develop Search API endpoint | Dev Team | 15 | To Do |
| T-004   | Develop alerts for chronic absenteeism | Dev Team | 10 | To Do |
| T-005   | Create a portal for parents to view student profiles | Dev Team | 8 | To Do |
| T-006   | Implement system logic to track chronic absenteeism | Dev Team | 17 | To Do |

# Reflection
Some of the challenges that were faced was pinpointing which tasks should be prioritized above which. It may also become a problem in when taking other stakeholders of the project into consideration. With more stakeholders it will become difficult to balance all parties involved, needs. Some stakeholders may not be happy that tasks related to them may have a lower priority than they had envisioned for the project. It also become apparent that estimating the time needs for tasks may become difficult to juggle especially if you are a novice in the field of programming and completing projects. It may also be problematic to sort tasks according to MoSCoW’s prioritisation. While tasks may seem critical to certain stakeholders, that may not be true of the objective of the project. It may also be hard establish whether certain tasks are a real need for the project. While a task may be critical to the completion of the project in may not take much time to implement. Another consideration should be the skill of the project team. The more skilled the team the faster milestones may be achieved. This also highlights the motivation or morale of the project team. If the team is highly motivated it my help speed up the progress of a project, but if the project encounters many obstacles it may cause the team to lose focus and not perform optimally. In regard to agile vs stakeholders it may be a problem if stakeholders to do not understand the principles of agile development. Time Management may also be a stumbling block. If the project team is constantly being approached by stakeholders to change the features or deliverables of the project it may become impossible to complete the project in the projected time frame. This makes it important to manage stakeholder expectations and to have a process in place for requested changes. This assignment provided proved that planning is a very important step in the creation of an artefact. Creating proper user stories help to visualise a project in a meaningful manner and will help all participants understand what needs to be achieved and how the project team will go about achieving these milestones. Creating user stories will help in understanding  which who the actors in the system are and what there needs may be of the system. It assists in eliminating duplicate tasks or user stories and enables the project team to create a proper plan for the completion of the project. The project backlog enables the team to be aware of how much work the project requires. It can also assist in dividing tasks among members which they can complete at the own pace or according to the schedule that was decided on. The backlog also enables the project team to see how much work has been completed and what still needs their attention. Creating a list of tasks and user stories can assist in managing a project better and help keep the project inline with the time frame allocated to it.
