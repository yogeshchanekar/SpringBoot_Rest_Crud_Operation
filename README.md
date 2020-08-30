# SpringBoot_Crud_Operation

The CRUD stands for Create, Read/Retrieve, Update, and Delete. These are the four basic functions of the persistence storage.
POST: Creates a new resource
GET: Reads a resource
PUT: Updates an existing resource
DELETE: Deletes a resource

Open the Google Rest client or Postman and do the following:

Select the POST
Invoke the URL http://localhost:8080/books.
Select the Body
Select he Content-Type JSON (application/json).
Insert the data. We have inserted the following data in the Body:
{  
    "bookid": "101",  
    "bookname": "Head First Java",  
    "author": "Bert Beats and kathy Serria",  
    "price": "950"  
}   

Click on the Send
When the request is successfully executed, it shows the Status:200 OK. It means the record has been successfully inserted in the database.

Open the browser and invoke the URL http://localhost:8080/h2-console.

see the database table :- books

Open the Postman and send a GET request with the URL http://localhost:8080/books. It returns the data that we have inserted in the database.

GET request with the URL http://localhost:8080/book/{bookid}. We have specified the bookid 101.
