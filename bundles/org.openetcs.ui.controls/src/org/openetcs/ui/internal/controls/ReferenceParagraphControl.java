package org.openetcs.ui.internal.controls;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.ecp.edit.internal.swt.controls.ReferenceMultiControl;
import org.eclipse.emf.ecp.edit.util.ECPStaticApplicableTester;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class ReferenceParagraphControl extends ReferenceMultiControl {

	public ReferenceParagraphControl(boolean showLabel,
			IItemPropertyDescriptor itemPropertyDescriptor,
			EStructuralFeature feature, ECPControlContext modelElementContext,
			boolean embedded) {
		super(showLabel, itemPropertyDescriptor, feature, modelElementContext, embedded);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected int getTesterPriority(ECPStaticApplicableTester tester, IItemPropertyDescriptor itemPropertyDescriptor,
		EObject eObject) {
		return ReferenceParagraphTester.getTesterPriority(tester, itemPropertyDescriptor, eObject);
	}
}
