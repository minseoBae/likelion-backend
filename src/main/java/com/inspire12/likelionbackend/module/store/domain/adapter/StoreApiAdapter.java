package com.inspire12.likelionbackend.module.store.domain.adapter;


import com.inspire12.likelionbackend.module.order.application.port.out.StoreStatusPort;
import org.springframework.stereotype.Component;

@Component
public class StoreApiAdapter implements StoreStatusPort {
    @Override
    public Boolean getStoreOpenStatus(Long storeId) {
        return true;
    }
// TODO: 지금은 무조건 여는 것이라고 가정
}
