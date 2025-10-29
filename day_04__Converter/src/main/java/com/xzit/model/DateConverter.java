package com.xzit.model;

import lombok.Data;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Kieran_Chase
 * @project springFrameWork
 * @date 2025/10/29
 */
@Data
public class DateConverter implements Converter<String, LocalDate> {
    private String pattern;
    @Override
    public LocalDate convert(String source) {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern(pattern);
        LocalDate date=LocalDate.parse(source,formatter);
        return date;
    }
}
