package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Queue_play_next: ImageVector
    get() {
        if (_Queue_play_next != null) return _Queue_play_next!!
        
        _Queue_play_next = ImageVector.Builder(
            name = "queue_play_next",
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
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(3f)
                            verticalLineTo(5f)
                            horizontalLineToRelative(18f)
                            verticalLineToRelative(8f)
                            horizontalLineToRelative(2f)
                            verticalLineTo(5f)
                            curveTo(23f, 3.89f, 22.1f, 3f, 21f, 3f)
                            close()
                            moveTo(13f, 10f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(-2f)
                            verticalLineToRelative(3f)
                            horizontalLineTo(8f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(3f)
                            horizontalLineToRelative(2f)
                            verticalLineToRelative(-3f)
                            horizontalLineToRelative(3f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(13f)
                            close()
                            moveTo(24f, 18f)
                            lineToRelative(-4.5f, 4.5f)
                            lineTo(18f, 21f)
                            lineToRelative(3f, -3f)
                            lineToRelative(-3f, -3f)
                            lineToRelative(1.5f, -1.5f)
                            lineTo(24f, 18f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Queue_play_next!!
    }

private var _Queue_play_next: ImageVector? = null

