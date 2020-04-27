# Different Ways of Iterating over a HashMap in Java

This is a simple Java project which demonstrates the various ways in which we can iterate over the
keys in a HashMap. We'll look at the following five methods:

1. Using the Iterator that comes in the Collection framework
2. Using the forEach loop on the HashMap's keySet
3. Using the forEachRemaining loop on the HashMap's iterator
4. Converting the keySet into a stream and then using forEach loop
5. Converting the keySet into an array, creating a stream from that array, and then using the 
forEach loop

There are examples and code snippets for the first methods in the code.

# Running the project

Once you clone this repo, ```cd``` into the project root directory and run the following command to compile and build this maven project:

```shell script
mvn clean install
```

Once you run this command, Maven will build the project and keep it in the ```/target``` directory in the project root directory.
You can run the program using the command below:

```shell script
java -jar target/hashmap_iteration_poc-1.0-SNAPSHOT.jar
```
