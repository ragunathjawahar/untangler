package ai.mender;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Console {
    public static <T> void printJson(T result) {
        try {
            System.out.println(toJson(result));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> String toJson(T object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper() {};

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper
                .setDefaultPrettyPrinter(new JsonPrettyPrinter())
                .writeValueAsString(object);
    }
}