/**
 * Copyright (C) 2015 Red Hat, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.kubernetes.api.model.policy.v1beta1;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.builder.Editable;
import io.fabric8.kubernetes.api.model.Container;
import io.fabric8.kubernetes.api.model.IntOrString;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import io.fabric8.kubernetes.api.model.KubernetesResourceList;
import io.fabric8.kubernetes.api.model.LabelSelector;
import io.fabric8.kubernetes.api.model.ListMeta;
import io.fabric8.kubernetes.api.model.LocalObjectReference;
import io.fabric8.kubernetes.api.model.ObjectMeta;
import io.fabric8.kubernetes.api.model.ObjectReference;
import io.fabric8.kubernetes.api.model.PersistentVolumeClaim;
import io.fabric8.kubernetes.api.model.PodTemplateSpec;
import io.fabric8.kubernetes.api.model.ResourceRequirements;
import io.fabric8.kubernetes.model.annotation.Group;
import io.fabric8.kubernetes.model.annotation.Version;
import io.sundr.builder.annotations.Buildable;
import io.sundr.builder.annotations.BuildableReference;
import io.sundr.transform.annotations.TemplateTransformation;
import io.sundr.transform.annotations.TemplateTransformations;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "apiVersion",
    "kind",
    "metadata",
    "items"
})
@ToString
@EqualsAndHashCode
@Setter
@Accessors(prefix = {
    "_",
    ""
})
@Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, lazyCollectionInitEnabled = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @BuildableReference(ObjectMeta.class),
    @BuildableReference(LabelSelector.class),
    @BuildableReference(Container.class),
    @BuildableReference(PodTemplateSpec.class),
    @BuildableReference(ResourceRequirements.class),
    @BuildableReference(IntOrString.class),
    @BuildableReference(ObjectReference.class),
    @BuildableReference(LocalObjectReference.class),
    @BuildableReference(PersistentVolumeClaim.class)
})
@TemplateTransformations({
    @TemplateTransformation(value = "/manifest.vm", outputPath = "META-INF/services/io.fabric8.kubernetes.api.model.KubernetesResource", gather = true)
})
@Version("v1beta1")
@Group("policy")
public class PodSecurityPolicyList implements Editable<PodSecurityPolicyListBuilder>, KubernetesResource,
    KubernetesResourceList<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy> {

  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("apiVersion")
  private String apiVersion = "policy/v1beta1";
  @JsonProperty("items")
  @JsonInclude(JsonInclude.Include.NON_EMPTY)
  private List<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy> items = new ArrayList<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy>();
  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("kind")
  private String kind = "PodSecurityPolicyList";
  @JsonProperty("metadata")
  private ListMeta metadata;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

  /**
   * No args constructor for use in serialization
   * 
   */
  public PodSecurityPolicyList() {
  }

  public PodSecurityPolicyList(String apiVersion, List<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy> items,
      String kind, ListMeta metadata) {
    super();
    this.apiVersion = apiVersion;
    this.items = items;
    this.kind = kind;
    this.metadata = metadata;
  }

  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("apiVersion")
  public String getApiVersion() {
    return apiVersion;
  }

  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("apiVersion")
  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  @JsonProperty("items")
  public List<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<io.fabric8.kubernetes.api.model.policy.v1beta1.PodSecurityPolicy> items) {
    this.items = items;
  }

  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("kind")
  public String getKind() {
    return kind;
  }

  /**
   * 
   * (Required)
   * 
   */
  @JsonProperty("kind")
  public void setKind(String kind) {
    this.kind = kind;
  }

  @JsonProperty("metadata")
  public ListMeta getMetadata() {
    return metadata;
  }

  @JsonProperty("metadata")
  public void setMetadata(ListMeta metadata) {
    this.metadata = metadata;
  }

  @JsonIgnore
  public PodSecurityPolicyListBuilder edit() {
    return new PodSecurityPolicyListBuilder(this);
  }

  @JsonIgnore
  public PodSecurityPolicyListBuilder toBuilder() {
    return edit();
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}
