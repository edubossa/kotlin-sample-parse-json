package br.com.commandline

/**
 * Created by wallace on 09/11/2017.
 */
data class Question(val question: String, val answer: String)

data class Topic(val topic: String, val list: List<Question>)

data class Response(val topics: List<Topic>)

