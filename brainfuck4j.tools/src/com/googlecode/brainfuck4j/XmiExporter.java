/**
 * 
 */
package com.googlecode.brainfuck4j;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.code.brainfuck4j.model.brainfuck.Program;

/**
 * @author a108600
 *
 */
public class XmiExporter {

	/**
	 * 
	 */
	public XmiExporter() {
		super();
	}
	
	public void export (InputStream is, File dir) throws IOException, ParseException {
		FckReader reader = new FckReader(is);
		Program program = reader.getProgram();
		File output = new File(dir, program.getHeader().getName() + ".xmi");
		export(program, URI.createFileURI(output.getAbsolutePath()));
	}

	public void export (EObject rootElement, URI uri) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		Map<String, Object> extMap = resourceSet
				.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extMap.put("*", new XMIResourceFactoryImpl());

		Resource resource = resourceSet.createResource(uri);
		List<EObject> objectList = resource.getContents();
		objectList.add(rootElement);
		
		// Serialize model
		resource.save(null);
	}
}
