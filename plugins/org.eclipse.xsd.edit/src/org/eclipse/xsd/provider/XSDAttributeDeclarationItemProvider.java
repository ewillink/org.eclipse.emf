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
 * $Id: XSDAttributeDeclarationItemProvider.java,v 1.1 2004/03/06 18:00:11 marcelop Exp $
 */
package org.eclipse.xsd.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

import org.eclipse.xsd.XSDAttributeDeclaration;
import org.eclipse.xsd.XSDAttributeUse;
import org.eclipse.xsd.XSDConcreteComponent;


/**
 * This is the item provider adpater for a {@link org.eclipse.xsd.XSDAttributeDeclaration} object.
 */
public class XSDAttributeDeclarationItemProvider
  extends XSDFeatureItemProvider
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
  public XSDAttributeDeclarationItemProvider(AdapterFactory adapterFactory)
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
      createTypeDefinitionPropertyDescriptor(object);
      createAnnotationPropertyDescriptor(object);
      createResolvedAttributeDeclarationPropertyDescriptor(object);
      createAttributeFormDefaultPropertyDescriptor(object);
    }
    return itemPropertyDescriptors;
  }

  protected static class DelegatingItemPropertyDescriptor extends ItemPropertyDescriptor
  {
    public DelegatingItemPropertyDescriptor
       (AdapterFactory adapterFactory,
        String displayName,
        String description,
        EStructuralFeature feature,
        boolean isSettable,
        Object staticImage)
    {
      super(adapterFactory, displayName, description, feature, isSettable, staticImage);
    }

    public Object getPropertyValue(Object object)
    {
      return super.getPropertyValue(((XSDAttributeDeclaration)object).getResolvedAttributeDeclaration());
    }

    public void setPropertyValue(Object object, Object value)
    {
      super.setPropertyValue(((XSDAttributeDeclaration)object).getResolvedAttributeDeclaration(), value);
    }
  }

  protected void createNamePropertyDescriptor(Object object)
  {

    // This is for the name feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_Name_label"),
         XSDEditPlugin.getString("_UI_Name_description"),
         xsdPackage.getXSDNamedComponent_Name(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public void setPropertyValue(Object o, Object value)
         {
           XSDAttributeDeclaration xsdAttributeDeclaration = (XSDAttributeDeclaration)o;
           if (xsdAttributeDeclaration.isAttributeDeclarationReference())
           {
             XSDAttributeDeclaration newResolvedAttributeDeclaration =
               xsdAttributeDeclaration.resolveAttributeDeclaration(xsdAttributeDeclaration.getTargetNamespace(), (String)value);
             EditingDomain editingDomain = getEditingDomain(xsdAttributeDeclaration);
             if (editingDomain == null)
             {
               xsdAttributeDeclaration.setResolvedAttributeDeclaration(newResolvedAttributeDeclaration);
             }
             else
             {
               editingDomain.getCommandStack().execute
                 (SetCommand.create
                    (editingDomain,
                     xsdAttributeDeclaration,
                     xsdPackage.getXSDAttributeDeclaration_ResolvedAttributeDeclaration(),
                     newResolvedAttributeDeclaration));
             }
           }
           else
           {
             super.setPropertyValue(o, value);
           }
         }
       });
  }

  protected void createTargetNamespacePropertyDescriptor(Object object)
  {

    // This is for the targetNamespace feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_TargetNamespace_label"),
         XSDEditPlugin.getString("_UI_TargetNamespace_description"),
         xsdPackage.getXSDNamedComponent_TargetNamespace(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public void setPropertyValue(Object o, Object value)
         {
           XSDAttributeDeclaration xsdAttributeDeclaration = (XSDAttributeDeclaration)o;
           if (xsdAttributeDeclaration.isAttributeDeclarationReference())
           {
             String namespace = (String)value;
             if (namespace.length() == 0)
             {
               namespace = null;
             }
             XSDAttributeDeclaration newResolvedAttributeDeclaration =
               xsdAttributeDeclaration.resolveAttributeDeclaration(namespace, xsdAttributeDeclaration.getName());
             EditingDomain editingDomain = getEditingDomain(xsdAttributeDeclaration);
             if (editingDomain == null)
             {
               xsdAttributeDeclaration.setResolvedAttributeDeclaration(newResolvedAttributeDeclaration);
             }
             else
             {
               editingDomain.getCommandStack().execute
                 (SetCommand.create
                    (editingDomain,
                     xsdAttributeDeclaration,
                     xsdPackage.getXSDAttributeDeclaration_ResolvedAttributeDeclaration(),
                     newResolvedAttributeDeclaration));
             }
           }
           else
           {
             super.setPropertyValue(o, value);
           }
         }
       });
  }

  protected void createAttributeFormDefaultPropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = (XSDAttributeDeclaration)object;

    // This is for the elementFormDefault feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptorWithDefault
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_Form_label"),
         XSDEditPlugin.getString("_UI_FormOfAttribute_description"),
         xsdPackage.getXSDFeature_Form(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE)
       {
         public Object getPropertyDefaultValue(Object o)
         {
           return 
             XSDEditPlugin.getString
               ("_UI_DefaultValue_label", new Object [] { ((XSDAttributeDeclaration)o).getSchema().getAttributeFormDefault().getName() });
         }
       });
  }

  protected void createLexicalValuePropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the value feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_LexicalValue_label"),
         XSDEditPlugin.getString("_UI_LexicalValueOfAttribute_description"),
         xsdPackage.getXSDFeature_LexicalValue(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE));
  }

  protected void createConstraintPropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the constraint feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_Constraint_label"),
         XSDEditPlugin.getString("_UI_ConstraintOfAttribute_description"),
         xsdPackage.getXSDFeature_Constraint(),
         true,
         ItemPropertyDescriptor.TEXT_VALUE_IMAGE));
  }

  protected void createScopePropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the scope feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_Scope_label"),
         XSDEditPlugin.getString("_UI_ScopeOfAttribute_description"),
         xsdPackage.getXSDFeature_Scope(),
         false,
        null));
  }

  protected void createTypeDefinitionPropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the typeDefinition feature.
    //
    itemPropertyDescriptors.add
      (new DelegatingItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_TypeDefinition_label"),
         XSDEditPlugin.getString("_UI_TypeDefinition_description"),
         xsdPackage.getXSDAttributeDeclaration_TypeDefinition(), 
         false,
         null));
  }

  protected void createAnnotationPropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the annotation feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_Annotation_label"),
         XSDEditPlugin.getString("_UI_AnnotationOfAttribute_description"),
         xsdPackage.getXSDAttributeDeclaration_Annotation(), 
         false));
  }

  protected void createResolvedAttributeDeclarationPropertyDescriptor(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);

    // This is for the resolvedAttributeDeclaration feature.
    //
    itemPropertyDescriptors.add
      (new ItemPropertyDescriptor
        (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
         XSDEditPlugin.getString("_UI_ResolveAttributeDeclaration_label"),
         XSDEditPlugin.getString("_UI_ResolveAttributeDeclaration_description"),
         xsdPackage.getXSDAttributeDeclaration_ResolvedAttributeDeclaration(), 
         false));
  }

  /**
   * This specifies how to implement {@link #getChildren} and 
   * {@link org.eclipse.emf.edit.command.AddCommand} and 
   * {@link org.eclipse.emf.edit.command.RemoveCommand} support in {@link #createCommand}.
   */
  public Collection getChildrenReferences(Object object)
  {
    if (childrenReferences == null)
    {
      super.getChildrenReferences(object);
      XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);
      childrenReferences.add(xsdPackage.getXSDAttributeDeclaration_AnonymousTypeDefinition());
      childrenReferences.add(xsdPackage.getXSDAttributeDeclaration_Annotation());
    }
    return childrenReferences;
  }

  /**
   * This returns XSDAttributeDeclaration.gif.
   */
  public Object getImage(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);
    XSDAttributeDeclaration resolvedAttributeDeclaration = xsdAttributeDeclaration.getResolvedAttributeDeclaration();
    return 
      XSDEditPlugin.getImage
       (resolvedAttributeDeclaration.getContainer() == null ?
          "full/obj16/XSDAttributeUnresolved" :
          xsdAttributeDeclaration.getResolvedAttributeDeclaration() == xsdAttributeDeclaration ?
            "full/obj16/XSDAttributeDeclaration" :
            "full/obj16/XSDAttributeUse");
  }

  public String getText(Object object)
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = ((XSDAttributeDeclaration)object);
    XSDAttributeDeclaration resolvedAttributeDeclaration = xsdAttributeDeclaration.getResolvedAttributeDeclaration();
    String name =
      xsdAttributeDeclaration != resolvedAttributeDeclaration ?
        xsdAttributeDeclaration.getQName() :
        xsdAttributeDeclaration.getName();

    StringBuffer result = new StringBuffer();
    if (name == null)
    {
      result.append(XSDEditPlugin.getString("_UI_Absent_label"));
    }
    else
    {
      result.append(name);
    }

    if (resolvedAttributeDeclaration.getAnonymousTypeDefinition() == null && resolvedAttributeDeclaration.getTypeDefinition() != null)
    {
      result.append(" : ");
      result.append(resolvedAttributeDeclaration.getTypeDefinition().getQName(xsdAttributeDeclaration));
    }

    return result.toString();
  }

  /**
   * This handles notification by calling {@link #fireNotifyChanged fireNotifyChanged}.
   */
  public void notifyChanged(Notification msg) 
  {
    XSDAttributeDeclaration xsdAttributeDeclaration = (XSDAttributeDeclaration)msg.getNotifier();
    if (msg.getFeature() == xsdPackage.getXSDAttributeDeclaration_TypeDefinition() || 
         msg.getFeature() == xsdPackage.getXSDAttributeDeclaration_AnonymousTypeDefinition() || 
         msg.getFeature() == xsdPackage.getXSDAttributeDeclaration_ResolvedAttributeDeclaration() ||
         msg.getFeature() == xsdPackage.getXSDAttributeDeclaration_Annotation())
    {
      fireNotifyChanged(msg);

      XSDConcreteComponent container = xsdAttributeDeclaration.getContainer();
      if (container instanceof XSDAttributeUse)
      {
        ((ItemProviderAdapter)adapterFactory.adapt(container, IItemLabelProvider.class)).fireNotifyChanged
          (new ENotificationImpl
            ((InternalEObject)container, 
             msg.getEventType(), 
             (EStructuralFeature)msg.getFeature(), 
             msg.getOldValue(), 
             msg.getNewValue(), 
             msg.getPosition()));
      }
      return;
    }
    super.notifyChanged(msg);
  }

  /**
   * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s 
   * describing all of the children that can be created under this object.
   */
  protected void collectNewChildDescriptors(Collection newChildDescriptors,
                                            Object object)
  {
    super.collectNewChildDescriptors(newChildDescriptors, object);
    XSDAttributeDeclaration ad = (XSDAttributeDeclaration) object;

    if (!ad.isAttributeDeclarationReference())
    {
      // annotation
      newChildDescriptors.add(createChildParameter(xsdPackage.getXSDAttributeDeclaration_Annotation(), xsdFactory.createXSDAnnotation()));

      // atomic, list, and union simple type definitions
      addSimpleTypeDefinitionChildParameters(newChildDescriptors, ad, xsdPackage.getXSDAttributeDeclaration_AnonymousTypeDefinition(), true, true, true);
    }
  }
}
