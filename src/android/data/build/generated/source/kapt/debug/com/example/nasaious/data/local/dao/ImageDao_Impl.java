package com.example.nasaious.data.local.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.nasaious.data.local.entity.ImageEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ImageDao_Impl extends ImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ImageEntity> __insertionAdapterOfImageEntity;

  private final SharedSQLiteStatement __preparedStmtOfNukeTable;

  public ImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfImageEntity = new EntityInsertionAdapter<ImageEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `nasa_image` (`id`,`copyright`,`date`,`explanation`,`hdurl`,`media_type`,`service_version`,`title`,`url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ImageEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getCopyright() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCopyright());
        }
        if (value.getDate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDate());
        }
        if (value.getExplanation() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExplanation());
        }
        if (value.getHdurl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getHdurl());
        }
        if (value.getMedia_type() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getMedia_type());
        }
        if (value.getService_version() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getService_version());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getTitle());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getUrl());
        }
      }
    };
    this.__preparedStmtOfNukeTable = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM nasa_image";
        return _query;
      }
    };
  }

  @Override
  public Object saveImages(final List<ImageEntity> images,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfImageEntity.insert(images);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object nukeTable(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfNukeTable.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfNukeTable.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object getImages(final Continuation<? super List<ImageEntity>> continuation) {
    final String _sql = "SELECT * FROM nasa_image";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<ImageEntity>>() {
      @Override
      public List<ImageEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCopyright = CursorUtil.getColumnIndexOrThrow(_cursor, "copyright");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "media_type");
          final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "service_version");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final List<ImageEntity> _result = new ArrayList<ImageEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ImageEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCopyright;
            if (_cursor.isNull(_cursorIndexOfCopyright)) {
              _tmpCopyright = null;
            } else {
              _tmpCopyright = _cursor.getString(_cursorIndexOfCopyright);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpExplanation;
            if (_cursor.isNull(_cursorIndexOfExplanation)) {
              _tmpExplanation = null;
            } else {
              _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
            }
            final String _tmpHdurl;
            if (_cursor.isNull(_cursorIndexOfHdurl)) {
              _tmpHdurl = null;
            } else {
              _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            }
            final String _tmpMedia_type;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMedia_type = null;
            } else {
              _tmpMedia_type = _cursor.getString(_cursorIndexOfMediaType);
            }
            final String _tmpService_version;
            if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
              _tmpService_version = null;
            } else {
              _tmpService_version = _cursor.getString(_cursorIndexOfServiceVersion);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _item = new ImageEntity(_tmpId,_tmpCopyright,_tmpDate,_tmpExplanation,_tmpHdurl,_tmpMedia_type,_tmpService_version,_tmpTitle,_tmpUrl);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getImage(final int id, final Continuation<? super ImageEntity> continuation) {
    final String _sql = "SELECT * FROM nasa_image Where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<ImageEntity>() {
      @Override
      public ImageEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCopyright = CursorUtil.getColumnIndexOrThrow(_cursor, "copyright");
          final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
          final int _cursorIndexOfExplanation = CursorUtil.getColumnIndexOrThrow(_cursor, "explanation");
          final int _cursorIndexOfHdurl = CursorUtil.getColumnIndexOrThrow(_cursor, "hdurl");
          final int _cursorIndexOfMediaType = CursorUtil.getColumnIndexOrThrow(_cursor, "media_type");
          final int _cursorIndexOfServiceVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "service_version");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
          final ImageEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpCopyright;
            if (_cursor.isNull(_cursorIndexOfCopyright)) {
              _tmpCopyright = null;
            } else {
              _tmpCopyright = _cursor.getString(_cursorIndexOfCopyright);
            }
            final String _tmpDate;
            if (_cursor.isNull(_cursorIndexOfDate)) {
              _tmpDate = null;
            } else {
              _tmpDate = _cursor.getString(_cursorIndexOfDate);
            }
            final String _tmpExplanation;
            if (_cursor.isNull(_cursorIndexOfExplanation)) {
              _tmpExplanation = null;
            } else {
              _tmpExplanation = _cursor.getString(_cursorIndexOfExplanation);
            }
            final String _tmpHdurl;
            if (_cursor.isNull(_cursorIndexOfHdurl)) {
              _tmpHdurl = null;
            } else {
              _tmpHdurl = _cursor.getString(_cursorIndexOfHdurl);
            }
            final String _tmpMedia_type;
            if (_cursor.isNull(_cursorIndexOfMediaType)) {
              _tmpMedia_type = null;
            } else {
              _tmpMedia_type = _cursor.getString(_cursorIndexOfMediaType);
            }
            final String _tmpService_version;
            if (_cursor.isNull(_cursorIndexOfServiceVersion)) {
              _tmpService_version = null;
            } else {
              _tmpService_version = _cursor.getString(_cursorIndexOfServiceVersion);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpUrl;
            if (_cursor.isNull(_cursorIndexOfUrl)) {
              _tmpUrl = null;
            } else {
              _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
            }
            _result = new ImageEntity(_tmpId,_tmpCopyright,_tmpDate,_tmpExplanation,_tmpHdurl,_tmpMedia_type,_tmpService_version,_tmpTitle,_tmpUrl);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
