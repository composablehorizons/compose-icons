package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Add_card: ImageVector
    get() {
        if (_Add_card != null) return _Add_card!!
        
        _Add_card = ImageVector.Builder(
            name = "add_card",
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
                    moveTo(2.01f, 4f)
                    lineTo(2f, 20f)
                    horizontalLineToRelative(12f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(4f)
                    horizontalLineTo(2.01f)
                    close()
                    moveTo(20f, 8f)
                    horizontalLineTo(4f)
                    verticalLineTo(6f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    close()
                    moveTo(24f, 17f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(24f)
                    close()
                }
            }
        }.build()
        
        return _Add_card!!
    }

private var _Add_card: ImageVector? = null

