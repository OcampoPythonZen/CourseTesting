package code.challenge;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonNodeExample {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{\"name\": \"peter\", \"age\": \"30\"}";
        JsonNode node = mapper.readTree(jsonString);
        ((ObjectNode) node).put("id", 777);


        System.out.println(node.get("id").asInt());
        System.out.println(node.get("name").asText());
        System.out.println(node.get("age").asInt(0));
    }
}
