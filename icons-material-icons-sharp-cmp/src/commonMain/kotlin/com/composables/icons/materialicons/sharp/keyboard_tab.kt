package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Keyboard_tab: ImageVector
    get() {
        if (_Keyboard_tab != null) return _Keyboard_tab!!
        
        _Keyboard_tab = ImageVector.Builder(
            name = "keyboard_tab",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.59f, 7.41f)
                lineTo(15.17f, 11f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14.17f)
                lineToRelative(-3.59f, 3.59f)
                lineTo(13f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(20f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Keyboard_tab!!
    }

private var _Keyboard_tab: ImageVector? = null

