package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Brightness_2: ImageVector
    get() {
        if (_Brightness_2 != null) return _Brightness_2!!
        
        _Brightness_2 = ImageVector.Builder(
            name = "brightness_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 4f)
                curveToRelative(4.41f, 0f, 8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                curveToRelative(-0.34f, 0f, -0.68f, -0.02f, -1.01f, -0.07f)
                curveTo(10.9f, 17.77f, 12f, 14.95f, 12f, 12f)
                reflectiveCurveToRelative(-1.1f, -5.77f, -3.01f, -7.93f)
                curveTo(9.32f, 4.02f, 9.66f, 4f, 10f, 4f)
                moveToRelative(0f, -2f)
                curveToRelative(-1.82f, 0f, -3.53f, 0.5f, -5f, 1.35f)
                curveTo(7.99f, 5.08f, 10f, 8.3f, 10f, 12f)
                reflectiveCurveToRelative(-2.01f, 6.92f, -5f, 8.65f)
                curveTo(6.47f, 21.5f, 8.18f, 22f, 10f, 22f)
                curveToRelative(5.52f, 0f, 10f, -4.48f, 10f, -10f)
                reflectiveCurveTo(15.52f, 2f, 10f, 2f)
                close()
            }
        }.build()
        
        return _Brightness_2!!
    }

private var _Brightness_2: ImageVector? = null

