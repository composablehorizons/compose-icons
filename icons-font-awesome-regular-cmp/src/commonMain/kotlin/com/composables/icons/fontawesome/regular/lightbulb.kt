package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Lightbulb: ImageVector
    get() {
        if (_Lightbulb != null) return _Lightbulb!!
        
        _Lightbulb = ImageVector.Builder(
            name = "lightbulb",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 352f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 80f)
                curveToRelative(-52.94f, 0f, -96f, 43.06f, -96f, 96f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                reflectiveCurveToRelative(16f, -7.16f, 16f, -16f)
                curveToRelative(0f, -35.3f, 28.72f, -64f, 64f, -64f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                reflectiveCurveToRelative(-7.16f, -16f, -16f, -16f)
                close()
                moveTo(96.06f, 459.17f)
                curveToRelative(0f, 3.15f, 0.93f, 6.22f, 2.68f, 8.84f)
                lineToRelative(24.51f, 36.84f)
                curveToRelative(2.97f, 4.46f, 7.97f, 7.14f, 13.32f, 7.14f)
                horizontalLineToRelative(78.85f)
                curveToRelative(5.36f, 0f, 10.36f, -2.68f, 13.32f, -7.14f)
                lineToRelative(24.51f, -36.84f)
                curveToRelative(1.74f, -2.62f, 2.67f, -5.7f, 2.68f, -8.84f)
                lineToRelative(0.05f, -43.18f)
                horizontalLineTo(96.02f)
                lineToRelative(0.04f, 43.18f)
                close()
                moveTo(176f, 0f)
                curveTo(73.72f, 0f, 0f, 82.97f, 0f, 176f)
                curveToRelative(0f, 44.37f, 16.45f, 84.85f, 43.56f, 115.78f)
                curveToRelative(16.64f, 18.99f, 42.74f, 58.8f, 52.42f, 92.16f)
                verticalLineToRelative(0.06f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-0.12f)
                curveToRelative(-0.01f, -4.77f, -0.72f, -9.51f, -2.15f, -14.07f)
                curveToRelative(-5.59f, -17.81f, -22.82f, -64.77f, -62.17f, -109.67f)
                curveToRelative(-20.54f, -23.43f, -31.52f, -53.15f, -31.61f, -84.14f)
                curveToRelative(-0.2f, -73.64f, 59.67f, -128f, 127.95f, -128f)
                curveToRelative(70.58f, 0f, 128f, 57.42f, 128f, 128f)
                curveToRelative(0f, 30.97f, -11.24f, 60.85f, -31.65f, 84.14f)
                curveToRelative(-39.11f, 44.61f, -56.42f, 91.47f, -62.1f, 109.46f)
                arcToRelative(47.507f, 47.507f, 0f, false, false, -2.22f, 14.3f)
                verticalLineToRelative(0.1f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(-0.05f)
                curveToRelative(9.68f, -33.37f, 35.78f, -73.18f, 52.42f, -92.16f)
                curveTo(335.55f, 260.85f, 352f, 220.37f, 352f, 176f)
                curveTo(352f, 78.8f, 273.2f, 0f, 176f, 0f)
                close()
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

