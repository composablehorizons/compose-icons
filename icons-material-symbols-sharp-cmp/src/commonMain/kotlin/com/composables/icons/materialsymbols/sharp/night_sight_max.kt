package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Night_sight_max: ImageVector
    get() {
        if (_Night_sight_max != null) return _Night_sight_max!!
        
        _Night_sight_max = ImageVector.Builder(
            name = "night_sight_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 440f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(440f, 760f)
                quadToRelative(54f, 0f, 100.5f, -21.5f)
                reflectiveQuadTo(620f, 679f)
                quadToRelative(-126f, -8f, -213f, -99.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(0f, -13f, 1f, -25.5f)
                reflectiveQuadToRelative(3f, -24.5f)
                quadToRelative(-56f, 31f, -90f, 86.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(5f, 0f, 10f, 0.5f)
                reflectiveQuadToRelative(10f, 0.5f)
                quadToRelative(-29f, 32f, -44.5f, 72.5f)
                reflectiveQuadTo(400f, 360f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                quadToRelative(32f, 0f, 61f, -8f)
                reflectiveQuadToRelative(55f, -22f)
                quadToRelative(-18f, 115f, -106.5f, 192.5f)
                reflectiveQuadTo(440f, 840f)
                close()
                moveToRelative(-33f, -261f)
                close()
            }
        }.build()
        
        return _Night_sight_max!!
    }

private var _Night_sight_max: ImageVector? = null

