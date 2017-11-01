package io.github.furuewl.springboot.sell.converter;

import io.github.furuewl.springboot.sell.dataobject.OrderMaster;
import io.github.furuewl.springboot.sell.dto.OrderDto;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * OrderMaster转OrderDTO
 *
 * @author weilai
 */
public class OrderMasterToOrderDtoConverter {

    public static OrderDto convert(OrderMaster orderMaster) {
        OrderDto orderDto = new OrderDto();

        BeanUtils.copyProperties(orderMaster, orderDto);

        return orderDto;
    }

    public static List<OrderDto> convert(List<OrderMaster> orderMasterList) {
        return orderMasterList.stream().map(
                e -> convert(e)
        ).collect(Collectors.toList());
    }

}
