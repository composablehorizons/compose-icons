package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Dynamic_feed: ImageVector
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
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 8f)
                        lineTo(6f, 8f)
                        lineTo(6f, 17f)
                        lineTo(17f, 17f)
                        lineTo(17f, 15f)
                        lineTo(8f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 3f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(3f)
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
                        moveTo(4f, 12f)
                        lineTo(2f, 12f)
                        lineTo(2f, 21f)
                        lineTo(13f, 21f)
                        lineTo(13f, 19f)
                        lineTo(4f, 19f)
                        close()
                    }
                }
            }
            group {
                group {
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 8f)
                        lineTo(6f, 8f)
                        lineTo(6f, 17f)
                        lineTo(17f, 17f)
                        lineTo(17f, 15f)
                        lineTo(8f, 15f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 3f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(10f)
                        horizontalLineToRelative(12f)
                        verticalLineTo(3f)
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
                        moveTo(4f, 12f)
                        lineTo(2f, 12f)
                        lineTo(2f, 21f)
                        lineTo(13f, 21f)
                        lineTo(13f, 19f)
                        lineTo(4f, 19f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Dynamic_feed!!
    }

private var _Dynamic_feed: ImageVector? = null

