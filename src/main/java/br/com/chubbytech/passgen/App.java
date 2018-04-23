package br.com.chubbytech.passgen;

import java.io.Console;

/**
 * Hello world!
 *
 */
public class App 
{


	public static void main( String[] args )
    {
		char passwordArrays[] = null;
    	
    	if (args != null && args.length > 0) {
			
    		try {
    			
				String encrypt = genpass(args[0].toString());
				System.out.println(encrypt);
				System.exit(0);
				
			} catch (Exception e) {
				System.err.println("Ocorreu um erro na tentativa de criptografar a senha");
				System.exit(2);
			}
    		
    		
		} else {
    		
    		Console console = System.console();
    		
    		if (console == null) {
    			System.out.println("Não foi possível abrir o console");
    			System.exit(1);
    		}
    		
    		console.printf("%n");
    		console.printf("------------------------------------------------------------------------------------%n");
    		console.printf("  Aplicação para criptografar senhas - Utilitário do NFe-sendmail - ChubbyTech%n");
    		console.printf("------------------------------------------------------------------------------------%n");
    		console.printf("%n");
    		
    		passwordArrays = console.readPassword("Entre com a senha a ser criptografada: ");
    		
    		try {
    			
				String encrypt = genpass(new String(passwordArrays));
				console.printf("A senha criptografada é: %s%n", encrypt);
				System.exit(0);
				
			} catch (Exception e) {
				console.printf("Ocorreu um erro na tentativa de criptografar a senha");
				System.exit(2);
			}
    		
    	}
    	
    	
    }

	private static String genpass(String pass) throws Exception {
		return new EncryptDecrypt().encrypt(pass);
	}
}
