package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Socks: ImageVector
    get() {
        if (_Socks != null) return _Socks!!
        
        _Socks = ImageVector.Builder(
            name = "socks",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(214.66f, 311.01f)
                lineTo(288f, 256f)
                verticalLineTo(96f)
                horizontalLineTo(128f)
                verticalLineToRelative(176f)
                lineToRelative(-86.65f, 64.61f)
                curveToRelative(-39.4f, 29.56f, -53.86f, 84.42f, -29.21f, 127.06f)
                curveTo(30.39f, 495.25f, 63.27f, 512f, 96.08f, 512f)
                curveToRelative(20.03f, 0f, 40.25f, -6.25f, 57.52f, -19.2f)
                lineToRelative(21.86f, -16.39f)
                curveToRelative(-29.85f, -55.38f, -13.54f, -125.84f, 39.2f, -165.4f)
                close()
                moveTo(288f, 32f)
                curveToRelative(0f, -11.05f, 3.07f, -21.3f, 8.02f, -30.38f)
                curveTo(293.4f, 0.92f, 290.85f, 0f, 288f, 0f)
                horizontalLineTo(160f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(160f)
                verticalLineTo(32f)
                close()
                moveTo(480f, 0f)
                horizontalLineTo(352f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(192f)
                verticalLineTo(32f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                close()
                moveTo(320f, 272f)
                lineToRelative(-86.13f, 64.61f)
                curveToRelative(-39.4f, 29.56f, -53.86f, 84.42f, -29.21f, 127.06f)
                curveToRelative(18.25f, 31.58f, 50.61f, 48.33f, 83.42f, 48.33f)
                curveToRelative(20.03f, 0f, 40.25f, -6.25f, 57.52f, -19.2f)
                lineToRelative(115.2f, -86.4f)
                arcTo(127.997f, 127.997f, 0f, false, false, 512f, 304f)
                verticalLineTo(96f)
                horizontalLineTo(320f)
                verticalLineToRelative(176f)
                close()
            }
        }.build()
        
        return _Socks!!
    }

private var _Socks: ImageVector? = null

