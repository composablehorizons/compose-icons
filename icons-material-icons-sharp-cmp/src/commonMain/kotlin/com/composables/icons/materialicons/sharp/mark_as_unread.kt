package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mark_as_unread: ImageVector
    get() {
        if (_Mark_as_unread != null) return _Mark_as_unread!!
        
        _Mark_as_unread = ImageVector.Builder(
            name = "mark_as_unread",
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
                        moveTo(16.23f, 7f)
                        lineTo(20.35f, 7f)
                        lineTo(10.5f, 2f)
                        lineTo(2f, 6.21f)
                        lineTo(2f, 17f)
                        lineTo(4f, 17f)
                        lineTo(4f, 7.4f)
                        lineTo(10.5f, 4f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(5f, 8f)
                        verticalLineToRelative(13f)
                        horizontalLineToRelative(17f)
                        verticalLineTo(8f)
                        horizontalLineTo(5f)
                        close()
                        moveTo(20f, 12f)
                        lineToRelative(-6.5f, 3.33f)
                        lineTo(7f, 12f)
                        verticalLineToRelative(-2f)
                        lineToRelative(6.5f, 3.33f)
                        lineTo(20f, 10f)
                        verticalLineTo(12f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_as_unread!!
    }

private var _Mark_as_unread: ImageVector? = null

