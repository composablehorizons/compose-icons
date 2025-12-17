package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sensors: ImageVector
    get() {
        if (_Sensors != null) return _Sensors!!
        
        _Sensors = ImageVector.Builder(
            name = "sensors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.76f, 16.24f)
                curveTo(6.67f, 15.16f, 6f, 13.66f, 6f, 12f)
                reflectiveCurveToRelative(0.67f, -3.16f, 1.76f, -4.24f)
                lineToRelative(1.42f, 1.42f)
                curveTo(8.45f, 9.9f, 8f, 10.9f, 8f, 12f)
                curveToRelative(0f, 1.1f, 0.45f, 2.1f, 1.17f, 2.83f)
                lineTo(7.76f, 16.24f)
                close()
                moveTo(16.24f, 16.24f)
                curveTo(17.33f, 15.16f, 18f, 13.66f, 18f, 12f)
                reflectiveCurveToRelative(-0.67f, -3.16f, -1.76f, -4.24f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(15.55f, 9.9f, 16f, 10.9f, 16f, 12f)
                curveToRelative(0f, 1.1f, -0.45f, 2.1f, -1.17f, 2.83f)
                lineTo(16.24f, 16.24f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 2.21f, -0.9f, 4.21f, -2.35f, 5.65f)
                lineToRelative(1.42f, 1.42f)
                curveTo(20.88f, 17.26f, 22f, 14.76f, 22f, 12f)
                reflectiveCurveToRelative(-1.12f, -5.26f, -2.93f, -7.07f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(19.1f, 7.79f, 20f, 9.79f, 20f, 12f)
                close()
                moveTo(6.35f, 6.35f)
                lineTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2f, 9.24f, 2f, 12f)
                reflectiveCurveToRelative(1.12f, 5.26f, 2.93f, 7.07f)
                lineToRelative(1.42f, -1.42f)
                curveTo(4.9f, 16.21f, 4f, 14.21f, 4f, 12f)
                reflectiveCurveTo(4.9f, 7.79f, 6.35f, 6.35f)
                close()
            }
        }.build()
        
        return _Sensors!!
    }

private var _Sensors: ImageVector? = null

