package jetBrainsCourse.c_conventions


//class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate> {
//    override fun iterator(): Iterator<MyDate> {
//        return object : Iterator<MyDate> {
//            var current: MyDate = start
//
//            override fun next(): MyDate {
//                if (!hasNext()) throw NoSuchElementException()
//                val result: MyDate = current
//                current = current.followingDate()
//                return result
//            }
//
//            override fun hasNext(): Boolean = current <= end
//        }
//    }
//}