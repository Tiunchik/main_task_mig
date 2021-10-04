package org.migration.main_task_mig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MainTaskMigApplication

fun main(args: Array<String>) {
    runApplication<MainTaskMigApplication>(*args)
}
