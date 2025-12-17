package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Chair_alt: ImageVector
    get() {
        if (_Chair_alt != null) return _Chair_alt!!
        
        _Chair_alt = ImageVector.Builder(
            name = "chair_alt",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 10f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(7f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-9f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(10f)
                    close()
                    moveTo(7f, 8f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(10f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(7f)
                    close()
                    moveTo(17f, 16f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(10f)
                    verticalLineTo(16f)
                    close()
                    moveTo(14f, 12f)
                    horizontalLineToRelative(-4f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Chair_alt!!
    }

private var _Chair_alt: ImageVector? = null

