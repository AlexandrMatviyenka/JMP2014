package com.epam.model.json;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class LocalDateSerializer extends JsonSerializer<LocalDate> {

	@Override
	public void serialize(LocalDate date, JsonGenerator generator, SerializerProvider provider) throws IOException,
			JsonProcessingException {
		String dateString = date.format(DateTimeFormatter.ISO_DATE);
		generator.writeString(dateString);
	}

}
