package jetBrainsCourse.a_introduction

fun containsEven(collection: Collection<Int>): Boolean = collection.any { it -> it % 2 == 0 }