package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_unread_chat_alt: ImageVector
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
                        moveTo(4f, 17.17f)
                        lineTo(5.17f, 16f)
                        horizontalLineTo(20f)
                        verticalLineTo(7.9f)
                        curveTo(19.68f, 7.96f, 19.34f, 8f, 19f, 8f)
                        reflectiveCurveToRelative(-0.68f, -0.04f, -1f, -0.1f)
                        verticalLineTo(8f)
                        horizontalLineTo(6f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(9.03f)
                        curveToRelative(-0.44f, -0.58f, -0.77f, -1.26f, -0.92f, -2f)
                        horizontalLineTo(4f)
                        verticalLineTo(17.17f)
                        close()
                        moveTo(6f, 9f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        verticalLineTo(9f)
                        close()
                        moveTo(6f, 12f)
                        horizontalLineToRelative(8f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(6f)
                        verticalLineTo(12f)
                        close()
                    }
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
                            moveTo(20f, 16f)
                            horizontalLineTo(5.17f)
                            lineTo(4f, 17.17f)
                            verticalLineTo(4f)
                            horizontalLineToRelative(10.1f)
                            curveToRelative(-0.18f, -0.89f, -0.08f, -1.61f, 0f, -2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 2f, 2.01f, 2.9f, 2.01f, 4f)
                            lineTo(2f, 22f)
                            lineToRelative(4f, -4f)
                            horizontalLineToRelative(14f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(6.97f)
                            curveToRelative(-0.58f, 0.44f, -1.26f, 0.77f, -2f, 0.92f)
                            verticalLineTo(16f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 12f)
                            horizontalLineTo(14f)
                            verticalLineTo(14f)
                            horizontalLineTo(6f)
                            verticalLineTo(12f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 9f)
                            horizontalLineTo(18f)
                            verticalLineTo(11f)
                            horizontalLineTo(6f)
                            verticalLineTo(9f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6f, 8f)
                            horizontalLineToRelative(12f)
                            verticalLineTo(7.9f)
                            curveToRelative(-1.21f, -0.25f, -2.25f, -0.95f, -2.97f, -1.9f)
                            horizontalLineTo(6f)
                            verticalLineTo(8f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Mark_unread_chat_alt!!
    }

private var _Mark_unread_chat_alt: ImageVector? = null

