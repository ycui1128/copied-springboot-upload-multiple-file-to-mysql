package com.hendisantika.springbootuploadmultiplefiletomysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import jakarta.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan(basePackageClasses = {
        SpringbootUploadMultipleFileToMysqlApplication.class,
        Jsr310JpaConverters.class   //用于在 JPA 实体类和数据库中进行日期和时间类型的转换
})
public class SpringbootUploadMultipleFileToMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUploadMultipleFileToMysqlApplication.class, args);
    }

    @PostConstruct
    void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Jakarta"));
    }

}
