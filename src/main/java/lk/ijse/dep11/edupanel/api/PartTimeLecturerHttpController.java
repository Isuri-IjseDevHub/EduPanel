package lk.ijse.dep11.edupanel.api;

import org.springframework.web.bind.annotation.*;

// REST controller for handling HTTP requests related to part-time lecturers
@RestController
@RequestMapping("/api/v1/lecturers/part-time")
@CrossOrigin
public class PartTimeLecturerHttpController {

    // Endpoint to handle HTTP PATCH requests for arranging the order of part-time lecturers
    @PatchMapping("/ranks")
    public void arrangePartTimeLecturersOrder(){
        System.out.println("arrangePartTimeLecturersOrder()");
    }

    // Endpoint to handle HTTP GET requests for retrieving all part-time lecturers
    @GetMapping
    public void getAllPartTimeLecturers(){
        System.out.println("getAllPartTimeLecturers()");
    }
}