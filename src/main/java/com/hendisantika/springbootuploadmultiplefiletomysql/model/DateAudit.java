package com.hendisantika.springbootuploadmultiplefiletomysql.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import java.time.Instant;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/11/18
 * Time: 06.15
 */

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)  //在实体类中使用该注解，以激活审计监听器。
@JsonIgnoreProperties(  //用于指示在序列化或反序列化过程中忽略指定的属性或字段
        value = {"createdAt", "updatedAt"},
        allowGetters = true
)
@Data
public class DateAudit {

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @LastModifiedDate
    @Column(nullable = false)
    private Instant updatedAt;

}