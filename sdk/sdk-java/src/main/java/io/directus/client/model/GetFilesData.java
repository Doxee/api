/*
 * directus.io
 * API for directus.io
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.directus.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetFilesData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-03T21:48:16.590Z")
public class GetFilesData {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("active")
  private Integer active = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("caption")
  private String caption = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("charset")
  private String charset = null;

  @SerializedName("tags")
  private String tags = null;

  @SerializedName("width")
  private Integer width = null;

  @SerializedName("height")
  private Integer height = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("embed_id")
  private String embedId = null;

  @SerializedName("user")
  private Integer user = null;

  @SerializedName("date_uploaded")
  private String dateUploaded = null;

  @SerializedName("storage_adapter")
  private String storageAdapter = null;

  public GetFilesData id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public GetFilesData active(Integer active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(value = "")
  public Integer getActive() {
    return active;
  }

  public void setActive(Integer active) {
    this.active = active;
  }

  public GetFilesData name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetFilesData url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GetFilesData title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public GetFilesData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @ApiModelProperty(value = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public GetFilesData caption(String caption) {
    this.caption = caption;
    return this;
  }

   /**
   * Get caption
   * @return caption
  **/
  @ApiModelProperty(value = "")
  public String getCaption() {
    return caption;
  }

  public void setCaption(String caption) {
    this.caption = caption;
  }

  public GetFilesData type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GetFilesData charset(String charset) {
    this.charset = charset;
    return this;
  }

   /**
   * Get charset
   * @return charset
  **/
  @ApiModelProperty(value = "")
  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }

  public GetFilesData tags(String tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public GetFilesData width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public GetFilesData height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public GetFilesData size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public GetFilesData embedId(String embedId) {
    this.embedId = embedId;
    return this;
  }

   /**
   * Get embedId
   * @return embedId
  **/
  @ApiModelProperty(value = "")
  public String getEmbedId() {
    return embedId;
  }

  public void setEmbedId(String embedId) {
    this.embedId = embedId;
  }

  public GetFilesData user(Integer user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public Integer getUser() {
    return user;
  }

  public void setUser(Integer user) {
    this.user = user;
  }

  public GetFilesData dateUploaded(String dateUploaded) {
    this.dateUploaded = dateUploaded;
    return this;
  }

   /**
   * Get dateUploaded
   * @return dateUploaded
  **/
  @ApiModelProperty(value = "")
  public String getDateUploaded() {
    return dateUploaded;
  }

  public void setDateUploaded(String dateUploaded) {
    this.dateUploaded = dateUploaded;
  }

  public GetFilesData storageAdapter(String storageAdapter) {
    this.storageAdapter = storageAdapter;
    return this;
  }

   /**
   * Get storageAdapter
   * @return storageAdapter
  **/
  @ApiModelProperty(value = "")
  public String getStorageAdapter() {
    return storageAdapter;
  }

  public void setStorageAdapter(String storageAdapter) {
    this.storageAdapter = storageAdapter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetFilesData getFilesData = (GetFilesData) o;
    return Objects.equals(this.id, getFilesData.id) &&
        Objects.equals(this.active, getFilesData.active) &&
        Objects.equals(this.name, getFilesData.name) &&
        Objects.equals(this.url, getFilesData.url) &&
        Objects.equals(this.title, getFilesData.title) &&
        Objects.equals(this.location, getFilesData.location) &&
        Objects.equals(this.caption, getFilesData.caption) &&
        Objects.equals(this.type, getFilesData.type) &&
        Objects.equals(this.charset, getFilesData.charset) &&
        Objects.equals(this.tags, getFilesData.tags) &&
        Objects.equals(this.width, getFilesData.width) &&
        Objects.equals(this.height, getFilesData.height) &&
        Objects.equals(this.size, getFilesData.size) &&
        Objects.equals(this.embedId, getFilesData.embedId) &&
        Objects.equals(this.user, getFilesData.user) &&
        Objects.equals(this.dateUploaded, getFilesData.dateUploaded) &&
        Objects.equals(this.storageAdapter, getFilesData.storageAdapter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, active, name, url, title, location, caption, type, charset, tags, width, height, size, embedId, user, dateUploaded, storageAdapter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetFilesData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    charset: ").append(toIndentedString(charset)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    embedId: ").append(toIndentedString(embedId)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    dateUploaded: ").append(toIndentedString(dateUploaded)).append("\n");
    sb.append("    storageAdapter: ").append(toIndentedString(storageAdapter)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
