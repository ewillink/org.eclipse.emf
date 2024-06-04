/**
 * Copyright (c) 2003-2006 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 */
package org.eclipse.emf.ecore.change.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.change.util.ChangeAdapterFactory;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ChangeItemProviderAdapterFactory extends ChangeAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable
{
  /**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComposedAdapterFactory parentAdapterFactory;

  /**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IChangeNotifier changeNotifier = new ChangeNotifier();

  /**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Collection<Object> supportedTypes = new ArrayList<Object>();

  /**
   * This constructs an instance.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChangeItemProviderAdapterFactory()
  {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecore.change.ChangeDescription} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChangeDescriptionItemProvider changeDescriptionItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.ecore.change.ChangeDescription}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createChangeDescriptionAdapter()
  {
    if (changeDescriptionItemProvider == null)
    {
      changeDescriptionItemProvider = new ChangeDescriptionItemProvider(this);
    }

    return changeDescriptionItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EObjectToChangesMapEntryItemProvider eObjectToChangesMapEntryItemProvider;

  /**
   * This creates an adapter for a {@link java.util.Map.Entry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createEObjectToChangesMapEntryAdapter()
  {
    if (eObjectToChangesMapEntryItemProvider == null)
    {
      eObjectToChangesMapEntryItemProvider = new EObjectToChangesMapEntryItemProvider(this);
    }

    return eObjectToChangesMapEntryItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecore.change.FeatureChange} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureChangeItemProvider featureChangeItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.ecore.change.FeatureChange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureChangeAdapter()
  {
    if (featureChangeItemProvider == null)
    {
      featureChangeItemProvider = new FeatureChangeItemProvider(this);
    }

    return featureChangeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecore.change.ListChange} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListChangeItemProvider listChangeItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.ecore.change.ListChange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createListChangeAdapter()
  {
    if (listChangeItemProvider == null)
    {
      listChangeItemProvider = new ListChangeItemProvider(this);
    }

    return listChangeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecore.change.ResourceChange} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResourceChangeItemProvider resourceChangeItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.ecore.change.ResourceChange}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createResourceChangeAdapter()
  {
    if (resourceChangeItemProvider == null)
    {
      resourceChangeItemProvider = new ResourceChangeItemProvider(this);
    }

    return resourceChangeItemProvider;
  }

  /**
   * This keeps track of the one adapter used for all {@link org.eclipse.emf.ecore.change.FeatureMapEntry} instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureMapEntryItemProvider featureMapEntryItemProvider;

  /**
   * This creates an adapter for a {@link org.eclipse.emf.ecore.change.FeatureMapEntry}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter createFeatureMapEntryAdapter()
  {
    if (featureMapEntryItemProvider == null)
    {
      featureMapEntryItemProvider = new FeatureMapEntryItemProvider(this);
    }

    return featureMapEntryItemProvider;
  }

  /**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComposeableAdapterFactory getRootAdapterFactory()
  {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

  /**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
  {
    this.parentAdapterFactory = parentAdapterFactory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object type)
  {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

  /**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Adapter adapt(Notifier notifier, Object type)
  {
    return super.adapt(notifier, this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object adapt(Object object, Object type)
  {
    if (isFactoryForType(type))
    {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
      {
        return adapter;
      }
    }

    return null;
  }

  /**
   * This adds a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void addListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.addListener(notifyChangedListener);
  }

  /**
   * This removes a listener.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void removeListener(INotifyChangedListener notifyChangedListener)
  {
    changeNotifier.removeListener(notifyChangedListener);
  }

  /**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void fireNotifyChanged(Notification notification)
  {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null)
    {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

  /**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void dispose()
  {
    if (changeDescriptionItemProvider != null) changeDescriptionItemProvider.dispose();
    if (eObjectToChangesMapEntryItemProvider != null) eObjectToChangesMapEntryItemProvider.dispose();
    if (featureChangeItemProvider != null) featureChangeItemProvider.dispose();
    if (listChangeItemProvider != null) listChangeItemProvider.dispose();
    if (resourceChangeItemProvider != null) resourceChangeItemProvider.dispose();
    if (featureMapEntryItemProvider != null) featureMapEntryItemProvider.dispose();
  }

}
