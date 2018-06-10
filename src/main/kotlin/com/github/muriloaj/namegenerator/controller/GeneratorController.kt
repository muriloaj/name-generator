package com.github.muriloaj.namegenerator.controller

import com.github.muriloaj.namegenerator.service.ChemicalElementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GeneratorController(private val chemicalElementService: ChemicalElementService) {


    @GetMapping("/z")
    fun generate(): String {

        return chemicalElementService.genZ()

    }

}