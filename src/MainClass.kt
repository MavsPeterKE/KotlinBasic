import java.lang.StringBuilder

fun main(args:Array<String>){
    println("Print Kotlin Test");

    //Kotlin Variables
    val fnumber = 20;
    val nNumber = 10;

    val total = fnumber*nNumber;
    
    //Condition statements in kotlin
    startConditionStatements(total, fnumber, nNumber)

    //Kotlin Loops
    

   


}

private fun startConditionStatements(total: Int, fnumber: Int, nNumber: Int) {
    if (total < 100) {
        println("""Total Count is Greater:$total""")
    } else {
        println("Multiplying: $fnumber AND $nNumber is less than 100"); // string templates concatenation

        val printTextBuilder = StringBuilder();
        printTextBuilder.append("Multiplying")
        printTextBuilder.append(" ")
        printTextBuilder.append(fnumber)
        printTextBuilder.append(" AND ")
        printTextBuilder.append(nNumber)
        printTextBuilder.append(" ")
        printTextBuilder.append("is less than 100")
        println(printTextBuilder); // string builder concatenation
    }
}