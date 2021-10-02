package com.example.weatherapp.data.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.example.weatherapp.data.db.dao.CurrentWeatherDAO;
import com.example.weatherapp.data.db.dao.CurrentWeatherDAO_Impl;
import com.example.weatherapp.data.db.dao.LocationWeatherDao;
import com.example.weatherapp.data.db.dao.LocationWeatherDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ForcastDatabase_Impl extends ForcastDatabase {
  private volatile CurrentWeatherDAO _currentWeatherDAO;

  private volatile LocationWeatherDao _locationWeatherDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `current_weather` (`id` INTEGER NOT NULL, `current_temperature` INTEGER, `current_weather_icons` TEXT, `current_observation_time` TEXT, `current_precip` REAL, `current_cloudcover` INTEGER, `current_wind_dir` TEXT, `current_wind_speed` TEXT, `current_feelslike` INTEGER, `current_visibility` INTEGER, `current_weather_descriptions` TEXT, `location_country` TEXT, `location_name` TEXT, `location_localtime` TEXT, `location_timezone_id` TEXT, `location_region` TEXT, `location_localtime_epoch` INTEGER, `location_lat` REAL, `location_lon` REAL, `request_language` TEXT, `request_query` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '45c66081a710a65c10fa8a4ae045559d')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `current_weather`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCurrentWeather = new HashMap<String, TableInfo.Column>(21);
        _columnsCurrentWeather.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_temperature", new TableInfo.Column("current_temperature", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_weather_icons", new TableInfo.Column("current_weather_icons", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_observation_time", new TableInfo.Column("current_observation_time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_precip", new TableInfo.Column("current_precip", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_cloudcover", new TableInfo.Column("current_cloudcover", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_wind_dir", new TableInfo.Column("current_wind_dir", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_wind_speed", new TableInfo.Column("current_wind_speed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_feelslike", new TableInfo.Column("current_feelslike", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_visibility", new TableInfo.Column("current_visibility", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("current_weather_descriptions", new TableInfo.Column("current_weather_descriptions", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_country", new TableInfo.Column("location_country", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_name", new TableInfo.Column("location_name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_localtime", new TableInfo.Column("location_localtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_timezone_id", new TableInfo.Column("location_timezone_id", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_region", new TableInfo.Column("location_region", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_localtime_epoch", new TableInfo.Column("location_localtime_epoch", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_lat", new TableInfo.Column("location_lat", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("location_lon", new TableInfo.Column("location_lon", "REAL", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("request_language", new TableInfo.Column("request_language", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCurrentWeather.put("request_query", new TableInfo.Column("request_query", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCurrentWeather = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCurrentWeather = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCurrentWeather = new TableInfo("current_weather", _columnsCurrentWeather, _foreignKeysCurrentWeather, _indicesCurrentWeather);
        final TableInfo _existingCurrentWeather = TableInfo.read(_db, "current_weather");
        if (! _infoCurrentWeather.equals(_existingCurrentWeather)) {
          return new RoomOpenHelper.ValidationResult(false, "current_weather(com.example.weatherapp.data.db.entity.WeatherApi).\n"
                  + " Expected:\n" + _infoCurrentWeather + "\n"
                  + " Found:\n" + _existingCurrentWeather);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "45c66081a710a65c10fa8a4ae045559d", "429d698c713dcd33c821a82f1745db72");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "current_weather");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `current_weather`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CurrentWeatherDAO.class, CurrentWeatherDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(LocationWeatherDao.class, LocationWeatherDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public CurrentWeatherDAO currentWeatherDao() {
    if (_currentWeatherDAO != null) {
      return _currentWeatherDAO;
    } else {
      synchronized(this) {
        if(_currentWeatherDAO == null) {
          _currentWeatherDAO = new CurrentWeatherDAO_Impl(this);
        }
        return _currentWeatherDAO;
      }
    }
  }

  @Override
  public LocationWeatherDao weatherLocationDao() {
    if (_locationWeatherDao != null) {
      return _locationWeatherDao;
    } else {
      synchronized(this) {
        if(_locationWeatherDao == null) {
          _locationWeatherDao = new LocationWeatherDao_Impl(this);
        }
        return _locationWeatherDao;
      }
    }
  }
}
