package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`30fps`: ImageVector
    get() {
        if (_30fps != null) return _30fps!!
        
        _30fps = ImageVector.Builder(
            name = "30fps",
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
                        moveTo(2f, 5f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(2.5f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(5f)
                        verticalLineTo(16f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(3f)
                        horizontalLineToRelative(9f)
                        verticalLineTo(5f)
                        horizontalLineTo(2f)
                        close()
                        moveTo(19f, 8f)
                        verticalLineToRelative(8f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(8f)
                        horizontalLineTo(19f)
                        moveTo(22f, 5f)
                        horizontalLineTo(12f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(10f)
                        verticalLineTo(5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _30fps!!
    }

private var _30fps: ImageVector? = null

