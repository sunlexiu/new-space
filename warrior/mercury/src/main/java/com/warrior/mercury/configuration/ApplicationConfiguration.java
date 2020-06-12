package com.warrior.mercury.configuration;

import com.alibaba.fastjson.JSONObject;
import com.warrior.mercury.model.dto.Menu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author:       Charon
 * @create:       2020/6/11 12:05
 */
@Configuration
public class ApplicationConfiguration {

    @Bean
    public List<Menu> defaultMenu() throws IOException {
        File file = ResourceUtils.getFile("classpath:menu.json");
        String json = new BufferedReader(new InputStreamReader(new FileInputStream(file)))
                .lines().collect(Collectors.joining(System.lineSeparator()));
        return new ArrayList<>(JSONObject.parseArray(json, Menu.class));
    }

}
