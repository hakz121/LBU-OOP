public class test {
    //----------------------------------------------------
    //  Prints a statement.
    //----------------------------------------------------
    public static void main(String[] args) {
        System.out.println("An Emergency Broadcast");
    }
}

//a. Change test to Test.\
// output = class Test is public, should be declared in a file named Test.java
//b. Change Emergency to emergency.\
// output = no error
//c. Remove the first quotation mark in the string.\
// output = :7:31 \ java: ')' expected
//d. Change main to man.\
// output = no output, doesn't let you run
//e. Change println to bogus.\
// output = java: cannot find symbol \ symbol:   method bogus(java.lang.String) \ location: variable out of type java.io.PrintStream \
//f. Remove the semicolon at the end of the println statement.\
// output = java: ';' expected \
//g. Remove the last brace in the program. \
// output = java: reached end of file while parsing \