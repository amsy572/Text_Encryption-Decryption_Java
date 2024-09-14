/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.function.BiFunction ;
import java.util.function.Function ;
public class JavaCurry {
public void curryfunction() {
// Create a function that adds 2 integers
BiFunction<Integer,Integer,Integer> adder = ( x, y ) -> x + y ;
Function<Integer,Function<Integer,Integer>> currier = x -> y
-> adder.apply( x,y ) ;
Function<Integer,Integer> curried = currier.apply( 5 ) ;
// To display Results
System.out.printf( "Curry : %d\n", curried.apply( 2 ) ) ;
}
public void compose() {
//Function to display the result with + 4
Function<Integer,Integer> addFour = (x) -> x + 4 ;
// function to display the result with * 5
Function<Integer,Integer> timesFive = (x) -> x * 5 ;
// to display the result with n number of times using compose
Function<Integer,Integer> compose1 = addFour.compose(timesFive);
//to display the result with add
Function<Integer,Integer> compose2 = timesFive.compose(addFour);
// TO display the end Result
System.out.printf( "Times then add: %d\n", compose1.apply( 7 ));
// ( 7 * 4 ) + 5 
System.out.printf( "Add then times: %d\n", compose2.apply( 7 ));
// ( 7 + 5 ) * 4
}
public static void main( String[] args ) {
new JavaCurry().curryfunction() ;
new JavaCurry().compose() ;
}
}
