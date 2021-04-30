# RabbitMQ work queue
RabbitMQ is a message broker (queue) that supports a number of different programming languages (Java, Python, C# etc.)   
This is the video demo repository for a work queue implementation using RabbitMQ.  
The work queue pattern involves a producer that is writing to a buffer, and multiple consumers that compete to read (consume) messages from the buffer.  
This is useful in situations where consumers need to perform certain operations with the received data and load balancing is needed.  

## Links
Java client library can be found [here](https://www.rabbitmq.com/tutorials/tutorial-one-java.html).  
Tutorial on the work queue itself can be found [here](https://www.rabbitmq.com/tutorials/tutorial-two-java.html).  
For the container setup, we used [LXD](https://linuxcontainers.org/).  
Youtube link [here](https://www.youtube.com/watch?v=JOWDDlzVKmc).  

## Demo breakdown
Steps to follow:
* Create containers
* Install prerequisites (Java, RabbitMQ, Java client library)
* Create (admin) user account on the host running the server (here, the publisher)
* Update consumer source code with publisher's IP address
* Push source code to containers
* Compile and run
