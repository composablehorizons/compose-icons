package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Difference: ImageVector
    get() {
        if (_Difference != null) return _Difference!!
        
        _Difference = ImageVector.Builder(
            name = "difference",
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
                    moveTo(18f, 23f)
                    horizontalLineTo(2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(14f)
                    horizontalLineToRelative(14f)
                    verticalLineTo(23f)
                    close()
                    moveTo(15f, 1f)
                    horizontalLineTo(6.01f)
                    lineTo(6f, 19f)
                    horizontalLineToRelative(15f)
                    verticalLineTo(7f)
                    lineTo(15f, 1f)
                    close()
                    moveTo(16.5f, 15f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(15f)
                    close()
                    moveTo(16.5f, 9f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                }
            }
        }.build()
        
        return _Difference!!
    }

private var _Difference: ImageVector? = null

