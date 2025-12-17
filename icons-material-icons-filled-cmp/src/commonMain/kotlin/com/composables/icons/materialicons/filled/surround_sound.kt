package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Surround_sound: ImageVector
    get() {
        if (_Surround_sound != null) return _Surround_sound!!
        
        _Surround_sound = ImageVector.Builder(
            name = "surround_sound",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7.76f, 16.24f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(4.78f, 16.1f, 4f, 14.05f, 4f, 12f)
                curveToRelative(0f, -2.05f, 0.78f, -4.1f, 2.34f, -5.66f)
                lineToRelative(1.41f, 1.41f)
                curveTo(6.59f, 8.93f, 6f, 10.46f, 6f, 12f)
                reflectiveCurveToRelative(0.59f, 3.07f, 1.76f, 4.24f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveToRelative(5.66f, 1.66f)
                lineToRelative(-1.41f, -1.41f)
                curveTo(17.41f, 15.07f, 18f, 13.54f, 18f, 12f)
                reflectiveCurveToRelative(-0.59f, -3.07f, -1.76f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                curveTo(19.22f, 7.9f, 20f, 9.95f, 20f, 12f)
                curveToRelative(0f, 2.05f, -0.78f, 4.1f, -2.34f, 5.66f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Surround_sound!!
    }

private var _Surround_sound: ImageVector? = null

