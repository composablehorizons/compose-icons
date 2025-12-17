package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.HeartFilled: ImageVector
    get() {
        if (_HeartFilled != null) return _HeartFilled!!
        
        _HeartFilled = ImageVector.Builder(
            name = "heart-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.02199f, 14.072f)
                curveTo(7.89399f, 14.072f, 7.76599f, 14.023f, 7.66799f, 13.926f)
                lineTo(2.10399f, 8.36098f)
                curveTo(1.53799f, 7.79698f, 0.997986f, 6.89098f, 0.997986f, 5.69898f)
                curveTo(0.997986f, 3.94498f, 2.32599f, 2.00098f, 4.72799f, 2.00098f)
                curveTo(5.70299f, 2.00098f, 6.67899f, 2.35798f, 7.39299f, 3.07098f)
                lineTo(7.99499f, 3.67198f)
                lineTo(8.58699f, 3.07698f)
                curveTo(9.30499f, 2.35998f, 10.266f, 2.00298f, 11.229f, 2.00298f)
                curveTo(14.204f, 2.00298f, 14.998f, 4.68498f, 14.998f, 5.75298f)
                curveTo(14.998f, 6.70998f, 14.636f, 7.66598f, 13.912f, 8.39398f)
                lineTo(8.37599f, 13.927f)
                curveTo(8.27799f, 14.025f, 8.14999f, 14.073f, 8.02199f, 14.073f)
                verticalLineTo(14.072f)
                close()
            }
        }.build()
        
        return _HeartFilled!!
    }

private var _HeartFilled: ImageVector? = null

