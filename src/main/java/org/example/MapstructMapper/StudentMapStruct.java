package org.example.MapstructMapper;


import org.example.Entity.Student;
import org.example.TO.StudentTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapStruct {
    StudentMapStruct INSTANCE = Mappers.getMapper(StudentMapStruct.class);

    @Mappings({
            @Mapping(target = "bodyInfo", source = "student.bodyInfo"),
            @Mapping(target = "transcript", source = "student.transcript")
    })
    StudentTO getStudentTObyMapStruct(Student student);
}
