package microserivces.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID id;
    @Null
    private Integer version;
    @Null
    private ZonedDateTime createdDate;
    @Null
    private ZonedDateTime lastModifiedDate;
    @NotBlank
    private String beerName;
    @NotNull
    private BeerStyle beerStyle;
    @Positive
    @NotNull
    private Long upc;
    @Positive
    @NotNull
    private BigDecimal price;
    private Integer quantityOnHand;
}
