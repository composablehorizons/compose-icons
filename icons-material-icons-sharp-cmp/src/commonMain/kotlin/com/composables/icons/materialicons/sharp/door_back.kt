package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Door_back: ImageVector
    get() {
        if (_Door_back != null) return _Door_back!!
        
        _Door_back = ImageVector.Builder(
            name = "door_back",
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
                    moveTo(19f, 19f)
                    verticalLineTo(3f)
                    horizontalLineTo(5f)
                    verticalLineToRelative(16f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(18f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(19f)
                    close()
                    moveTo(11f, 13f)
                    horizontalLineTo(9f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Door_back!!
    }

private var _Door_back: ImageVector? = null

