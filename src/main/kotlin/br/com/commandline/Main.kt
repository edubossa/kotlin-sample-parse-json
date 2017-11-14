package br.com.commandline

import com.google.gson.Gson
import java.io.FileReader

fun main(args: Array<String>) {

    val gson = Gson()
    val topics = gson.fromJson(FileReader("/Users/wallace/Apps/kotlin/kotlin-sample-parse-json/src/main/resources/question.json"), Response::class.java)

    for(topic in topics.topics) {
        println(topic.topic)
        topic.list.forEach { println("  --> $it") }
    }

}

