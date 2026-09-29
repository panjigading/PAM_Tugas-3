package com.example.pamtugas3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pamtugas3.ui.theme.PAMTugas3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAMTugas3Theme {
                ImageList()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ImageList() {
    LazyColumn(
        modifier = Modifier.padding(3.dp),
        verticalArrangement = Arrangement.spacedBy(5.dp),
    ) {
        stickyHeader {
            Text(
                text = "Panji Sunaring G. - 245150400111007",
                modifier = Modifier.fillMaxSize().padding(8.dp),
                textAlign = TextAlign.Center
            )
        }
        items(10) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.surfaceVariant)
                    .padding(8.dp),
                painter = painterResource(id = R.drawable.android_developer_logo),
                contentDescription = ""
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainActivityPreview() {
    PAMTugas3Theme {
        ImageList()
    }
}