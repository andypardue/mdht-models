/*******************************************************************************
 * Copyright (c) 2015 seanmuir.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     seanmuir - initial API and implementation
 *
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.tests;


/**
 * @author seanmuir
 *
 */
public class TestEngine {
	//
	// /*
	// *
	// * sourceMap = test/BCHSourceMap.xmi
	// * sourceModel = BCHMessageGroup.BCHRXHistory
	// * sourceMsg = test/BCHSourceMessage.xml
	// * targetMap = test/CCDTargetMap.xmi
	// * targetModel = CCDMessageGroup.CCD
	// * targetMsg = test/CCDTargetMessage.xml
	// * convElements = one;two;three
	// */
	// @Test
	// public void testTransformationXML() {
	//
	// ConsolPackage.eINSTANCE.getAdvanceDirectiveObservation();
	//
	// final File folder = new File("/Users/seanmuir/git/sample_ccdas");
	// try {
	// listFilesForFolder(folder, "xml");
	// } catch (Exception e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// fail();
	//
	// }
	//
	// // transform("test/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", "test/AllergiesSection.xml",
	// // "test/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", "test/CCDTargetMessage.xml", "");
	// }
	//
	// @Test
	// public void testTransformationJson() {
	//
	// final File folder = new File("/Users/seanmuir/MDMIFixAgain/mdmicore/org.mdmi.core/JSON");
	// try {
	// listFilesForFolder(folder, "json");
	// } catch (Exception e) {
	// e.printStackTrace();
	// fail();
	// }
	//
	// // transform("test/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", "test/AllergiesSection.xml",
	// // "test/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", "test/CCDTargetMessage.xml", "");
	// }
	//
	// public String transform(String srcMap, String srcMdl, String srcMsg, String trgMap, String trgMdl, String trgMsg,
	// String cnvElm) throws Exception {
	//
	// File rootDir = new File(System.getProperties().getProperty("user.dir"));
	// System.out.println("  rootDir = " + rootDir.getAbsolutePath());
	// System.out.println("");
	//
	// // initialize the runtime, using the current folder as the roo folder
	// Mdmi.INSTANCE.initialize(rootDir);
	// Mdmi.INSTANCE.start();
	//
	// String retVal = null;
	// // try {
	// // 1. check to make sure the maps and messages exist
	// File f = Mdmi.INSTANCE.fileFromRelPath(srcMap);
	// if (!f.exists() || !f.isFile()) {
	// System.out.println("Source map file '" + srcMap + "' does not exist!");
	// usage();
	// }
	//
	// f = Mdmi.INSTANCE.fileFromRelPath(trgMap);
	// if (!f.exists() || !f.isFile()) {
	// System.out.println("Target map file '" + trgMap + "' does not exist!");
	// usage();
	// }
	//
	// /// Users/seanmuir/git/sample_ccdas/Allscripts Samples/Enterprise EHR/b2 Adam Everyman ToC.xml
	// // f = Mdmi.INSTANCE.fileFromRelPath(srcMsg);
	// // if (!f.exists() || !f.isFile()) {
	// // System.out.println("Source message file '" + f.getAbsolutePath() + "' does not exist!");
	// // usage();
	// // }
	//
	// f = Mdmi.INSTANCE.fileFromRelPath(trgMsg);
	// if (!f.exists() || !f.isFile()) {
	// System.out.println("Target message file '" + trgMsg + "' does not exist!");
	// usage();
	// }
	//
	// // 2. make sure the qualified message names are spelled right
	// String[] a = srcMdl.split("\\.");
	// if (a == null || a.length != 2) {
	// System.out.println("Invalid source model '" + srcMdl + "', must be formatted as MapName.MessageName");
	// usage();
	// }
	// String srcMapName = a[0];
	// String srcMsgMdl = a[1];
	//
	// a = trgMdl.split("\\.");
	// if (a == null || a.length != 2) {
	// System.out.println("Invalid target model '" + trgMdl + "', must be formatted as MapName.MessageName");
	// usage();
	// }
	// String trgMapName = a[0];
	// String trgMsgMdl = a[1];
	//
	// // 3. parse the elements array
	// final ArrayList<String> elements = new ArrayList<String>();
	// String[] ss = cnvElm.split(";");
	// for (String s : ss) {
	// if (s != null && s.trim().length() > 0) {
	// elements.add(s);
	// }
	// }
	//
	// // 4. load the maps into the runtime.
	// Mdmi.INSTANCE.getConfig().putMapInfo(new MdmiConfig.MapInfo(srcMapName, srcMap));
	// Mdmi.INSTANCE.getConfig().putMapInfo(new MdmiConfig.MapInfo(trgMapName, trgMap));
	// Mdmi.INSTANCE.getResolver().resolveConfig(Mdmi.INSTANCE.getConfig());
	//
	// // 5. Construct the parameters to the call based on the values passed in
	// MdmiModelRef sMod = new MdmiModelRef(srcMapName, srcMsgMdl);
	// MdmiMessage sMsg = new MdmiMessage(new File(srcMsg));
	// MdmiModelRef tMod = new MdmiModelRef(trgMapName, trgMsgMdl);
	// MdmiMessage tMsg = new MdmiMessage(Mdmi.INSTANCE.fileFromRelPath(trgMsg));
	//
	// Map<String, MdmiBusinessElementReference> left = sMod.getModel().getBusinessElementHashMap();
	//
	// Map<String, MdmiBusinessElementReference> right = tMod.getModel().getBusinessElementHashMap();
	//
	// Equivalence<MdmiBusinessElementReference> valueEquivalence = new Equivalence<MdmiBusinessElementReference>() {
	//
	// @Override
	// protected boolean doEquivalent(MdmiBusinessElementReference a, MdmiBusinessElementReference b) {
	// return a.getUniqueIdentifier().equals(b.getUniqueIdentifier());
	// }
	//
	// @Override
	// protected int doHash(MdmiBusinessElementReference t) {
	// return t.getUniqueIdentifier().hashCode();
	// }
	// };
	//
	// MapDifference<String, MdmiBusinessElementReference> differences = Maps.difference(
	// left, right, valueEquivalence);
	//
	// Predicate<MdmiBusinessElementReference> predicate = new Predicate<MdmiBusinessElementReference>() {
	//
	// @Override
	// public boolean apply(MdmiBusinessElementReference input) {
	//
	// if (!elements.isEmpty()) {
	// for (String element : elements) {
	// if (input.getName().equalsIgnoreCase(element)) {
	// return true;
	// }
	//
	// }
	// return false;
	// }
	// return true;
	//
	// }
	// };
	// ;
	//
	// ArrayList<MdmiBusinessElementReference> bers = new ArrayList<MdmiBusinessElementReference>();
	// bers.addAll(Collections2.filter(differences.entriesInCommon().values(), predicate));
	//
	// MdmiTransferInfo ti = new MdmiTransferInfo(sMod, sMsg, tMod, tMsg, bers);
	// ti.useDictionary = true;
	//
	// // 6. call the runtime
	// Mdmi.INSTANCE.executeTransfer(ti);
	//
	// // 7. set the return value
	// retVal = tMsg.getDataAsString();
	//
	// saveResults(retVal);
	//
	// // } catch (Exception ex) {
	// // ex.printStackTrace();
	// // }
	// Mdmi.INSTANCE.stop();
	// return retVal; // return the target message transformed
	// }
	//
	// private static void usage() {
	// System.out.println("PARAMETERS:");
	// System.out.println("  sourceMap   = the file name of the source map to load, relative path");
	// System.out.println("  sourceModel = the source model name formatted as messageGroupName.messageModelName");
	// System.out.println("  sourceMsg   = the file name of the source message to transform, relative path");
	// System.out.println("  targetMap   = the file name of the target map to load, relative path");
	// System.out.println("  targetModel = the target model name formatted as messageGroupName.messageModelName");
	// System.out.println("  targetMsg   = the file name of the target message to transform, relative path");
	// System.out.println("  elements (optional)    = the name(s) of the BERs to convert from source to target");
	// System.exit(-1);
	// }
	//
	// public static void saveResults(String content) throws Exception {
	//
	// FileOutputStream fop = null;
	// File file;
	//
	// file = new File("results.json");
	// fop = new FileOutputStream(file);
	//
	// // if file doesnt exists, then create it
	// if (!file.exists()) {
	// file.createNewFile();
	// }
	//
	// // get the content in bytes
	// byte[] contentInBytes = content.getBytes();
	//
	// fop.write(contentInBytes);
	// fop.flush();
	// fop.close();
	//
	// System.out.println("Done");
	//
	// }
	//
	// public void listFilesForFolder(final File folder, String extension) throws Exception {
	// for (final File fileEntry : folder.listFiles()) {
	// if (fileEntry.isDirectory()) {
	// listFilesForFolder(fileEntry, extension);
	// } else if (fileEntry.getName().endsWith(extension)) {
	//
	// try {
	// String result = transform(
	// "maps/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", fileEntry.getAbsolutePath(),
	// "maps/cdamap.xmi", "consol_ContinuityOfCareDocument.consol", "CDA/CCD_Source.xml", "");
	//
	// ValidationHandler handler = new ValidationHandler() {
	//
	// public void handleError(Diagnostic diagnostic) {
	//
	// System.out.println(diagnostic.getMessage());
	// // System.out.
	// // do nothing
	// }
	//
	// public void handleInfo(Diagnostic diagnostic) {
	// // do nothing
	// }
	//
	// public void handleWarning(Diagnostic diagnostic) {
	// // do nothing
	// }
	//
	// };
	// CDAUtil.load(new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8)));
	//
	// // CDAUtil.l
	// System.out.println(result);
	// } catch (Exception e) {
	// System.out.println("FAILS" + fileEntry.getAbsolutePath());
	// e.printStackTrace();
	// }
	//
	// // break;
	//
	// }
	// }
	// }

}
