/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;
import java.util.function.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;
import java.time.*; 

/**
 *
 * @author PC
 */
public class FunctionDemo {
    public static void main(String args[]){
        Function <LocalDate,LocalDateTime> plusTwoM = 
                Function.<LocalDate> identity()
                .andThen (displayDateTime(d -> d.plusMonths(2)));
        System.out.println(Stream.iterate(LocalDate.now(),d -> d.plusDays(1))
                .limit(10).map(plusTwoM).map(Object::toString).collect(joining(",")));
    }
    public static Function<LocalDate,LocalDateTime> displayDateTime(final Function<LocalDate,LocalDate> test){
        return test.andThen(d -> d.atTime(2,2));
    }
}
