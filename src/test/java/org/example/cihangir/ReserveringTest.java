package org.example.cihangir;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReserveringTest {

    @Test
    void EersteTest() {

        ArrayList<LocalTime> openingstijden = new ArrayList<LocalTime>( );

        LocalTime localTime = LocalTime.parse("22:45:30",
                DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(localTime);

    }
}
