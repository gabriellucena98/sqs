package gabriellucena98.sqs.producer

import gabriellucena98.sqs.consumer.model.MyMessage
import io.awspring.cloud.sqs.operations.SqsTemplate
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/producer")
class MyProducerController(
    private val sqsTemplate: SqsTemplate
) {
    var SQS = "https://localhost.localstack.cloud:4566/000000000000/minha-fila"

    @PostMapping("/send")
    fun sendMessage(@RequestBody body: MyMessage) {
        sqsTemplate.send(SQS, body)
    }
}