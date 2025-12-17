package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Mark_unread_chat_alt: ImageVector
    get() {
        if (_Mark_unread_chat_alt != null) return _Mark_unread_chat_alt!!
        
        _Mark_unread_chat_alt = ImageVector.Builder(
            name = "mark_unread_chat_alt",
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
                        moveTo(22f, 3f)
                        arcTo(3f, 3f, 0f, false, true, 19f, 6f)
                        arcTo(3f, 3f, 0f, false, true, 16f, 3f)
                        arcTo(3f, 3f, 0f, false, true, 22f, 3f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(6f, 8f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(9.03f)
                        curveToRelative(-1.21f, -1.6f, -1.08f, -3.21f, -0.92f, -4f)
                        horizontalLineTo(2.01f)
                        lineTo(2f, 22f)
                        lineToRelative(4f, -4f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(6.97f)
                        curveTo(21.16f, 7.61f, 20.13f, 8f, 19f, 8f)
                        horizontalLineTo(6f)
                        close()
                        moveTo(14f, 14f)
                        horizontalLineTo(6f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(14f)
                        close()
                        moveTo(18f, 11f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_unread_chat_alt!!
    }

private var _Mark_unread_chat_alt: ImageVector? = null

