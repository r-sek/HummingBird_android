import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import dev.kurokiri.hummingbird.R
import dev.kurokiri.hummingbird.views.SettingsActivity
import kotlinx.android.synthetic.main.fragment_item_list_dialog_list_dialog.view.*

class MenuListDialogFragment: BottomSheetDialogFragment() {

    lateinit var activityContext :Context

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_item_list_dialog_list_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.navigation_view.setNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.navigation_home -> {

                }

                R.id.navigation_reply -> {

                }

                R.id.navigation_account -> {
                    Toast.makeText(context,"Change Account will be available.",Toast.LENGTH_SHORT).show()
                }

                R.id.navigation_settings -> {
                    startActivity(SettingsActivity.createIntent(activityContext))
                }
            }
            true
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        activityContext = context
    }

    override fun getTheme(): Int {
        // Fragment全体のスタイルを指定する
        return R.style.BottomSheetDialogTheme
    }
}