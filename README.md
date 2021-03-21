# contract-first-sample
A sample project for contract first approach using OAS

### Description of the project

This project is a simple representation of contract first approach using open api specification.
We have created the contract first, then generated the client and server (interface only) code using the ``openapi-generator-maven-plugin``.
We have implemented the server side code in the service code (contract-first) and then used the generated client side code in consuming the service (sample-client).

### How to run
1. Clone the repository.
2. Run the ContractFirstApplication.java file
3. Then run the SampleClientApplication.java file
4. Download and import the postman collection
5. Hit the get-client-products endpoint
