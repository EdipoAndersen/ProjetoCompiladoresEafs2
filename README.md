# ProjetoCompiladoresEafs2
O projeto consiste da execu��o de testes sobre um CallGraph gerado, o c�digo original do gerador � autoria de Marlon Reghert(mras), eu rodei testes diferentes em classes diferentes das pertencentes a ele. 

SampleOne - Nessa classe � definido um m�todo que n�o vai ser chamadao pelo Main(no caso, o metodoNaoChamado), os testes uncalledMethodExistenceTeste e o  uncalledMethodInEdgeTest verificam se essa caracteristica � verdadeira no c�digo.
SampleTwo - Nessa classe s�o definidos m�todos que utilizam uma recurs�o m�tua(recursaoMutuaA e recursaoMutuaB) e s�o usados no Main, o mutualRecursionTeste verifica se isso � verdade no c�digo. Visto que toda recurs�o m�tua � indireta, tamb�m � realizado o teste indirectRecursionTest para refor�ar essa certeza.
Sample Three - Nessa classe � definido um m�todo numa classe pai que sera herdado pela classe teste, tal classe sendo assim classe filha da que possui a defini��o a mesma defini��o do m�todo descrito na classe herdada. O inheritanceMethodEdge verifica a exist�ncia dessa heran�a no c�digo, ou seja, existir� uma aresta da classe SampleThree para a classe pai.

O c�digo dos testes est�o no caminho CallGraph/src/tests. Sendo os DetailsTests os descritos acima. No caso dos GraphConstructionTests, eles reportam erro caso exista algum problema na cria��o dos CallGraphs.  Os arquivos utilizados pelo compilador s�o os SampleOne.jar, SampleTwo.jar,  SampleThree.jar. Enquanto os arquivos .java correspondentes s�o usados para refer�ncia do leitor e para uso de defini��o de m�todos. Os testes unit�rios s�o poss�veis de serem compilados atrav�s do JUnity na j� supracitada classe DetailsTests.java.

Contato: eafs2@cin.ufpe.br (Edipo Andersen).