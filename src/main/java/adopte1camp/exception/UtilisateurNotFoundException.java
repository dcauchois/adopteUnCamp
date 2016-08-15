package adopte1camp.exception;

public class UtilisateurNotFoundException extends Exception 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UtilisateurNotFoundException(String loginUtilisateur)
	{
		super("L'utilisateur "+loginUtilisateur+" n'a pas été trouvé");
	}
}
