package io.github.furuewl.springboot.sell.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Date;

/**
 * Date转Long类型
 *
 * @author weilai
 */
public class DateToLongSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date value, JsonGenerator gen, SerializerProvider serializers) throws IOException {


        gen.writeNumber(value.getTime() / 1000);


    }

}
