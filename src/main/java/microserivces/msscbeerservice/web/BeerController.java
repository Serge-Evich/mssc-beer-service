package microserivces.msscbeerservice.web;

import microserivces.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@ResponseBody
@RestController
public class BeerController {
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getById(@PathVariable("beerId") UUID beerId) {
        return ResponseEntity.ok(BeerDto.builder().build());
    }

    @PostMapping
    public ResponseEntity create(@RequestBody BeerDto beerDto) {
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{beerId}")
    public ResponseEntity update(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
