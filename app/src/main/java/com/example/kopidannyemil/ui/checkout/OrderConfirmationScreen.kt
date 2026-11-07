package com.example.kopidannyemil.ui.checkout

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.kopidannyemil.data.MenuItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderConfirmationScreen(
    selectedItem: MenuItem,
    address: String,
    paymentMethod: String,
    note: String,
    onFinishOrder: () -> Unit
) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Konfirmasi Pesanan") })
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Ringkasan Pesanan", style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(8.dp))
                    Text("• ${selectedItem.name} (${selectedItem.price})")
                    if (note.isNotBlank()) {
                        Text("Catatan: $note", style = MaterialTheme.typography.bodySmall)
                    }
                    HorizontalDivider(modifier = Modifier.padding(vertical = 8.dp))
                    Text("Total Pembayaran: ${selectedItem.price} ($paymentMethod)", style = MaterialTheme.typography.titleSmall)
                }
            }

            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text("Alamat Pengiriman", style = MaterialTheme.typography.titleMedium)
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(address)
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = onFinishOrder,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Pesan Sekarang 🎉")
            }
        }
    }
}