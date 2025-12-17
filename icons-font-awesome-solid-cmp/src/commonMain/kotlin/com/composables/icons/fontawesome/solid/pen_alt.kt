package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PenAlt: ImageVector
    get() {
        if (_PenAlt != null) return _PenAlt!!
        
        _PenAlt = ImageVector.Builder(
            name = "pen-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(497.94f, 74.17f)
                lineToRelative(-60.11f, -60.11f)
                curveToRelative(-18.75f, -18.75f, -49.16f, -18.75f, -67.91f, 0f)
                lineToRelative(-56.55f, 56.55f)
                lineToRelative(128.02f, 128.02f)
                lineToRelative(56.55f, -56.55f)
                curveToRelative(18.75f, -18.75f, 18.75f, -49.15f, 0f, -67.91f)
                close()
                moveToRelative(-246.8f, -20.53f)
                curveToRelative(-15.62f, -15.62f, -40.94f, -15.62f, -56.56f, 0f)
                lineTo(75.8f, 172.43f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.62f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(101.82f, -101.82f)
                lineToRelative(22.63f, 22.62f)
                lineTo(93.95f, 290.03f)
                arcTo(327.038f, 327.038f, 0f, false, false, 0.17f, 485.11f)
                lineToRelative(-0.03f, 0.23f)
                curveToRelative(-1.7f, 15.28f, 11.21f, 28.2f, 26.49f, 26.51f)
                arcToRelative(327.02f, 327.02f, 0f, false, false, 195.34f, -93.8f)
                lineToRelative(196.79f, -196.79f)
                lineToRelative(-82.77f, -82.77f)
                lineToRelative(-84.85f, -84.85f)
                close()
            }
        }.build()
        
        return _PenAlt!!
    }

private var _PenAlt: ImageVector? = null

