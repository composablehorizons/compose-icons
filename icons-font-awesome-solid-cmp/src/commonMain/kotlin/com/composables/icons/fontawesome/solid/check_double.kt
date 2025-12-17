package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CheckDouble: ImageVector
    get() {
        if (_CheckDouble != null) return _CheckDouble!!
        
        _CheckDouble = ImageVector.Builder(
            name = "check-double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(505f, 174.8f)
                lineToRelative(-39.6f, -39.6f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(192f, 374.7f)
                lineTo(80.6f, 263.2f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(7f, 302.9f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 34f)
                lineTo(175f, 505f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0f)
                lineToRelative(296f, -296.2f)
                curveToRelative(9.4f, -9.5f, 9.4f, -24.7f, 0.1f, -34f)
                close()
                moveToRelative(-324.3f, 106f)
                curveToRelative(6.2f, 6.3f, 16.4f, 6.3f, 22.6f, 0f)
                lineToRelative(208f, -208.2f)
                curveToRelative(6.2f, -6.3f, 6.2f, -16.4f, 0f, -22.6f)
                lineTo(366.1f, 4.7f)
                curveToRelative(-6.2f, -6.3f, -16.4f, -6.3f, -22.6f, 0f)
                lineTo(192f, 156.2f)
                lineToRelative(-55.4f, -55.5f)
                curveToRelative(-6.2f, -6.3f, -16.4f, -6.3f, -22.6f, 0f)
                lineTo(68.7f, 146f)
                curveToRelative(-6.2f, 6.3f, -6.2f, 16.4f, 0f, 22.6f)
                lineToRelative(112f, 112.2f)
                close()
            }
        }.build()
        
        return _CheckDouble!!
    }

private var _CheckDouble: ImageVector? = null

