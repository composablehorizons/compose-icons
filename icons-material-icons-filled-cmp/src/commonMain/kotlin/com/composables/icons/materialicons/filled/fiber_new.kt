package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Fiber_new: ImageVector
    get() {
        if (_Fiber_new != null) return _Fiber_new!!
        
        _Fiber_new = ImageVector.Builder(
            name = "fiber_new",
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
                            moveTo(20f, 4f)
                            horizontalLineTo(4f)
                            curveTo(2.89f, 4f, 2.01f, 4.89f, 2.01f, 6f)
                            lineTo(2f, 18f)
                            curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                            horizontalLineToRelative(16f)
                            curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                            verticalLineTo(6f)
                            curveTo(22f, 4.89f, 21.11f, 4f, 20f, 4f)
                            close()
                            moveTo(8.5f, 15f)
                            horizontalLineTo(7.3f)
                            lineToRelative(-2.55f, -3.5f)
                            verticalLineTo(15f)
                            horizontalLineTo(3.5f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(1.25f)
                            lineToRelative(2.5f, 3.5f)
                            verticalLineTo(9f)
                            horizontalLineTo(8.5f)
                            verticalLineTo(15f)
                            close()
                            moveTo(13.5f, 10.26f)
                            horizontalLineTo(11f)
                            verticalLineToRelative(1.12f)
                            horizontalLineToRelative(2.5f)
                            verticalLineToRelative(1.26f)
                            horizontalLineTo(11f)
                            verticalLineToRelative(1.11f)
                            horizontalLineToRelative(2.5f)
                            verticalLineTo(15f)
                            horizontalLineToRelative(-4f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(4f)
                            verticalLineTo(10.26f)
                            close()
                            moveTo(20.5f, 14f)
                            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                            horizontalLineToRelative(-4f)
                            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(1.25f)
                            verticalLineToRelative(4.51f)
                            horizontalLineToRelative(1.13f)
                            verticalLineTo(9.99f)
                            horizontalLineToRelative(1.25f)
                            verticalLineToRelative(3.51f)
                            horizontalLineToRelative(1.12f)
                            verticalLineTo(9f)
                            horizontalLineToRelative(1.25f)
                            verticalLineTo(14f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Fiber_new!!
    }

private var _Fiber_new: ImageVector? = null

