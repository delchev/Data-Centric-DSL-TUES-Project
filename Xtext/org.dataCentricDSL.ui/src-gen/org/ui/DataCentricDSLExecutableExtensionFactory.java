/*
 * generated by Xtext
 */
package org.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.ui.internal.DataCentricDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DataCentricDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DataCentricDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DataCentricDSLActivator.getInstance().getInjector(DataCentricDSLActivator.ORG_DATACENTRICDSL);
	}
	
}