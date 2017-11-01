package com.david.common;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

/**
 * Date serializer to transform TimeStamp into yyyy-MM-dd HH:MM:SS format as String output
 * @author Chandra Sekhar Babu A
 *
 */
public class DateSerializer extends StdSerializer<Timestamp> {

    /**
     *
     */
    private static final long serialVersionUID = -5667281289191088794L;

    public static final String DATE_PATTERN = "yyyy-MM-dd HH:MM:SS";

    public DateSerializer() {
        this(null);
    }

    public DateSerializer(Class<Timestamp> t) {
        super(t);
    }

    @Override
    public void serialize(Timestamp value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {
        Format formatter = new SimpleDateFormat(DATE_PATTERN);
        if (value != null) {
            jgen.writeString(formatter.format(value));
        }
    }
}