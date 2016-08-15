package adopte1camp.exception;

public class UtilisateurAlreadyExistException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UtilisateurAlreadyExistException(String login)
	{
		super("Le login "+login+" est déjà présent dans la base de donnée");
	}

}
