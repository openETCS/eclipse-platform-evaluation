package org.openetcs.ui.internal.ecp;

import java.io.File;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.ui.util.ECPHandlerHelper;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.progress.IProgressService;
import org.openetcs.es3f.ImportUtil;

public class CreateProjectFromImportHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		FileDialog fd = new FileDialog(HandlerUtil.getActiveShell(event), SWT.OPEN);
		fd.setFilterExtensions(new String[] { "*.efs" });
		final String pathToImport = fd.open();
		if (pathToImport == null)
			return null;
		final ECPProject project = ECPHandlerHelper.createProject(HandlerUtil.getActiveShell(event));
		IProgressService progressService = PlatformUI.getWorkbench().getProgressService();
		try {
			progressService.run(true, false, new IRunnableWithProgress() {
				@Override
				public void run(IProgressMonitor monitor) throws InvocationTargetException,
					InterruptedException {
					ImportUtil.importModel(new File(pathToImport), project, monitor);
				}
			});
		} catch (InvocationTargetException e) {
			showImportErrorDialog(e.getMessage());
		} catch (InterruptedException e) {
			showImportErrorDialog(e.getMessage());
		}
		return null;
	}

	public void showImportErrorDialog(String message) {
		MessageDialog.openError(Display.getCurrent().getActiveShell(),
			"Import error",
			"An error occurred during import: " + message);
	}

}
