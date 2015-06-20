package Gerador;

import java.io.File;
import java.io.IOException;

import com.ibm.wala.core.tests.callGraph.CallGraphTestUtil;
import com.ibm.wala.ipa.callgraph.AnalysisCache;
import com.ibm.wala.ipa.callgraph.AnalysisOptions;
import com.ibm.wala.ipa.callgraph.AnalysisScope;
import com.ibm.wala.ipa.callgraph.CallGraph;
import com.ibm.wala.ipa.callgraph.CallGraphBuilderCancelException;
import com.ibm.wala.ipa.callgraph.Entrypoint;
import com.ibm.wala.ipa.callgraph.impl.Util;
import com.ibm.wala.ipa.cha.ClassHierarchy;
import com.ibm.wala.ipa.cha.ClassHierarchyException;
import com.ibm.wala.util.config.AnalysisScopeReader;
import com.ibm.wala.util.io.FileProvider;

public class CallGraphGenerator {
	static public CallGraph buildCG(String JARPATH) throws IllegalArgumentException, CallGraphBuilderCancelException, IOException, ClassHierarchyException {
		String exclusionFile = null;
		AnalysisScope scope = AnalysisScopeReader.makeJavaBinaryAnalysisScope(JARPATH, exclusionFile != null ? new File(exclusionFile)
		: (new FileProvider()).getFile(CallGraphTestUtil.REGRESSION_EXCLUSIONS));
		ClassHierarchy cha = ClassHierarchy.make(scope);
		Iterable<Entrypoint> entrypoints = com.ibm.wala.ipa.callgraph.impl.Util.makeMainEntrypoints(scope, cha);
		AnalysisOptions options = new AnalysisOptions(scope, entrypoints);
		com.ibm.wala.ipa.callgraph.CallGraphBuilder builder = Util.makeZeroCFABuilder(options, new AnalysisCache(), cha, scope, null,
				null);
		CallGraph cg = builder.makeCallGraph(options,null);
		return cg;  
	} 
}
	
/*public static void main(String[] args) {
		//Classe auxiliar de testes.
		try {
			CallGraph g = buildCG("JLex.jar");
			//Iterator<CGNode> it = g.iterator(); // iterator pros nos
			
			while(it.hasNext()) {
				//CGNode no = it.next();
				String assinatura = no.getMethod().getSignature();
				
				System.out.println(no);
				
				//Iterator<CallSiteReference> adjacentes =  no.iterateCallSites();
				
				while(adjacentes.hasNext()) {
					//CallSiteReference adj =  adjacentes.next();
					String assinaturaAdj = adj.getDeclaredTarget().getSignature();
					
					System.out.print(" [->>>" + assinaturaAdj + "<<<<-] ");
				}
				
				System.out.println();
			}
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CallGraphBuilderCancelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassHierarchyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}*/