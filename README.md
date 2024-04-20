# arrayOfStringsFormat
Project is intended to format array of strings to needful condition.
Base functionality is placed in Util class.
String[] createStringArray(int length) - creates new String array of random strings of specified length.
Srting genString() - generates random unicode symbols in range of 32 - 126 values and compiles them in the string.
String[] resizeArray(String[] array, int length) - creates new array of specified length with holding on all the data of "old" array.
String[] transformStringArray(String[] array) - method that recieves random substring from each string of current item and collect them in new array.