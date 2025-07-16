## 🧪 Selenium Automation - Reading data from Properties File
In test automation, hardcoding credentials or environment-specific data directly in the test code is bad practice. As I continue to enhance my Selenium automation skills, in this hands-on exercise, I implemented a solution using a config.properties file and a utility class (ConfigReader) to dynamically fetch data during test execution. This approach makes the framework more flexible, maintainable, and secure.

This approach made my framework:  
- Clean  
- Maintainable  
- Environment-independent  

### Project Structure:
<img width="300" alt="" src="https://github.com/user-attachments/assets/fedd3e9b-a2c3-4fb8-b858-9bb4313936f4" />

### Step 1: Create a config.properties File  
Inside: src/test/resources/configurations/config.properties  
<img width="1593" alt="" src="https://github.com/user-attachments/assets/8d62dd87-4682-4aea-945d-a34c755c49d4" />

### Step 2: Create a ConfigReader.java Utility Class  
Inside: src/test/main/utilities/ConfigReader.java
<img width="1593" alt="" src="https://github.com/user-attachments/assets/9224a304-a472-4a55-a9b8-b47adcb70cfc" />

### Step 3: Use It in the code  
In **BaseTest.java** class:  
<img width="1593" height="549" alt="" src="https://github.com/user-attachments/assets/211aa285-3ed4-4c8f-8334-6ab53b03d11b" />

In **DriverFactory.java** class
<img width="1593"  alt="" src="https://github.com/user-attachments/assets/f46e4b18-6d08-4035-bdb3-9da62cc783be" />

In test class e.g.: **LoginTest.java**  
<img width="1593" alt="" src="https://github.com/user-attachments/assets/1484070d-1150-4cba-b4d2-0cc6d3de0820" />

### Steps To Run:

1. Create and Clone the project to Selenium-Automation-Reading-data-from-Properties-File folder
    ```
    git clone https://github.com/amulsinfal/Selenium-Automation-Reading-data-from-Properties-File.git
    ```
2. Go to the folder Selenium-Automation-Reading-data-from-Properties-File containing the testng.xml file.
    ```
    cd Selenium-Automation-Reading-data-from-Properties-File
    ```
3. Open command prompt from this location and Run maven command in command prompt.
    ```
    mvn test
    ```
    <img width="958" alt="" src="https://github.com/user-attachments/assets/b3c2a3c5-3015-491f-8102-946e7cb7a7bf" />

### Learning:  
1. To create a config.properties file for storing reusable data  
2. To read property values in Java using the Properties class  
3. To integrate these values into Selenium + TestNG test scripts  
4. Best practices for managing test data and environment-specific settings  
