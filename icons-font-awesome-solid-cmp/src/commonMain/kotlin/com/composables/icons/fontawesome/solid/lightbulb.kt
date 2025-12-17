package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Lightbulb: ImageVector
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
                moveTo(96.06f, 454.35f)
                curveToRelative(0.01f, 6.29f, 1.87f, 12.45f, 5.36f, 17.69f)
                lineToRelative(17.09f, 25.69f)
                arcToRelative(31.99f, 31.99f, 0f, false, false, 26.64f, 14.28f)
                horizontalLineToRelative(61.71f)
                arcToRelative(31.99f, 31.99f, 0f, false, false, 26.64f, -14.28f)
                lineToRelative(17.09f, -25.69f)
                arcToRelative(31.989f, 31.989f, 0f, false, false, 5.36f, -17.69f)
                lineToRelative(0.04f, -38.35f)
                horizontalLineTo(96.01f)
                lineToRelative(0.05f, 38.35f)
                close()
                moveTo(0f, 176f)
                curveToRelative(0f, 44.37f, 16.45f, 84.85f, 43.56f, 115.78f)
                curveToRelative(16.52f, 18.85f, 42.36f, 58.23f, 52.21f, 91.45f)
                curveToRelative(0.04f, 0.26f, 0.07f, 0.52f, 0.11f, 0.78f)
                horizontalLineToRelative(160.24f)
                curveToRelative(0.04f, -0.26f, 0.07f, -0.51f, 0.11f, -0.78f)
                curveToRelative(9.85f, -33.22f, 35.69f, -72.6f, 52.21f, -91.45f)
                curveTo(335.55f, 260.85f, 352f, 220.37f, 352f, 176f)
                curveTo(352f, 78.61f, 272.91f, -0.3f, 175.45f, 0f)
                curveTo(73.44f, 0.31f, 0f, 82.97f, 0f, 176f)
                close()
                moveToRelative(176f, -80f)
                curveToRelative(-44.11f, 0f, -80f, 35.89f, -80f, 80f)
                curveToRelative(0f, 8.84f, -7.16f, 16f, -16f, 16f)
                reflectiveCurveToRelative(-16f, -7.16f, -16f, -16f)
                curveToRelative(0f, -61.76f, 50.24f, -112f, 112f, -112f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Lightbulb!!
    }

private var _Lightbulb: ImageVector? = null

