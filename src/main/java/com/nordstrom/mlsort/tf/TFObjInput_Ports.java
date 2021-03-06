package com.nordstrom.mlsort.tf;

import java.util.List;

/**
 * To create inputPorts terraform element
 */
public class TFObjInput_Ports implements TerraformObjects {

  private String id;
  private String name;
  private int concurrentlySchedulableTaskCount;

  /**
   * The getter for id.
   * 
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * The setter for id.
   * 
   * @param id the id to set
   */
  public void setId(String id) {
    this.id = id;
  }

  /**
   * The getter for name.
   * 
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * The setter for name.
   * 
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * The getter for concurrentlySchedulableTaskCount.
   * 
   * @return the concurrentlySchedulableTaskCount
   */
  public int getConcurrentlySchedulableTaskCount() {
    return concurrentlySchedulableTaskCount;
  }

  /**
   * The setter for concurrentlySchedulableTaskCount.
   * 
   * @param concurrentlySchedulableTaskCount the concurrentlySchedulableTaskCount to set
   */
  public void setConcurrentlySchedulableTaskCount(int concurrentlySchedulableTaskCount) {
    this.concurrentlySchedulableTaskCount = concurrentlySchedulableTaskCount;
  }

  /*
   * (non-Javadoc)
   * 
   * @see com.nordstrom.mlsort.tf.TerraformObjects#generateStringRepresentation()
   */
  @Override
  public String generateStringRepresentation() {
    String element = null;
    try {
      List<String> list = TFUtil.getFieldNameAndValues(this, false);
      element = TFUtil.generateString(TFUtil.getElementNameFromClassName(this.getClass().getName()),
          list, false);
    } catch (IllegalAccessException exception) {
      exception.printStackTrace();
    }
    return element;
  }

}
