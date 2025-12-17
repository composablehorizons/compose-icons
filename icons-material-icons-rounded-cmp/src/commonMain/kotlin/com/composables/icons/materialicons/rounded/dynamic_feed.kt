package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Dynamic_feed: ImageVector
    get() {
        if (_Dynamic_feed != null) return _Dynamic_feed!!
        
        _Dynamic_feed = ImageVector.Builder(
            name = "dynamic_feed",
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
                            moveTo(7f, 8f)
                            lineTo(7f, 8f)
                            curveTo(6.45f, 8f, 6f, 8.45f, 6f, 9f)
                            verticalLineToRelative(6f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(8f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(8f)
                            verticalLineTo(9f)
                            curveTo(8f, 8.45f, 7.55f, 8f, 7f, 8f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(20f, 3f)
                            horizontalLineToRelative(-8f)
                            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                            verticalLineToRelative(6f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(8f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(5f)
                            curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                            close()
                            moveTo(20f, 11f)
                            horizontalLineToRelative(-8f)
                            verticalLineTo(7f)
                            horizontalLineToRelative(8f)
                            verticalLineTo(11f)
                            close()
                        }
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(3f, 12f)
                            lineTo(3f, 12f)
                            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                            verticalLineToRelative(6f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineToRelative(8f)
                            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                            lineToRelative(0f, 0f)
                            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                            horizontalLineTo(4f)
                            verticalLineToRelative(-6f)
                            curveTo(4f, 12.45f, 3.55f, 12f, 3f, 12f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Dynamic_feed!!
    }

private var _Dynamic_feed: ImageVector? = null

