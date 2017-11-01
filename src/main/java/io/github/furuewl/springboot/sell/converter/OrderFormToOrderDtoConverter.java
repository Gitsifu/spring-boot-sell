package io.github.furuewl.springboot.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import io.github.furuewl.springboot.sell.dataobject.OrderDetail;
import io.github.furuewl.springboot.sell.dto.OrderDto;
import io.github.furuewl.springboot.sell.enums.ResultEnum;
import io.github.furuewl.springboot.sell.exception.SellException;
import io.github.furuewl.springboot.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @author weilai
 */
@Slf4j
public class OrderFormToOrderDtoConverter {

    public static OrderDto convert(OrderForm orderForm) {
        Gson gson = new Gson();

        OrderDto orderDto = new OrderDto();

        orderDto.setBuyerName(orderForm.getName());
        orderDto.setBuyerPhone(orderForm.getPhone());
        orderDto.setBuyerAddress(orderForm.getAddress());
        orderDto.setOrderId(orderForm.getOpenid());


        List<OrderDetail> orderDetailList;
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        } catch (Exception e) {
            log.error("【对象转换】错误，string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }


        orderDto.setOrderDetailList(orderDetailList);
        return null;
    }

}
