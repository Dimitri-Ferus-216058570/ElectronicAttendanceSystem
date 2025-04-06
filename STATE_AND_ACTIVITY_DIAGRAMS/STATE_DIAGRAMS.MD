## State Transition Diagrams

### Objects
1. Attendance
2. Modify
3. Notification
4. Privileges
5. Report
6. TeacherSearch
7. UserAccount
8. ViewReport

### Attendance

```mermaid
stateDiagram-v2
    [*] --> MarkAttendanceMenu
    MarkAttendanceMenu --> SelectClass : choose class
    SelectClass --> IsValidClass : validate selection
    IsValidClass --> SelectStudents : Yes
    IsValidClass --> SelectClass : No
    SelectStudents --> MarkAttendance : students selected
    MarkAttendance --> Save : record attendance
    Save --> Submit : confirm & save
    Submit --> UpdateDatabase : send data
    UpdateDatabase --> ConfirmSuccess : data updated
    ConfirmSuccess --> [*]
```
### Modify
```mermaid
stateDiagram-v2
    [*] --> Idle
    Idle --> SelectStudentRecord: Select Update Function
    SelectStudentRecord --> LoadingStudentDetails: Request student record
    LoadingStudentDetails --> EditRecord: Load details
    EditRecord --> ValidateUpdate: Submit changes
    ValidateUpdate --> Save: [Data is correct]
    ValidateUpdate --> UpdateError: [Error detected]
    UpdateError --> ReEnterInformation: Retry (re-enter information)
    ReEnterInformation --> EditRecord
    Save --> [*]
```
### Notification
```mermaid
stateDiagram-v2
    [*] --> AttendanceTaken

    AttendanceTaken --> AbsinteeDetected : Absentee detected?
    
    AbsinteeDetected --> SearchLinkedParent : Search for Parent Account
    SearchLinkedParent --> LoadingStudentList : Load Student List
    LoadingStudentList --> NotificationReady : Prepare Notification
    NotificationReady --> SendingNotification : Ready to send
    SendingNotification --> NotificationSent : Sent successfully
    SendingNotification --> NotificationFailed : Sending failed
    
    NotificationFailed --> Retry : Retry?
    Retry --> SearchLinkedParent : Retry finding parent
    Retry --> [*] : Retry failed
    
    NotificationSent --> [*]
```
### Privileges
```mermaid
stateDiagram-v2
    [*] --> Unassigned
    Unassigned --> Requested: Request Sent\n(Admin initiates privilege assignment)
    Requested --> Verification: Verification Process\n(System starts verification)
    Verification --> Assigned: [Valid user]\n(User role is valid)
    Verification --> Revoked: [Invalid conditions]\n(Assignment conditions not met\nor user violates rules)
    Assigned --> [*]
    Revoked --> [*]
```
### Report
```mermaid
stateDiagram-v2
    [*] --> ReportRequest
    ReportRequest --> SelectReportParameters: Admin initiates request
    SelectReportParameters --> ValidateParameters: Enter & check parameters\n[Data Found]
    ValidateParameters --> RetrieveData: Parameters valid
    RetrieveData --> DataReceived: Data retrieved
    DataReceived --> GenerateReport: Process data
    GenerateReport --> ReportReady: Report generated
    ReportReady --> ExportDecision: Admin selects export method
    ExportDecision --> DownloadSend: Download/Send Report
    ExportDecision --> ExportReport: Export Report
    DownloadSend --> [*]
    ExportReport --> [*]
```
### TeacherSearch
```mermaid
stateDiagram-v2
    [*] --> Idle
    
    Idle --> InputSearch : Initiate Search Function
    InputSearch --> Search : Submit Search Criteria
    Search --> ResultsDisplay : Results Found\n[Valid User Role]
    Search --> NoResultsFound : No Matching Data Found
    NoResultsFound --> InputSearch : Re-Input Search Criteria
    ResultsDisplay --> [*]
```
### UserAccount
```mermaid
stateDiagram-v2
    [*] --> Idle

    %% Registration Flow
    Idle --> Registration : Not registered?
    Registration --> Verification : Admin inputs user info\n(Verification email sent)
    Verification --> Verified : Email confirmed

    %% Authentication Flow
    Idle --> Authenticating : Already registered?
    Authenticating --> Login : Inputs credentials\n[Correct Credentials]
    Login --> Verified : Successfully authenticated

    %% Convergence
    Verified --> UserAccount : Account active
    UserAccount --> [*]
```
### ViewReport
```mermaid
stateDiagram-v2
    [*] --> GenerateReport
    GenerateReport --> SelectGraphType : Admin initiates report function
    SelectGraphType --> SelectParameters : Choose graph type & set parameters
    SelectParameters --> ValidateParameters : System validates parameters
    ValidateParameters --> RetrieveData : Parameters valid
    RetrieveData --> GenerateGraph : Data retrieved successfully
    GenerateGraph --> DisplayGraph : Graph is generated
    DisplayGraph --> GraphCompleted : Report displayed
    GraphCompleted --> [*]
```
