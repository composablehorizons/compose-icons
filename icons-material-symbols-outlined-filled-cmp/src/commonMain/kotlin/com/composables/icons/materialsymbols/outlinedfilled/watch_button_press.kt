package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Watch_button_press: ImageVector
    get() {
        if (_Watch_button_press != null) return _Watch_button_press!!
        
        _Watch_button_press = ImageVector.Builder(
            name = "watch_button_press",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 480f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 880f)
                lineToRelative(-54f, -182f)
                quadToRelative(-48f, -38f, -77f, -95f)
                reflectiveQuadToRelative(-29f, -123f)
                quadToRelative(0f, -66f, 29f, -123f)
                reflectiveQuadToRelative(77f, -95f)
                lineToRelative(54f, -182f)
                horizontalLineToRelative(240f)
                lineToRelative(54f, 182f)
                quadToRelative(48f, 38f, 77f, 95f)
                reflectiveQuadToRelative(29f, 123f)
                quadToRelative(0f, 66f, -29f, 123f)
                reflectiveQuadToRelative(-77f, 95f)
                lineTo(520f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(120f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(400f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(400f, 680f)
                close()
            }
        }.build()
        
        return _Watch_button_press!!
    }

private var _Watch_button_press: ImageVector? = null

