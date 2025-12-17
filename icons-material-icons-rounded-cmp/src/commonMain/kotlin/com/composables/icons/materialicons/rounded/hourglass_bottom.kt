package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Hourglass_bottom: ImageVector
    get() {
        if (_Hourglass_bottom != null) return _Hourglass_bottom!!
        
        _Hourglass_bottom = ImageVector.Builder(
            name = "hourglass_bottom",
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
                    moveTo(16f, 22f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    lineToRelative(-0.01f, -3.18f)
                    curveToRelative(0f, -0.53f, -0.21f, -1.03f, -0.58f, -1.41f)
                    lineTo(14f, 12f)
                    lineToRelative(3.41f, -3.43f)
                    curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f)
                    lineTo(18f, 4f)
                    curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                    horizontalLineTo(8f)
                    curveTo(6.9f, 2f, 6f, 2.9f, 6f, 4f)
                    verticalLineToRelative(3.16f)
                    curveTo(6f, 7.69f, 6.21f, 8.2f, 6.58f, 8.58f)
                    lineTo(10f, 12f)
                    lineToRelative(-3.41f, 3.4f)
                    curveTo(6.21f, 15.78f, 6f, 16.29f, 6f, 16.82f)
                    verticalLineTo(20f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineTo(16f)
                    close()
                    moveTo(8f, 7.09f)
                    verticalLineTo(5f)
                    curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                    horizontalLineToRelative(6f)
                    curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                    verticalLineToRelative(2.09f)
                    curveToRelative(0f, 0.27f, -0.11f, 0.52f, -0.29f, 0.71f)
                    lineTo(12f, 11.5f)
                    lineTo(8.29f, 7.79f)
                    curveTo(8.11f, 7.61f, 8f, 7.35f, 8f, 7.09f)
                    close()
                }
            }
        }.build()
        
        return _Hourglass_bottom!!
    }

private var _Hourglass_bottom: ImageVector? = null

