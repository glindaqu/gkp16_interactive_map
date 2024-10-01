package ru.gkp16.interactive_map

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import ru.gkp16.interactive_map.services.excel_service.ExcelParser

@SpringBootApplication
class InteractiveMapApplication

fun main(args: Array<String>) {
//	runApplication<InteractiveMapApplication>(*args)
	val excelParser = ExcelParser.create("D:\\Мои документы\\Desktop\\адреса по участкам.xlsx")
	excelParser.parse(onRowParsed = {
		println(it.toString())
	})
}


