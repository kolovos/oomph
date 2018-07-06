/*
 * Copyright (c) 2014 Eike Stepper (Loehne, Germany) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *    Eike Stepper - initial API and implementation
 */
package org.eclipse.oomph.util;

/**
 * @author Eike Stepper
 */
public class IORuntimeException extends RuntimeException
{
  private static final long serialVersionUID = 1L;

  public IORuntimeException()
  {
  }

  public IORuntimeException(String message)
  {
    super(message);
  }

  public IORuntimeException(Throwable cause)
  {
    super(cause);
  }

  public IORuntimeException(String message, Throwable cause)
  {
    super(message, cause);
  }
}
