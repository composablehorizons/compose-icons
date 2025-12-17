package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.SignalSlash: ImageVector
    get() {
        if (_SignalSlash != null) return _SignalSlash!!
        
        _SignalSlash = ImageVector.Builder(
            name = "signal-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(8.407f, 8.407f)
                arcToRelative(1.125f, 1.125f, 0f, false, true, 1.186f, 1.186f)
                lineToRelative(1.462f, 1.461f)
                arcToRelative(3.001f, 3.001f, 0f, false, false, -0.464f, -3.645f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.061f, -1.061f)
                arcToRelative(4.501f, 4.501f, 0f, false, true, 0.486f, 5.79f)
                lineToRelative(1.072f, 1.072f)
                arcToRelative(6.001f, 6.001f, 0f, false, false, -0.497f, -7.923f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                arcToRelative(7.501f, 7.501f, 0f, false, true, 0.505f, 10.05f)
                lineToRelative(1.064f, 1.065f)
                arcToRelative(9f, 9f, 0f, false, false, -0.508f, -12.176f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                curveToRelative(3.923f, 3.922f, 4.093f, 10.175f, 0.512f, 14.3f)
                lineToRelative(1.594f, 1.594f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineToRelative(-2.106f, -2.105f)
                lineToRelative(-2.121f, -2.122f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-4.705f, -4.706f)
                arcToRelative(0.747f, 0.747f, 0f, false, true, -0.127f, -0.126f)
                lineTo(2.47f, 3.53f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.061f)
                close()
                moveToRelative(1.189f, 4.422f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.326f, 1.01f)
                arcToRelative(9.004f, 9.004f, 0f, false, false, 1.651f, 10.462f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                curveTo(1.27f, 16.12f, 0.63f, 11.165f, 2.648f, 7.219f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.01f, -0.326f)
                close()
                moveTo(5.84f, 9.134f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.472f, 0.95f)
                arcToRelative(6f, 6f, 0f, false, false, 1.444f, 6.159f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                arcTo(7.5f, 7.5f, 0f, false, true, 4.89f, 9.606f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.95f, -0.472f)
                close()
                moveToRelative(2.341f, 2.653f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.848f, 0.638f)
                curveToRelative(0.088f, 0.62f, 0.37f, 1.218f, 0.849f, 1.696f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 1.061f)
                arcToRelative(4.483f, 4.483f, 0f, false, true, -1.273f, -2.546f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.637f, -0.848f)
                close()
            }
        }.build()
        
        return _SignalSlash!!
    }

private var _SignalSlash: ImageVector? = null

