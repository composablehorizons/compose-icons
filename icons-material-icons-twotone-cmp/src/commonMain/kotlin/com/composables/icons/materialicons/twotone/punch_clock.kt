package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Punch_clock: ImageVector
    get() {
        if (_Punch_clock != null) return _Punch_clock!!
        
        _Punch_clock = ImageVector.Builder(
            name = "punch_clock",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 3f)
                        horizontalLineTo(16f)
                        verticalLineTo(6f)
                        horizontalLineTo(8f)
                        verticalLineTo(3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 20f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(8f)
                        horizontalLineTo(5f)
                        verticalLineTo(20f)
                        close()
                        moveTo(12f, 9f)
                        curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                        reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                        curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                        reflectiveCurveTo(9.24f, 9f, 12f, 9f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 6f)
                        horizontalLineToRelative(-1f)
                        verticalLineTo(1f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(5f)
                        horizontalLineTo(5f)
                        curveTo(3.9f, 6f, 3f, 6.9f, 3f, 8f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(8f)
                        curveTo(21f, 6.9f, 20.1f, 6f, 19f, 6f)
                        close()
                        moveTo(8f, 3f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(8f)
                        verticalLineTo(3f)
                        close()
                        moveTo(19f, 20f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 19f)
                        curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                        reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                        curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                        reflectiveCurveTo(9.24f, 19f, 12f, 19f)
                        close()
                        moveTo(12f, 10.5f)
                        curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                        reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                        reflectiveCurveTo(8.5f, 15.93f, 8.5f, 14f)
                        reflectiveCurveTo(10.07f, 10.5f, 12f, 10.5f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(13.85f, 15.14f)
                        lineTo(12.5f, 13.79f)
                        lineTo(12.5f, 11.5f)
                        lineTo(11.5f, 11.5f)
                        lineTo(11.5f, 14.21f)
                        lineTo(13.14f, 15.85f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Punch_clock!!
    }

private var _Punch_clock: ImageVector? = null

