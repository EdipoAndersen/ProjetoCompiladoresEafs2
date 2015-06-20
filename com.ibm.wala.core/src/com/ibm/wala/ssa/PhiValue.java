/*******************************************************************************
 * Copyright (c) 2002 - 2006 IBM Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.wala.ssa;


/**
 * A value generated by a phi instruction.
 * 
 * Clients shouldn't use this ... it's only used internally during SSA construction.
 */
class PhiValue implements Value {
  /**
   * The phi instruction that defines this value
   */
  final private SSAPhiInstruction phi;

  /**
   * @param phi The phi instruction that defines this value
   */
  PhiValue(SSAPhiInstruction phi) {
    this.phi = phi;
  }

  @Override
  public String toString() {
    return "v" + phi.getDef();
  }

  /**
   * @return The phi instruction that defines this value
   */
  public SSAPhiInstruction getPhiInstruction() {
    return phi;
  }

  /*
   * @see com.ibm.wala.ssa.Value#isStringConstant()
   */
  @Override
  public boolean isStringConstant() {
    return false;
  }

  /*
   * @see com.ibm.wala.ssa.Value#isNullConstant()
   */
  @Override
  public boolean isNullConstant() {
    return false;
  }

}
