/**
 * <copyright>
 *
 * Copyright (c) 2002-2004 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors: 
 *   IBM - Initial API and implementation
 *
 * </copyright>
 *
 * $Id: XSDEnumerationFacetItemProvider.java,v 1.1 2004/03/06 18:00:11 marcelop Exp $
 */
package org.eclipse.xsd.provider;


import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.eclipse.xsd.XSDEnumerationFacet;


/**
 * This is the item provider adpater for a {@link org.eclipse.xsd.XSDEnumerationFacet} object.
 */
public class XSDEnumerationFacetItemProvider
  extends XSDRepeatableFacetItemProvider
  implements 
    IEditingDomainItemProvider,
    IStructuredItemContentProvider, 
    ITreeItemContentProvider, 
    IItemLabelProvider, 
    IItemPropertySource
{
  /**
   * This constructs an instance from a factory and a notifier.
   */
  public XSDEnumerationFacetItemProvider(AdapterFactory adapterFactory)
  {
    super(adapterFactory);
  }

  /**
   * This returns the property descriptors for the adapted class.
   */
  public List getPropertyDescriptors(Object object)
  {
    if (itemPropertyDescriptors == null)
    {
      super.getPropertyDescriptors(object);

      XSDEnumerationFacet xsdEnumerationFacet = ((XSDEnumerationFacet)object);

      // This is for the value feature.
      //
      itemPropertyDescriptors.add
        (new ItemPropertyDescriptor
          (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
           XSDEditPlugin.getString("_UI_Value_label"),
           XSDEditPlugin.getString("_UI_ValueEnumerationFacet_description"),
           xsdPackage.getXSDEnumerationFacet_Value(),
           false,
           ItemPropertyDescriptor.TEXT_VALUE_IMAGE));

    }
    return itemPropertyDescriptors;
  }

  /**
   * This returns XSDEnumerationFacet.gif.
   */
  public Object getImage(Object object)
  {
    return XSDEditPlugin.getImage("full/obj16/XSDEnumerationFacet");
  }

  public String getText(Object object)
  {
    XSDEnumerationFacet xsdEnumerationFacet = ((XSDEnumerationFacet)object);
    String result = xsdEnumerationFacet.getLexicalValue();
    return result == null ? "" : result;
  }

  /**
   * This handles notification by calling {@link #fireNotifyChanged fireNotifyChanged}.
   */
  public void notifyChanged(Notification msg) 
  {
    if (
         msg.getFeature() == xsdPackage.getXSDEnumerationFacet_Value()
       )
    {
      fireNotifyChanged(msg);
      return;
    }
    super.notifyChanged(msg);
  }

}
