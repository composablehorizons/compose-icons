package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VolumeDown: ImageVector
    get() {
        if (_VolumeDown != null) return _VolumeDown!!
        
        _VolumeDown = ImageVector.Builder(
            name = "volume-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(215.03f, 72.04f)
                lineTo(126.06f, 161f)
                horizontalLineTo(24f)
                curveToRelative(-13.26f, 0f, -24f, 10.74f, -24f, 24f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 13.25f, 10.74f, 24f, 24f, 24f)
                horizontalLineToRelative(102.06f)
                lineToRelative(88.97f, 88.95f)
                curveToRelative(15.03f, 15.03f, 40.97f, 4.47f, 40.97f, -16.97f)
                verticalLineTo(89.02f)
                curveToRelative(0f, -21.47f, -25.96f, -31.98f, -40.97f, -16.98f)
                close()
                moveToRelative(123.2f, 108.08f)
                curveToRelative(-11.58f, -6.33f, -26.19f, -2.16f, -32.61f, 9.45f)
                curveToRelative(-6.39f, 11.61f, -2.16f, 26.2f, 9.45f, 32.61f)
                curveTo(327.98f, 229.28f, 336f, 242.62f, 336f, 257f)
                curveToRelative(0f, 14.38f, -8.02f, 27.72f, -20.92f, 34.81f)
                curveToRelative(-11.61f, 6.41f, -15.84f, 21f, -9.45f, 32.61f)
                curveToRelative(6.43f, 11.66f, 21.05f, 15.8f, 32.61f, 9.45f)
                curveToRelative(28.23f, -15.55f, 45.77f, -45f, 45.77f, -76.88f)
                reflectiveCurveToRelative(-17.54f, -61.32f, -45.78f, -76.87f)
                close()
            }
        }.build()
        
        return _VolumeDown!!
    }

private var _VolumeDown: ImageVector? = null

