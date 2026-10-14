package com.cronos.cronos_panel

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Import

@Import(TestcontainersConfiguration::class)
@SpringBootTest
class CronosPanelApplicationTests {

	@Test
	fun contextLoads() {
	}

}
