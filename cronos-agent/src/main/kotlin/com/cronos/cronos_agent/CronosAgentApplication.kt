package com.cronos.cronos_agent

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CronosAgentApplication

fun main(args: Array<String>) {
	runApplication<CronosAgentApplication>(*args)
}
