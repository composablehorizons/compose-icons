package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AngleLeft: ImageVector
    get() {
        if (_AngleLeft != null) return _AngleLeft!!
        
        _AngleLeft = ImageVector.Builder(
            name = "angle-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(31.7f, 239f)
                lineToRelative(136f, -136f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0f)
                lineToRelative(22.6f, 22.6f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineTo(127.9f, 256f)
                lineToRelative(96.4f, 96.4f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0f, 33.9f)
                lineTo(201.7f, 409f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0f)
                lineToRelative(-136f, -136f)
                curveToRelative(-9.5f, -9.4f, -9.5f, -24.6f, -0.1f, -34f)
                close()
            }
        }.build()
        
        return _AngleLeft!!
    }

private var _AngleLeft: ImageVector? = null

