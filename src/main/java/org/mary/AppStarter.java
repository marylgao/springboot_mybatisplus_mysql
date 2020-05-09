package org.mary;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auth yangyongp
 * @Create 2020/5/8 12:09
 */
@SpringBootApplication
@MapperScan("org.mary.mapper")
public class AppStarter {

  public static void main(String[] args){
    SpringApplication.run(AppStarter.class, args);
  }
}
