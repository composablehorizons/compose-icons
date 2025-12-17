package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hourglass_top: ImageVector
    get() {
        if (_Hourglass_top != null) return _Hourglass_top!!
        
        _Hourglass_top = ImageVector.Builder(
            name = "hourglass_top",
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
                    moveTo(8f, 2f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    lineToRelative(0.01f, 3.18f)
                    curveToRelative(0f, 0.53f, 0.21f, 1.03f, 0.58f, 1.41f)
                    lineTo(10f, 12f)
                    lineToRelative(-3.41f, 3.43f)
                    curveToRelative(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f)
                    lineTo(6f, 20f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(8f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineToRelative(-3.16f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.04f, -0.58f, -1.41f)
                    lineTo(14f, 12f)
                    lineToRelative(3.41f, -3.4f)
                    curveTo(17.79f, 8.22f, 18f, 7.71f, 18f, 7.18f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    close()
                    moveTo(16f, 16.91f)
                    verticalLineTo(19f)
                    curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                    horizontalLineTo(9f)
                    curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                    verticalLineToRelative(-2.09f)
                    curveToRelative(0f, -0.27f, 0.11f, -0.52f, 0.29f, -0.71f)
                    lineTo(12f, 12.5f)
                    lineToRelative(3.71f, 3.71f)
                    curveTo(15.89f, 16.39f, 16f, 16.65f, 16f, 16.91f)
                    close()
                }
            }
        }.build()
        
        return _Hourglass_top!!
    }

private var _Hourglass_top: ImageVector? = null

