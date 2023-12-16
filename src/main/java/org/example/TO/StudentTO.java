package org.example.TO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.Entity.BodyInfo;
import org.example.Entity.Transcript;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentTO {

    private BodyInfo bodyInfo;

    private Map<String, Transcript> transcript;
}
