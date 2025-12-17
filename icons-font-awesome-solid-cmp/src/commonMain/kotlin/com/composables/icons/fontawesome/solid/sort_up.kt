package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SortUp: ImageVector
    get() {
        if (_SortUp != null) return _SortUp!!
        
        _SortUp = ImageVector.Builder(
            name = "sort-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279f, 224f)
                horizontalLineTo(41f)
                curveToRelative(-21.4f, 0f, -32.1f, -25.9f, -17f, -41f)
                lineTo(143f, 64f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(119f, 119f)
                curveToRelative(15.2f, 15.1f, 4.5f, 41f, -16.9f, 41f)
                close()
            }
        }.build()
        
        return _SortUp!!
    }

private var _SortUp: ImageVector? = null

