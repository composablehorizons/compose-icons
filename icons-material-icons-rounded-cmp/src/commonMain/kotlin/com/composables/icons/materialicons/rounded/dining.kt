package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dining: ImageVector
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
                    moveTo(20f, 2f)
                    horizontalLineTo(4f)
                    curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                    verticalLineToRelative(16f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(16f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(4f)
                    curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                    close()
                    moveTo(11f, 10.3f)
                    curveToRelative(0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f)
                    verticalLineToRelative(6.02f)
                    curveTo(9.5f, 18.66f, 9.16f, 19f, 8.75f, 19f)
                    horizontalLineToRelative(0f)
                    curveTo(8.34f, 19f, 8f, 18.66f, 8f, 18.25f)
                    verticalLineToRelative(-6.02f)
                    curveToRelative(-0.86f, -0.22f, -1.5f, -1f, -1.5f, -1.93f)
                    verticalLineTo(6.5f)
                    curveTo(6.5f, 6.22f, 6.72f, 6f, 7f, 6f)
                    reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(0.75f)
                    verticalLineTo(6.5f)
                    curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                    reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(10f)
                    verticalLineTo(6.5f)
                    curveTo(10f, 6.22f, 10.23f, 6f, 10.5f, 6f)
                    curveTo(10.78f, 6f, 11f, 6.22f, 11f, 6.5f)
                    verticalLineTo(10.3f)
                    close()
                    moveTo(15.58f, 12.59f)
                    lineToRelative(-0.08f, 0.03f)
                    verticalLineToRelative(5.63f)
                    curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                    horizontalLineToRelative(0f)
                    curveTo(14.34f, 19f, 14f, 18.66f, 14f, 18.25f)
                    verticalLineToRelative(-5.63f)
                    lineToRelative(-0.08f, -0.04f)
                    curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f)
                    curveToRelative(0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f)
                    curveToRelative(1.38f, 0f, 2.5f, 1.53f, 2.5f, 3.41f)
                    curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f)
                    close()
                }
            }
        }.build()
        
        return _Dining!!
    }

private var _Dining: ImageVector? = null

