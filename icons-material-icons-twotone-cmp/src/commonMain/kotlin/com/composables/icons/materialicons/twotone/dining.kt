package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Dining: ImageVector
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(4f, 20f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(4f)
                        horizontalLineTo(4f)
                        verticalLineTo(20f)
                        close()
                        moveTo(14.75f, 6f)
                        curveToRelative(1.38f, 0f, 2.5f, 1.53f, 2.5f, 3.41f)
                        curveToRelative(0f, 1.48f, -0.7f, 2.71f, -1.67f, 3.18f)
                        lineToRelative(-0.08f, 0.03f)
                        verticalLineTo(19f)
                        horizontalLineTo(14f)
                        verticalLineToRelative(-6.38f)
                        lineToRelative(-0.08f, -0.04f)
                        curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f)
                        curveTo(12.25f, 7.52f, 13.38f, 6f, 14.75f, 6f)
                        close()
                        moveTo(6.5f, 6.5f)
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
                        verticalLineToRelative(3.8f)
                        curveToRelative(0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f)
                        verticalLineTo(19f)
                        horizontalLineTo(8f)
                        verticalLineToRelative(-6.77f)
                        curveToRelative(-0.86f, -0.22f, -1.5f, -1f, -1.5f, -1.93f)
                        verticalLineTo(6.5f)
                        close()
                    }
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
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 12.23f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-6.77f)
                        curveToRelative(0.86f, -0.22f, 1.5f, -1f, 1.5f, -1.93f)
                        verticalLineTo(6.5f)
                        curveTo(11f, 6.22f, 10.78f, 6f, 10.5f, 6f)
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
                        curveTo(6.5f, 11.23f, 7.14f, 12.01f, 8f, 12.23f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.92f, 12.58f)
                        lineTo(14f, 12.62f)
                        verticalLineTo(19f)
                        horizontalLineToRelative(1.5f)
                        verticalLineToRelative(-6.38f)
                        lineToRelative(0.08f, -0.03f)
                        curveToRelative(0.97f, -0.47f, 1.67f, -1.7f, 1.67f, -3.18f)
                        curveToRelative(0f, -1.88f, -1.12f, -3.41f, -2.5f, -3.41f)
                        curveToRelative(-1.37f, 0f, -2.5f, 1.52f, -2.5f, 3.4f)
                        curveTo(12.25f, 10.88f, 12.95f, 12.11f, 13.92f, 12.58f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dining!!
    }

private var _Dining: ImageVector? = null

