package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Enum.Sex;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BodyInfo {

    private String name;
    
    private Integer height; //身高
    
    private Integer weight; //體重

    private Integer age; // 年紀

    private Sex sex; //性別
}
