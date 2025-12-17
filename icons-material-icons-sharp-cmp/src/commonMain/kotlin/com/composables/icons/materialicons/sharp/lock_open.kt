package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Lock_open: ImageVector
    get() {
        if (_Lock_open != null) return _Lock_open!!
        
        _Lock_open = ImageVector.Builder(
            name = "lock_open",
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
                moveTo(20f, 8f)
                horizontalLineToRelative(-3f)
                verticalLineTo(6.21f)
                curveToRelative(0f, -2.61f, -1.91f, -4.94f, -4.51f, -5.19f)
                curveTo(9.51f, 0.74f, 7f, 3.08f, 7f, 6f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.13f, 0.6f, -2.24f, 1.64f, -2.7f)
                curveTo(12.85f, 2.31f, 15f, 3.9f, 15f, 6f)
                verticalLineToRelative(2f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(16f)
                verticalLineTo(8f)
                close()
                moveToRelative(-2f, 12f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(10f)
                close()
                moveToRelative(-6f, -3f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.build()
        
        return _Lock_open!!
    }

private var _Lock_open: ImageVector? = null

