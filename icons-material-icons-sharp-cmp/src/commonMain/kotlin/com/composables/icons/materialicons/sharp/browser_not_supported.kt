package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Browser_not_supported: ImageVector
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
                        lineTo(19f, 16.5f)
                        lineTo(21f, 18.5f)
                        lineTo(21f, 4f)
                        lineTo(6.5f, 4f)
                        lineTo(8.5f, 6f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(3.22f, 3.32f)
                        lineTo(1.95f, 4.59f)
                        lineTo(3f, 5.64f)
                        lineTo(3f, 20f)
                        horizontalLineToRelative(14.36f)
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

