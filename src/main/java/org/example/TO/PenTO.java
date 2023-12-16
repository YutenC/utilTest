package org.example.TO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PenTO {

    private String brand;

    private Double price;

    private String color;

    private Integer length;

    private String material;

    private Boolean isAutoPen;

    private LocalDate productionDate;

}


