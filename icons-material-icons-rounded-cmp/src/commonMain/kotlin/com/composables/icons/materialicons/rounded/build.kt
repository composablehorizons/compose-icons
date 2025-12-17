package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Build: ImageVector
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
                lineTo(8.28f, 5.3f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineTo(6.69f, 8.3f)
                curveToRelative(-0.39f, 0.4f, -1.02f, 0.4f, -1.41f, 0f)
                lineTo(1.65f, 4.67f)
                curveTo(0.48f, 7.1f, 0.89f, 10.09f, 2.9f, 12.1f)
                curveToRelative(1.86f, 1.86f, 4.58f, 2.35f, 6.89f, 1.48f)
                lineToRelative(7.96f, 7.96f)
                curveToRelative(1.03f, 1.03f, 2.69f, 1.03f, 3.71f, 0f)
                curveToRelative(1.03f, -1.03f, 1.03f, -2.69f, 0f, -3.71f)
                lineTo(13.54f, 9.9f)
                curveToRelative(0.92f, -2.34f, 0.44f, -5.1f, -1.45f, -6.99f)
                close()
            }
        }.build()
        
        return _Build!!
    }

private var _Build: ImageVector? = null

