All Creational Patterns were implemented and the Project board was updated. Methods behaviour has not yet been completed, but will be added as the functions are completed. Some changes were made as to how reports will be constructed, the attendance marking function has also been altered in order to implement the logic of the design patterns.

## API
API with controllers to conduct CRUD operations was created for Student, Teacher, Administratror, Parent and User classes.  This was achieved by making use of Springboot and the rest api was successfully implimented.

### API Bugs
There was a bug when starting the application.  When checking http://localhost:8080/docs it did not have anything to display. The error stemmed from not having the API folder under the org.example folder, which meant it could not pick up the controller classes. This was rectified by moving the api package into the org.example package
 
