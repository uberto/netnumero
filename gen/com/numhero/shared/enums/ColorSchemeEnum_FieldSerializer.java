package com.numhero.shared.enums;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ColorSchemeEnum_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.numhero.shared.enums.ColorSchemeEnum instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.numhero.shared.enums.ColorSchemeEnum instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.numhero.shared.enums.ColorSchemeEnum[] values = com.numhero.shared.enums.ColorSchemeEnum.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.numhero.shared.enums.ColorSchemeEnum instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.numhero.shared.enums.ColorSchemeEnum_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.numhero.shared.enums.ColorSchemeEnum_FieldSerializer.deserialize(reader, (com.numhero.shared.enums.ColorSchemeEnum)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.numhero.shared.enums.ColorSchemeEnum_FieldSerializer.serialize(writer, (com.numhero.shared.enums.ColorSchemeEnum)object);
  }
  
}
