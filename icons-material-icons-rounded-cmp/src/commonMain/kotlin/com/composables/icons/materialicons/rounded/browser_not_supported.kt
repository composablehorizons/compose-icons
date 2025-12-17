package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Browser_not_supported: ImageVector
    get() {
        if (_Browser_not_supported != null) return _Browser_not_supported!!
        
        _Browser_not_supported = ImageVector.Builder(
            name = "browser_not_supported",
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
                        moveTo(19f, 6f)
                        verticalLineToRelative(10.5f)
                        lineToRelative(1.95f, 1.95f)
                        curveTo(20.98f, 18.3f, 21f, 18.15f, 21f, 18f)
                        verticalLineTo(6f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        horizontalLineTo(6.5f)
                        lineToRelative(2f, 2f)
                        horizontalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.86f, 3.95f)
                        curveToRelative(-0.35f, -0.35f, -0.92f, -0.35f, -1.27f, 0f)
                        curveToRelative(-0.35f, 0.35f, -0.35f, 0.92f, 0f, 1.27f)
                        lineTo(3f, 5.64f)
                        lineTo(3f, 18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12.36f)
                        lineToRelative(1.42f, 1.42f)
                        curveToRelative(0.35f, 0.35f, 0.92f, 0.35f, 1.27f, 0f)
                        curveToRelative(0.35f, -0.35f, 0.35f, -0.92f, 0f, -1.27f)
                        lineTo(3.86f, 3.95f)
                        close()
                        moveTo(5f, 18f)
                        verticalLineTo(7.64f)
                        lineTo(15.36f, 18f)
                        horizontalLineTo(5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Browser_not_supported!!
    }

private var _Browser_not_supported: ImageVector? = null

