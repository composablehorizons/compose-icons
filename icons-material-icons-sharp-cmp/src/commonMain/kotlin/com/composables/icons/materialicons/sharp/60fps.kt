package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`60fps`: ImageVector
    get() {
        if (_60fps != null) return _60fps!!
        
        _60fps = ImageVector.Builder(
            name = "60fps",
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
                        moveTo(10f, 8f)
                        verticalLineTo(5f)
                        horizontalLineTo(2f)
                        verticalLineToRelative(14f)
                        horizontalLineToRelative(9f)
                        verticalLineToRelative(-9f)
                        horizontalLineTo(5f)
                        verticalLineTo(8f)
                        horizontalLineTo(10f)
                        close()
                        moveTo(8f, 13f)
                        verticalLineToRelative(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(-3f)
                        horizontalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _60fps!!
    }

private var _60fps: ImageVector? = null

