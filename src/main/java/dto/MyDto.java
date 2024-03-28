package dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import jakarta.validation.constraints.NotNull;

public class MyDto {
    @JsonInclude(Include.NON_NULL)
    private String stringValue;

    private final int intValue;
    
    @NotNull(message = "Name cannot be null")
    private String name;

    public MyDto(String value1, int value2, String value3) {
        stringValue = value1;
        intValue = value2;
        name = value3;
    }

    public String getStringValue() {
        return stringValue;
    }

    public int getIntValue() {
        return intValue;
    }
    
    public String getName() {
        return name;
    }

}
