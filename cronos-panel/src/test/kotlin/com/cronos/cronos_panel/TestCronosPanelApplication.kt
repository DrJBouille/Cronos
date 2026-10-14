package com.cronos.cronos_panel

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
	fromApplication<CronosPanelApplication>().with(TestcontainersConfiguration::class).run(*args)
}
