package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Watch_vibration: ImageVector
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
                moveTo(420f, 160f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(0f, 640f)
                horizontalLineToRelative(120f)
                horizontalLineToRelative(-120f)
                close()
                moveToRelative(-60f, 80f)
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
                moveToRelative(-76f, -470f)
                quadToRelative(20f, -5f, 38.5f, -8f)
                reflectiveQuadToRelative(37.5f, -3f)
                quadToRelative(19f, 0f, 37.5f, 3f)
                reflectiveQuadToRelative(38.5f, 8f)
                lineToRelative(-16f, -50f)
                horizontalLineTo(420f)
                lineToRelative(-16f, 50f)
                close()
                moveToRelative(16f, 590f)
                horizontalLineToRelative(120f)
                lineToRelative(16f, -50f)
                quadToRelative(-20f, 5f, -38.5f, 7.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(-19f, 0f, -37.5f, -2.5f)
                reflectiveQuadTo(404f, 750f)
                lineToRelative(16f, 50f)
                close()
            }
        }.build()
        
        return _Watch_vibration!!
    }

private var _Watch_vibration: ImageVector? = null

