package com.google.gwt.i18n.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class DateTimeFormat_PredefinedFormat_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat[] values = com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer.deserialize(reader, (com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.google.gwt.i18n.shared.DateTimeFormat_PredefinedFormat_FieldSerializer.serialize(writer, (com.google.gwt.i18n.shared.DateTimeFormat.PredefinedFormat)object);
  }
  
}
