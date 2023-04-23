#   RESTAURANT PROJECT

  ## Framework and Language used :
  ### SpringBoot , JAVA
  
  ## Controller
  ###   Functions used in controller are 
  ####   1.addrest()    --> for adding the restaurant using @PostMapping(value = "add");
  ####   2.getrest();   --> for getting the restaurant using @GetMapping(value = "restaurant/{id}");
  ####   3.getalrest(); --> for getting list of restaurants using  @GetMapping(value = "allrest");
  ####   4.updaterest();--> for updating the restaurent parameters using @PutMapping(value = "update/{speciality}");
  ####   5.deleterest();--> for deleting a restaurant from the list using @DeleteMapping(value = "delete/{id}");
     
  ## Service
  ###   Functions used in Service are
  ####   1.addarest();
  ####   2.getarest();
  ####   3.getrestlist();
  ####   4.updtrest();
  ####   5.deletearest();
     
  ## Repository
  ###   Functions used in Repository are
  ####   1.getallrest();
  ####   2.add1rest();
  ####   3.updatearest();
  ####   4.delete1rest();
     
  ## DataBaseDesign
  ###   Functions used in DataBaseDesign are
  ####   1.setter functions.
  ####   2.getter functions.
     
  ## Data Structure used :
  ###   * ArrayList
