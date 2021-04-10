package com.digitalinnovation.config;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import static com.digitalinnovation.constants.HeroesConstant.ENDPOINT_DYNAMO;
import static com.digitalinnovation.constants.HeroesConstant.REGION_DYNAMO;

public class HeroesData {
  public static void main(String[] args) throws Exception {

    AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
      .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(ENDPOINT_DYNAMO,REGION_DYNAMO))
      .build();
    DynamoDB dynamoDB = new DynamoDB(client);

    Table table = dynamoDB.getTable("Heroes_Table");

    Item hero = new Item()
      .withPrimaryKey("id", "2")
      .withString("name", "Batman")
      .withString("universe", "dc comics")
      .withNumber("films", 2);
    
    Item hero2 = new Item()
    	      .withPrimaryKey("id", "3")
    	      .withString("name", "Superman")
    	      .withString("universe", "dc comics")
    	      .withNumber("films", 2);
    
    Item hero3 = new Item()
  	      .withPrimaryKey("id", "4")
  	      .withString("name", "Shazam")
  	      .withString("universe", "dc comics")
  	      .withNumber("films", 2);
    
    Item hero4 = new Item()
    	      .withPrimaryKey("id", "5")
    	      .withString("name", "Capitão América")
    	      .withString("universe", "marvel")
    	      .withNumber("films", 2);
    
    Item hero5 = new Item()
    	      .withPrimaryKey("id", "6")
    	      .withString("name", "Homem de Ferro")
    	      .withString("universe", "marvel")
    	      .withNumber("films", 2);
    
    Item hero6 = new Item()
  	      .withPrimaryKey("id", "7")
  	      .withString("name", "Thor")
  	      .withString("universe", "marvel")
  	      .withNumber("films", 2);
    
    
 

    PutItemOutcome outcome1 = table.putItem(hero);
    PutItemOutcome outcome2 = table.putItem(hero2);
    PutItemOutcome outcome3 = table.putItem(hero3);
    PutItemOutcome outcome4 = table.putItem(hero4);
    PutItemOutcome outcome5 = table.putItem(hero5);
    PutItemOutcome outcome6 = table.putItem(hero6);
  
  }

}