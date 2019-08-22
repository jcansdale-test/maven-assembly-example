package com.mattamorphic;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MavenAssembly {
  public static String printProp(String field) {
    Properties prop = new Properties();

    try (InputStream input = new FileInputStream("conf" + File.separator + "config.properties")) {
      prop.load(input); // Load a properties file
      String data = prop.getProperty(field);
      return (StringUtils.isEmpty(data)) ? null : data;
    } catch (IOException ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
