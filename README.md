This repository demonstrates a classic race condition in Java. The `BuggyIncrement.java` file contains a class with a method that increments an integer variable.  When multiple threads call this method concurrently, the final value of the integer may be incorrect due to the non-atomic nature of the increment operation. The `FixedIncrement.java` file shows how to solve this problem using appropriate synchronization mechanisms.