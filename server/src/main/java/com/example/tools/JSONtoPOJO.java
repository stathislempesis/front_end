package com.example.tools;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.nio.file.Path;

public class JSONtoPOJO {

  public void convertToPOJO (String filename, Path filepath){
      ObjectMapper mapper = new ObjectMapper();

      /**
       * Read object from file
       */
      MarketPositionList value = null;
      try {
          value = mapper.readValue(new File(filepath+filename), MarketPositionList.class);
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}
