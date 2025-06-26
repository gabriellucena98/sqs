package gabriellucena98.sqs.consumer

import gabriellucena98.sqs.consumer.model.MyMessage
import io.awspring.cloud.sqs.annotation.SqsListener
import org.springframework.stereotype.Component

@Component
class MyConsumer {

    @SqsListener("minha-fila") //Escutar uma determinada fila, a cada nova mensagem
    fun listen(message: MyMessage) {
        println("Message received: ${message.content}")
    }
}