package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Curtains: ImageVector
    get() {
        if (_Curtains != null) return _Curtains!!
        
        _Curtains = ImageVector.Builder(
            name = "curtains",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 120f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 760f)
                horizontalLineToRelative(40f)
                close()
                moveToRelative(169f, -280f)
                quadToRelative(68f, 45f, 105f, 123f)
                reflectiveQuadToRelative(44f, 157f)
                horizontalLineToRelative(4f)
                quadToRelative(7f, -79f, 44f, -157f)
                reflectiveQuadToRelative(105f, -123f)
                quadToRelative(-68f, -45f, -105f, -123f)
                reflectiveQuadToRelative(-44f, -157f)
                horizontalLineToRelative(-4f)
                quadToRelative(-7f, 79f, -44f, 157f)
                reflectiveQuadTo(329f, 480f)
                close()
            }
        }.build()
        
        return _Curtains!!
    }

private var _Curtains: ImageVector? = null

