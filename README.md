# DevAPI: API for devs registering

This project was based on the Prof. Rodrigo Peleas' ["PersonAPI"](https://github.com/rpeleias/personapi_digital_innovation_one) project, built as part of Santander Full Stack Bootcamp.

It extends its base functionalities, and includes:

* Fixed bug which allowed to update a different object from the one who had the id specified as the path parameter;
* Improved validation by trimming strings;
* Added swagger for documentation;
* Added email, linkedin and github fields;
* POST and PUT returns the created/updated object;


## Executing project on the terminal

In project's root folder, execute the following command:

```shell script
./gradlew bootRun
```

You can check the project running at the main endpoint:

```
http://localhost:8080/api/v1/devs
```

## Watch it live on Heroku

https://santander-bootcamp-devapi.herokuapp.com/api/v1/devs


