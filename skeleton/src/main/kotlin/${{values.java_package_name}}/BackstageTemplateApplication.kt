package ${{values.java_package_name}}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
@RestController
@RequestMapping("/")
class BackstageTemplateApplication {

  @GetMapping
  fun get(): String {
    return "Funfo"
  }
}

fun main(args: Array<String>) {
	runApplication<BackstageTemplateApplication>(*args)
}
