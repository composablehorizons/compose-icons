package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Remove_from_queue: ImageVector
    get() {
        if (_Remove_from_queue != null) return _Remove_from_queue!!
        
        _Remove_from_queue = ImageVector.Builder(
            name = "remove_from_queue",
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
                            moveTo(21f, 3f)
                            horizontalLineTo(3f)
                            curveTo(1.89f, 3f, 1f, 3.89f, 1f, 5f)
                            verticalLineToRelative(12f)
                            curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                            horizontalLineToRelative(5f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(8f)
                            verticalLineToRelative(-2f)
                            horizontalLineToRelative(5f)
                            curveToRelative(1.1f, 0f, 1.99f, -0.9f, 1.99f, -2f)
                            lineTo(23f, 5f)
                            curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                            close()
                            moveTo(21f, 17f)
                            horizontalLineTo(3f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(18f)
                            verticalLineTo(17f)
                            close()
                            moveTo(16f, 10f)
                            verticalLineToRelative(2f)
                            horizontalLineTo(8f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(16f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Remove_from_queue!!
    }

private var _Remove_from_queue: ImageVector? = null

