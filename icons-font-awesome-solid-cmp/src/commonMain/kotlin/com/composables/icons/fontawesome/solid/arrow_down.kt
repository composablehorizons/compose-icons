package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ArrowDown: ImageVector
    get() {
        if (_ArrowDown != null) return _ArrowDown!!
        
        _ArrowDown = ImageVector.Builder(
            name = "arrow-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(413.1f, 222.5f)
                lineToRelative(22.2f, 22.2f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineTo(241f, 473f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(12.7f, 278.6f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(22.2f, -22.2f)
                curveToRelative(9.5f, -9.5f, 25f, -9.3f, 34.3f, 0.4f)
                lineTo(184f, 343.4f)
                verticalLineTo(56f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                horizontalLineToRelative(32f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                verticalLineToRelative(287.4f)
                lineToRelative(114.8f, -120.5f)
                curveToRelative(9.3f, -9.8f, 24.8f, -10f, 34.3f, -0.4f)
                close()
            }
        }.build()
        
        return _ArrowDown!!
    }

private var _ArrowDown: ImageVector? = null

