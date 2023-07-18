package com.hendisantika.springbootuploadmultiplefiletomysql.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-upload-multiple-file-to-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 22/11/18
 * Time: 06.19
 */

@Configuration
@EnableJpaAuditing  //启用 JPA 审计功能。JPA 审计是一种跟踪和记录实体类的创建时间、修改时间以及创建者、修改者等信息的机制。
public class JpaAuditingConfig {
}
