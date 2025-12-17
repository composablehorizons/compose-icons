package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`1k`: ImageVector
    get() {
        if (_1k != null) return _1k!!
        
        _1k = ImageVector.Builder(
            name = "1k",
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
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(10f, 15f)
                    horizontalLineTo(8.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(7f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(17f, 15f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(-1.75f, -2.25f)
                    verticalLineTo(15f)
                    horizontalLineTo(12f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.25f)
                    lineTo(15.25f, 9f)
                    horizontalLineTo(17f)
                    lineToRelative(-2.25f, 3f)
                    lineTo(17f, 15f)
                    close()
                }
            }
        }.build()
        
        return _1k!!
    }

private var _1k: ImageVector? = null

