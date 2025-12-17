package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Instalod: ImageVector
    get() {
        if (_Instalod != null) return _Instalod!!
        
        _Instalod = ImageVector.Builder(
            name = "instalod",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(153.384f, 480f)
                horizontalLineTo(387.113f)
                lineTo(502.554f, 275.765f)
                lineTo(204.229f, 333.211f)
                close()
                moveTo(504.726f, 240.078f)
                lineTo(387.113f, 32f)
                horizontalLineTo(155.669f)
                lineTo(360.23f, 267.9f)
                close()
                moveTo(124.386f, 48.809f)
                lineTo(7.274f, 256f)
                lineTo(123.236f, 461.154f)
                lineTo(225.627f, 165.561f)
                close()
            }
        }.build()
        
        return _Instalod!!
    }

private var _Instalod: ImageVector? = null

