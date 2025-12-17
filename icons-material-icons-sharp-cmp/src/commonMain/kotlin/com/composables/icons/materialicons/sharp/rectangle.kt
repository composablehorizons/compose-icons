package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Rectangle: ImageVector
    get() {
        if (_Rectangle != null) return _Rectangle!!
        
        _Rectangle = ImageVector.Builder(
            name = "rectangle",
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
                        moveTo(2f, 4f)
                        horizontalLineTo(22f)
                        verticalLineTo(20f)
                        horizontalLineTo(2f)
                        verticalLineTo(4f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rectangle!!
    }

private var _Rectangle: ImageVector? = null

