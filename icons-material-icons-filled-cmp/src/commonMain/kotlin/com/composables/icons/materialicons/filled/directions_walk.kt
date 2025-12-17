package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Directions_walk: ImageVector
    get() {
        if (_Directions_walk != null) return _Directions_walk!!
        
        _Directions_walk = ImageVector.Builder(
            name = "directions_walk",
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
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(9.8f, 8.9f)
                lineTo(7f, 23f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.8f, -8f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2f)
                lineToRelative(0.6f, -3f)
                curveTo(14.8f, 12f, 16.8f, 13f, 19f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.9f, 0f, -3.5f, -1f, -4.3f, -2.4f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.4f, -0.6f, -1f, -1f, -1.7f, -1f)
                curveToRelative(-0.3f, 0f, -0.5f, 0.1f, -0.8f, 0.1f)
                lineTo(6f, 8.3f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(9.6f)
                lineToRelative(1.8f, -0.7f)
            }
        }.build()
        
        return _Directions_walk!!
    }

private var _Directions_walk: ImageVector? = null

