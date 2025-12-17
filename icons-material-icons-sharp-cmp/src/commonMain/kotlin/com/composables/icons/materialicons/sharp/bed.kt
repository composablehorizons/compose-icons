package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Bed: ImageVector
    get() {
        if (_Bed != null) return _Bed!!
        
        _Bed = ImageVector.Builder(
            name = "bed",
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
                    moveTo(21f, 10f)
                    verticalLineTo(5f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(2f)
                    verticalLineToRelative(9f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-9f)
                    horizontalLineTo(21f)
                    close()
                    moveTo(13f, 7f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-6f)
                    verticalLineTo(7f)
                    close()
                    moveTo(5f, 10f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(5f)
                    close()
                    moveTo(4f, 15f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(4f)
                    close()
                }
            }
        }.build()
        
        return _Bed!!
    }

private var _Bed: ImageVector? = null

