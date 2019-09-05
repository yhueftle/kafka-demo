The prep work to start this sample app:

- Install zookeeper and kafka on your local machine.

On Window:

- There are several ways to start zookeeper locally, for this just set the port to 2181.

- Navigate to zookeeper/bin in a cmd prompt and enter the command "zkserver" to start zookeeper using zoo.cfg info

- Navigate to kafka in a cmd prompt and enter the command ".\bin\windows\kafka-server-start.bat .\config\server.properties"
- That will start the kafka broker using server.properties.
  
- Note: if you don't have zookeeper installed you can use the following command while in kafka as it comes with the
  zookeeper goodies ".\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties"
  
- Run Application