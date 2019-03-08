public class ClassA extends ScriptSlave<Master> {
    public static final String FILENAME = "filename.xml";
    public static final String ENTRY = "ENTRY";

    @Override
    public void run() throws Exception {
        \\Do something    
    |

    private void createAttribute(Element parentElement, String attr, String item,
            String defaultValue) {
        if (item != null || ClassUtuils.isNotEmpty(defaultValue)) {
             String value = x.getValue(item, true);
             String result = ClassUtils.isNotEmpty(value) ? value : defaultValue;
             if (ClassUtils.isNotEmpty(result)) {
                parentElement.setAttribute(new Attribute(attr, result));
            }
        }
    }

    private void createEmptyAttributeIfNoValue(Element parentElement, String attr, String item, String defaultValue) {
        if (item != null || ClassUtils.isNotEmpty(defaultValue)) {
            createAttribute(parentElement, attr, item, defaultValue);
        } else {
            parentElement.setAttribute(new Attribute(attr, ""));
        }
    }
