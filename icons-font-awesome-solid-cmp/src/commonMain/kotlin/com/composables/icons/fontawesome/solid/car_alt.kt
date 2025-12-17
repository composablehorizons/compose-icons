package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CarAlt: ImageVector
    get() {
        if (_CarAlt != null) return _CarAlt!!
        
        _CarAlt = ImageVector.Builder(
            name = "car-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 480f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438.66f, 212.33f)
                lineToRelative(-11.24f, -28.1f)
                lineToRelative(-19.93f, -49.83f)
                curveTo(390.38f, 91.63f, 349.57f, 64f, 303.5f, 64f)
                horizontalLineToRelative(-127f)
                curveToRelative(-46.06f, 0f, -86.88f, 27.63f, -103.99f, 70.4f)
                lineToRelative(-19.93f, 49.83f)
                lineToRelative(-11.24f, 28.1f)
                curveTo(17.22f, 221.5f, 0f, 244.66f, 0f, 272f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 16.12f, 6.16f, 30.67f, 16f, 41.93f)
                verticalLineTo(416f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(256f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(32f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-54.07f)
                curveToRelative(9.84f, -11.25f, 16f, -25.8f, 16f, -41.93f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -27.34f, -17.22f, -50.5f, -41.34f, -59.67f)
                close()
                moveToRelative(-306.73f, -54.16f)
                curveToRelative(7.29f, -18.22f, 24.94f, -30.17f, 44.57f, -30.17f)
                horizontalLineToRelative(127f)
                curveToRelative(19.63f, 0f, 37.28f, 11.95f, 44.57f, 30.17f)
                lineTo(368f, 208f)
                horizontalLineTo(112f)
                lineToRelative(19.93f, -49.83f)
                close()
                moveTo(80f, 319.8f)
                curveToRelative(-19.2f, 0f, -32f, -12.76f, -32f, -31.9f)
                reflectiveCurveTo(60.8f, 256f, 80f, 256f)
                reflectiveCurveToRelative(48f, 28.71f, 48f, 47.85f)
                reflectiveCurveToRelative(-28.8f, 15.95f, -48f, 15.95f)
                close()
                moveToRelative(320f, 0f)
                curveToRelative(-19.2f, 0f, -48f, 3.19f, -48f, -15.95f)
                reflectiveCurveTo(380.8f, 256f, 400f, 256f)
                reflectiveCurveToRelative(32f, 12.76f, 32f, 31.9f)
                reflectiveCurveToRelative(-12.8f, 31.9f, -32f, 31.9f)
                close()
            }
        }.build()
        
        return _CarAlt!!
    }

private var _CarAlt: ImageVector? = null

