/*
 * Copyright 2006 Pentaho Corporation.  All rights reserved. 
 * This software was developed by Pentaho Corporation and is provided under the terms 
 * of the Mozilla Public License, Version 1.1, or any later version. You may not use 
 * this file except in compliance with the license. If you need a copy of the license, 
 * please go to http://www.mozilla.org/MPL/MPL-1.1.txt. The Original Code is the Pentaho 
 * BI Platform.  The Initial Developer is Pentaho Corporation.
 *
 * Software distributed under the Mozilla Public License is distributed on an "AS IS" 
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or  implied. Please refer to 
 * the license for the specific language governing your rights and limitations.
*/
package org.pentaho.pms.schema.dialect;

import org.pentaho.pms.core.exception.PentahoMetadataException;

/**
 * This interface is implemented by PMSFormula in order to traverse the 
 * libformula object model and call the appropriate dialect related classes 
 * in this package.
 *  
 * @author Will Gorman (wgorman@pentaho.org)
 *
 */
public interface FormulaTraversalInterface {
  
  /**
   * this method traverses the libformula object model recursively
   * 
   * @param val current object in libformula object model
   * @param sb string buffer to append sql to
   * @param locale specific locale of the sql
   * @throws PentahoMetadataException if a problem occurs during the generation of sql
   */
  public void generateSQL(Object val, StringBuffer sb, String locale) throws PentahoMetadataException;
}