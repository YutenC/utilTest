package org.example.Test;


import org.apache.commons.beanutils.BeanUtils;
import org.example.Entity.Pen;
import org.example.MapstructMapper.PenMapStruct;
import org.example.TO.PenTO;

import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class MapstructTest {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException {

        Pen pen = Pen.builder()
                .brand("Pilot")
                .price(100.50)
                .color("Yellow")
                .length(15)
                .material(null)
                .isAutoPen(false)
                .productionDate(LocalDate.of(2023, 10, 10))
                .build();

        PenTO penTO = getPenTOByMapStruct(pen);
//        PenTO penTO = getPenTOByTraditionalGetSet(pen);
//        PenTO penTO = new PenTO();
//        BeanUtils.copyProperties(penTO, pen);

        System.out.println(
                "This pen information :" +
                        " Brand : " + penTO.getBrand() +
                        ", Price : " + penTO.getPrice() +
                        ", Color : " + penTO.getColor() +
                        ", Length : " + penTO.getLength() +
                        ", Material : " + penTO.getMaterial() +
                        ", IsAutoPen : " + penTO.getIsAutoPen() +
                        ", Production Date : " + penTO.getProductionDate()
        );
    }

    public static PenTO getPenTOByMapStruct(Pen pen) {
        return PenMapStruct.INSTANCE.transferToPenTO(pen);
    }

    public static PenTO getPenTOByTraditionalGetSet(Pen pen) {

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
}
