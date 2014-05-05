package org.agorava.instagram.jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author Dje
 * @author Werner Keil
 * Date: 05/05/14
 * Time: 02:25
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InstagramDataDeserializer {

    public InstagramDataDeserializer() {
    }
}
