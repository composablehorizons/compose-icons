package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AngleUp: ImageVector
    get() {
        if (_AngleUp != null) return _AngleUp!!
        
        _AngleUp = ImageVector.Builder(
            name = "angle-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(177f, 159.7f)
                lineToRelative(136f, 136f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(-22.6f, 22.6f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(160f, 255.9f)
                lineToRelative(-96.4f, 96.4f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineTo(7f, 329.7f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(136f, -136f)
                curveToRelative(9.4f, -9.5f, 24.6f, -9.5f, 34f, -0.1f)
                close()
            }
        }.build()
        
        return _AngleUp!!
    }

private var _AngleUp: ImageVector? = null

