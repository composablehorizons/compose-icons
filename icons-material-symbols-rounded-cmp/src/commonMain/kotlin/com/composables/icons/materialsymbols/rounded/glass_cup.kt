package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Glass_cup: ImageVector
    get() {
        if (_Glass_cup != null) return _Glass_cup!!
        
        _Glass_cup = ImageVector.Builder(
            name = "glass_cup",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(279f, 880f)
                quadToRelative(-31f, 0f, -53.5f, -20f)
                reflectiveQuadTo(200f, 809f)
                lineToRelative(-70f, -640f)
                quadToRelative(-4f, -35f, 19.5f, -62f)
                reflectiveQuadToRelative(59.5f, -27f)
                horizontalLineToRelative(542f)
                quadToRelative(36f, 0f, 59.5f, 27f)
                reflectiveQuadToRelative(19.5f, 62f)
                lineToRelative(-70f, 640f)
                quadToRelative(-3f, 31f, -25.5f, 51f)
                reflectiveQuadTo(681f, 880f)
                horizontalLineTo(279f)
                close()
                moveToRelative(-8f, -160f)
                lineToRelative(9f, 80f)
                horizontalLineToRelative(400f)
                lineToRelative(9f, -80f)
                horizontalLineTo(271f)
                close()
                moveToRelative(-8f, -80f)
                horizontalLineToRelative(435f)
                lineToRelative(52f, -480f)
                horizontalLineTo(210f)
                lineToRelative(53f, 480f)
                close()
                moveToRelative(8f, 160f)
                horizontalLineToRelative(418f)
                horizontalLineToRelative(-418f)
                close()
            }
        }.build()
        
        return _Glass_cup!!
    }

private var _Glass_cup: ImageVector? = null

