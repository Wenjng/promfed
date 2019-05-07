package com.wen.promfed.model;

import java.time.*;
import lombok.*;

@Setter
@Getter
@RequiredArgsConstructor(staticName = "of")
public class Race {
    Double raceId;
    String description;
    LocalDate eventDate;
    LocalTime startTime;
    Duration duration;
    String place;
    ZoneId zoneId;
}
