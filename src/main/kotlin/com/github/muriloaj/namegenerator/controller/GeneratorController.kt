package com.github.muriloaj.namegenerator.controller

import com.github.muriloaj.namegenerator.service.ChemicalElementService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GeneratorController(private val chemicalElementService: ChemicalElementService) {

    @GetMapping("/z")
    fun generateZ(): String {
        return chemicalElementService.genZ()
    }

    @GetMapping("/symbol")
    fun generateSymbol(): String {
        return chemicalElementService.genSymbol()
    }

    @GetMapping("/pt")
    fun generatePt(): String {
        return chemicalElementService.genPt()
    }

    @GetMapping("/es")
    fun generateEs(): String {
        return chemicalElementService.genEs()
    }

    @GetMapping("/latin")
    fun generateLatin(): String {
        return chemicalElementService.genLatin()
    }

    @GetMapping("/en")
    fun generateEn(): String {
        return chemicalElementService.genEn()
    }

}