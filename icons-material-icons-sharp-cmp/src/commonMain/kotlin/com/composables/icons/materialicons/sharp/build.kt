package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Build: ImageVector
    get() {
        if (_Build != null) return _Build!!
        
        _Build = ImageVector.Builder(
            name = "build",
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
                moveTo(12.09f, 2.91f)
                curveTo(10.08f, 0.9f, 7.07f, 0.49f, 4.65f, 1.67f)
                lineToRelative(4.34f, 4.34f)
                lineToRelative(-3f, 3f)
                lineToRelative(-4.34f, -4.34f)
                curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f)
                curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f)
                lineToRelative(9.82f, 9.82f)
                lineToRelative(3.71f, -3.71f)
                lineToRelative(-9.78f, -9.79f)
                curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

