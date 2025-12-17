package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Lightbulb_circle: ImageVector
    get() {
        if (_Lightbulb_circle != null) return _Lightbulb_circle!!
        
        _Lightbulb_circle = ImageVector.Builder(
            name = "lightbulb_circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 700f)
                horizontalLineTo(420f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveTo(360f, 660f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-60f)
                horizontalLineTo(360f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(1f, -100f)
                horizontalLineToRelative(238f)
                quadToRelative(37f, -27f, 59f, -68.5f)
                reflectiveQuadToRelative(22f, -91.5f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(0f, 50f, 22f, 91.5f)
                reflectiveQuadToRelative(59f, 68.5f)
                close()
                moveToRelative(22f, -60f)
                quadToRelative(-20f, -20f, -31.5f, -45.5f)
                reflectiveQuadTo(340f, 400f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(58f, 0f, 99f, 41f)
                reflectiveQuadToRelative(41f, 99f)
                quadToRelative(0f, 29f, -11.5f, 54.5f)
                reflectiveQuadTo(577f, 500f)
                horizontalLineTo(383f)
                close()
            }
        }.build()
        
        return _Lightbulb_circle!!
    }

private var _Lightbulb_circle: ImageVector? = null

