package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`6k`: ImageVector
    get() {
        if (_6k != null) return _6k!!
        
        _6k = ImageVector.Builder(
            name = "6k",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(8f, 12.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineTo(14f)
                    horizontalLineTo(8f)
                    verticalLineTo(12.5f)
                    close()
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(11f, 10.5f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    horizontalLineTo(6.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(11f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(18f, 15f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(-1.75f, -2.25f)
                    verticalLineTo(15f)
                    horizontalLineTo(13f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.25f)
                    lineTo(16.25f, 9f)
                    horizontalLineTo(18f)
                    lineToRelative(-2.25f, 3f)
                    lineTo(18f, 15f)
                    close()
                }
            }
        }.build()
        
        return _6k!!
    }

private var _6k: ImageVector? = null

