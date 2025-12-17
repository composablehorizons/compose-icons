package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Atlas: ImageVector
    get() {
        if (_Atlas != null) return _Atlas!!
        
        _Atlas = ImageVector.Builder(
            name = "atlas",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(318.38f, 208f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(-1.49f, 27.03f, -6.54f, 51.35f, -14.21f, 70.41f)
                curveToRelative(27.71f, -13.24f, 48.02f, -39.19f, 53.3f, -70.41f)
                close()
                moveToRelative(0f, -32f)
                curveToRelative(-5.29f, -31.22f, -25.59f, -57.17f, -53.3f, -70.41f)
                curveToRelative(7.68f, 19.06f, 12.72f, 43.38f, 14.21f, 70.41f)
                horizontalLineToRelative(39.09f)
                close()
                moveTo(224f, 97.31f)
                curveToRelative(-7.69f, 7.45f, -20.77f, 34.42f, -23.43f, 78.69f)
                horizontalLineToRelative(46.87f)
                curveToRelative(-2.67f, -44.26f, -15.75f, -71.24f, -23.44f, -78.69f)
                close()
                moveToRelative(-41.08f, 8.28f)
                curveToRelative(-27.71f, 13.24f, -48.02f, 39.19f, -53.3f, 70.41f)
                horizontalLineToRelative(39.09f)
                curveToRelative(1.49f, -27.03f, 6.53f, -51.35f, 14.21f, -70.41f)
                close()
                moveToRelative(0f, 172.82f)
                curveToRelative(-7.68f, -19.06f, -12.72f, -43.38f, -14.21f, -70.41f)
                horizontalLineToRelative(-39.09f)
                curveToRelative(5.28f, 31.22f, 25.59f, 57.17f, 53.3f, 70.41f)
                close()
                moveTo(247.43f, 208f)
                horizontalLineToRelative(-46.87f)
                curveToRelative(2.66f, 44.26f, 15.74f, 71.24f, 23.43f, 78.69f)
                curveToRelative(7.7f, -7.45f, 20.78f, -34.43f, 23.44f, -78.69f)
                close()
                moveTo(448f, 358.4f)
                verticalLineTo(25.6f)
                curveToRelative(0f, -16f, -9.6f, -25.6f, -25.6f, -25.6f)
                horizontalLineTo(96f)
                curveTo(41.6f, 0f, 0f, 41.6f, 0f, 96f)
                verticalLineToRelative(320f)
                curveToRelative(0f, 54.4f, 41.6f, 96f, 96f, 96f)
                horizontalLineToRelative(326.4f)
                curveToRelative(12.8f, 0f, 25.6f, -9.6f, 25.6f, -25.6f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -6.4f, -3.2f, -12.8f, -9.6f, -19.2f)
                curveToRelative(-3.2f, -16f, -3.2f, -60.8f, 0f, -73.6f)
                curveToRelative(6.4f, -3.2f, 9.6f, -9.6f, 9.6f, -19.2f)
                close()
                moveTo(224f, 64f)
                curveToRelative(70.69f, 0f, 128f, 57.31f, 128f, 128f)
                reflectiveCurveToRelative(-57.31f, 128f, -128f, 128f)
                reflectiveCurveTo(96f, 262.69f, 96f, 192f)
                reflectiveCurveTo(153.31f, 64f, 224f, 64f)
                close()
                moveToRelative(160f, 384f)
                horizontalLineTo(96f)
                curveToRelative(-19.2f, 0f, -32f, -12.8f, -32f, -32f)
                reflectiveCurveToRelative(16f, -32f, 32f, -32f)
                horizontalLineToRelative(288f)
                verticalLineToRelative(64f)
                close()
            }
        }.build()
        
        return _Atlas!!
    }

private var _Atlas: ImageVector? = null

