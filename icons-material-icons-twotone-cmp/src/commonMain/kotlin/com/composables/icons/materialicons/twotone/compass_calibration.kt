package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Compass_calibration: ImageVector
    get() {
        if (_Compass_calibration != null) return _Compass_calibration!!
        
        _Compass_calibration = ImageVector.Builder(
            name = "compass_calibration",
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
                moveTo(4.94f, 7.26f)
                lineToRelative(2.21f, 2.21f)
                curveToRelative(1.44f, -0.91f, 3.11f, -1.4f, 4.85f, -1.4f)
                curveToRelative(1.74f, 0f, 3.41f, 0.49f, 4.84f, 1.4f)
                lineToRelative(2.21f, -2.21f)
                curveTo(17f, 5.79f, 14.56f, 5f, 12f, 5f)
                curveToRelative(-2.56f, 0f, -5.01f, 0.79f, -7.06f, 2.26f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 17f)
                arcTo(3f, 3f, 0f, false, true, 12f, 20f)
                arcTo(3f, 3f, 0f, false, true, 9f, 17f)
                arcTo(3f, 3f, 0f, false, true, 15f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 17f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                close()
                moveToRelative(-8f, 0f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
                moveTo(2f, 7.15f)
                lineToRelative(5f, 5f)
                curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5f, -2.08f)
                reflectiveCurveToRelative(3.72f, 0.79f, 5f, 2.07f)
                lineToRelative(5f, -5f)
                curveTo(19.44f, 4.59f, 15.9f, 3f, 12f, 3f)
                curveTo(8.1f, 3f, 4.56f, 4.59f, 2f, 7.15f)
                close()
                moveToRelative(14.84f, 2.32f)
                curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f)
                curveToRelative(-1.74f, 0f, -3.41f, 0.49f, -4.85f, 1.41f)
                lineTo(4.94f, 7.26f)
                curveTo(6.99f, 5.79f, 9.44f, 5f, 12f, 5f)
                curveToRelative(2.56f, 0f, 5f, 0.79f, 7.05f, 2.26f)
                lineToRelative(-2.21f, 2.21f)
                close()
            }
        }.build()
        
        return _Compass_calibration!!
    }

private var _Compass_calibration: ImageVector? = null

