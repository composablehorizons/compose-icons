package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fiber_dvr: ImageVector
    get() {
        if (_Fiber_dvr != null) return _Fiber_dvr!!
        
        _Fiber_dvr = ImageVector.Builder(
            name = "fiber_dvr",
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
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(17.5f, 10.5f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(1f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(10.5f)
                            close()
                            moveTo(4.5f, 10.5f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(-2f)
                            verticalLineTo(10.5f)
                            close()
                            moveTo(21f, 3f)
                            horizontalLineTo(3f)
                            curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                            verticalLineToRelative(14f)
                            curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                            horizontalLineToRelative(18f)
                            curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(5f)
                            curveTo(23f, 3.89f, 22.11f, 3f, 21f, 3f)
                            close()
                            moveTo(8f, 13.5f)
                            curveTo(8f, 14.35f, 7.35f, 15f, 6.5f, 15f)
                            horizontalLineTo(3f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(3.5f)
                            curveTo(7.35f, 9f, 8f, 9.65f, 8f, 10.5f)
                            verticalLineTo(13.5f)
                            close()
                            moveTo(12.62f, 15f)
                            horizontalLineToRelative(-1.5f)
                            lineTo(9.37f, 9f)
                            horizontalLineToRelative(1.5f)
                            lineToRelative(1f, 3.43f)
                            lineToRelative(1f, -3.43f)
                            horizontalLineToRelative(1.5f)
                            lineTo(12.62f, 15f)
                            close()
                            moveTo(21f, 11.5f)
                            curveToRelative(0f, 0.6f, -0.4f, 1.15f, -0.9f, 1.4f)
                            lineTo(21f, 15f)
                            horizontalLineToRelative(-1.5f)
                            lineToRelative(-0.85f, -2f)
                            horizontalLineTo(17.5f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(16f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(3.5f)
                            curveToRelative(0.85f, 0f, 1.5f, 0.65f, 1.5f, 1.5f)
                            verticalLineTo(11.5f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

