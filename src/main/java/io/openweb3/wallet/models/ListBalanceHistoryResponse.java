/*
 * Wallet API Documentation
 * This is a custody wallet service api server.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.openweb3.wallet.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.openweb3.wallet.models.Balance;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.openweb3.wallet.internal.JSON;

/**
 * ListBalanceHistoryResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-02-19T17:27:01.667922+08:00[Asia/Shanghai]", comments = "Generator version: 7.11.0")
public class ListBalanceHistoryResponse {
  public static final String SERIALIZED_NAME_BALANCES = "balances";
  @SerializedName(SERIALIZED_NAME_BALANCES)
  @javax.annotation.Nullable
  private List<Balance> balances = new ArrayList<>();

  public static final String SERIALIZED_NAME_BEGIN_AT = "begin_at";
  @SerializedName(SERIALIZED_NAME_BEGIN_AT)
  @javax.annotation.Nullable
  private String beginAt;

  public static final String SERIALIZED_NAME_END_AT = "end_at";
  @SerializedName(SERIALIZED_NAME_END_AT)
  @javax.annotation.Nullable
  private String endAt;

  public ListBalanceHistoryResponse() {
  }

  public ListBalanceHistoryResponse balances(@javax.annotation.Nullable List<Balance> balances) {
    this.balances = balances;
    return this;
  }

  public ListBalanceHistoryResponse addBalancesItem(Balance balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<>();
    }
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * Get balances
   * @return balances
   */
  @javax.annotation.Nullable
  public List<Balance> getBalances() {
    return balances;
  }

  public void setBalances(@javax.annotation.Nullable List<Balance> balances) {
    this.balances = balances;
  }


  public ListBalanceHistoryResponse beginAt(@javax.annotation.Nullable String beginAt) {
    this.beginAt = beginAt;
    return this;
  }

  /**
   * Get beginAt
   * @return beginAt
   */
  @javax.annotation.Nullable
  public String getBeginAt() {
    return beginAt;
  }

  public void setBeginAt(@javax.annotation.Nullable String beginAt) {
    this.beginAt = beginAt;
  }


  public ListBalanceHistoryResponse endAt(@javax.annotation.Nullable String endAt) {
    this.endAt = endAt;
    return this;
  }

  /**
   * Get endAt
   * @return endAt
   */
  @javax.annotation.Nullable
  public String getEndAt() {
    return endAt;
  }

  public void setEndAt(@javax.annotation.Nullable String endAt) {
    this.endAt = endAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListBalanceHistoryResponse listBalanceHistoryResponse = (ListBalanceHistoryResponse) o;
    return Objects.equals(this.balances, listBalanceHistoryResponse.balances) &&
        Objects.equals(this.beginAt, listBalanceHistoryResponse.beginAt) &&
        Objects.equals(this.endAt, listBalanceHistoryResponse.endAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, beginAt, endAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListBalanceHistoryResponse {\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    beginAt: ").append(toIndentedString(beginAt)).append("\n");
    sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("balances");
    openapiFields.add("begin_at");
    openapiFields.add("end_at");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListBalanceHistoryResponse
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListBalanceHistoryResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListBalanceHistoryResponse is not found in the empty JSON string", ListBalanceHistoryResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListBalanceHistoryResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListBalanceHistoryResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("balances") != null && !jsonObj.get("balances").isJsonNull()) {
        JsonArray jsonArraybalances = jsonObj.getAsJsonArray("balances");
        if (jsonArraybalances != null) {
          // ensure the json data is an array
          if (!jsonObj.get("balances").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `balances` to be an array in the JSON string but got `%s`", jsonObj.get("balances").toString()));
          }

          // validate the optional field `balances` (array)
          for (int i = 0; i < jsonArraybalances.size(); i++) {
            Balance.validateJsonElement(jsonArraybalances.get(i));
          };
        }
      }
      if ((jsonObj.get("begin_at") != null && !jsonObj.get("begin_at").isJsonNull()) && !jsonObj.get("begin_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `begin_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("begin_at").toString()));
      }
      if ((jsonObj.get("end_at") != null && !jsonObj.get("end_at").isJsonNull()) && !jsonObj.get("end_at").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_at` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_at").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListBalanceHistoryResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListBalanceHistoryResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListBalanceHistoryResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListBalanceHistoryResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ListBalanceHistoryResponse>() {
           @Override
           public void write(JsonWriter out, ListBalanceHistoryResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListBalanceHistoryResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListBalanceHistoryResponse given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListBalanceHistoryResponse
   * @throws IOException if the JSON string is invalid with respect to ListBalanceHistoryResponse
   */
  public static ListBalanceHistoryResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListBalanceHistoryResponse.class);
  }

  /**
   * Convert an instance of ListBalanceHistoryResponse to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

