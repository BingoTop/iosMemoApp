package com.example.memomvvm.db;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MemoDao_Impl implements MemoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MemoEntity> __insertionAdapterOfMemoEntity;

  private final EntityDeletionOrUpdateAdapter<MemoEntity> __deletionAdapterOfMemoEntity;

  private final EntityDeletionOrUpdateAdapter<MemoEntity> __updateAdapterOfMemoEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllMemos;

  public MemoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMemoEntity = new EntityInsertionAdapter<MemoEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `memo_table` (`id`,`desc`,`createdAt`) VALUES (nullif(?, 0),?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MemoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDesc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDesc());
        }
        stmt.bindLong(3, value.getCreatedAt());
      }
    };
    this.__deletionAdapterOfMemoEntity = new EntityDeletionOrUpdateAdapter<MemoEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `memo_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MemoEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfMemoEntity = new EntityDeletionOrUpdateAdapter<MemoEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `memo_table` SET `id` = ?,`desc` = ?,`createdAt` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, MemoEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getDesc() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDesc());
        }
        stmt.bindLong(3, value.getCreatedAt());
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAllMemos = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM memo_table";
        return _query;
      }
    };
  }

  @Override
  public Object insertMemo(final MemoEntity memoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfMemoEntity.insert(memoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteMemo(final MemoEntity memoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfMemoEntity.handle(memoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateMemo(final MemoEntity memoEntity, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfMemoEntity.handle(memoEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAllMemos(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllMemos.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAllMemos.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<MemoEntity>> getAllMemos() {
    final String _sql = "SELECT * from memo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"memo_table"}, false, new Callable<List<MemoEntity>>() {
      @Override
      public List<MemoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<MemoEntity> _result = new ArrayList<MemoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MemoEntity _item;
            final String _tmpDesc;
            _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new MemoEntity(_tmpDesc,_tmpCreatedAt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
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

  @Override
  public Object getMemo(final int id, final Continuation<? super MemoEntity> p1) {
    final String _sql = "SELECT * FROM memo_table where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    return CoroutinesRoom.execute(__db, false, new Callable<MemoEntity>() {
      @Override
      public MemoEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final MemoEntity _result;
          if(_cursor.moveToFirst()) {
            final String _tmpDesc;
            _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _result = new MemoEntity(_tmpDesc,_tmpCreatedAt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _result.setId(_tmpId);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p1);
  }

  @Override
  public Object getList(final Continuation<? super List<String>> p0) {
    final String _sql = "SELECT `desc` from memo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<String>>() {
      @Override
      public List<String> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final List<String> _result = new ArrayList<String>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final String _item;
            _item = _cursor.getString(0);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getMutableList(final Continuation<? super List<MemoEntity>> p0) {
    final String _sql = "SELECT * from memo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<MemoEntity>>() {
      @Override
      public List<MemoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<MemoEntity> _result = new ArrayList<MemoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MemoEntity _item;
            final String _tmpDesc;
            _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new MemoEntity(_tmpDesc,_tmpCreatedAt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getMemoList(final Continuation<? super List<MemoEntity>> p0) {
    final String _sql = "SELECT * from memo_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<MemoEntity>>() {
      @Override
      public List<MemoEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfCreatedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "createdAt");
          final List<MemoEntity> _result = new ArrayList<MemoEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final MemoEntity _item;
            final String _tmpDesc;
            _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            final long _tmpCreatedAt;
            _tmpCreatedAt = _cursor.getLong(_cursorIndexOfCreatedAt);
            _item = new MemoEntity(_tmpDesc,_tmpCreatedAt);
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }
}
