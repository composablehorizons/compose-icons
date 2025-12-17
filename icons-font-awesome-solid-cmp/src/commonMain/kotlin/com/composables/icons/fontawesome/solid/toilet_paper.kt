package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.ToiletPaper: ImageVector
    get() {
        if (_ToiletPaper != null) return _ToiletPaper!!
        
        _ToiletPaper = ImageVector.Builder(
            name = "toilet-paper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 0f)
                curveTo(74.98f, 0f, 32f, 85.96f, 32f, 192f)
                verticalLineToRelative(172.07f)
                curveToRelative(0f, 41.12f, -9.8f, 62.77f, -31.17f, 126.87f)
                curveTo(-2.62f, 501.3f, 5.09f, 512f, 16.01f, 512f)
                horizontalLineToRelative(280.92f)
                curveToRelative(13.77f, 0f, 26f, -8.81f, 30.36f, -21.88f)
                curveToRelative(12.83f, -38.48f, 24.71f, -72.4f, 24.71f, -126.05f)
                verticalLineTo(192f)
                curveToRelative(0f, -83.6f, 23.67f, -153.52f, 60.44f, -192f)
                horizontalLineTo(128f)
                close()
                moveTo(96f, 224f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
                moveToRelative(64f, 0f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
                moveToRelative(64f, 0f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
                moveToRelative(64f, 0f)
                curveToRelative(-8.84f, 0f, -16f, -7.16f, -16f, -16f)
                reflectiveCurveToRelative(7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
                moveTo(480f, 0f)
                curveToRelative(-53.02f, 0f, -96f, 85.96f, -96f, 192f)
                reflectiveCurveToRelative(42.98f, 192f, 96f, 192f)
                reflectiveCurveToRelative(96f, -85.96f, 96f, -192f)
                reflectiveCurveTo(533.02f, 0f, 480f, 0f)
                close()
                moveToRelative(0f, 256f)
                curveToRelative(-17.67f, 0f, -32f, -28.65f, -32f, -64f)
                reflectiveCurveToRelative(14.33f, -64f, 32f, -64f)
                reflectiveCurveToRelative(32f, 28.65f, 32f, 64f)
                reflectiveCurveToRelative(-14.33f, 64f, -32f, 64f)
                close()
            }
        }.build()
        
        return _ToiletPaper!!
    }

private var _ToiletPaper: ImageVector? = null

