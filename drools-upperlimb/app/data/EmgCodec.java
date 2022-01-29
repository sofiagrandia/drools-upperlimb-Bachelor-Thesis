package data;

import entities.*;
import java.util.*;
import java.time.LocalDate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import data.*;
import utils.ApplicationUtil;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import com.datastax.oss.driver.api.core.cql.SimpleStatement;
import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.type.codec.ExtraTypeCodecs;
import com.datastax.oss.driver.api.core.type.codec.MappingCodec;
import com.datastax.oss.driver.api.core.data.UdtValue;
import com.datastax.oss.driver.api.core.type.UserDefinedType;
import com.datastax.oss.driver.api.core.type.codec.TypeCodec;
import com.datastax.oss.driver.api.core.type.reflect.GenericType;
import com.datastax.oss.driver.api.core.type.codec.registry.CodecRegistry;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.ZoneId;

public class EmgCodec extends MappingCodec<UdtValue, EmgInfo> {

    public EmgCodec(TypeCodec<UdtValue> innerCodec) {
        super(innerCodec, GenericType.of(EmgInfo.class));
    }

  @Override public UserDefinedType getCqlType() {
        return (UserDefinedType) super.getCqlType();
    }

    @Override protected EmgInfo innerToOuter(UdtValue value) {
        return value == null ? null : new EmgInfo(value.getLong("time"), value.getFloat("emg1"), value.getFloat("emg2"), value.getFloat("emg3"), value.getFloat("emg4"), value.getFloat("emg5"));
    }

    @Override protected UdtValue outerToInner(EmgInfo value) {
        return value == null ? null : getCqlType().newValue().setLong("time", value.time).setFloat("emg1", value.emg1).setFloat("emg2", value.emg2).setFloat("emg3", value.emg1).setFloat("emg4", value.emg2).setFloat("emg5", value.emg1);
    }
}