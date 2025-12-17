package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Compass_calibration: ImageVector
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
                moveTo(16f, 17f)
                arcTo(4f, 4f, 0f, false, true, 12f, 21f)
                arcTo(4f, 4f, 0f, false, true, 8f, 17f)
                arcTo(4f, 4f, 0f, false, true, 16f, 17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveTo(8.1f, 3f, 4.56f, 4.59f, 2f, 7.15f)
                lineToRelative(5f, 5f)
                curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5f, -2.08f)
                reflectiveCurveToRelative(3.72f, 0.79f, 5f, 2.07f)
                lineToRelative(5f, -5f)
                curveTo(19.44f, 4.59f, 15.9f, 3f, 12f, 3f)
                close()
            }
        }.build()
        
        return _Compass_calibration!!
    }

private var _Compass_calibration: ImageVector? = null

