package com.sda.demo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDTO {

    private String name;
    private String value;
    private Integer year;
    private Boolean clever;

    /**
     * To String method.
     *
     * @return String
     */
    @Override
    public String toString() {
        return "RequestDTO{"
                + "name='" + name + '\''
                + ", value='" + value + '\''
                + ", year=" + year
                + ", clever=" + clever
                + '}';
    }
}
