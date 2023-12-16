package org.example.MapstructMapper;

import org.example.Entity.Pen;
import org.example.TO.PenTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Mapper
public interface PenMapStruct {
    PenMapStruct INSTANCE = Mappers.getMapper(PenMapStruct.class);
    @Mappings({
          @Mapping(target = "brand", source = "pen.brand"),
          @Mapping(target = "price", source = "pen.price", numberFormat = "#0.00"),
          @Mapping(target = "color", source = "pen.color"),
          @Mapping(target = "length", source = "pen.length", numberFormat = "#0"),
          @Mapping(target = "material", source = "pen.material"),
          @Mapping(target = "isAutoPen", source = "pen.isAutoPen"),
          @Mapping(target = "productionDate", source = "pen.productionDate", dateFormat = "yyyy-MM-dd")
    })
    PenTO transferToPenTO(Pen pen);

    List<PenTO> transferToListPenTO(List<Pen> penList);

    Set<PenTO> transferToSetPenTO(Set<Pen> penSet);

    Map<String, PenTO> transferToMapPenTO(Map<String, Pen> penMap);
}
