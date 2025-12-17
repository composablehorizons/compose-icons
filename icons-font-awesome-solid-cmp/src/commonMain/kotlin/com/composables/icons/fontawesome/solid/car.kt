package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Car: ImageVector
    get() {
        if (_Car != null) return _Car!!
        
        _Car = ImageVector.Builder(
            name = "car",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(499.99f, 176f)
                horizontalLineToRelative(-59.87f)
                lineToRelative(-16.64f, -41.6f)
                curveTo(406.38f, 91.63f, 365.57f, 64f, 319.5f, 64f)
                horizontalLineToRelative(-127f)
                curveToRelative(-46.06f, 0f, -86.88f, 27.63f, -103.99f, 70.4f)
                lineTo(71.87f, 176f)
                horizontalLineTo(12.01f)
                curveTo(4.2f, 176f, -1.53f, 183.34f, 0.37f, 190.91f)
                lineToRelative(6f, 24f)
                curveTo(7.7f, 220.25f, 12.5f, 224f, 18.01f, 224f)
                horizontalLineToRelative(20.07f)
                curveTo(24.65f, 235.73f, 16f, 252.78f, 16f, 272f)
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
                curveToRelative(0f, -19.22f, -8.65f, -36.27f, -22.07f, -48f)
                horizontalLineTo(494f)
                curveToRelative(5.51f, 0f, 10.31f, -3.75f, 11.64f, -9.09f)
                lineToRelative(6f, -24f)
                curveToRelative(1.89f, -7.57f, -3.84f, -14.91f, -11.65f, -14.91f)
                close()
                moveToRelative(-352.06f, -17.83f)
                curveToRelative(7.29f, -18.22f, 24.94f, -30.17f, 44.57f, -30.17f)
                horizontalLineToRelative(127f)
                curveToRelative(19.63f, 0f, 37.28f, 11.95f, 44.57f, 30.17f)
                lineTo(384f, 208f)
                horizontalLineTo(128f)
                lineToRelative(19.93f, -49.83f)
                close()
                moveTo(96f, 319.8f)
                curveToRelative(-19.2f, 0f, -32f, -12.76f, -32f, -31.9f)
                reflectiveCurveTo(76.8f, 256f, 96f, 256f)
                reflectiveCurveToRelative(48f, 28.71f, 48f, 47.85f)
                reflectiveCurveToRelative(-28.8f, 15.95f, -48f, 15.95f)
                close()
                moveToRelative(320f, 0f)
                curveToRelative(-19.2f, 0f, -48f, 3.19f, -48f, -15.95f)
                reflectiveCurveTo(396.8f, 256f, 416f, 256f)
                reflectiveCurveToRelative(32f, 12.76f, 32f, 31.9f)
                reflectiveCurveToRelative(-12.8f, 31.9f, -32f, 31.9f)
                close()
            }
        }.build()
        
        return _Car!!
    }

private var _Car: ImageVector? = null

