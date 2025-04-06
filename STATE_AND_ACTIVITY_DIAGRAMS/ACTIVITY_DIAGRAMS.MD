## Activity Diagrams

### Marking Attendance 

flowchart TD
    A((Start))
    B[Mark Attendance Menu]
    C[Select Class]
    D{Is Valid Class?}
    E[Select Students]
    F[Mark Attendance]
    G[Save]
    H[Submit]
    I[Update Database]
    J[Confirm Success]
    K((End))
    
    A --> B
    B --> C
    C --> D
    D -- Yes --> E
    D -- No --> C
    E --> F
    F --> G
    G --> H
    H --> I
    I --> J
    J --> K
