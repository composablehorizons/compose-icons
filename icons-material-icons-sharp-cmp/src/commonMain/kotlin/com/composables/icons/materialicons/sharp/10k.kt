package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`10k`: ImageVector
    get() {
        if (_10k != null) return _10k!!
        
        _10k = ImageVector.Builder(
            name = "10k",
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
                    moveTo(10f, 10.5f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(10f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(21f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(7.5f, 15f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(4.5f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(13f, 9f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(8.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(19f, 15f)
                    horizontalLineToRelative(-1.75f)
                    lineToRelative(-1.75f, -2.25f)
                    verticalLineTo(15f)
                    horizontalLineTo(14f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(2.25f)
                    lineTo(17.25f, 9f)
                    horizontalLineTo(19f)
                    lineToRelative(-2.25f, 3f)
                    lineTo(19f, 15f)
                    close()
                }
            }
        }.build()
        
        return _10k!!
    }

private var _10k: ImageVector? = null

