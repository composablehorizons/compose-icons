package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Ad: ImageVector
    get() {
        if (_Ad != null) return _Ad!!
        
        _Ad = ImageVector.Builder(
            name = "ad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(157.52f, 272f)
                horizontalLineToRelative(36.96f)
                lineTo(176f, 218.78f)
                lineTo(157.52f, 272f)
                close()
                moveTo(352f, 256f)
                curveToRelative(-13.23f, 0f, -24f, 10.77f, -24f, 24f)
                reflectiveCurveToRelative(10.77f, 24f, 24f, 24f)
                reflectiveCurveToRelative(24f, -10.77f, 24f, -24f)
                reflectiveCurveToRelative(-10.77f, -24f, -24f, -24f)
                close()
                moveTo(464f, 64f)
                horizontalLineTo(48f)
                curveTo(21.5f, 64f, 0f, 85.5f, 0f, 112f)
                verticalLineToRelative(288f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(112f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(250.58f, 352f)
                horizontalLineToRelative(-16.94f)
                curveToRelative(-6.81f, 0f, -12.88f, -4.32f, -15.12f, -10.75f)
                lineTo(211.15f, 320f)
                horizontalLineToRelative(-70.29f)
                lineToRelative(-7.38f, 21.25f)
                arcTo(16f, 16f, 0f, false, true, 118.36f, 352f)
                horizontalLineToRelative(-16.94f)
                curveToRelative(-11.01f, 0f, -18.73f, -10.85f, -15.12f, -21.25f)
                lineTo(140f, 176.12f)
                arcTo(23.995f, 23.995f, 0f, false, true, 162.67f, 160f)
                horizontalLineToRelative(26.66f)
                arcTo(23.99f, 23.99f, 0f, false, true, 212f, 176.13f)
                lineToRelative(53.69f, 154.62f)
                curveToRelative(3.61f, 10.4f, -4.11f, 21.25f, -15.11f, 21.25f)
                close()
                moveTo(424f, 336f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                horizontalLineToRelative(-16f)
                curveToRelative(-4.85f, 0f, -9.04f, -2.27f, -11.98f, -5.68f)
                curveToRelative(-8.62f, 3.66f, -18.09f, 5.68f, -28.02f, 5.68f)
                curveToRelative(-39.7f, 0f, -72f, -32.3f, -72f, -72f)
                reflectiveCurveToRelative(32.3f, -72f, 72f, -72f)
                curveToRelative(8.46f, 0f, 16.46f, 1.73f, 24f, 4.42f)
                verticalLineTo(176f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Ad!!
    }

private var _Ad: ImageVector? = null

