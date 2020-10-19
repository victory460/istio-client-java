package com.paas.istio.model.serviceentry;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface ServiceEntryEndpointFluent<A extends ServiceEntryEndpointFluent<A>> extends Fluent<A> {


    List<String> getAddresss();
    List<String> buildAddresss();
    String buildAddresss(int index);
    A withAddresss(List<String> items);
    A withAddresss(String... items);
    Boolean hasAddresss();
    A addNewAddress(String specHttp);
    A addToAddress(int index, String item);
    A setToAddress(int index, String item);
    A addToAddress(String... items);
    A addAllToAddresss(Collection<String> items);
    A removeFromAddress(String... items);
    A removeAllFromAddresss(Collection<String> items);

    Map<String, Integer> getPort();
    Map<String, Integer> buildPort();
    Integer buildPort(String key);
    A withPort(Map<String, Integer> item);
    Boolean hasPort();
    A addNewPort(String key ,Integer item);
    A removeFromPort(String... keys);

    Map<String, String> getLabel();
    Map<String, String> buildLabel();
    String buildLabel(String key);
    A withLabel(Map<String, String> item);
    Boolean hasLabel();
    A addNewLabel(String key ,String item);
    A removeFromLabel(String... keys);

    A withNetwork(String network);
    String getNetwork();

    A withLocality(String locality);
    String getLocality();

    A withWeight(Integer weight);
    Integer getWeight();
}
