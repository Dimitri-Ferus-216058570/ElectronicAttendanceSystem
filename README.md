# Electronic Attendance System

In education, accurately tracking student attendance is crucial for monotoring academic performance, ensuring students safety and maintaining institutional accountability. Traditional methods of marking attendance have become time consuming and an expensive exercise which may be prone to errors. The proposed system will be used to electronically mark attendance of students in order to eliminate errors, eliminate costs in regard to providing space for records, streamlining the attendance marking process, provide easily accessible reports and records related to attendance and promoting accountability among staff and students.  The system can provide a centralised point for retreiving data in regard to attendance, assist the education department in compiling statistics and providing the broader country in showing transparency over the attendance of school going students in South Africa.

## Link to Activity and state transition diagrams folder:
[State_Transition_Activity_Diagrams](STATE_AND_ACTIVITY_DIAGRAMS/)

## Link to Domain Model Documentation:
[Domian_Model_Documentation](DOMAIN_MODEL_DOCS/).

## Justification for Generics in Repository 

Choosing the generics eliminates the need to write CRUD methods for every class. This also ensures that all entities behave in a consistent manner and when adding new entities there will be no need to rewrite the logic. Another reason is that new methods can be added in one place and all other classes will inherit it automatically. 

## Justification for Factory over DI 

Making use of the factory method fits in with the current small size of the project because its simpler and lighter.  There are also no extra libraries needed such as with Dependency Injection which usually needs heavy frameworks which adds complexity.  Factories can easily be extended when new storage types need to be added without making changes to the rest of the application. It is also more understandable because I have had experience making use of the factory method.

