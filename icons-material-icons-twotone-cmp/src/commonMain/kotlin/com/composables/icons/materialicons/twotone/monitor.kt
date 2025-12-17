package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Monitor: ImageVector
    get() {
        if (_Monitor != null) return _Monitor!!
        
        _Monitor = ImageVector.Builder(
            name = "monitor",
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
                        moveTo(20f, 3f)
                        horizontalLineTo(4f)
                        curveTo(2.9f, 3f, 2f, 3.9f, 2f, 5f)
                        verticalLineToRelative(11f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(3f)
                        lineToRelative(-1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-2f)
                        lineToRelative(-1f, -1f)
                        horizontalLineToRelative(3f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineTo(5f)
                        curveTo(22f, 3.9f, 21.1f, 3f, 20f, 3f)
                        close()
                        moveTo(20f, 16f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(16f)
                        close()
                    }
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 5f)
                    horizontalLineTo(20f)
                    verticalLineTo(16f)
                    horizontalLineTo(4f)
                    verticalLineTo(5f)
                    close()
                }
            }
        }.build()
        
        return _Monitor!!
    }

private var _Monitor: ImageVector? = null

