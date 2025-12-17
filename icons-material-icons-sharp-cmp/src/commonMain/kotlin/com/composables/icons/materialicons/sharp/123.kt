package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.`123`: ImageVector
    get() {
        if (_123 != null) return _123!!
        
        _123 = ImageVector.Builder(
            name = "123",
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
                    moveTo(7f, 15f)
                    horizontalLineTo(5.5f)
                    verticalLineToRelative(-4.5f)
                    horizontalLineTo(4f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(15f)
                    close()
                    moveTo(13.5f, 13.5f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-1f)
                    horizontalLineToRelative(3f)
                    verticalLineTo(9f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineTo(9f)
                    verticalLineTo(15f)
                    horizontalLineToRelative(4.5f)
                    verticalLineTo(13.5f)
                    close()
                    moveTo(19.5f, 15f)
                    verticalLineTo(9f)
                    horizontalLineTo(15f)
                    verticalLineToRelative(1.5f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(1f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(15f)
                    horizontalLineTo(19.5f)
                    close()
                }
            }
        }.build()
        
        return _123!!
    }

private var _123: ImageVector? = null

