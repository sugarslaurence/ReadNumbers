# ReadNumbers
ReadNumbers reads and writes plain text to a .txt file

ReadFile
- ReadFile reads data from .txt file, converts Strings to Integers and builds textData array to store data
- OpenFile is the method that creates textData
- ReadLines counts the number of lines in the file

WriteFile
- WriteFile either appends the original file with data (Boolean append_value= true)
- OR it overwrites it (Boolean append_value = false)

ReadNumbers
- ReadNumbers is the Main class 
- It invokes ReadFile and WriteFile
- It contains multiple functions internally eg. finds the median value of textData
- It invokes a number of classes eg. Prime Identifier which identifies all primes less than the value(s) in the file


