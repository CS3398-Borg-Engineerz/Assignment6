# Assignment6
## SOLID Practice

##### Overview: Explain your reasoning for reorganizing the code. How were you using the three principles? If a principle did not apply, then just say so. Please build your final solution using ANT and submit the repo via your Slack channel. 

### File: ThreeSolidMain.Java
#### Contributer: Bailey Cheung bcg73
1. Open Close - The main class is open for extension, by creating new objects of relevant classes, or whatever the engineer specifies to be done. 
2. Single Responsibility - The main class is only utilizing objects made from other classes.
3. Interface Segregartion - Interfaces are segregrated from the main portion of the program.

### File: Manager.Java
#### Contributer: Bailey Cheung bcg73
1. Open Close - The manager is open to extension by adding features that are unique to the manager but unable to be modified by the main class of the program. 
2. Single Responsibility - The manager class is responsible for one item, ie managing the worker it is set to manage.
3. Interface Segregartion - Interface is not being used here. 

### File: Robot
#### Contributer: Chance Martin c_m906
1. Open Close - Robot class is open to extension but close to modification. It solely implements the work class from the Workable interface. Nothing is dependent to it. 
If something was dependent to it, then it would have to extend the robot class, not change it.
2. Single Responsibility - The robot class only focuses on the Robot's job, keeping with single responsibility, not a job from another class.
3. Interface Segregartion - The interface is not a part of the class, but implements it, keeping with interface segregation.

### File: Worker.java
#### Contributer: Josh Armstrong JArmstrong98
1. Open Close - Worker is open to extension and allow features to be added to it that relate to the worker
2. Single Responsibility - Worker has only two classes, work and eat. The Worker class needs both of these so the file only has the Worker responsibility
3. Interface Segregartion - Worker only implements IEat and IWorker which it needs and isn't cluttered with additional implementations

### File: SuperWorker.java
#### Contributer: Josh Armstrong JArmstrong98
1. Open Close - SuperWorker is also easy to extend and structure makes it not have to be rewritten/modified
2. Single Responsibility - The SuperWorker class has only has two classes - work and eat - both of which are needed for SuperWorker. 
3. Interface Segregartion - SuperWorker implements IEat and IWorker and no other implementations because these are the only two it needs to implement.

### File: 
#### Contributer:
1. Open Close - 
2. Single Responsibility - 
3. Interface Segregartion - 
