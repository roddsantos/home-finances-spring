package com.roddsantos.homefinances.controllers;

import com.roddsantos.homefinances.dto.user.UserPatchDto;
import com.roddsantos.homefinances.dto.user.UserRecordDto;
import com.roddsantos.homefinances.models.UserModel;
import com.roddsantos.homefinances.repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/user")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDto userRecordDto) {
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto, userModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(userRepository.save(userModel));
    }

    @GetMapping("user/{id}")
    public ResponseEntity<Object> getUser(@PathVariable(value = "id") UUID id) {
        Optional<UserModel> user0 = userRepository.findById(id);
        if (user0.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
        var userModel = user0.get();
        return ResponseEntity.status(HttpStatus.OK).body(userModel);
    }

    @PutMapping("/user")
    public ResponseEntity<Object> updateUser(@RequestBody @Valid UserPatchDto userPatchDto) {
        var id = userPatchDto.id();
        Optional<UserModel> user0 = userRepository.findById(id);

        if (user0.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");

        var userModel = user0.get();
        BeanUtils.copyProperties(userPatchDto, userModel);
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.save(userModel));
    }
}
