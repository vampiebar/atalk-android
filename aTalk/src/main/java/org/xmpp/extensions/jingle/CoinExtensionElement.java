/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 * 
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package org.xmpp.extensions.jingle;

import org.xmpp.extensions.AbstractExtensionElement;

/**
 * Represents the conference information.
 *
 * @author Sebastien Vincent
 * @author Eng Chong Meng
 */
public class CoinExtensionElement extends AbstractExtensionElement
{
	/**
	 * Name of the XML element representing the extension.
	 */
	public final static String ELEMENT = "conference-info";

	/**
	 * Namespace.
	 */
    public final static String NAMESPACE = "urn:xmpp:coin:1";

	/**
	 * IsFocus attribute name.
	 */
	public final static String ISFOCUS_ATTR_NAME = "isfocus";

	/**
	 * Constructs a new <tt>coin</tt> extension.
	 *
	 */
	public CoinExtensionElement()
	{
		super(ELEMENT, NAMESPACE);
	}

	/**
	 * Constructs a new <tt>coin</tt> extension.
	 *
	 * @param isFocus
	 *        <tt>true</tt> if the peer is a conference focus; otherwise, <tt>false</tt>
	 */
	public CoinExtensionElement(boolean isFocus)
	{
		super(ELEMENT, NAMESPACE);
		setAttribute(ISFOCUS_ATTR_NAME, isFocus);
	}
}
