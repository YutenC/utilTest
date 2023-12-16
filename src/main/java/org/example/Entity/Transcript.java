package org.example.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Enum.Subject;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transcript { //成績單

    private Subject subject; //科目

    private Integer score;
}
