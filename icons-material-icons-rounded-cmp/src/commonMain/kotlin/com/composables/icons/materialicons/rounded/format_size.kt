package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_size: ImageVector
    get() {
        if (_Format_size != null) return _Format_size!!
        
        _Format_size = ImageVector.Builder(
            name = "format_size",
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
                moveTo(9f, 5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(7f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(21.33f, 4f, 20.5f, 4f)
                horizontalLineToRelative(-10f)
                curveTo(9.67f, 4f, 9f, 4.67f, 9f, 5.5f)
                close()
                moveTo(4.5f, 12f)
                horizontalLineTo(6f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveTo(9f, 18.33f, 9f, 17.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveTo(11.33f, 9f, 10.5f, 9f)
                horizontalLineToRelative(-6f)
                curveTo(3.67f, 9f, 3f, 9.67f, 3f, 10.5f)
                reflectiveCurveTo(3.67f, 12f, 4.5f, 12f)
                close()
            }
        }.build()
        
        return _Format_size!!
    }

private var _Format_size: ImageVector? = null

