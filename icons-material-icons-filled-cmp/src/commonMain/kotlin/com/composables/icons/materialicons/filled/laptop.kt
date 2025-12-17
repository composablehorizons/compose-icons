package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Laptop: ImageVector
    get() {
        if (_Laptop != null) return _Laptop!!
        
        _Laptop = ImageVector.Builder(
            name = "laptop",
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
                            moveTo(20f, 18f)
                            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                            verticalLineTo(6f)
                            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                            horizontalLineTo(4f)
                            curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                            verticalLineToRelative(10f)
                            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                            horizontalLineTo(0f)
                            verticalLineToRelative(2f)
                            horizontalLineToRelative(24f)
                            verticalLineToRelative(-2f)
                            horizontalLineTo(20f)
                            close()
                            moveTo(4f, 6f)
                            horizontalLineToRelative(16f)
                            verticalLineToRelative(10f)
                            horizontalLineTo(4f)
                            verticalLineTo(6f)
                            close()
                        }
                    }
                }
            }
        }.build()
        
        return _Laptop!!
    }

private var _Laptop: ImageVector? = null

