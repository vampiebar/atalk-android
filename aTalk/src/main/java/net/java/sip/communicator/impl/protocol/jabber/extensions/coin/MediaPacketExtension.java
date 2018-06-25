/*
 * Jitsi, the OpenSource Java VoIP and Instant Messaging client.
 *
 * Distributable under LGPL license. See terms of license at gnu.org.
 */
package net.java.sip.communicator.impl.protocol.jabber.extensions.coin;

import net.java.sip.communicator.impl.protocol.jabber.extensions.AbstractPacketExtension;

import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.util.XmlStringBuilder;

import java.util.Map;

/**
 * Media packet extension.
 *
 * @author Sebastien Vincent
 * @author Eng Chong Meng
 */
public class MediaPacketExtension extends AbstractPacketExtension
{
    /**
     * The name of the element that contains the media data.
     */
    public static final String ELEMENT_NAME = "media";

    /**
     * The namespace that media belongs to.
     */
    public static final String NAMESPACE = null;

    /**
     * Display text element name.
     */
    public static final String ELEMENT_DISPLAY_TEXT = "display-text";

    /**
     * Source ID element name.
     */
    public static final String ELEMENT_SRC_ID = "src-id";

    /**
     * Label element name.
     */
    public static final String ELEMENT_LABEL = "label";

    /**
     * Type element name.
     */
    public static final String ELEMENT_TYPE = "type";

    /**
     * Status element name.
     */
    public static final String ELEMENT_STATUS = "status";

    /**
     * ID attribute name.
     */
    public static final String ID_ATTR_NAME = "id";

    /**
     * Source ID.
     */
    private String srcId = null;

    /**
     * Type.
     */
    private String type = null;

    /**
     * Label.
     */
    private String label = null;

    /**
     * Display text.
     */
    private String displayText = null;

    /**
     * Media status.
     */
    private String status = null;

    /**
     * Constructor.
     *
     * @param id media ID
     */
    public MediaPacketExtension(String id)
    {
        super(ELEMENT_NAME, NAMESPACE);

        setAttribute(ID_ATTR_NAME, id);
    }

    /**
     * Set label.
     *
     * @param label label
     */
    public void setLabel(String label)
    {
        this.label = label;
    }

    /**
     * Set status.
     *
     * @param status status.
     */
    public void setStatus(String status)
    {
        this.status = status;
    }

    /**
     * Set src-id.
     *
     * @param srcId src-id
     */
    public void setSrcID(String srcId)
    {
        this.srcId = srcId;
    }

    /**
     * Set type.
     *
     * @param type type
     */
    public void setType(String type)
    {
        this.type = type;
    }

    /**
     * Set display text.
     *
     * @param displayText display text
     */
    public void setDisplayText(String displayText)
    {
        this.displayText = displayText;
    }

    /**
     * Get display text.
     *
     * @return display text
     */
    public String getDisplayText()
    {
        return displayText;
    }

    /**
     * Get type.
     *
     * @return type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Get label.
     *
     * @return label
     */
    public String getLabel()
    {
        return label;
    }

    /**
     * Get status.
     *
     * @return status.
     */
    public String getStatus()
    {
        return status;
    }

    /**
     * Get src-id.
     *
     * @return src-id
     */
    public String getSrcID()
    {
        return srcId;
    }

    /**
     * Get an XML string representation.
     *
     * @return XML string representation
     */
    @Override
    public XmlStringBuilder toXML()
    {
        XmlStringBuilder xml = new XmlStringBuilder();
        xml.prelude(getElementName(), getNamespace());

        // add the rest of the attributes if any
        for (Map.Entry<String, Object> entry : attributes.entrySet()) {
            xml.optAttribute(entry.getKey(), entry.getValue().toString());
        }
        xml.append(">");

        xml.optElement(ELEMENT_DISPLAY_TEXT, displayText);
        xml.optElement(ELEMENT_TYPE, type);
        xml.optElement(ELEMENT_SRC_ID, srcId);
        xml.optElement(ELEMENT_STATUS, status);
        xml.optElement(ELEMENT_LABEL, label);

        for (ExtensionElement ext : getChildExtensions()) {
            xml.append(ext.toXML());
        }
        xml.closeElement(getElementName());
        return xml;
    }
}
