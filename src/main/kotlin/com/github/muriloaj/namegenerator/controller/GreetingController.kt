package com.github.muriloaj.namegenerator.controller

import com.github.muriloaj.namegenerator.service.ChemicalElementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(private val chemicalElementService: ChemicalElementService) {

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) = "Hello $name"

}