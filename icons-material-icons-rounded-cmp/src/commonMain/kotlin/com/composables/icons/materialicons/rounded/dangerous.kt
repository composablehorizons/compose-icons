package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dangerous: ImageVector
    get() {
        if (_Dangerous != null) return _Dangerous!!
        
        _Dangerous = ImageVector.Builder(
            name = "dangerous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14.9f, 3f)
                    horizontalLineTo(9.1f)
                    curveTo(8.57f, 3f, 8.06f, 3.21f, 7.68f, 3.59f)
                    lineToRelative(-4.1f, 4.1f)
                    curveTo(3.21f, 8.06f, 3f, 8.57f, 3f, 9.1f)
                    verticalLineToRelative(5.8f)
                    curveToRelative(0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                    lineToRelative(4.1f, 4.1f)
                    curveTo(8.06f, 20.79f, 8.57f, 21f, 9.1f, 21f)
                    horizontalLineToRelative(5.8f)
                    curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                    lineToRelative(4.1f, -4.1f)
                    curveTo(20.79f, 15.94f, 21f, 15.43f, 21f, 14.9f)
                    verticalLineTo(9.1f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                    lineToRelative(-4.1f, -4.1f)
                    curveTo(15.94f, 3.21f, 15.43f, 3f, 14.9f, 3f)
                    close()
                    moveTo(15.54f, 15.54f)
                    lineTo(15.54f, 15.54f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineTo(12f, 13.41f)
                    lineToRelative(-2.12f, 2.12f)
                    curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineTo(10.59f, 12f)
                    lineTo(8.46f, 9.88f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineTo(12f, 10.59f)
                    lineToRelative(2.12f, -2.12f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineTo(13.41f, 12f)
                    lineToRelative(2.12f, 2.12f)
                    curveTo(15.93f, 14.51f, 15.93f, 15.15f, 15.54f, 15.54f)
                    close()
                }
            }
        }.build()
        
        return _Dangerous!!
    }

private var _Dangerous: ImageVector? = null

