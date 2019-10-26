package com.bh.ldp.myhuiapplication.train

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import bean.TrainBean
import bean.TrainDetailBean
import com.bh.ldp.lib_base.basev.BaseListActivity
import com.bh.ldp.lib_base.view.RecyclerViewHolder
import com.bh.ldp.myhuiapplication.R
import kotlinx.android.synthetic.main.activity_train_query.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author mini
 * @date 2019/10/18
 */
class TrainQueryActivity : BaseListActivity<TrainDetailBean, TrainQueryPresenter>(), TrainQueryContract.View {

    private var start = ""
    private var end = ""
    private var ishigh = 0
    private var date = ""

    override fun getLayoutResId(): Int {
        return R.layout.activity_train_query
    }

    override fun onLoadMore() {}

    override fun onRefresh() {
        getUserData()
        presenter.requestData(start, end, ishigh, date)
    }

    override fun bindItemView(holder: RecyclerViewHolder, position: Int, item: TrainDetailBean) {
        holder.setText(R.id.station, item.station + "-" + item.endstation)
        holder.setText(R.id.time, item.departuretime + "-" + item.arrivaltime)
    }

    override fun getItemLayoutRes(): Int {
        return R.layout.item_tarin
    }

    override fun initPresenter() {
        presenter = TrainQueryPresenter(this)
    }

    override fun initData() {

    }

    @SuppressLint("SimpleDateFormat")
    override fun initView() {
        super.initView()
        getUserData()
        val simpleDateFormat = SimpleDateFormat("yyyy/MM/dd")// HH:mm:ss
        val date1 = Date(System.currentTimeMillis())
        date = simpleDateFormat.format(date1)
        date_tv.text = date
        query_btn.setOnClickListener { onRefresh() }
        dateChoose.setOnClickListener { showDatePickerDialog() }
    }

    private fun getUserData() {
        start = start_et.text.toString()
        end = end_et.text.toString()
        ishigh = if (highCheckBox.isChecked) 1 else 0
    }

    override fun isLoadMore(): Boolean {
        return false
    }

    override fun isRefresh(): Boolean {
        return false
    }

    override fun loadData(bean: TrainBean) {
        loadDataRefresh(bean.result.list)
    }

    private fun showDatePickerDialog() {
        val calendar = Calendar.getInstance()
        val datePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener {
            /**
             * @param year the initially selected year
             * @param month the initially selected month (0-11 for compatibility with
             *              {@link Calendar#MONTH})
             * @param dayOfMonth the initially selected day of month (1-31, depending
             *                   on month)
             */
            view, year, month, dayOfMonth ->

            date = year.toString() + "/" + (month + 1).toString() + "/" + dayOfMonth.toString()
            date_tv.text = date
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))
        datePickerDialog.show()
    }

    override fun showErrorMsg(msg: String?) {
        showShortToast(msg)
    }

}
