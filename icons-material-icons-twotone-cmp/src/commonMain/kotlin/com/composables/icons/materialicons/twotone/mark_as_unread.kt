package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Mark_as_unread: ImageVector
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
                        moveTo(13.5f, 13.33f)
                        lineTo(20f, 10f)
                        lineTo(7f, 10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7f, 12f)
                        lineTo(7f, 19f)
                        lineTo(20f, 19f)
                        lineTo(20f, 12f)
                        lineTo(13.5f, 15.33f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.23f, 7f)
                        horizontalLineToRelative(2.6f)
                        curveToRelative(-0.06f, -0.47f, -0.36f, -0.94f, -0.79f, -1.17f)
                        lineTo(10.5f, 2f)
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
                        moveTo(20f, 19f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-7f)
                        lineToRelative(6.5f, 3.33f)
                        lineTo(20f, 12f)
                        verticalLineTo(19f)
                        close()
                        moveTo(13.5f, 13.33f)
                        lineTo(7f, 10f)
                        horizontalLineToRelative(13f)
                        lineTo(13.5f, 13.33f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Mark_as_unread!!
    }

private var _Mark_as_unread: ImageVector? = null

