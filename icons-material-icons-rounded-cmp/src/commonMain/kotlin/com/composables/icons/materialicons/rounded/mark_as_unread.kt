package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Mark_as_unread: ImageVector
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
                        horizontalLineToRelative(2.6f)
                        curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f)
                        lineTo(11.4f, 2.45f)
                        curveToRelative(-0.56f, -0.29f, -1.23f, -0.29f, -1.8f, -0.01f)
                        lineTo(2.8f, 5.83f)
                        curveTo(2.32f, 6.09f, 2f, 6.64f, 2f, 7.17f)
                        verticalLineTo(15f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        verticalLineTo(7.4f)
                        lineTo(10.5f, 4f)
                        lineTo(16.23f, 7f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20f, 8f)
                        horizontalLineTo(7f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(9f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(13f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-9f)
                        curveTo(22f, 8.9f, 21.1f, 8f, 20f, 8f)
                        close()
                        moveTo(20f, 11.46f)
                        curveToRelative(0f, 0.33f, -0.19f, 0.64f, -0.48f, 0.79f)
                        lineToRelative(-5.61f, 2.88f)
                        curveToRelative(-0.25f, 0.13f, -0.56f, 0.13f, -0.81f, 0f)
                        lineToRelative(-5.61f, -2.88f)
                        curveTo(7.19f, 12.1f, 7f, 11.79f, 7f, 11.46f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.67f, 0.7f, -1.1f, 1.3f, -0.79f)
                        lineToRelative(5.2f, 2.67f)
                        lineToRelative(5.2f, -2.67f)
                        curveTo(19.3f, 10.36f, 20f, 10.79f, 20f, 11.46f)
                        lineTo(20f, 11.46f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_as_unread!!
    }

private var _Mark_as_unread: ImageVector? = null

