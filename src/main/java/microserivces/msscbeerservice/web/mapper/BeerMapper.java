package microserivces.msscbeerservice.web.mapper;

import microserivces.msscbeerservice.domain.Beer;
import microserivces.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DataMapper.class})
public interface BeerMapper {
    BeerDto map(Beer beer);
    Beer map(BeerDto beerDto);
}
