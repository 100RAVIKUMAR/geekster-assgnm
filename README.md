# geekster-assgnm
Framework : SpringBoot
Language  : java
Data Flow (Mappings,Paths,Functions  used in packages)
1.Controller  
    usercontroller class
    Mappings used  : @GetMapping,@PostMapping,@PutMapping,@DeleteMApping.
    paths for respecytive mappings are as follows 
     @GetMapping-->"/adduser"
     @PostMapping-->"getuserbyid/{user_id}"(get user by id)&&   "getuser".
     @PutMapping--> "/update/{user_id}"   for updating an user/ @RequestBody for parameter to be updated.
     @DeleteMApping-->"delete/{user_id}"
     
**  Functions used in usercontroller class 
     addauser();
     getuserbyid();
     getallusers();
     updatebyid();
     deleteuser();
     
 ** Functions used in userservice class
    addanuser();
    getuserinfo();
    getusers();
    updateanuser();
    delete1user();
    
 ** Functions used in userdao class
    addoneuser();
    gerallusers();
    updatetheinfo();
    deletuser();
    
 ** Functions used in userdao class
    setters for all the parameters to get instantiated.
    getters for all the parameters to get instantiated.
    
    
    DATA STRUCTURE : ARRAYLIST.
   
   SUMMARY:
              this projects delas the data the data od the users of any website or an app and to manipulate the data os the usersin the respective datastruture used.
    
 
     
     
