package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.SortDown: ImageVector
    get() {
        if (_SortDown != null) return _SortDown!!
        
        _SortDown = ImageVector.Builder(
            name = "sort-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(41f, 288f)
                horizontalLineToRelative(238f)
                curveToRelative(21.4f, 0f, 32.1f, 25.9f, 17f, 41f)
                lineTo(177f, 448f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(24f, 329f)
                curveToRelative(-15.1f, -15.1f, -4.4f, -41f, 17f, -41f)
                close()
            }
        }.build()
        
        return _SortDown!!
    }

private var _SortDown: ImageVector? = null

