package com.company;

import com.sun.org.apache.xpath.internal.operations.String;

public interface ManFactory<Man1 extends Human>
{
  Man1 create(boolean sex, java.lang.String FN, java.lang.String LN, double height, double weight);

  }
