package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) return _Bluetooth!!
        
        _Bluetooth = ImageVector.Builder(
            name = "bluetooth",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(292.6f, 171.1f)
                lineTo(249.7f, 214f)
                lineToRelative(-0.3f, -86f)
                lineToRelative(43.2f, 43.1f)
                moveToRelative(-43.2f, 219.8f)
                lineToRelative(43.1f, -43.1f)
                lineToRelative(-42.9f, -42.9f)
                lineToRelative(-0.2f, 86f)
                close()
                moveTo(416f, 259.4f)
                curveTo(416f, 465f, 344.1f, 512f, 230.9f, 512f)
                reflectiveCurveTo(32f, 465f, 32f, 259.4f)
                reflectiveCurveTo(115.4f, 0f, 228.6f, 0f)
                reflectiveCurveTo(416f, 53.9f, 416f, 259.4f)
                close()
                moveToRelative(-158.5f, 0f)
                lineToRelative(79.4f, -88.6f)
                lineTo(211.8f, 36.5f)
                verticalLineToRelative(176.9f)
                lineTo(138f, 139.6f)
                lineToRelative(-27f, 26.9f)
                lineToRelative(92.7f, 93f)
                lineToRelative(-92.7f, 93f)
                lineToRelative(26.9f, 26.9f)
                lineToRelative(73.8f, -73.8f)
                lineToRelative(2.3f, 170f)
                lineToRelative(127.4f, -127.5f)
                lineToRelative(-83.9f, -88.7f)
                close()
            }
        }.build()
        
        return _Bluetooth!!
    }

private var _Bluetooth: ImageVector? = null

