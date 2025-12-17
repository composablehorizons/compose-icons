package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Yahoo: ImageVector
    get() {
        if (_Yahoo != null) return _Yahoo!!
        
        _Yahoo = ImageVector.Builder(
            name = "yahoo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(223.69f, 141.06f)
                lineTo(167f, 284.23f)
                lineTo(111f, 141.06f)
                horizontalLineTo(14.93f)
                lineTo(120.76f, 390.19f)
                lineTo(82.19f, 480f)
                horizontalLineToRelative(94.17f)
                lineTo(317.27f, 141.06f)
                close()
                moveToRelative(105.4f, 135.79f)
                arcToRelative(58.22f, 58.22f, 0f, true, false, 58.22f, 58.22f)
                arcTo(58.22f, 58.22f, 0f, false, false, 329.09f, 276.85f)
                close()
                moveTo(394.65f, 32f)
                lineToRelative(-93f, 223.47f)
                horizontalLineTo(406.44f)
                lineTo(499.07f, 32f)
                close()
            }
        }.build()
        
        return _Yahoo!!
    }

private var _Yahoo: ImageVector? = null

