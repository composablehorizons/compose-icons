package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cable: ImageVector
    get() {
        if (_Cable != null) return _Cable!!
        
        _Cable = ImageVector.Builder(
            name = "cable",
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
                        moveTo(20f, 5f)
                        verticalLineTo(3f)
                        horizontalLineToRelative(-4f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(-1f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(9f)
                        horizontalLineToRelative(-4f)
                        verticalLineTo(3f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(11f)
                        horizontalLineTo(3f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(1f)
                        verticalLineToRelative(-5f)
                        horizontalLineTo(7f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(4f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(8f)
                        verticalLineTo(10f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(5f)
                        horizontalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Cable!!
    }

private var _Cable: ImageVector? = null

