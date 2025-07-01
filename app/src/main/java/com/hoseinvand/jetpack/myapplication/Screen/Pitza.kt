package com.hoseinvand.jetpack.myapplication.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.hoseinvand.jetpack.myapplication.R
import com.hoseinvand.jetpack.myapplication.data.DataModel

@Composable
fun PizzaMenu(
     navController: NavHostController
) {



    MyApp(nav=navController)


}

@Composable
fun MyApp(
      nav: NavHostController) {
    val myData= listOf(
        DataModel(
            image = R.drawable.acd1,
            name = "SUPREME",
            material = "Pizza Supreme usually includes a combination of meat, vegetables, and cheese"
        ),
        DataModel(
            image = R.drawable.acd2,
            name = "SUPER SUPREME",
            material = "Pizza Supreme is typically made with pizza dough, special sauce, pizza cheese, and a combination of various meat and non-meat ingredients"
        ),
        DataModel(
            image =R.drawable.acd3 ,
            name = "CHEESE LOVER'S",
            material = "The main ingredients of a vegetable love pizza include pizza dough, marinara sauce or tomato sauce, pizza cheese (such as mozzarella and parmesan), and various vegetables"
        ),
        DataModel(
            image =R.drawable.acd4 ,
            name = "VEGGIE LOVER'S",
            material = "A \"cheese love\" pizza (probably meaning a pizza with a lot of cheese) generally consists of the following main ingredients: pizza dough, tomato sauce, mozzarella cheese"
        ),
        DataModel(
            image = R.drawable.acd5,
            name = "MEAT LOVER'S",
            material = "Meat Lover's Pizza is usually made with a combination of meat and cheese. The main ingredients of this pizza include pizza dough, tomato sauce, and meat"
        ),
        DataModel(
            image =R.drawable.acd6 ,
            name = "HAWAIIAN",
            material = "The main ingredients of Hawaiian pizza are pizza dough, tomato sauce, mozzarella cheese, ham (or bacon), and pineapple"
        )
    )

    LazyColumn {
        items(myData.size) { items ->
            ColumnItemUi(data = items,item=myData,nav=nav)

        }
    }
}
@Composable
fun ColumnItemUi(data: Int, nav: NavHostController, item: List<DataModel>) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable {
                nav.navigate("Detail/$data")
            }
            .wrapContentSize(),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xffffffff))
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            Image(painter = painterResource(item[data].image), "", modifier = Modifier.size(140.dp))
            Column(modifier = Modifier.padding(12.dp)) {
                Text(text = item[data].name, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                Text(text = item[data].material)
            }

        }


    }

}




