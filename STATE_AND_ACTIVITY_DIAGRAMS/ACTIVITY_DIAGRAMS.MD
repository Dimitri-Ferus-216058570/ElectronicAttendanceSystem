## Activity Diagrams

### Marking Attendance

```mermaid
flowchart TD
  %% Teacher Swimlane
  subgraph Teacher [Teacher Actions]
      T0((Start))
      T1[Mark Attendance Menu]
      T2[Select Class]
      T3[Select Students]
      T4[Mark Attendance]
      T5[Save]
      T6[Submit]
      T_end((End))
  end

  %% System Swimlane
  subgraph System [System Processes]
      D[Is Valid Class?]
      S1[Update Database]
      S2[Confirm Success]
  end

  %% Flow Connections
  T0 --> T1
  T1 --> T2
  T2 --> D
  D -- Yes --> T3
  D -- No --> T2
  T3 --> T4
  T4 --> T5
  T5 --> T6
  T6 --> S1
  S1 --> S2
  S2 --> T_end
```

### Create Report 

```mermaid
flowchart TD
    %% Admin Actions
    subgraph Admin [Admin]
      A((Start))
      A --> B[Logged In]
      B --> C[Attendance Menu]
      C --> D[Create Report]
    end

    %% System Processes
    subgraph System [System]
      D --> E[Display Report Creation Page]
      E --> F[Input Report Parameters]
      F --> G{Valid Parameters?}
      G -- Yes --> H[Display Report]
      G -- No --> E
      H --> I[Download/Export]
      I --> J[Choose Format]
      J --> K[Export]
      K --> L((End))
    end
```

## Display Report as a Graph
```mermaid
flowchart TD
    %% Admin Actions
    subgraph Admin [Admin]
      A[Logged In]
      B[Attendance Menu]
      C[Create Report]
    end

    %% System Processes
    subgraph System [System]
      D[Display Report Creation Page]
      E[Input Report Parameters]
      F{Valid Parameters?}
      G[Display Report]
      H[Choose Visual Display Format]
      I[Chooses Graph]
      J[Renders Graph]
      K[View Graph]
    end

    %% Flow Connections
    A --> B
    B --> C
    C --> D
    D --> E
    E --> F
    F -- No --> D
    F -- Yes --> G
    G --> H
    H -- Yes --> I
    I --> J
    J --> K
    K --> L((End))
```

### Assign Privileges
```mermaid
flowchart TD
  %% Admin Work
  subgraph Admin [Admin]
    A[Start]
    B[Log In]
    C[User Management Page]
    D[Select Modify User]
    E[Select User]
    F[Modify User]
    G[Assign Privileges]
  end

  %% System Work
  subgraph System [System]
    H[Display Users]
    I[Display User Information]
    J[Update Privileges]
    K[Notify User]
  end

  %% Process Flow
  A --> B
  B --> C
  C --> D
  %% Admin initiates modify user which triggers a system action:
  D -- "Request user list" --> H
  H -- "Return list" --> E
  E -- "User selected" --> I
  I -- "Show details" --> F
  F --> G
  %% Privileges assignment triggers system update and notification:
  G -- "Submit privileges" --> J
  J --> K
  K --> L((End))
```
### Register a New User
```mermaid
flowchart TD
  %% Admin Work
  subgraph Admin [Admin]
    A[Start]
    B[Log In]
    C[User Management Page]
    D[Select Modify User]
    E[Select User]
    F[Modify User]
    G[Assign Privileges]
  end

  %% System Work
  subgraph System [System]
    H[Display Users]
    I[Display User Information]
    J[Update Privileges]
    K[Notify User]
  end

  %% Process Flow
  A --> B
  B --> C
  C --> D
  %% Admin initiates modify user which triggers a system action:
  D -- "Request user list" --> H
  H -- "Return list" --> E
  E -- "User selected" --> I
  I -- "Show details" --> F
  F --> G
  %% Privileges assignment triggers system update and notification:
  G -- "Submit privileges" --> J
  J --> K
  K --> L((End))
```
### Search for a Student
```mermaid
flowchart TD
  %% Admin Work
  subgraph Admin [Admin]
    A[Start]
    B[Log In]
    C[User Management Page]
    D[Select Modify User]
    E[Select User]
    F[Modify User]
    G[Assign Privileges]
  end

  %% System Work
  subgraph System [System]
    H[Display Users]
    I[Display User Information]
    J[Update Privileges]
    K[Notify User]
  end

  %% Process Flow
  A --> B
  B --> C
  C --> D
  %% Admin initiates modify user which triggers a system action:
  D -- "Request user list" --> H
  H -- "Return list" --> E
  E -- "User selected" --> I
  I -- "Show details" --> F
  F --> G
  %% Privileges assignment triggers system update and notification:
  G -- "Submit privileges" --> J
  J --> K
  K --> L((End))
```
### Update an Attendance Record
```mermaid
flowchart TD
  %% Teacher Lane
  subgraph Teacher [Teacher Actions]
      T1((Start))
      T2[Attendance Menu]
      T3[Input Search Parameters]
      T4[Open Student Profile]
      T5[Update Attendance]
      T_end((End))
  end

  %% System Lane
  subgraph System [System Processes]
      S1[Search Page]
      D[If valid User?]
      S2[Display User Profile]
  end

  %% Flow Connections
  T1 --> T2
  T2 -- "Initiate Search" --> S1
  S1 --> T3
  T3 --> D
  D -- Yes --> T4
  D -- No --> S1
  T4 --> S2
  S2 --> T5
  T5 --> T_end
```
