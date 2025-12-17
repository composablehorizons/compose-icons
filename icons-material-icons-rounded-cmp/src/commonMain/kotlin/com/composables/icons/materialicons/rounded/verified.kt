package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Verified: ImageVector
    get() {
        if (_Verified != null) return _Verified!!
        
        _Verified = ImageVector.Builder(
            name = "verified",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(23f, 12f)
                    lineToRelative(-2.44f, -2.79f)
                    lineToRelative(0.34f, -3.69f)
                    lineToRelative(-3.61f, -0.82f)
                    lineTo(15.4f, 1.5f)
                    lineTo(12f, 2.96f)
                    lineTo(8.6f, 1.5f)
                    lineTo(6.71f, 4.69f)
                    lineTo(3.1f, 5.5f)
                    lineTo(3.44f, 9.2f)
                    lineTo(1f, 12f)
                    lineToRelative(2.44f, 2.79f)
                    lineToRelative(-0.34f, 3.7f)
                    lineToRelative(3.61f, 0.82f)
                    lineTo(8.6f, 22.5f)
                    lineToRelative(3.4f, -1.47f)
                    lineToRelative(3.4f, 1.46f)
                    lineToRelative(1.89f, -3.19f)
                    lineToRelative(3.61f, -0.82f)
                    lineToRelative(-0.34f, -3.69f)
                    lineTo(23f, 12f)
                    close()
                    moveTo(9.38f, 16.01f)
                    lineTo(7f, 13.61f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0.07f, -0.07f)
                    curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0f)
                    lineToRelative(1.61f, 1.62f)
                    lineToRelative(5.15f, -5.16f)
                    curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0f)
                    lineToRelative(0.07f, 0.07f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-5.92f, 5.94f)
                    curveTo(10.41f, 16.4f, 9.78f, 16.4f, 9.38f, 16.01f)
                    close()
                }
            }
        }.build()
        
        return _Verified!!
    }

private var _Verified: ImageVector? = null

