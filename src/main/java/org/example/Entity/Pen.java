package org.example.Entity;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pen {

    private String brand;

    private Double price;

    private String color;

    private Integer length;

    private String material;

    private Boolean isAutoPen;

    private LocalDate productionDate;

}
