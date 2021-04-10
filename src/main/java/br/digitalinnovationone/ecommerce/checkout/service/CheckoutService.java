package java.br.digitalinnovationone.ecommerce.checkout.service;

import java.br.digitalinnovationone.ecommerce.checkout.entity.CheckoutEntity;
import java.br.digitalinnovationone.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}