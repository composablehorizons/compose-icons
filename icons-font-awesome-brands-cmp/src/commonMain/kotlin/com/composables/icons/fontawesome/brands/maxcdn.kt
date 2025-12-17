package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Maxcdn: ImageVector
    get() {
        if (_Maxcdn != null) return _Maxcdn!!
        
        _Maxcdn = ImageVector.Builder(
            name = "maxcdn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(461.1f, 442.7f)
                horizontalLineToRelative(-97.4f)
                lineTo(415.6f, 200f)
                curveToRelative(2.3f, -10.2f, 0.9f, -19.5f, -4.4f, -25.7f)
                curveToRelative(-5f, -6.1f, -13.7f, -9.6f, -24.2f, -9.6f)
                horizontalLineToRelative(-49.3f)
                lineToRelative(-59.5f, 278f)
                horizontalLineToRelative(-97.4f)
                lineToRelative(59.5f, -278f)
                horizontalLineToRelative(-83.4f)
                lineToRelative(-59.5f, 278f)
                horizontalLineTo(0f)
                lineToRelative(59.5f, -278f)
                lineToRelative(-44.6f, -95.4f)
                horizontalLineTo(387f)
                curveToRelative(39.4f, 0f, 75.3f, 16.3f, 98.3f, 44.9f)
                curveToRelative(23.3f, 28.6f, 31.8f, 67.4f, 23.6f, 105.9f)
                lineToRelative(-47.8f, 222.6f)
                close()
            }
        }.build()
        
        return _Maxcdn!!
    }

private var _Maxcdn: ImageVector? = null

