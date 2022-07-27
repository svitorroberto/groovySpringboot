package com.svitor.apizord.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = 'root')
class RootController {

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<?> index() {
        new ResponseEntity<String>("Well done until now!", HttpStatus.OK)
    }
}
