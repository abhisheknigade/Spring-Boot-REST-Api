We are designing a RESTful API for performing CRUD (Create, Read, Update, Delete) operations on student records. 
This API will provide endpoints to manage student data stored in a database. 
Here's a brief overview of the API:
================================================================================================================================================

GET /students:
--------------
This endpoint retrieves a list of all students.
It responds with a JSON array containing information about each student, including their ID, name, age, and other relevant details.


GET /students/{id}:
-------------------
This endpoint retrieves information about a specific student identified by their ID.
It responds with a JSON object containing detailed information about the student, such as their name, age, address, etc.


POST /students:
----------------
This endpoint allows the creation of a new student record.
It expects a JSON object containing details of the student to be created, such as name, age, address, etc.
Upon successful creation, it responds with a JSON object containing the newly created student's ID and other details.


PUT /students/{id}:
-------------------
This endpoint allows the updating of an existing student record identified by their ID.
It expects a JSON object containing updated details of the student, such as name, age, address, etc.
Upon successful update, it responds with a JSON object containing the updated student's details.


DELETE /students/{id}:
----------------------
This endpoint allows the deletion of a student record identified by their ID.
Upon successful deletion, it responds with a success message confirming the deletion of the student record.
