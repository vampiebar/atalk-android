/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 * 
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package org.xmpp.extensions.jingleinfo;

import org.xmpp.extensions.AbstractExtensionElement;

/**
 * Stun packet extension.
 *
 * @author Sebastien Vincent
 * @author Eng Chong Meng
 */
public class StunExtensionElement extends AbstractExtensionElement
{
	/**
	 * The namespace.
	 */
    public static final String NAMESPACE = "google:jingleinfo";

	/**
	 * The element name.
	 */
	public static final String ELEMENT_NAME = "stun";

	/**
	 * Constructor.
	 */
	public StunExtensionElement()
	{
		super(ELEMENT_NAME, NAMESPACE);
	}
}
