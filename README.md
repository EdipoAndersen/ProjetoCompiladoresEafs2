# ProjetoCompiladoresEafs2
O projeto consiste da execução de testes sobre um CallGraph gerado, o código original do gerador é autoria de Marlon Reghert(mras), eu rodei testes diferentes em classes diferentes das pertencentes a ele. 

SampleOne - Nessa classe é definido um método que não vai ser chamadao pelo Main(no caso, o metodoNaoChamado), os testes uncalledMethodExistenceTeste e o  uncalledMethodInEdgeTest verificam se essa caracteristica é verdadeira no código.
SampleTwo - Nessa classe são definidos métodos que utilizam uma recursão mútua(recursaoMutuaA e recursaoMutuaB) e são usados no Main, o mutualRecursionTeste verifica se isso é verdade no código. Visto que toda recursão mútua é indireta, também é realizado o teste indirectRecursionTest para reforçar essa certeza.
Sample Three - Nessa classe é definido um método numa classe pai que sera herdado pela classe teste, tal classe sendo assim classe filha da que possui a definição a mesma definição do método descrito na classe herdada. O inheritanceMethodEdge verifica a existência dessa herança no código, ou seja, existirá uma aresta da classe SampleThree para a classe pai.

O código dos testes estão no caminho CallGraph/src/tests. Sendo os DetailsTests os descritos acima. No caso dos GraphConstructionTests, eles reportam erro caso exista algum problema na criação dos CallGraphs.  Os arquivos utilizados pelo compilador são os SampleOne.jar, SampleTwo.jar,  SampleThree.jar. Enquanto os arquivos .java correspondentes são usados para referência do leitor e para uso de definição de métodos. Os testes unitários são possíveis de serem compilados através do JUnity na já supracitada classe DetailsTests.java.

Contato: eafs2@cin.ufpe.br (Edipo Andersen).