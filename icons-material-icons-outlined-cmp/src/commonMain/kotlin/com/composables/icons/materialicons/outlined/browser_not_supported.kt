package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Browser_not_supported: ImageVector
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
                        moveTo(3.22f, 3.32f)
                        lineTo(1.95f, 4.59f)
                        lineTo(3f, 5.64f)
                        lineTo(3f, 18f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(12.36f)
                        lineToRelative(2.06f, 2.06f)
                        lineToRelative(1.27f, -1.27f)
                        lineTo(3.22f, 3.32f)
                        close()
                        moveTo(15f, 18f)
                        horizontalLineTo(5f)
                        verticalLineTo(7.64f)
                        lineTo(15.36f, 18f)
                        horizontalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Browser_not_supported!!
    }

private var _Browser_not_supported: ImageVector? = null

