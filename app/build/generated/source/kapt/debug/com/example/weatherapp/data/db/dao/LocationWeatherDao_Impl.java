package com.example.weatherapp.data.db.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.weatherapp.data.db.StringListConverter;
import com.example.weatherapp.data.db.entity.Current;
import com.example.weatherapp.data.db.entity.Location;
import com.example.weatherapp.data.db.entity.Request;
import com.example.weatherapp.data.db.entity.WeatherApi;
import com.example.weatherapp.data.db.unitLocalized.MetricCurrentWeatherEntry;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocationWeatherDao_Impl implements LocationWeatherDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WeatherApi> __insertionAdapterOfWeatherApi;

  private final StringListConverter __stringListConverter = new StringListConverter();

  public LocationWeatherDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWeatherApi = new EntityInsertionAdapter<WeatherApi>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `current_weather` (`id`,`current_temperature`,`current_weather_icons`,`current_observation_time`,`current_precip`,`current_cloudcover`,`current_wind_dir`,`current_wind_speed`,`current_feelslike`,`current_visibility`,`current_weather_descriptions`,`location_country`,`location_name`,`location_localtime`,`location_timezone_id`,`location_region`,`location_localtime_epoch`,`location_lat`,`location_lon`,`request_language`,`request_query`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WeatherApi value) {
        stmt.bindLong(1, value.getId());
        final Current _tmpCurrent = value.getCurrent();
        if(_tmpCurrent != null) {
          if (_tmpCurrent.getTemperature() == null) {
            stmt.bindNull(2);
          } else {
            stmt.bindLong(2, _tmpCurrent.getTemperature());
          }
          final String _tmp;
          _tmp = __stringListConverter.toString(_tmpCurrent.getWeather_icons());
          if (_tmp == null) {
            stmt.bindNull(3);
          } else {
            stmt.bindString(3, _tmp);
          }
          if (_tmpCurrent.getObservation_time() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpCurrent.getObservation_time());
          }
          if (_tmpCurrent.getPrecip() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindDouble(5, _tmpCurrent.getPrecip());
          }
          if (_tmpCurrent.getCloudcover() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindLong(6, _tmpCurrent.getCloudcover());
          }
          if (_tmpCurrent.getWind_dir() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpCurrent.getWind_dir());
          }
          if (_tmpCurrent.getWind_speed() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpCurrent.getWind_speed());
          }
          if (_tmpCurrent.getFeelslike() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindLong(9, _tmpCurrent.getFeelslike());
          }
          if (_tmpCurrent.getVisibility() == null) {
            stmt.bindNull(10);
          } else {
            stmt.bindLong(10, _tmpCurrent.getVisibility());
          }
          final String _tmp_1;
          _tmp_1 = __stringListConverter.toString(_tmpCurrent.getWeather_descriptions());
          if (_tmp_1 == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmp_1);
          }
        } else {
          stmt.bindNull(2);
          stmt.bindNull(3);
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
        final Location _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          if (_tmpLocation.getCountry() == null) {
            stmt.bindNull(12);
          } else {
            stmt.bindString(12, _tmpLocation.getCountry());
          }
          if (_tmpLocation.getName() == null) {
            stmt.bindNull(13);
          } else {
            stmt.bindString(13, _tmpLocation.getName());
          }
          if (_tmpLocation.getLocaltime() == null) {
            stmt.bindNull(14);
          } else {
            stmt.bindString(14, _tmpLocation.getLocaltime());
          }
          if (_tmpLocation.getTimezone_id() == null) {
            stmt.bindNull(15);
          } else {
            stmt.bindString(15, _tmpLocation.getTimezone_id());
          }
          if (_tmpLocation.getRegion() == null) {
            stmt.bindNull(16);
          } else {
            stmt.bindString(16, _tmpLocation.getRegion());
          }
          if (_tmpLocation.getLocaltime_epoch() == null) {
            stmt.bindNull(17);
          } else {
            stmt.bindLong(17, _tmpLocation.getLocaltime_epoch());
          }
          if (_tmpLocation.getLat() == null) {
            stmt.bindNull(18);
          } else {
            stmt.bindDouble(18, _tmpLocation.getLat());
          }
          if (_tmpLocation.getLon() == null) {
            stmt.bindNull(19);
          } else {
            stmt.bindDouble(19, _tmpLocation.getLon());
          }
        } else {
          stmt.bindNull(12);
          stmt.bindNull(13);
          stmt.bindNull(14);
          stmt.bindNull(15);
          stmt.bindNull(16);
          stmt.bindNull(17);
          stmt.bindNull(18);
          stmt.bindNull(19);
        }
        final Request _tmpRequest = value.getRequest();
        if(_tmpRequest != null) {
          if (_tmpRequest.getLanguage() == null) {
            stmt.bindNull(20);
          } else {
            stmt.bindString(20, _tmpRequest.getLanguage());
          }
          if (_tmpRequest.getQuery() == null) {
            stmt.bindNull(21);
          } else {
            stmt.bindString(21, _tmpRequest.getQuery());
          }
        } else {
          stmt.bindNull(20);
          stmt.bindNull(21);
        }
      }
    };
  }

  @Override
  public void upsert(final WeatherApi weatherLocation) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfWeatherApi.insert(weatherLocation);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<MetricCurrentWeatherEntry> getLocation() {
    final String _sql = "select * from current_weather where id=''";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"current_weather"}, false, new Callable<MetricCurrentWeatherEntry>() {
      @Override
      public MetricCurrentWeatherEntry call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCurrentTemperature = CursorUtil.getColumnIndexOrThrow(_cursor, "current_temperature");
          final int _cursorIndexOfCurrentWeatherIcons = CursorUtil.getColumnIndexOrThrow(_cursor, "current_weather_icons");
          final int _cursorIndexOfCurrentObservationTime = CursorUtil.getColumnIndexOrThrow(_cursor, "current_observation_time");
          final int _cursorIndexOfCurrentPrecip = CursorUtil.getColumnIndexOrThrow(_cursor, "current_precip");
          final int _cursorIndexOfCurrentCloudcover = CursorUtil.getColumnIndexOrThrow(_cursor, "current_cloudcover");
          final int _cursorIndexOfCurrentWindDir = CursorUtil.getColumnIndexOrThrow(_cursor, "current_wind_dir");
          final int _cursorIndexOfCurrentWindSpeed = CursorUtil.getColumnIndexOrThrow(_cursor, "current_wind_speed");
          final int _cursorIndexOfCurrentFeelslike = CursorUtil.getColumnIndexOrThrow(_cursor, "current_feelslike");
          final int _cursorIndexOfCurrentVisibility = CursorUtil.getColumnIndexOrThrow(_cursor, "current_visibility");
          final int _cursorIndexOfCurrentWeatherDescriptions = CursorUtil.getColumnIndexOrThrow(_cursor, "current_weather_descriptions");
          final int _cursorIndexOfLocationCountry = CursorUtil.getColumnIndexOrThrow(_cursor, "location_country");
          final int _cursorIndexOfLocationName = CursorUtil.getColumnIndexOrThrow(_cursor, "location_name");
          final int _cursorIndexOfLocationLocaltime = CursorUtil.getColumnIndexOrThrow(_cursor, "location_localtime");
          final int _cursorIndexOfLocationTimezoneId = CursorUtil.getColumnIndexOrThrow(_cursor, "location_timezone_id");
          final int _cursorIndexOfLocationRegion = CursorUtil.getColumnIndexOrThrow(_cursor, "location_region");
          final int _cursorIndexOfLocationLocaltimeEpoch = CursorUtil.getColumnIndexOrThrow(_cursor, "location_localtime_epoch");
          final int _cursorIndexOfLocationLat = CursorUtil.getColumnIndexOrThrow(_cursor, "location_lat");
          final int _cursorIndexOfLocationLon = CursorUtil.getColumnIndexOrThrow(_cursor, "location_lon");
          final int _cursorIndexOfRequestLanguage = CursorUtil.getColumnIndexOrThrow(_cursor, "request_language");
          final MetricCurrentWeatherEntry _result;
          if(_cursor.moveToFirst()) {
            final int _tmpCurrentTemperature;
            _tmpCurrentTemperature = _cursor.getInt(_cursorIndexOfCurrentTemperature);
            final List<String> _tmpCurrentWeatherIcons;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfCurrentWeatherIcons)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfCurrentWeatherIcons);
            }
            _tmpCurrentWeatherIcons = __stringListConverter.fromString(_tmp);
            final String _tmpCurrentObservationTime;
            if (_cursor.isNull(_cursorIndexOfCurrentObservationTime)) {
              _tmpCurrentObservationTime = null;
            } else {
              _tmpCurrentObservationTime = _cursor.getString(_cursorIndexOfCurrentObservationTime);
            }
            final double _tmpCurrentPrecip;
            _tmpCurrentPrecip = _cursor.getDouble(_cursorIndexOfCurrentPrecip);
            final int _tmpCurrentCloudcover;
            _tmpCurrentCloudcover = _cursor.getInt(_cursorIndexOfCurrentCloudcover);
            final String _tmpCurrentWind_dir;
            if (_cursor.isNull(_cursorIndexOfCurrentWindDir)) {
              _tmpCurrentWind_dir = null;
            } else {
              _tmpCurrentWind_dir = _cursor.getString(_cursorIndexOfCurrentWindDir);
            }
            final String _tmpCurrentWind_speed;
            if (_cursor.isNull(_cursorIndexOfCurrentWindSpeed)) {
              _tmpCurrentWind_speed = null;
            } else {
              _tmpCurrentWind_speed = _cursor.getString(_cursorIndexOfCurrentWindSpeed);
            }
            final int _tmpCurrentFeelslike;
            _tmpCurrentFeelslike = _cursor.getInt(_cursorIndexOfCurrentFeelslike);
            final int _tmpCurrentVisibility;
            _tmpCurrentVisibility = _cursor.getInt(_cursorIndexOfCurrentVisibility);
            final List<String> _tmpCurrentWeather_descriptions;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfCurrentWeatherDescriptions)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfCurrentWeatherDescriptions);
            }
            _tmpCurrentWeather_descriptions = __stringListConverter.fromString(_tmp_1);
            final String _tmpLocationCountry;
            if (_cursor.isNull(_cursorIndexOfLocationCountry)) {
              _tmpLocationCountry = null;
            } else {
              _tmpLocationCountry = _cursor.getString(_cursorIndexOfLocationCountry);
            }
            final String _tmpLocationName;
            if (_cursor.isNull(_cursorIndexOfLocationName)) {
              _tmpLocationName = null;
            } else {
              _tmpLocationName = _cursor.getString(_cursorIndexOfLocationName);
            }
            final String _tmpLocationLocaltime;
            if (_cursor.isNull(_cursorIndexOfLocationLocaltime)) {
              _tmpLocationLocaltime = null;
            } else {
              _tmpLocationLocaltime = _cursor.getString(_cursorIndexOfLocationLocaltime);
            }
            final String _tmpLocationTimezone_id;
            if (_cursor.isNull(_cursorIndexOfLocationTimezoneId)) {
              _tmpLocationTimezone_id = null;
            } else {
              _tmpLocationTimezone_id = _cursor.getString(_cursorIndexOfLocationTimezoneId);
            }
            final String _tmpLocationRegion;
            if (_cursor.isNull(_cursorIndexOfLocationRegion)) {
              _tmpLocationRegion = null;
            } else {
              _tmpLocationRegion = _cursor.getString(_cursorIndexOfLocationRegion);
            }
            final long _tmpLocationLocaltime_epoch;
            _tmpLocationLocaltime_epoch = _cursor.getLong(_cursorIndexOfLocationLocaltimeEpoch);
            final double _tmpLocationLat;
            _tmpLocationLat = _cursor.getDouble(_cursorIndexOfLocationLat);
            final double _tmpLocationLon;
            _tmpLocationLon = _cursor.getDouble(_cursorIndexOfLocationLon);
            final String _tmpRequestLanguage;
            if (_cursor.isNull(_cursorIndexOfRequestLanguage)) {
              _tmpRequestLanguage = null;
            } else {
              _tmpRequestLanguage = _cursor.getString(_cursorIndexOfRequestLanguage);
            }
            _result = new MetricCurrentWeatherEntry(_tmpCurrentTemperature,_tmpCurrentWeatherIcons,_tmpCurrentObservationTime,_tmpCurrentPrecip,_tmpCurrentCloudcover,_tmpCurrentWind_dir,_tmpCurrentWind_speed,_tmpCurrentFeelslike,_tmpCurrentVisibility,_tmpCurrentWeather_descriptions,_tmpLocationCountry,_tmpLocationName,_tmpLocationRegion,_tmpLocationLocaltime,_tmpLocationTimezone_id,_tmpLocationLocaltime_epoch,_tmpLocationLat,_tmpLocationLon,_tmpRequestLanguage);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
