package com.github.muriloaj.namegenerator.model

data class ChemicalElement(var z: String,
                           var symbol: String,
                           var latin: String,
                           var portuguese: String,
                           var spanish: String,
                           var english: String) {
    constructor() : this("", "", "", "", "", "")
}