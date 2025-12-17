package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mark_unread_chat_alt: ImageVector
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
                        moveTo(7f, 8f)
                        curveTo(6.45f, 8f, 6f, 7.55f, 6f, 7f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(8.03f)
                        curveToRelative(-1.21f, -1.6f, -1.08f, -3.21f, -0.92f, -4f)
                        horizontalLineTo(4.01f)
                        curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                        lineTo(2f, 19.58f)
                        curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                        lineTo(6f, 18f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(6.97f)
                        curveTo(21.16f, 7.61f, 20.13f, 8f, 19f, 8f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(13f, 14f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(6f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(14f, 13.55f, 13.55f, 14f, 13f, 14f)
                        close()
                        moveTo(17f, 11f)
                        horizontalLineTo(7f)
                        curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(10f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        curveTo(18f, 10.55f, 17.55f, 11f, 17f, 11f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_unread_chat_alt!!
    }

private var _Mark_unread_chat_alt: ImageVector? = null

