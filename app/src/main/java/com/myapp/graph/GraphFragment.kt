package com.myapp.graph

import android.content.Context
import android.graphics.*
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [GraphFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GraphFragment : Fragment(R.layout.fragment_graph) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val canvas = activity?.findViewById<RelativeLayout>(R.id.container)
        if (canvas != null) {
            canvas.addView(Rectangle(activity))
        }
    }
}


private class Rectangle(context: Context?) : View(context) {
    var paint: Paint = Paint()
    override fun onDraw(canvas: Canvas) {
        paint.setColor(Color.GREEN)
        val rect = Rect(20, 56, 200, 112)
        canvas.drawRect(rect, paint)
    }
}