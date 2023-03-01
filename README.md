1. `Date` 

    Create a `Date` class in `Date.java` that stores a calendar date. It should:
    * have a 3-argument constructor that takes 3 integers representing the month, day, and year respectively
    * have instance methods `getMonth`, `getDay`, `getYear` that take no arguments, and each return an integer
    * have a `toString` method that always creates a string with the same length, in format "mm/dd/yyyy". This means if the month or day are below 10, they should be zero padded. E.g. "12/04/1970". The year should be zero padded when necessary, too.

1. `TimeV1`

    Create a representation of a time of day measured to the nearest second. It should:
    * have a 3-argument constructor that takes 3 integers representing the hours, minutes, and seconds of that time of day. It should have three instance variables to store this information.
    * have instance methods `getHours`, `getMinutes`, and `getSeconds` that take no arguments, and each return an integer
    * have a `toString` method that would represent 7:02 pm as "19:02:00"

1. `TimeV2`

    Rewrite the previous class so that it has the same API (that means any client code wouldn't have to be modified since it retains identical constructors and public instance methods), but now uses only one instance variable to store the time of day: an integer representing the number of seconds since midnight.