package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AngleDoubleDown: ImageVector
    get() {
        if (_AngleDoubleDown != null) return _AngleDoubleDown!!
        
        _AngleDoubleDown = ImageVector.Builder(
            name = "angle-double-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 320f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(143f, 256.3f)
                lineTo(7f, 120.3f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(22.6f, -22.6f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(96.4f, 96.4f)
                lineToRelative(96.4f, -96.4f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineTo(313f, 86.3f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(-136f, 136f)
                curveToRelative(-9.4f, 9.5f, -24.6f, 9.5f, -34f, 0.1f)
                close()
                moveToRelative(34f, 192f)
                lineToRelative(136f, -136f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0f, -33.9f)
                lineToRelative(-22.6f, -22.6f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(160f, 352.1f)
                lineToRelative(-96.4f, -96.4f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0f)
                lineTo(7f, 278.3f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0f, 33.9f)
                lineToRelative(136f, 136f)
                curveToRelative(9.4f, 9.5f, 24.6f, 9.5f, 34f, 0.1f)
                close()
            }
        }.build()
        
        return _AngleDoubleDown!!
    }

private var _AngleDoubleDown: ImageVector? = null

