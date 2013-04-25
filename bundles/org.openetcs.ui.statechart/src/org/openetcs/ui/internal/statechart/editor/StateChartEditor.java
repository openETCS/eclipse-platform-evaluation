package org.openetcs.ui.internal.statechart.editor;

import org.eclipse.emf.ecp.graphiti.ECPGraphitiDiagramEditor;


public class StateChartEditor extends ECPGraphitiDiagramEditor {
	
	public static final String EDITOR_ID="org.openetcs.ui.statechart.editor";
	
	public StateChartEditor() {
		super();
	}

	@Override
	public boolean isDirty() {
		return false;
	}
}
