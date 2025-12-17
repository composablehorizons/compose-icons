package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Functions: ImageVector
    get() {
        if (_Functions != null) return _Functions!!
        
        _Functions = ImageVector.Builder(
            name = "functions",
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
                moveTo(16.5f, 4f)
                horizontalLineTo(7.56f)
                curveTo(6.7f, 4f, 6f, 4.7f, 6f, 5.56f)
                curveToRelative(0f, 0.28f, 0.12f, 0.55f, 0.32f, 0.74f)
                lineTo(12.5f, 12f)
                lineToRelative(-6.18f, 5.7f)
                curveToRelative(-0.2f, 0.19f, -0.32f, 0.46f, -0.32f, 0.74f)
                curveTo(6f, 19.3f, 6.7f, 20f, 7.56f, 20f)
                horizontalLineToRelative(8.94f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(11f)
                lineToRelative(3.59f, -3.59f)
                curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                lineTo(11f, 7f)
                horizontalLineToRelative(5.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(17.33f, 4f, 16.5f, 4f)
                close()
            }
        }.build()
        
        return _Functions!!
    }

private var _Functions: ImageVector? = null

