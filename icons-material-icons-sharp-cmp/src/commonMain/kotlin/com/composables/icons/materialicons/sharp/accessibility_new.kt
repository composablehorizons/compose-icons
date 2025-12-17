package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Accessibility_new: ImageVector
    get() {
        if (_Accessibility_new != null) return _Accessibility_new!!
        
        _Accessibility_new = ImageVector.Builder(
            name = "accessibility_new",
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
                moveTo(20.5f, 6f)
                curveToRelative(-2.61f, 0.7f, -5.67f, 1f, -8.5f, 1f)
                reflectiveCurveToRelative(-5.89f, -0.3f, -8.5f, -1f)
                lineTo(3f, 8f)
                curveToRelative(1.86f, 0.5f, 4f, 0.83f, 6f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                curveToRelative(2f, -0.17f, 4.14f, -0.5f, 6f, -1f)
                lineToRelative(-0.5f, -2f)
                close()
                moveTo(12f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Accessibility_new!!
    }

private var _Accessibility_new: ImageVector? = null

