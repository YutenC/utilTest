package org.example.Test;

import org.apache.commons.beanutils.BeanUtils;
import org.example.Entity.Pen;
import org.example.MapstructMapper.PenMapStruct;
import org.example.TO.PenTO;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class MapstructEfficiencyTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Pen pen = Pen.builder()
                .brand("Pilot")
                .price(100.50)
                .color("Yellow")
                .length(15)
                .material("wood")
                .isAutoPen(false)
                .productionDate(LocalDate.of(2023, 10, 10))
                .build();

        long timeToken;

        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getTOByTraditionSet(pen);
        }
        long time2 = System.currentTimeMillis();
        timeToken = time2 - time1;
        System.out.println("Traditional Set/Get spend : " + timeToken + "(ms)");

        long time3 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            getTOByMapstruct(pen);
        }
        long time4 = System.currentTimeMillis();
        timeToken = time4 - time3;
        System.out.println("Mapstruct spend : " + timeToken + "(ms)");

        long time5 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            PenTO penTO = new PenTO();
            getTOByApacheBeanUtil(penTO ,pen);
        }
        long time6 = System.currentTimeMillis();
        timeToken = time6 - time5;
        System.out.println("Apache BeanUtil spend : " + timeToken + "(ms)");
    }

    private static PenTO getTOByTraditionSet(Pen pen) {
        return PenTO.builder()
                .brand(pen.getBrand())
                .price(pen.getPrice())
                .color(pen.getColor())
                .length(pen.getLength())
                .material(pen.getMaterial())
                .isAutoPen(pen.getIsAutoPen())
                .productionDate(pen.getProductionDate())
                .build();
    }

    private static PenTO getTOByMapstruct(Pen pen) {
        return PenMapStruct.INSTANCE.transferToPenTO(pen);
    }

    private static PenTO getTOByApacheBeanUtil(PenTO penTO ,Pen pen) throws InvocationTargetException, IllegalAccessException {
        BeanUtils.copyProperties(penTO, pen);
        return penTO;
    }
}
