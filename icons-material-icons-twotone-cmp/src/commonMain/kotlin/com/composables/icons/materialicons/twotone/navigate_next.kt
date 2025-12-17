package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Navigate_next: ImageVector
    get() {
        if (_Navigate_next != null) return _Navigate_next!!
        
        _Navigate_next = ImageVector.Builder(
            name = "navigate_next",
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
                moveTo(10.02f, 18f)
                lineToRelative(6f, -6f)
                lineToRelative(-6f, -6f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(13.19f, 12f)
                lineToRelative(-4.58f, 4.59f)
                close()
            }
        }.build()
        
        return _Navigate_next!!
    }

private var _Navigate_next: ImageVector? = null

