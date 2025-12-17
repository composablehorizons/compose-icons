package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Baby_changing_station: ImageVector
    get() {
        if (_Baby_changing_station != null) return _Baby_changing_station!!
        
        _Baby_changing_station = ImageVector.Builder(
            name = "baby_changing_station",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-400f)
                lineToRelative(63f, -185f)
                quadToRelative(8f, -26f, 30f, -40.5f)
                reflectiveQuadToRelative(47f, -14.5f)
                quadToRelative(8f, 0f, 16f, 1.5f)
                reflectiveQuadToRelative(16f, 5.5f)
                lineToRelative(166f, 73f)
                horizontalLineToRelative(102f)
                verticalLineToRelative(80f)
                horizontalLineTo(440f)
                lineToRelative(-108f, -47f)
                lineToRelative(-52f, 157f)
                verticalLineToRelative(370f)
                horizontalLineTo(120f)
                close()
                moveToRelative(240f, -120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(360f)
                close()
                moveToRelative(420f, -120f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 580f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 520f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 580f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 640f)
                close()
                moveToRelative(-260f, 0f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(440f, 560f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 640f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(320f, 200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 200f)
                close()
            }
        }.build()
        
        return _Baby_changing_station!!
    }

private var _Baby_changing_station: ImageVector? = null

