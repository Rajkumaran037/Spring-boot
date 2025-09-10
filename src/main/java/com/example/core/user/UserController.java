package com.example.core.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/home")
    public String home() {
        return "Welcome Spring !";
    }

    @GetMapping("/getUserFromPath{id}/{dummy}")
    public String getUserFromPath(@PathVariable long id,@PathVariable("dummy") long dummy) {
        return dummy+"Welcome Spring"+id;
    }


    @GetMapping("/getUserFromQuery")
    public String getUserFromQuery(@RequestParam("id") long id,@RequestParam("dummy") long dummy,@RequestParam("dummy1") long dummy1) {
        return dummy+"Welcome Spring"+id;
    }

    @PostMapping("/persistUser")
    public String persistUser(@RequestBody User user) {
        return "User persisted with id: " + user.id + " and name: " + user.name;
    }




}




