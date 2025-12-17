package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Directions_bus: ImageVector
    get() {
        if (_Directions_bus != null) return _Directions_bus!!
        
        _Directions_bus = ImageVector.Builder(
            name = "directions_bus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                verticalLineToRelative(20f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(260f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 780f)
                verticalLineToRelative(-62f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -83f, 77f, -121.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 29f, -11f, 53.5f)
                reflectiveQuadTo(760f, 718f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 840f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(640f, 780f)
                verticalLineToRelative(-20f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-80f, -360f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(100f, 240f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(620f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(560f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(620f, 640f)
                close()
            }
        }.build()
        
        return _Directions_bus!!
    }

private var _Directions_bus: ImageVector? = null

