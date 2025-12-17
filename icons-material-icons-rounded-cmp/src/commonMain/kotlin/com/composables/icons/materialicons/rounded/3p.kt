package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.`3p`: ImageVector
    get() {
        if (_3p != null) return _3p!!
        
        _3p = ImageVector.Builder(
            name = "3p",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20f, 2f)
                    horizontalLineTo(4.01f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    lineTo(2f, 19.58f)
                    curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                    lineTo(6f, 18f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(12f, 6f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                    reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                    reflectiveCurveTo(10.9f, 6f, 12f, 6f)
                    close()
                    moveTo(16f, 14f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(-0.57f)
                    curveToRelative(0f, -0.81f, 0.48f, -1.53f, 1.22f, -1.85f)
                    curveTo(10.07f, 11.21f, 11.01f, 11f, 12f, 11f)
                    curveToRelative(0.99f, 0f, 1.93f, 0.21f, 2.78f, 0.58f)
                    curveTo(15.52f, 11.9f, 16f, 12.62f, 16f, 13.43f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _3p!!
    }

private var _3p: ImageVector? = null

