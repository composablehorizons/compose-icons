package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Directions_run: ImageVector
    get() {
        if (_Directions_run != null) return _Directions_run!!
        
        _Directions_run = ImageVector.Builder(
            name = "directions_run",
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
                moveTo(13.49f, 5.48f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveToRelative(-3.6f, 13.9f)
                lineToRelative(1f, -4.4f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1.3f, 1.5f, 3.3f, 2.5f, 5.5f, 2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.9f, 0f, -3.5f, -1f, -4.3f, -2.4f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.4f, -0.6f, -1f, -1f, -1.7f, -1f)
                curveToRelative(-0.3f, 0f, -0.5f, 0.1f, -0.8f, 0.1f)
                lineToRelative(-5.2f, 2.2f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3.4f)
                lineToRelative(1.8f, -0.7f)
                lineToRelative(-1.6f, 8.1f)
                lineToRelative(-4.9f, -1f)
                lineToRelative(-0.4f, 2f)
                lineToRelative(7f, 1.4f)
                close()
            }
        }.build()
        
        return _Directions_run!!
    }

private var _Directions_run: ImageVector? = null

