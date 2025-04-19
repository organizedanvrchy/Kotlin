package com.vimal.practicecode

fun main() {
    /* Loops:
       Used to repeat a block
       of code multiple times
     */

    // for Loop
    /* defined starting and ending points
     */
    for (i in 1..5 ) {
        println(i)
    }

    // while Loop
    /* repeats a block of code as long
       as a specified condition is true
     */
    var count = 0
    while (count < 5) {
        println("Count: $count")
        count++
    }

    // do-while Loop
    /* guarantees that the loop body
       is executed at least once
       because the condition is checked
       after the loop body
     */
    var x = 1
    do {
        println("This will be printed at least once...")
        x++
    } while (x < 0)

    /* Break:
       Terminates the loop and transfers
       control to the statement following
       the loop
     */
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i)
    }

    /* Continue:
       Skips the current iteration and
       proceeds to the next iteration of
       the loop
     */
    for (i in 1..10) {
        if ((i % 2) == 0) {
            continue
        }
        println(i)
    }
}