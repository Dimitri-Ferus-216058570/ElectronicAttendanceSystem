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
### Attendance
```mermaid

```
### Modify
```mermaid

```
### Notification
```mermaid

```
### Privileges
```mermaid

```
### Report
```mermaid

```
### TeacherSearch
```mermaid

```
### UserAccount
```mermaid

```
### ViewReport
```mermaid

```
