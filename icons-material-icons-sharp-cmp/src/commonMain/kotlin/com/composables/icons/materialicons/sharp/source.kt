package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Source: ImageVector
    get() {
        if (_Source != null) return _Source!!
        
        _Source = ImageVector.Builder(
            name = "source",
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
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 6f)
                    lineToRelative(-2f, -2f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(6f)
                    horizontalLineTo(12f)
                    close()
                    moveTo(14f, 16f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(8f)
                    verticalLineTo(16f)
                    close()
                    moveTo(18f, 12f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(12f)
                    close()
                }
            }
        }.build()
        
        return _Source!!
    }

private var _Source: ImageVector? = null

