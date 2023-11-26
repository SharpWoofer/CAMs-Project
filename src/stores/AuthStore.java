package stores;

import models.User;

/**
 * The {@link AuthStore} class provides utility methods for managing the current
 * authenticated user within the application. It offers methods to set and get
 * the current user, as well as check if the user is logged in.
 */
public class AuthStore {
	/**
	 * The currently authenticated user.
	 */
	private static User currentUser;

	/**
	 * Private constructor {@link AuthStore} to prevent instantiation of the class.
	 */
	private AuthStore() {
	}

	/**
	 * Sets the current user in the AuthStore.
	 *
	 * @param currentUser the User instance to set as the current user
	 */
	public static void setCurrentUser(User currentUser) {
		AuthStore.currentUser = currentUser;
	}

	/**
	 * Checks if the user is logged in.
	 *
	 * @return true if the user is logged in, false otherwise
	 */
	public static boolean isLoggedIn() {
		return currentUser != null;
	}

	// ---------- Get Methods ---------- //
	/**
	 * Gets the current user from the AuthStore.
	 *
	 * @return the current User instance, or null if not logged in
	 */
	public static User getCurrentUser() {
		return AuthStore.currentUser;
	}
}