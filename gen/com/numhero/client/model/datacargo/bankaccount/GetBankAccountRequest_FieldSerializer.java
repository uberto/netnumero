package com.numhero.client.model.datacargo.bankaccount;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class GetBankAccountRequest_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest instance) throws SerializationException {
    
    com.numhero.shared.datacargo.GetSingleEntityRequest_FieldSerializer.deserialize(streamReader, instance);
  }
  
  public static com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest instance) throws SerializationException {
    
    com.numhero.shared.datacargo.GetSingleEntityRequest_FieldSerializer.serialize(streamWriter, instance);
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest_FieldSerializer.deserialize(reader, (com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest_FieldSerializer.serialize(writer, (com.numhero.client.model.datacargo.bankaccount.GetBankAccountRequest)object);
  }
  
}
