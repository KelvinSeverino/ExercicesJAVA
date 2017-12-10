package ArquivosHD;

import java.io.File;

//Código abaixo serve para mostrar as pastas que se encontram em um unico diretório
public class Arquivos {
	public String diretorio = "C:\\"; //Insira aqui o caminho do diretorio que deseja pesquisar
	
	public void visualizarArquivos()
	{
		File file = new File(diretorio);
		File afile[] = file.listFiles();
		int i = 0;
		
		for(int c = afile.length; i < c; i++)
		{
			File arquivos = afile[i];
			if(arquivos.isDirectory() == true)
			{
				System.out.println("Diretório: " + arquivos.getName());
			}
			else
			{
				System.out.println("Arquivo: " + arquivos.getName());
			}	
			
		}
	}
	
	public static void main(String[] args)
	{
		Arquivos arq = new Arquivos();
		arq.visualizarArquivos();
	}
}