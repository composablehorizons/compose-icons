package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Chat_bubble_outline: ImageVector
    get() {
        if (_Chat_bubble_outline != null) return _Chat_bubble_outline!!
        
        _Chat_bubble_outline = ImageVector.Builder(
            name = "chat_bubble_outline",
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
                        moveTo(20f, 4f)
                        verticalLineToRelative(12f)
                        horizontalLineTo(5.17f)
                        lineTo(4f, 17.17f)
                        verticalLineTo(4f)
                        horizontalLineTo(20f)
                        moveTo(20f, 2f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                        verticalLineToRelative(15.59f)
                        curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                        lineTo(6f, 18f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(4f)
                        curveTo(22f, 2.9f, 21.1f, 2f, 20f, 2f)
                        lineTo(20f, 2f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Chat_bubble_outline!!
    }

private var _Chat_bubble_outline: ImageVector? = null

