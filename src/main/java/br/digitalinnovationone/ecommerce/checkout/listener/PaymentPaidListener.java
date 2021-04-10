package java.br.digitalinnovationone.ecommerce.checkout.listener;

import java.br.digitalinnovationone.ecommerce.checkout.entity.CheckoutEntity;
import java.br.digitalinnovationone.ecommerce.checkout.service.CheckoutService;
import java.br.digitalinnovationone.ecommerce.checkout.streaming.PaymentPaidSink;
import java.br.digitalinnovationone.ecommerce.payment.event.PaymentCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentPaidListener {

    private final CheckoutService checkoutService;

    @StreamListener(PaymentPaidSink.INPUT)
    public void handler(PaymentCreatedEvent paymentCreatedEvent) {
        checkoutService.updateStatus(paymentCreatedEvent.getCheckoutCode().toString(), CheckoutEntity.Status.APPROVED);
    }
}
