//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.3-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.02.21 at 11:46:13 GMT 
//


package net.sf.mpxj.planner.schema.impl;

public class DaysImpl implements net.sf.mpxj.planner.schema.Days, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, net.sf.mpxj.planner.schema.impl.runtime.UnmarshallableObject, net.sf.mpxj.planner.schema.impl.runtime.XMLSerializable, net.sf.mpxj.planner.schema.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Day;
    public final static java.lang.Class version = (net.sf.mpxj.planner.schema.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (net.sf.mpxj.planner.schema.Days.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "days";
    }

    protected com.sun.xml.bind.util.ListImpl _getDay() {
        if (_Day == null) {
            _Day = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Day;
    }

    public java.util.List getDay() {
        return _getDay();
    }

    public net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingEventHandler createUnmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
        return new net.sf.mpxj.planner.schema.impl.DaysImpl.Unmarshaller(context);
    }

    public void serializeBody(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Day == null)? 0 :_Day.size());
        context.startElement("", "days");
        int idx_0 = idx1;
        while (idx_0 != len1) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Day.get(idx_0 ++)), "Day");
        }
        context.endNamespaceDecls();
        int idx_1 = idx1;
        while (idx_1 != len1) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Day.get(idx_1 ++)), "Day");
        }
        context.endAttributes();
        while (idx1 != len1) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _Day.get(idx1 ++)), "Day");
        }
        context.endElement();
    }

    public void serializeAttributes(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Day == null)? 0 :_Day.size());
    }

    public void serializeURIs(net.sf.mpxj.planner.schema.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Day == null)? 0 :_Day.size());
    }

    public java.lang.Class getPrimaryInterface() {
        return (net.sf.mpxj.planner.schema.Days.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001dcom.sun.msv.gra"
+"mmar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000 com.sun.msv.gra"
+"mmar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001"
+"Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u000ep\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\nq\u0000~\u0000\u000epsr\u0000 com.sun.msv"
+".grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001"
+"xq\u0000~\u0000\u0004q\u0000~\u0000\u000epsr\u00002com.sun.msv.grammar.Expression$AnyStringExpr"
+"ession\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\r\u0001q\u0000~\u0000\u0015sr\u0000 com.sun.msv.grammar.A"
+"nyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016q\u0000~\u0000\u001bsr\u0000#com.sun.msv.grammar.SimpleNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespa"
+"ceURIq\u0000~\u0000\u001dxq\u0000~\u0000\u0018t\u0000\u001enet.sf.mpxj.planner.schema.Dayt\u0000+http://j"
+"ava.sun.com/jaxb/xjc/dummy-elementsq\u0000~\u0000\u001bsq\u0000~\u0000\u001ct\u0000\u0004dayst\u0000\u0000sr\u0000\""
+"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/L"
+"com/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun."
+"msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rs"
+"treamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;"
+"xp\u0000\u0000\u0000\u0004\u0001pq\u0000~\u0000\tq\u0000~\u0000\fq\u0000~\u0000\u0010q\u0000~\u0000\u0011x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends net.sf.mpxj.planner.schema.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(net.sf.mpxj.planner.schema.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return net.sf.mpxj.planner.schema.impl.DaysImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("day" == ___local)&&("" == ___uri)) {
                            _getDay().add(((net.sf.mpxj.planner.schema.impl.DayImpl) spawnChildFromEnterElement((net.sf.mpxj.planner.schema.impl.DayImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 2;
                        continue outer;
                    case  0 :
                        if (("days" == ___local)&&("" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  2 :
                        if (("day" == ___local)&&("" == ___uri)) {
                            _getDay().add(((net.sf.mpxj.planner.schema.impl.DayImpl) spawnChildFromEnterElement((net.sf.mpxj.planner.schema.impl.DayImpl.class), 2, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        state = 2;
                        continue outer;
                    case  2 :
                        if (("days" == ___local)&&("" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        state = 2;
                        continue outer;
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            state = 2;
                            continue outer;
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}