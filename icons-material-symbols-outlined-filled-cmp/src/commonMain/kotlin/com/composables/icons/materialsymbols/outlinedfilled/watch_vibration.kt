package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Watch_vibration: ImageVector
    get() {
        if (_Watch_vibration != null) return _Watch_vibration!!
        
        _Watch_vibration = ImageVector.Builder(
            name = "watch_vibration",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(99f, 700f)
                quadToRelative(-28f, -49f, -43.5f, -104.5f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -60f, 15.5f, -115.5f)
                reflectiveQuadTo(99f, 260f)
                lineToRelative(69f, 40f)
                quadToRelative(-23f, 40f, -35.5f, 85.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 49f, 12.5f, 94.5f)
                reflectiveQuadTo(168f, 660f)
                lineToRelative(-69f, 40f)
                close()
                moveToRelative(762f, 0f)
                lineToRelative(-69f, -40f)
                quadToRelative(23f, -40f, 35.5f, -85.5f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, -49f, -12.5f, -94.5f)
                reflectiveQuadTo(792f, 300f)
                lineToRelative(69f, -40f)
                quadToRelative(28f, 49f, 43.5f, 104.5f)
                reflectiveQuadTo(920f, 480f)
                quadToRelative(0f, 60f, -15.5f, 115.5f)
                reflectiveQuadTo(861f, 700f)
                close()
                moveTo(360f, 880f)
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
                lineTo(600f, 880f)
                horizontalLineTo(360f)
                close()
                moveToRelative(120f, -200f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 680f)
                close()
            }
        }.build()
        
        return _Watch_vibration!!
    }

private var _Watch_vibration: ImageVector? = null

