package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AngleDown: ImageVector
    get() {
        if (_AngleDown != null) return _AngleDown!!
        
        _AngleDown = ImageVector.Builder(
            name = "angle-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(143f, 352.3f)
                lineTo(7f, 216.3f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(96.4f, 96.4f)
                lineToRelative(96.4f, -96.4f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(-136f, 136f)
                curveToRelative(-9.2f, 9.4f, -24.4f, 9.4f, -33.8f, 0f)
                close()
            }
        }.build()
        
        return _AngleDown!!
    }

private var _AngleDown: ImageVector? = null

