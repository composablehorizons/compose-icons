package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Dining: ImageVector
    get() {
        if (_Dining != null) return _Dining!!
        
        _Dining = ImageVector.Builder(
            name = "dining",
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
                    moveTo(14.75f, 6f)
                    curveToRelative(-1.37f, 0f, -2.5f, 1.52f, -2.5f, 3.4f)
                    curveToRelative(0f, 1.48f, 0.7f, 2.71f, 1.67f, 3.18f)
                    lineTo(14f, 12.62f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-6.38f)
                    lineToRelative(0.08f, -0.03f)
                    curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f)
                    curveTo(17.25f, 7.53f, 16.13f, 6f, 14.75f, 6f)
                    moveTo(6.5f, 9.96f)
                    moveTo(10.5f, 6f)
                    curveTo(10.23f, 6f, 10f, 6.22f, 10f, 6.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(9.25f)
                    verticalLineTo(6.5f)
                    curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                    reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(7.5f)
                    verticalLineTo(6.5f)
                    curveTo(7.5f, 6.22f, 7.28f, 6f, 7f, 6f)
                    reflectiveCurveTo(6.5f, 6.22f, 6.5f, 6.5f)
                    verticalLineToRelative(3.8f)
                    curveToRelative(0f, 0.93f, 0.64f, 1.71f, 1.5f, 1.93f)
                    verticalLineTo(19f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(-6.77f)
                    curveToRelative(0.86f, -0.22f, 1.5f, -1f, 1.5f, -1.93f)
                    verticalLineTo(6.5f)
                    curveTo(11f, 6.22f, 10.78f, 6f, 10.5f, 6f)
                    close()
                    moveTo(20f, 4f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(4f)
                    moveTo(20f, 2f)
                    curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    horizontalLineTo(4f)
                    curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                    verticalLineTo(4f)
                    curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                    horizontalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Dining!!
    }

private var _Dining: ImageVector? = null

