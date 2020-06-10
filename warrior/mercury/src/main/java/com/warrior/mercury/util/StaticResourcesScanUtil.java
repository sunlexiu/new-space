package com.warrior.mercury.util;

import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.warrior.mercury.common.ConstantSymbol.EMPTY_STRING;
import static com.warrior.mercury.common.ConstantSymbol.MULTI_STAR;

/**
 * @author:       Charon
 * @create:       2020/6/10 10:28
 */
public class StaticResourcesScanUtil {

    public static String[] scanDirectStaticResourcesDir(String... paths)
            throws FileNotFoundException {
        if (paths == null || paths.length == 0) {
            return new String[] {};
        }

        List<String> result = new LinkedList<>();
        for (String path : paths) {
            result.addAll(scanDir(path));
        }

        return result.toArray(new String[0]);
    }

    private static List<String> scanDir(String path) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        String absolutePath = concatPath(ResourceUtils.getFile("classpath:").getPath(), path);
        File[] files = new File(absolutePath).listFiles();
        if (files == null) {
            return Collections.emptyList();
        }

        for (File f : files) {
            if (f.isDirectory()) {
                String expression  = f.getPath().replace(absolutePath, EMPTY_STRING) + "/" + MULTI_STAR;
                list.add(expression.replace("\\", "/"));
            }
        }
        return list;
    }

    private static String concatPath(String path, String...suffixes) {
        if (suffixes == null || suffixes.length == 0) {
            return path;
        }

        path = path.trim();
        String url = path.endsWith("\\") ? path : (path + "\\");
        int index = 0;
        for (String suffix : suffixes) {
            suffix = suffix.trim();
            url = url.concat(suffix.startsWith("\\") ? suffix.substring(1) : suffix);
            if (++index != suffixes.length) {
                url = url.concat("\\");
            }
        }
        return url;
    }

}
