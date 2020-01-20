package microserivces.msscbeerservice.web.mapper;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.*;

@Component
public class DataMapper {
    public ZonedDateTime asZonedDateTime(Timestamp ts) {
        if (ts == null) {
            return null;
        }
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(ts.getTime()), ZoneOffset.UTC);
    }

    public Timestamp asTimestamp(ZonedDateTime offsetDateTime) {
        if (offsetDateTime == null) {
            return null;
        }
        return Timestamp.from(offsetDateTime.withZoneSameInstant(ZoneOffset.UTC).toInstant());
    }
}
