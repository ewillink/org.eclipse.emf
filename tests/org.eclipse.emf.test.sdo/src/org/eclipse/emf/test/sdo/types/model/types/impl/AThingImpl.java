/**
 * <copyright>
 * </copyright>
 *
 * $Id: AThingImpl.java,v 1.2 2004/11/03 23:30:47 marcelop Exp $
 */
package org.eclipse.emf.test.sdo.types.model.types.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.sdo.impl.EDataObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.emf.test.sdo.types.model.types.AThing;
import org.eclipse.emf.test.sdo.types.model.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AThing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#isABoolean <em>ABoolean</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAByte <em>AByte</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getADecimal <em>ADecimal</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAFloat <em>AFloat</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getADouble <em>ADouble</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAInt <em>AInt</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAInteger <em>AInteger</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getALong <em>ALong</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAShort <em>AShort</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAString <em>AString</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAChar <em>AChar</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getADate <em>ADate</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getABytes <em>ABytes</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getANumber <em>ANumber</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAObject <em>AObject</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getAThread <em>AThread</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyBoolean <em>Many Boolean</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyByte <em>Many Byte</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyDecimal <em>Many Decimal</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyFloat <em>Many Float</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyDouble <em>Many Double</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyInt <em>Many Int</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyInteger <em>Many Integer</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyLong <em>Many Long</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyShort <em>Many Short</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyString <em>Many String</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyChar <em>Many Char</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyDate <em>Many Date</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyBytes <em>Many Bytes</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyNumber <em>Many Number</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyObject <em>Many Object</em>}</li>
 *   <li>{@link org.eclipse.emf.test.sdo.types.model.types.impl.AThingImpl#getManyThread <em>Many Thread</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AThingImpl extends EDataObjectImpl implements AThing
{
  /**
   * The default value of the '{@link #isABoolean() <em>ABoolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isABoolean()
   * @generated
   * @ordered
   */
  protected static final boolean ABOOLEAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isABoolean() <em>ABoolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isABoolean()
   * @generated
   * @ordered
   */
  protected boolean aBoolean = ABOOLEAN_EDEFAULT;

  /**
   * This is true if the ABoolean attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aBooleanESet = false;

  /**
   * The default value of the '{@link #getAByte() <em>AByte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAByte()
   * @generated
   * @ordered
   */
  protected static final byte ABYTE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAByte() <em>AByte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAByte()
   * @generated
   * @ordered
   */
  protected byte aByte = ABYTE_EDEFAULT;

  /**
   * This is true if the AByte attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aByteESet = false;

  /**
   * The default value of the '{@link #getADecimal() <em>ADecimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADecimal()
   * @generated
   * @ordered
   */
  protected static final BigDecimal ADECIMAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getADecimal() <em>ADecimal</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADecimal()
   * @generated
   * @ordered
   */
  protected BigDecimal aDecimal = ADECIMAL_EDEFAULT;

  /**
   * The default value of the '{@link #getAFloat() <em>AFloat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAFloat()
   * @generated
   * @ordered
   */
  protected static final float AFLOAT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getAFloat() <em>AFloat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAFloat()
   * @generated
   * @ordered
   */
  protected float aFloat = AFLOAT_EDEFAULT;

  /**
   * This is true if the AFloat attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aFloatESet = false;

  /**
   * The default value of the '{@link #getADouble() <em>ADouble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADouble()
   * @generated
   * @ordered
   */
  protected static final double ADOUBLE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getADouble() <em>ADouble</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADouble()
   * @generated
   * @ordered
   */
  protected double aDouble = ADOUBLE_EDEFAULT;

  /**
   * This is true if the ADouble attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aDoubleESet = false;

  /**
   * The default value of the '{@link #getAInt() <em>AInt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAInt()
   * @generated
   * @ordered
   */
  protected static final int AINT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAInt() <em>AInt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAInt()
   * @generated
   * @ordered
   */
  protected int aInt = AINT_EDEFAULT;

  /**
   * This is true if the AInt attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aIntESet = false;

  /**
   * The default value of the '{@link #getAInteger() <em>AInteger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAInteger()
   * @generated
   * @ordered
   */
  protected static final BigInteger AINTEGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAInteger() <em>AInteger</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAInteger()
   * @generated
   * @ordered
   */
  protected BigInteger aInteger = AINTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getALong() <em>ALong</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getALong()
   * @generated
   * @ordered
   */
  protected static final long ALONG_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getALong() <em>ALong</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getALong()
   * @generated
   * @ordered
   */
  protected long aLong = ALONG_EDEFAULT;

  /**
   * This is true if the ALong attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aLongESet = false;

  /**
   * The default value of the '{@link #getAShort() <em>AShort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAShort()
   * @generated
   * @ordered
   */
  protected static final short ASHORT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAShort() <em>AShort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAShort()
   * @generated
   * @ordered
   */
  protected short aShort = ASHORT_EDEFAULT;

  /**
   * This is true if the AShort attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aShortESet = false;

  /**
   * The default value of the '{@link #getAString() <em>AString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAString()
   * @generated
   * @ordered
   */
  protected static final String ASTRING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAString() <em>AString</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAString()
   * @generated
   * @ordered
   */
  protected String aString = ASTRING_EDEFAULT;

  /**
   * The default value of the '{@link #getAChar() <em>AChar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAChar()
   * @generated
   * @ordered
   */
  protected static final char ACHAR_EDEFAULT = '\u0000';

  /**
   * The cached value of the '{@link #getAChar() <em>AChar</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAChar()
   * @generated
   * @ordered
   */
  protected char aChar = ACHAR_EDEFAULT;

  /**
   * This is true if the AChar attribute has been set.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  protected boolean aCharESet = false;

  /**
   * The default value of the '{@link #getADate() <em>ADate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADate()
   * @generated
   * @ordered
   */
  protected static final Date ADATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getADate() <em>ADate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getADate()
   * @generated
   * @ordered
   */
  protected Date aDate = ADATE_EDEFAULT;

  /**
   * The default value of the '{@link #getABytes() <em>ABytes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getABytes()
   * @generated
   * @ordered
   */
  protected static final byte[] ABYTES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getABytes() <em>ABytes</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getABytes()
   * @generated
   * @ordered
   */
  protected byte[] aBytes = ABYTES_EDEFAULT;

  /**
   * The default value of the '{@link #getANumber() <em>ANumber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getANumber()
   * @generated
   * @ordered
   */
  protected static final Number ANUMBER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getANumber() <em>ANumber</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getANumber()
   * @generated
   * @ordered
   */
  protected Number aNumber = ANUMBER_EDEFAULT;

  /**
   * The default value of the '{@link #getAObject() <em>AObject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAObject()
   * @generated
   * @ordered
   */
  protected static final Object AOBJECT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAObject() <em>AObject</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAObject()
   * @generated
   * @ordered
   */
  protected Object aObject = AOBJECT_EDEFAULT;

  /**
   * The default value of the '{@link #getAThread() <em>AThread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAThread()
   * @generated
   * @ordered
   */
  protected static final Thread ATHREAD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAThread() <em>AThread</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAThread()
   * @generated
   * @ordered
   */
  protected Thread aThread = ATHREAD_EDEFAULT;

  /**
   * The cached value of the '{@link #getManyBoolean() <em>Many Boolean</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyBoolean()
   * @generated
   * @ordered
   */
  protected EList manyBoolean = null;

  /**
   * The cached value of the '{@link #getManyByte() <em>Many Byte</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyByte()
   * @generated
   * @ordered
   */
  protected EList manyByte = null;

  /**
   * The cached value of the '{@link #getManyDecimal() <em>Many Decimal</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyDecimal()
   * @generated
   * @ordered
   */
  protected EList manyDecimal = null;

  /**
   * The cached value of the '{@link #getManyFloat() <em>Many Float</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyFloat()
   * @generated
   * @ordered
   */
  protected EList manyFloat = null;

  /**
   * The cached value of the '{@link #getManyDouble() <em>Many Double</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyDouble()
   * @generated
   * @ordered
   */
  protected EList manyDouble = null;

  /**
   * The cached value of the '{@link #getManyInt() <em>Many Int</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyInt()
   * @generated
   * @ordered
   */
  protected EList manyInt = null;

  /**
   * The cached value of the '{@link #getManyInteger() <em>Many Integer</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyInteger()
   * @generated
   * @ordered
   */
  protected EList manyInteger = null;

  /**
   * The cached value of the '{@link #getManyLong() <em>Many Long</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyLong()
   * @generated
   * @ordered
   */
  protected EList manyLong = null;

  /**
   * The cached value of the '{@link #getManyShort() <em>Many Short</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyShort()
   * @generated
   * @ordered
   */
  protected EList manyShort = null;

  /**
   * The cached value of the '{@link #getManyString() <em>Many String</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyString()
   * @generated
   * @ordered
   */
  protected EList manyString = null;

  /**
   * The cached value of the '{@link #getManyChar() <em>Many Char</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyChar()
   * @generated
   * @ordered
   */
  protected EList manyChar = null;

  /**
   * The cached value of the '{@link #getManyDate() <em>Many Date</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyDate()
   * @generated
   * @ordered
   */
  protected EList manyDate = null;

  /**
   * The cached value of the '{@link #getManyBytes() <em>Many Bytes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyBytes()
   * @generated
   * @ordered
   */
  protected EList manyBytes = null;

  /**
   * The cached value of the '{@link #getManyNumber() <em>Many Number</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyNumber()
   * @generated
   * @ordered
   */
  protected EList manyNumber = null;

  /**
   * The cached value of the '{@link #getManyObject() <em>Many Object</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyObject()
   * @generated
   * @ordered
   */
  protected EList manyObject = null;

  /**
   * The cached value of the '{@link #getManyThread() <em>Many Thread</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getManyThread()
   * @generated
   * @ordered
   */
  protected EList manyThread = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AThingImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return TypesPackage.eINSTANCE.getAThing();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isABoolean()
  {
    return aBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setABoolean(boolean newABoolean)
  {
    boolean oldABoolean = aBoolean;
    aBoolean = newABoolean;
    boolean oldABooleanESet = aBooleanESet;
    aBooleanESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ABOOLEAN, oldABoolean, aBoolean, !oldABooleanESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetABoolean()
  {
    boolean oldABoolean = aBoolean;
    boolean oldABooleanESet = aBooleanESet;
    aBoolean = ABOOLEAN_EDEFAULT;
    aBooleanESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ABOOLEAN, oldABoolean, ABOOLEAN_EDEFAULT, oldABooleanESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetABoolean()
  {
    return aBooleanESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public byte getAByte()
  {
    return aByte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAByte(byte newAByte)
  {
    byte oldAByte = aByte;
    aByte = newAByte;
    boolean oldAByteESet = aByteESet;
    aByteESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ABYTE, oldAByte, aByte, !oldAByteESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAByte()
  {
    byte oldAByte = aByte;
    boolean oldAByteESet = aByteESet;
    aByte = ABYTE_EDEFAULT;
    aByteESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ABYTE, oldAByte, ABYTE_EDEFAULT, oldAByteESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAByte()
  {
    return aByteESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getADecimal()
  {
    return aDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADecimal(BigDecimal newADecimal)
  {
    BigDecimal oldADecimal = aDecimal;
    aDecimal = newADecimal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ADECIMAL, oldADecimal, aDecimal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getAFloat()
  {
    return aFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAFloat(float newAFloat)
  {
    float oldAFloat = aFloat;
    aFloat = newAFloat;
    boolean oldAFloatESet = aFloatESet;
    aFloatESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__AFLOAT, oldAFloat, aFloat, !oldAFloatESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAFloat()
  {
    float oldAFloat = aFloat;
    boolean oldAFloatESet = aFloatESet;
    aFloat = AFLOAT_EDEFAULT;
    aFloatESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__AFLOAT, oldAFloat, AFLOAT_EDEFAULT, oldAFloatESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAFloat()
  {
    return aFloatESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getADouble()
  {
    return aDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADouble(double newADouble)
  {
    double oldADouble = aDouble;
    aDouble = newADouble;
    boolean oldADoubleESet = aDoubleESet;
    aDoubleESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ADOUBLE, oldADouble, aDouble, !oldADoubleESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetADouble()
  {
    double oldADouble = aDouble;
    boolean oldADoubleESet = aDoubleESet;
    aDouble = ADOUBLE_EDEFAULT;
    aDoubleESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ADOUBLE, oldADouble, ADOUBLE_EDEFAULT, oldADoubleESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetADouble()
  {
    return aDoubleESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAInt()
  {
    return aInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAInt(int newAInt)
  {
    int oldAInt = aInt;
    aInt = newAInt;
    boolean oldAIntESet = aIntESet;
    aIntESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__AINT, oldAInt, aInt, !oldAIntESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAInt()
  {
    int oldAInt = aInt;
    boolean oldAIntESet = aIntESet;
    aInt = AINT_EDEFAULT;
    aIntESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__AINT, oldAInt, AINT_EDEFAULT, oldAIntESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAInt()
  {
    return aIntESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigInteger getAInteger()
  {
    return aInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAInteger(BigInteger newAInteger)
  {
    BigInteger oldAInteger = aInteger;
    aInteger = newAInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__AINTEGER, oldAInteger, aInteger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public long getALong()
  {
    return aLong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setALong(long newALong)
  {
    long oldALong = aLong;
    aLong = newALong;
    boolean oldALongESet = aLongESet;
    aLongESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ALONG, oldALong, aLong, !oldALongESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetALong()
  {
    long oldALong = aLong;
    boolean oldALongESet = aLongESet;
    aLong = ALONG_EDEFAULT;
    aLongESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ALONG, oldALong, ALONG_EDEFAULT, oldALongESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetALong()
  {
    return aLongESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public short getAShort()
  {
    return aShort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAShort(short newAShort)
  {
    short oldAShort = aShort;
    aShort = newAShort;
    boolean oldAShortESet = aShortESet;
    aShortESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ASHORT, oldAShort, aShort, !oldAShortESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAShort()
  {
    short oldAShort = aShort;
    boolean oldAShortESet = aShortESet;
    aShort = ASHORT_EDEFAULT;
    aShortESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ASHORT, oldAShort, ASHORT_EDEFAULT, oldAShortESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAShort()
  {
    return aShortESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAString()
  {
    return aString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAString(String newAString)
  {
    String oldAString = aString;
    aString = newAString;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ASTRING, oldAString, aString));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public char getAChar()
  {
    return aChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAChar(char newAChar)
  {
    char oldAChar = aChar;
    aChar = newAChar;
    boolean oldACharESet = aCharESet;
    aCharESet = true;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ACHAR, oldAChar, aChar, !oldACharESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void unsetAChar()
  {
    char oldAChar = aChar;
    boolean oldACharESet = aCharESet;
    aChar = ACHAR_EDEFAULT;
    aCharESet = false;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.UNSET, TypesPackage.ATHING__ACHAR, oldAChar, ACHAR_EDEFAULT, oldACharESet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isSetAChar()
  {
    return aCharESet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Date getADate()
  {
    return aDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setADate(Date newADate)
  {
    Date oldADate = aDate;
    aDate = newADate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ADATE, oldADate, aDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public byte[] getABytes()
  {
    return aBytes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setABytes(byte[] newABytes)
  {
    byte[] oldABytes = aBytes;
    aBytes = newABytes;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ABYTES, oldABytes, aBytes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Number getANumber()
  {
    return aNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setANumber(Number newANumber)
  {
    Number oldANumber = aNumber;
    aNumber = newANumber;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ANUMBER, oldANumber, aNumber));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object getAObject()
  {
    return aObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAObject(Object newAObject)
  {
    Object oldAObject = aObject;
    aObject = newAObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__AOBJECT, oldAObject, aObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Thread getAThread()
  {
    return aThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAThread(Thread newAThread)
  {
    Thread oldAThread = aThread;
    aThread = newAThread;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TypesPackage.ATHING__ATHREAD, oldAThread, aThread));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyBoolean()
  {
    if (manyBoolean == null)
    {
      manyBoolean = new EDataTypeEList(Boolean.class, this, TypesPackage.ATHING__MANY_BOOLEAN);
    }
    return manyBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyByte()
  {
    if (manyByte == null)
    {
      manyByte = new EDataTypeEList(Byte.class, this, TypesPackage.ATHING__MANY_BYTE);
    }
    return manyByte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyDecimal()
  {
    if (manyDecimal == null)
    {
      manyDecimal = new EDataTypeEList(BigDecimal.class, this, TypesPackage.ATHING__MANY_DECIMAL);
    }
    return manyDecimal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyFloat()
  {
    if (manyFloat == null)
    {
      manyFloat = new EDataTypeEList(Float.class, this, TypesPackage.ATHING__MANY_FLOAT);
    }
    return manyFloat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyDouble()
  {
    if (manyDouble == null)
    {
      manyDouble = new EDataTypeEList(Double.class, this, TypesPackage.ATHING__MANY_DOUBLE);
    }
    return manyDouble;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyInt()
  {
    if (manyInt == null)
    {
      manyInt = new EDataTypeEList(Integer.class, this, TypesPackage.ATHING__MANY_INT);
    }
    return manyInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyInteger()
  {
    if (manyInteger == null)
    {
      manyInteger = new EDataTypeEList(BigInteger.class, this, TypesPackage.ATHING__MANY_INTEGER);
    }
    return manyInteger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyLong()
  {
    if (manyLong == null)
    {
      manyLong = new EDataTypeEList(Long.class, this, TypesPackage.ATHING__MANY_LONG);
    }
    return manyLong;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyShort()
  {
    if (manyShort == null)
    {
      manyShort = new EDataTypeEList(Short.class, this, TypesPackage.ATHING__MANY_SHORT);
    }
    return manyShort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyString()
  {
    if (manyString == null)
    {
      manyString = new EDataTypeEList(String.class, this, TypesPackage.ATHING__MANY_STRING);
    }
    return manyString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyChar()
  {
    if (manyChar == null)
    {
      manyChar = new EDataTypeEList(Character.class, this, TypesPackage.ATHING__MANY_CHAR);
    }
    return manyChar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyDate()
  {
    if (manyDate == null)
    {
      manyDate = new EDataTypeEList(Date.class, this, TypesPackage.ATHING__MANY_DATE);
    }
    return manyDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyBytes()
  {
    if (manyBytes == null)
    {
      manyBytes = new EDataTypeEList(byte[].class, this, TypesPackage.ATHING__MANY_BYTES);
    }
    return manyBytes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyNumber()
  {
    if (manyNumber == null)
    {
      manyNumber = new EDataTypeEList(Number.class, this, TypesPackage.ATHING__MANY_NUMBER);
    }
    return manyNumber;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyObject()
  {
    if (manyObject == null)
    {
      manyObject = new EDataTypeEList(Object.class, this, TypesPackage.ATHING__MANY_OBJECT);
    }
    return manyObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public List getManyThread()
  {
    if (manyThread == null)
    {
      manyThread = new EDataTypeEList(Thread.class, this, TypesPackage.ATHING__MANY_THREAD);
    }
    return manyThread;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case TypesPackage.ATHING__ABOOLEAN:
        return isABoolean() ? Boolean.TRUE : Boolean.FALSE;
      case TypesPackage.ATHING__ABYTE:
        return new Byte(getAByte());
      case TypesPackage.ATHING__ADECIMAL:
        return getADecimal();
      case TypesPackage.ATHING__AFLOAT:
        return new Float(getAFloat());
      case TypesPackage.ATHING__ADOUBLE:
        return new Double(getADouble());
      case TypesPackage.ATHING__AINT:
        return new Integer(getAInt());
      case TypesPackage.ATHING__AINTEGER:
        return getAInteger();
      case TypesPackage.ATHING__ALONG:
        return new Long(getALong());
      case TypesPackage.ATHING__ASHORT:
        return new Short(getAShort());
      case TypesPackage.ATHING__ASTRING:
        return getAString();
      case TypesPackage.ATHING__ACHAR:
        return new Character(getAChar());
      case TypesPackage.ATHING__ADATE:
        return getADate();
      case TypesPackage.ATHING__ABYTES:
        return getABytes();
      case TypesPackage.ATHING__ANUMBER:
        return getANumber();
      case TypesPackage.ATHING__AOBJECT:
        return getAObject();
      case TypesPackage.ATHING__ATHREAD:
        return getAThread();
      case TypesPackage.ATHING__MANY_BOOLEAN:
        return getManyBoolean();
      case TypesPackage.ATHING__MANY_BYTE:
        return getManyByte();
      case TypesPackage.ATHING__MANY_DECIMAL:
        return getManyDecimal();
      case TypesPackage.ATHING__MANY_FLOAT:
        return getManyFloat();
      case TypesPackage.ATHING__MANY_DOUBLE:
        return getManyDouble();
      case TypesPackage.ATHING__MANY_INT:
        return getManyInt();
      case TypesPackage.ATHING__MANY_INTEGER:
        return getManyInteger();
      case TypesPackage.ATHING__MANY_LONG:
        return getManyLong();
      case TypesPackage.ATHING__MANY_SHORT:
        return getManyShort();
      case TypesPackage.ATHING__MANY_STRING:
        return getManyString();
      case TypesPackage.ATHING__MANY_CHAR:
        return getManyChar();
      case TypesPackage.ATHING__MANY_DATE:
        return getManyDate();
      case TypesPackage.ATHING__MANY_BYTES:
        return getManyBytes();
      case TypesPackage.ATHING__MANY_NUMBER:
        return getManyNumber();
      case TypesPackage.ATHING__MANY_OBJECT:
        return getManyObject();
      case TypesPackage.ATHING__MANY_THREAD:
        return getManyThread();
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case TypesPackage.ATHING__ABOOLEAN:
        setABoolean(((Boolean)newValue).booleanValue());
        return;
      case TypesPackage.ATHING__ABYTE:
        setAByte(((Byte)newValue).byteValue());
        return;
      case TypesPackage.ATHING__ADECIMAL:
        setADecimal((BigDecimal)newValue);
        return;
      case TypesPackage.ATHING__AFLOAT:
        setAFloat(((Float)newValue).floatValue());
        return;
      case TypesPackage.ATHING__ADOUBLE:
        setADouble(((Double)newValue).doubleValue());
        return;
      case TypesPackage.ATHING__AINT:
        setAInt(((Integer)newValue).intValue());
        return;
      case TypesPackage.ATHING__AINTEGER:
        setAInteger((BigInteger)newValue);
        return;
      case TypesPackage.ATHING__ALONG:
        setALong(((Long)newValue).longValue());
        return;
      case TypesPackage.ATHING__ASHORT:
        setAShort(((Short)newValue).shortValue());
        return;
      case TypesPackage.ATHING__ASTRING:
        setAString((String)newValue);
        return;
      case TypesPackage.ATHING__ACHAR:
        setAChar(((Character)newValue).charValue());
        return;
      case TypesPackage.ATHING__ADATE:
        setADate((Date)newValue);
        return;
      case TypesPackage.ATHING__ABYTES:
        setABytes((byte[])newValue);
        return;
      case TypesPackage.ATHING__ANUMBER:
        setANumber((Number)newValue);
        return;
      case TypesPackage.ATHING__AOBJECT:
        setAObject((Object)newValue);
        return;
      case TypesPackage.ATHING__ATHREAD:
        setAThread((Thread)newValue);
        return;
      case TypesPackage.ATHING__MANY_BOOLEAN:
        getManyBoolean().clear();
        getManyBoolean().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_BYTE:
        getManyByte().clear();
        getManyByte().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_DECIMAL:
        getManyDecimal().clear();
        getManyDecimal().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_FLOAT:
        getManyFloat().clear();
        getManyFloat().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_DOUBLE:
        getManyDouble().clear();
        getManyDouble().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_INT:
        getManyInt().clear();
        getManyInt().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_INTEGER:
        getManyInteger().clear();
        getManyInteger().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_LONG:
        getManyLong().clear();
        getManyLong().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_SHORT:
        getManyShort().clear();
        getManyShort().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_STRING:
        getManyString().clear();
        getManyString().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_CHAR:
        getManyChar().clear();
        getManyChar().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_DATE:
        getManyDate().clear();
        getManyDate().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_BYTES:
        getManyBytes().clear();
        getManyBytes().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_NUMBER:
        getManyNumber().clear();
        getManyNumber().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_OBJECT:
        getManyObject().clear();
        getManyObject().addAll((Collection)newValue);
        return;
      case TypesPackage.ATHING__MANY_THREAD:
        getManyThread().clear();
        getManyThread().addAll((Collection)newValue);
        return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case TypesPackage.ATHING__ABOOLEAN:
        unsetABoolean();
        return;
      case TypesPackage.ATHING__ABYTE:
        unsetAByte();
        return;
      case TypesPackage.ATHING__ADECIMAL:
        setADecimal(ADECIMAL_EDEFAULT);
        return;
      case TypesPackage.ATHING__AFLOAT:
        unsetAFloat();
        return;
      case TypesPackage.ATHING__ADOUBLE:
        unsetADouble();
        return;
      case TypesPackage.ATHING__AINT:
        unsetAInt();
        return;
      case TypesPackage.ATHING__AINTEGER:
        setAInteger(AINTEGER_EDEFAULT);
        return;
      case TypesPackage.ATHING__ALONG:
        unsetALong();
        return;
      case TypesPackage.ATHING__ASHORT:
        unsetAShort();
        return;
      case TypesPackage.ATHING__ASTRING:
        setAString(ASTRING_EDEFAULT);
        return;
      case TypesPackage.ATHING__ACHAR:
        unsetAChar();
        return;
      case TypesPackage.ATHING__ADATE:
        setADate(ADATE_EDEFAULT);
        return;
      case TypesPackage.ATHING__ABYTES:
        setABytes(ABYTES_EDEFAULT);
        return;
      case TypesPackage.ATHING__ANUMBER:
        setANumber(ANUMBER_EDEFAULT);
        return;
      case TypesPackage.ATHING__AOBJECT:
        setAObject(AOBJECT_EDEFAULT);
        return;
      case TypesPackage.ATHING__ATHREAD:
        setAThread(ATHREAD_EDEFAULT);
        return;
      case TypesPackage.ATHING__MANY_BOOLEAN:
        getManyBoolean().clear();
        return;
      case TypesPackage.ATHING__MANY_BYTE:
        getManyByte().clear();
        return;
      case TypesPackage.ATHING__MANY_DECIMAL:
        getManyDecimal().clear();
        return;
      case TypesPackage.ATHING__MANY_FLOAT:
        getManyFloat().clear();
        return;
      case TypesPackage.ATHING__MANY_DOUBLE:
        getManyDouble().clear();
        return;
      case TypesPackage.ATHING__MANY_INT:
        getManyInt().clear();
        return;
      case TypesPackage.ATHING__MANY_INTEGER:
        getManyInteger().clear();
        return;
      case TypesPackage.ATHING__MANY_LONG:
        getManyLong().clear();
        return;
      case TypesPackage.ATHING__MANY_SHORT:
        getManyShort().clear();
        return;
      case TypesPackage.ATHING__MANY_STRING:
        getManyString().clear();
        return;
      case TypesPackage.ATHING__MANY_CHAR:
        getManyChar().clear();
        return;
      case TypesPackage.ATHING__MANY_DATE:
        getManyDate().clear();
        return;
      case TypesPackage.ATHING__MANY_BYTES:
        getManyBytes().clear();
        return;
      case TypesPackage.ATHING__MANY_NUMBER:
        getManyNumber().clear();
        return;
      case TypesPackage.ATHING__MANY_OBJECT:
        getManyObject().clear();
        return;
      case TypesPackage.ATHING__MANY_THREAD:
        getManyThread().clear();
        return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
      case TypesPackage.ATHING__ABOOLEAN:
        return isSetABoolean();
      case TypesPackage.ATHING__ABYTE:
        return isSetAByte();
      case TypesPackage.ATHING__ADECIMAL:
        return ADECIMAL_EDEFAULT == null ? aDecimal != null : !ADECIMAL_EDEFAULT.equals(aDecimal);
      case TypesPackage.ATHING__AFLOAT:
        return isSetAFloat();
      case TypesPackage.ATHING__ADOUBLE:
        return isSetADouble();
      case TypesPackage.ATHING__AINT:
        return isSetAInt();
      case TypesPackage.ATHING__AINTEGER:
        return AINTEGER_EDEFAULT == null ? aInteger != null : !AINTEGER_EDEFAULT.equals(aInteger);
      case TypesPackage.ATHING__ALONG:
        return isSetALong();
      case TypesPackage.ATHING__ASHORT:
        return isSetAShort();
      case TypesPackage.ATHING__ASTRING:
        return ASTRING_EDEFAULT == null ? aString != null : !ASTRING_EDEFAULT.equals(aString);
      case TypesPackage.ATHING__ACHAR:
        return isSetAChar();
      case TypesPackage.ATHING__ADATE:
        return ADATE_EDEFAULT == null ? aDate != null : !ADATE_EDEFAULT.equals(aDate);
      case TypesPackage.ATHING__ABYTES:
        return ABYTES_EDEFAULT == null ? aBytes != null : !ABYTES_EDEFAULT.equals(aBytes);
      case TypesPackage.ATHING__ANUMBER:
        return ANUMBER_EDEFAULT == null ? aNumber != null : !ANUMBER_EDEFAULT.equals(aNumber);
      case TypesPackage.ATHING__AOBJECT:
        return AOBJECT_EDEFAULT == null ? aObject != null : !AOBJECT_EDEFAULT.equals(aObject);
      case TypesPackage.ATHING__ATHREAD:
        return ATHREAD_EDEFAULT == null ? aThread != null : !ATHREAD_EDEFAULT.equals(aThread);
      case TypesPackage.ATHING__MANY_BOOLEAN:
        return manyBoolean != null && !manyBoolean.isEmpty();
      case TypesPackage.ATHING__MANY_BYTE:
        return manyByte != null && !manyByte.isEmpty();
      case TypesPackage.ATHING__MANY_DECIMAL:
        return manyDecimal != null && !manyDecimal.isEmpty();
      case TypesPackage.ATHING__MANY_FLOAT:
        return manyFloat != null && !manyFloat.isEmpty();
      case TypesPackage.ATHING__MANY_DOUBLE:
        return manyDouble != null && !manyDouble.isEmpty();
      case TypesPackage.ATHING__MANY_INT:
        return manyInt != null && !manyInt.isEmpty();
      case TypesPackage.ATHING__MANY_INTEGER:
        return manyInteger != null && !manyInteger.isEmpty();
      case TypesPackage.ATHING__MANY_LONG:
        return manyLong != null && !manyLong.isEmpty();
      case TypesPackage.ATHING__MANY_SHORT:
        return manyShort != null && !manyShort.isEmpty();
      case TypesPackage.ATHING__MANY_STRING:
        return manyString != null && !manyString.isEmpty();
      case TypesPackage.ATHING__MANY_CHAR:
        return manyChar != null && !manyChar.isEmpty();
      case TypesPackage.ATHING__MANY_DATE:
        return manyDate != null && !manyDate.isEmpty();
      case TypesPackage.ATHING__MANY_BYTES:
        return manyBytes != null && !manyBytes.isEmpty();
      case TypesPackage.ATHING__MANY_NUMBER:
        return manyNumber != null && !manyNumber.isEmpty();
      case TypesPackage.ATHING__MANY_OBJECT:
        return manyObject != null && !manyObject.isEmpty();
      case TypesPackage.ATHING__MANY_THREAD:
        return manyThread != null && !manyThread.isEmpty();
    }
    return eDynamicIsSet(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (aBoolean: ");
    if (aBooleanESet) result.append(aBoolean); else result.append("<unset>");
    result.append(", aByte: ");
    if (aByteESet) result.append(aByte); else result.append("<unset>");
    result.append(", aDecimal: ");
    result.append(aDecimal);
    result.append(", aFloat: ");
    if (aFloatESet) result.append(aFloat); else result.append("<unset>");
    result.append(", aDouble: ");
    if (aDoubleESet) result.append(aDouble); else result.append("<unset>");
    result.append(", aInt: ");
    if (aIntESet) result.append(aInt); else result.append("<unset>");
    result.append(", aInteger: ");
    result.append(aInteger);
    result.append(", aLong: ");
    if (aLongESet) result.append(aLong); else result.append("<unset>");
    result.append(", aShort: ");
    if (aShortESet) result.append(aShort); else result.append("<unset>");
    result.append(", aString: ");
    result.append(aString);
    result.append(", aChar: ");
    if (aCharESet) result.append(aChar); else result.append("<unset>");
    result.append(", aDate: ");
    result.append(aDate);
    result.append(", aBytes: ");
    result.append(aBytes);
    result.append(", aNumber: ");
    result.append(aNumber);
    result.append(", aObject: ");
    result.append(aObject);
    result.append(", aThread: ");
    result.append(aThread);
    result.append(", manyBoolean: ");
    result.append(manyBoolean);
    result.append(", manyByte: ");
    result.append(manyByte);
    result.append(", manyDecimal: ");
    result.append(manyDecimal);
    result.append(", manyFloat: ");
    result.append(manyFloat);
    result.append(", manyDouble: ");
    result.append(manyDouble);
    result.append(", manyInt: ");
    result.append(manyInt);
    result.append(", manyInteger: ");
    result.append(manyInteger);
    result.append(", manyLong: ");
    result.append(manyLong);
    result.append(", manyShort: ");
    result.append(manyShort);
    result.append(", manyString: ");
    result.append(manyString);
    result.append(", manyChar: ");
    result.append(manyChar);
    result.append(", manyDate: ");
    result.append(manyDate);
    result.append(", manyBytes: ");
    result.append(manyBytes);
    result.append(", manyNumber: ");
    result.append(manyNumber);
    result.append(", manyObject: ");
    result.append(manyObject);
    result.append(", manyThread: ");
    result.append(manyThread);
    result.append(')');
    return result.toString();
  }

} //AThingImpl
