package lk.ijse.dep11.edupanel.api;

import lk.ijse.dep11.edupanel.to.request.LecturerReqTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

// This class represents the HTTP controller for managing operations related to lecturers.
@RestController
@RequestMapping("/api/v1/lecturers")
@CrossOrigin
public class LecturerHttpController {

    // Handles the creation of a new lecturer.
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "multipart/form-data", produces = "application/json")
    public void createNewLecturer(@ModelAttribute @Valid LecturerReqTO lecturer){
        System.out.println(lecturer);
        System.out.println("createNewLecturer()");
    }

    // Handles the update of lecturer details.
    @PatchMapping("/{lecturer-id}")
    public void updateLecturerDetails(){
        System.out.println("updateLecturerDetails()");
    }

    // Handles the deletion of a lecturer.
    @DeleteMapping("/{lecturer-id}")
    public void deleteLecturer(){
        System.out.println("deleteLecturer()");
    }

    // Handles the retrieval of all lecturers.
    @GetMapping
    public void getAllLecturers(){
        System.out.println("getAllLecturers()");
    }
}