package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Ethereum: ImageVector
    get() {
        if (_Ethereum != null) return _Ethereum!!
        
        _Ethereum = ImageVector.Builder(
            name = "ethereum",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(311.9f, 260.8f)
                lineTo(160f, 353.6f)
                lineTo(8f, 260.8f)
                lineTo(160f, 0f)
                lineToRelative(151.9f, 260.8f)
                close()
                moveTo(160f, 383.4f)
                lineTo(8f, 290.6f)
                lineTo(160f, 512f)
                lineToRelative(152f, -221.4f)
                lineToRelative(-152f, 92.8f)
                close()
            }
        }.build()
        
        return _Ethereum!!
    }

private var _Ethereum: ImageVector? = null

