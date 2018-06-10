package com.github.muriloaj.namegenerator.service

import com.github.muriloaj.namegenerator.model.ChemicalElement
import org.springframework.stereotype.Service
import java.io.File
import java.util.*

@Service
class ChemicalElementService {

    fun importFromCsv(): List<ChemicalElement> {

        val elements = mutableListOf<ChemicalElement>()
        File("chemical-elements.csv").useLines { lines -> lines.forEach { elements.add(convertIntoElement(it)) } }

        return elements
    }


    private fun convertIntoElement(line: String): ChemicalElement {
        val splitted = line.split(";")
        val element = ChemicalElement()
        element.z = splitted.get(0)
        element.symbol = splitted.get(1)
        element.latin = splitted.get(2)
        element.portuguese = splitted.get(3)
        element.spanish = splitted.get(4)
        element.english = splitted.get(5)

        return element


    }

    fun randomElement(): ChemicalElement {
        importFromCsv().let {
            val bound: Int = it.size
            val index: Int = Random().nextInt(bound)
            return it.get(index)

        }
    }

    fun genZ(): String = randomElement().z

    fun genSymbol(): String = randomElement().symbol

    fun genPt(): String = randomElement().portuguese

    fun genEs(): String = randomElement().spanish

    fun genLatin(): String = randomElement().latin

    fun genEn(): String = randomElement().english

}