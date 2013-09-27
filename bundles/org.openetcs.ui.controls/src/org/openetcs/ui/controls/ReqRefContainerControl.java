package org.openetcs.ui.controls;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.edit.internal.swt.Activator;
import org.eclipse.emf.ecp.edit.internal.swt.controls.LinkControl;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class ReqRefContainerControl extends LinkControl {

	public ReqRefContainerControl(boolean showLabel,
			IItemPropertyDescriptor itemPropertyDescriptor,
			EStructuralFeature feature, ECPControlContext modelElementContext,
			boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext,
				embedded);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Object getLinkText(Object value) {
		String linkName = adapterFactoryItemDelegator.getText(((EObject)value).eContainer());
		return linkName == null ? "" : linkName;
	}
	@Override
	protected void linkClicked(EObject value) {
		getModelElementContext().openInNewContext(value.eContainer());
	}
	@Override
	protected Object getImage(Object value) {
		return Activator.getImage((URL) adapterFactoryItemDelegator.getImage(((EObject)value).eContainer()));
	}
}
