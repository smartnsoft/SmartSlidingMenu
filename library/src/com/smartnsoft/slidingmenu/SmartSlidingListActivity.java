package com.smartnsoft.slidingmenu;

import java.util.List;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;

import com.slidingmenu.lib.app.SlidingListActivity;
import com.smartnsoft.droid4me.app.AppPublics.BroadcastListener;
import com.smartnsoft.droid4me.app.Droid4mizer;
import com.smartnsoft.droid4me.app.SmartableActivity;
import com.smartnsoft.droid4me.framework.ActivityResultHandler.CompositeHandler;
import com.smartnsoft.droid4me.log.Logger;
import com.smartnsoft.droid4me.log.LoggerFactory;
import com.smartnsoft.droid4me.menu.MenuHandler.Composite;
import com.smartnsoft.droid4me.menu.StaticMenuCommand;

/**
 * @author Jocelyn Girard
 * @since 2013.01.08
 */
@Deprecated
public abstract class SmartSlidingListActivity<AggregateClass>
    extends SlidingListActivity
    implements SmartableActivity<AggregateClass>
{

  protected static final Logger log = LoggerFactory.getInstance("Smartable");

  private final Droid4mizer<AggregateClass, SmartSlidingListActivity<AggregateClass>> droid4mizer = new Droid4mizer<AggregateClass, SmartSlidingListActivity<AggregateClass>>(this, this, this, null);

  @Override
  public Object getSystemService(String name)
  {
    return droid4mizer.getSystemService(name, super.getSystemService(name));
  }

  @Override
  public void onCreate(final Bundle savedInstanceState)
  {
    droid4mizer.onCreate(new Runnable()
    {
      public void run()
      {
        SmartSlidingListActivity.super.onCreate(savedInstanceState);
      }
    }, savedInstanceState);
  }

  @Override
  public void onNewIntent(Intent intent)
  {
    super.onNewIntent(intent);
    droid4mizer.onNewIntent(intent);
  }

  @Override
  public void onContentChanged()
  {
    super.onContentChanged();
    droid4mizer.onContentChanged();
  }

  @Override
  protected void onResume()
  {
    super.onResume();
    droid4mizer.onResume();
  }

  @Override
  protected void onSaveInstanceState(Bundle outState)
  {
    super.onSaveInstanceState(outState);
    droid4mizer.onSaveInstanceState(outState);
  }

  @Override
  protected void onStart()
  {
    super.onStart();
    droid4mizer.onStart();
  }

  @Override
  protected void onPause()
  {
    try
    {
      droid4mizer.onPause();
    }
    finally
    {
      super.onPause();
    }
  }

  @Override
  protected void onStop()
  {
    try
    {
      droid4mizer.onStop();
    }
    finally
    {
      super.onStop();
    }
  }

  @Override
  protected void onDestroy()
  {
    try
    {
      droid4mizer.onDestroy();
    }
    finally
    {
      super.onDestroy();
    }
  }

  @Override
  public boolean onContextItemSelected(MenuItem item)
  {
    return droid4mizer.onContextItemSelected(super.onContextItemSelected(item), item);
  }

  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data)
  {
    super.onActivityResult(requestCode, resultCode, data);
    droid4mizer.onActivityResult(requestCode, resultCode, data);
  }

  /**
   * SmartableActivity implementation.
   */

  public final void setHomeIntent(Intent intent)
  {
    droid4mizer.setHomeIntent(intent);
  }

  /**
   * Smartable implementation.
   */

  public AggregateClass getAggregate()
  {
    return droid4mizer.getAggregate();
  }

  public void setAggregate(AggregateClass aggregate)
  {
    droid4mizer.setAggregate(aggregate);
  }

  public Handler getHandler()
  {
    return droid4mizer.getHandler();
  }

  public SharedPreferences getPreferences()
  {
    return droid4mizer.getPreferences();
  }

  public void onException(Throwable throwable, boolean fromGuiThread)
  {
    droid4mizer.onException(throwable, fromGuiThread);
  }

  public void registerBroadcastListeners(BroadcastListener[] broadcastListeners)
  {
    droid4mizer.registerBroadcastListeners(broadcastListeners);
  }

  public void onBusinessObjectsRetrieved()
  {
    droid4mizer.onBusinessObjectsRetrieved();
  }

  public int getOnSynchronizeDisplayObjectsCount()
  {
    return droid4mizer.getOnSynchronizeDisplayObjectsCount();
  }

  public boolean isRefreshingBusinessObjectsAndDisplay()
  {
    return droid4mizer.isRefreshingBusinessObjectsAndDisplay();
  }

  public boolean isFirstLifeCycle()
  {
    return droid4mizer.isFirstLifeCycle();
  }

  public final boolean isInteracting()
  {
    return droid4mizer.isInteracting();
  }

  public final boolean isAlive()
  {
    return droid4mizer.isAlive();
  }

  public final void refreshBusinessObjectsAndDisplay(boolean retrieveBusinessObjects, final Runnable onOver, boolean immediately)
  {
    refreshBusinessObjectsAndDisplayInternal(retrieveBusinessObjects, onOver, immediately, false);
  }

  /**
   * AppInternals.LifeCycleInternals implementation.
   */

  public boolean shouldKeepOn()
  {
    return droid4mizer.shouldKeepOn();
  }

  public Composite getCompositeActionHandler()
  {
    return droid4mizer.getCompositeActionHandler();
  }

  public CompositeHandler getCompositeActivityResultHandler()
  {
    return droid4mizer.getCompositeActivityResultHandler();
  }

  /**
   * Own implementation.
   */

  /**
   * Same as invoking {@link #refreshBusinessObjectsAndDisplay(true, null, false)}.
   * 
   * @see #refreshBusinessObjectsAndDisplay(boolean, Runnable, boolean)
   */
  public final void refreshBusinessObjectsAndDisplay()
  {
    refreshBusinessObjectsAndDisplay(true, null, false);
  }

  void refreshBusinessObjectsAndDisplayInternal(final boolean retrieveBusinessObjects, final Runnable onOver, boolean immediately,
      final boolean businessObjectCountAndSortingUnchanged)
  {
    droid4mizer.refreshBusinessObjectsAndDisplay(retrieveBusinessObjects, onOver, immediately);
  }

  public List<StaticMenuCommand> getMenuCommands()
  {
    return null;
  };

}
