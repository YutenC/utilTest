package org.example.Test;

import org.example.Entity.BodyInfo;
import org.example.Entity.Student;
import org.example.Entity.Transcript;
import org.example.Enum.Sex;
import org.example.Enum.Subject;
import org.example.MapstructMapper.StudentMapStruct;
import org.example.TO.StudentTO;

import java.util.HashMap;
import java.util.Map;

public class MultipleMapStructTest {

    public static void main(String[] args) {

        BodyInfo bodyInfo = BodyInfo.builder()
                .name("Yuten")
                .height(183)
                .age(32)
                .sex(Sex.MAN)
                .weight(82)
                .build();

        Transcript chinese = Transcript.builder()
                .subject(Subject.CHINESE)
                .score(100)
                .build();

        Transcript math = Transcript.builder()
                .subject(Subject.MATH)
                .score(90)
                .build();

        Transcript english = Transcript.builder()
                .subject(Subject.ENGLISH)
                .score(98)
                .build();

        Map<String, Transcript> transcript = new HashMap<>();
        transcript.put(chinese.toString(), chinese);
        transcript.put(math.toString(), math);
        transcript.put(english.toString(), english);

        Student YUTEN = Student.builder()
                .bodyInfo(bodyInfo)
                .transcript(transcript)
                .build();

        StudentTO studentTO = getStudentTO(YUTEN);

        System.out.println(studentTO.getBodyInfo().getSex());
        System.out.println(studentTO.getTranscript().get(Subject.CHINESE.toString()));
    }

    public static StudentTO getStudentTO(Student student) {
        return StudentMapStruct.INSTANCE.getStudentTObyMapStruct(student);
    }
}
