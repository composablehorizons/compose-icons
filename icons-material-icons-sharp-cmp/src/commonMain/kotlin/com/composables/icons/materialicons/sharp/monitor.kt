package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Monitor: ImageVector
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
                        moveTo(22f, 3f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(15f)
                        horizontalLineToRelative(5f)
                        lineToRelative(-1f, 1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(12f)
                        verticalLineToRelative(-2f)
                        lineToRelative(-1f, -1f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(3f)
                        close()
                        moveTo(20f, 16f)
                        horizontalLineTo(4f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(16f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Monitor!!
    }

private var _Monitor: ImageVector? = null

