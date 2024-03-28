package dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RunDto {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        MyDto dtoObject = new MyDto(null, 20, null);
        String dtoAsString = mapper.writeValueAsString(dtoObject);
        System.out.println(dtoAsString);
    }
    
}
