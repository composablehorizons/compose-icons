package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Php: ImageVector
    get() {
        if (_Php != null) return _Php!!
        
        _Php = ImageVector.Builder(
            name = "php",
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
                    moveTo(13f, 9f)
                    horizontalLineToRelative(1.5f)
                    verticalLineToRelative(6f)
                    horizontalLineTo(13f)
                    verticalLineToRelative(-2.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(15f)
                    horizontalLineTo(9.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(9f)
                    close()
                    moveTo(8f, 9f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(4.5f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(3f)
                    verticalLineTo(9f)
                    horizontalLineTo(8f)
                    close()
                    moveTo(6.5f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                    moveTo(21.5f, 9f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(18f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-1.5f)
                    verticalLineTo(9f)
                    horizontalLineTo(21.5f)
                    close()
                    moveTo(20f, 10.5f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(10.5f)
                    close()
                }
            }
        }.build()
        
        return _Php!!
    }

private var _Php: ImageVector? = null

