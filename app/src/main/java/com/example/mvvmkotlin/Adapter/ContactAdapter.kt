package com.example.mvvmkotlin.Adapter
import android.Manifest
import android.Manifest.permission.CALL_PHONE
import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import com.example.mvvmkotlin.R
import com.example.mvvmkotlin.model.contact_model

class ContactAdapter(private val context: Context, private val contactModelArrayList: ArrayList<contact_model>) : BaseAdapter() {
    var number = ""
    override fun getViewTypeCount(): Int {
        return count
    }

    override fun getItemViewType(position: Int): Int {

        return position
    }

    override fun getCount(): Int {
        return contactModelArrayList.size
    }

    override fun getItem(position: Int): Any {
        return contactModelArrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        val holder: ViewHolder

        if (convertView == null) {
            holder = ViewHolder()
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.contact_item, null, true)

            holder.tvname = convertView!!.findViewById(R.id.userName) as TextView
            holder.tvnumber = convertView.findViewById(R.id.userContact) as TextView
            holder.itemContact = convertView.findViewById(R.id.itemContact) as LinearLayout

            convertView.tag = holder
        } else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = convertView.tag as ViewHolder
        }

        holder.tvname!!.setText(contactModelArrayList[position].getNames())
        holder.tvnumber!!.setText(contactModelArrayList[position].getNumbers())



        holder.itemContact!!.setOnClickListener {
            Toast.makeText(context,contactModelArrayList[position].getNames(),Toast.LENGTH_SHORT).show()
             number = contactModelArrayList[position].getNumbers()

            callPhone()

        }
        return convertView
    }




    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
        {
            if (ActivityCompat.shouldShowRequestPermissionRationale(context as Activity, Manifest.permission.CALL_PHONE))
            {
            }
            else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(context, arrayOf(Manifest.permission.CALL_PHONE), 42)
            }
        } else {
            // Permission has already been granted
            callPhone()
        }
    }

     fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (requestCode == 42) {
            // If request is cancelled, the result arrays are empty.
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // permission was granted, yay!
                callPhone()
            } else {
               Toast.makeText(context,"Permission Not Granted",Toast.LENGTH_SHORT).show()
            }
            return
        }
    }





    private fun callPhone() {
        val intent = Intent(Intent.ACTION_CALL,Uri.parse("tel:$number"))
        //intent.data = Uri.parse("tel:$number")
        if (ContextCompat.checkSelfPermission(context, CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
            context.startActivity(intent);
        } else {
            checkPermission()
        }

    }


    private inner class ViewHolder {

        var tvname: TextView? = null
        var tvnumber: TextView? = null
        var itemContact: LinearLayout? = null



    }
}