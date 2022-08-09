fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    println("================================\n")  
    println("Read-Write (mutable) List - Operations\n")
    println("================================\n")  
   
    
    // Add (Element)
    println("Add (Element)")
    println("befor adding:   ${numbers}")
    numbers.add("Six")
    println("after adding:  ${numbers}")
    println("-------------------")

   	
    // Add (Index, Element)
    println("Add (Index, Element)")
    println("befor adding:   ${numbers}")
    numbers.add(4,"Eight")
    println("after adding:  ${numbers}")
    println("-------------------")

   	
    // Add All (List)
    println("Add All (List)")
    println("befor adding:   ${numbers}")
    numbers.addAll(weekDays)
    println("after adding:  ${numbers}")
    println("-------------------")

    // Add All (Index, List)
    println("Add All (Index, List)")
    println("befor adding:   ${numbers}")
    numbers.addAll(4,weekDays)
    println("after adding:  ${numbers}")
    println("-------------------")

    
    // Clear 
    println("clear()")
    val num= mutableListOf(1, 2, 3, 4, 5)
    println("befor clear : ${num}")
    num.clear()
    println("befor clear : ${num}")
    println("-------------------")

   	
    // Remove
    println("befor Remove four : ${numbers}")
    numbers.remove("four")
    println("after remove At index 1:  ${numbers}")       
    println("-------------------")

    
    // Remove At 
    println("befor Remove At index 1: ${numbers}")
    numbers.removeAt(1)
    println("after remove At index 1:  ${numbers}")       
    println("-------------------")

    
    // Remove All
    println("befor Remove All : ${numbers}")
    numbers.removeAll(weekDays)
    println("after remove All :  ${numbers}")

  
  
  
   // Read-only (immutable) List - Operations
    println("\n================================\n")  
    println("Read-only (immutable) List - Operations\n")
    println("================================\n")  
     
    // The size of the list
    println("The size of the list:")
    println("${names.size}")
    println("-------------------")

    
    // Contains
    println("Contains:")
   	println("${names.contains("Reem")}")
    println("-------------------")

    
    // Contains All
    println("Contains All:")
   	println("${names.containsAll(namesAll)}")
    println("-------------------")

    
    // get
    println("get the name of index 3")
   	println("${names.get(3)}")
    println("-------------------")

    
    // indexOf
    println("index Of Ahad")
    println("${names.indexOf("Ahad")}")
    println("-------------------")

    // isEmpty
    println("the names list is Empty?") 
    println("${names.isEmpty()}")
    println("the  color list is Empty?")
    println("${color.isEmpty()}")
    println("-------------------")

    // Sublist
    println("Sublist of names list:")
    println("${names.subList(0,3)}")

    
}
