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

public class ImuCodec extends MappingCodec<UdtValue, ImuInfo> {

    public ImuCodec(TypeCodec<UdtValue> innerCodec) {
        super(innerCodec, GenericType.of(ImuInfo.class));
    }

  @Override public UserDefinedType getCqlType() {
        return (UserDefinedType) super.getCqlType();
    }

    @Override protected ImuInfo innerToOuter(UdtValue value) {
        return value == null ? null : new ImuInfo(value.getLong("time"), value.getList("imu1", Float.class), value.getList("imu2",Float.class));
    }

    @Override protected UdtValue outerToInner(ImuInfo value) {
        return value == null ? null : getCqlType().newValue().setLong("time", value.time).setList("imu1", value.imu1,Float.class ).setList("imu2", value.imu2,Float.class);
    }
}