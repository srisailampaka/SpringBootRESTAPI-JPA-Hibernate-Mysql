# SpringBootRESTAPI-JPA-Hibernate-Mysql
This the Spring Boot Application , which creates a REST API to perform CRUD operation using MySQL<br/>
This appliation uses JPA, Hibernate.<br/>

Create the Maven Project using eclipse, then add the dependacys in pom.xml, andthen Run as/maven build.<br/>
Once code added to the Project Runas/Java Applition.

<b>1.Create:</b><br/>
POST  : http://localhost:8080/company/employees<br/>
Request:<br/>
{<br/>
  "name": "Srisailam",<br/>
  "designation": "Android Consultant",<br/>
  "expertise": "Android Expertise"<br/>
}<br/>

Response:<br/>
{<br/>
    "id": 2,<br/>
    "name": "Srisailam",<br/>
    "designation": "Android Consultant",<br/>
    "expertise": "Android Expertise",<br/>
    "createdAt": 1525577327761<br/>
}<br/>

<b>2.Read:</b><br/>
GET : http://localhost:8080/company/employees<br/>
Response:<br/>
[<br/>
    {<br/>
        "id": 1,<br/>
        "name": "varun",<br/>
        "designation": "Senior Consultant",<br/>
        "expertise": "SAP Expertise",<br/>
        "createdAt": 1525577261000<br/>
    },<br/>
    {<br/>
        "id": 2,<br/>
        "name": "Srisailam",<br/>
        "designation": "Android Consultant",<br/>
        "expertise": "Android Expertise",<br/>
        "createdAt": 1525577328000<br/>
    }<br/>
]<br/>


<b>3.Update:</b><br/>
PUT : http://localhost:8080/company/employees/1 <br/>
Request:<br/>
{<br/>
    "id": 1,<br/>
    "name": "Mahesh",<br/>
    "designation": "Senior Business Consultant",<br/>
    "expertise": "SAP Expertise"<br/>
}<br/>
Response:<br/>
{<br/>
    "id": 1,<br/>
    "name": "Mahesh",<br/>
    "designation": "Senior Business Consultant",<br/>
    "expertise": "SAP Expertise",<br/>
    "createdAt": 1525578413167v
}<br/>

<b>4.Delete:</b><br/>

DELETE : http://localhost:8080/company/employees/1<br/>
Request:<br/>
{<br/>
    "id": 1,<br/>
    "name": "Mahesh",<br/>
    "designation": "Senior Business Consultant",<br/>
    "expertise": "SAP Expertise"<br/>
}<br/>
Response:<br/>


