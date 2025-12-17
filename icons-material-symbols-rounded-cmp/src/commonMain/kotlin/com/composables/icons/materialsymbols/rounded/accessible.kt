package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Accessible: ImageVector
    get() {
        if (_Accessible != null) return _Accessible!!
        
        _Accessible = ImageVector.Builder(
            name = "accessible",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(200f, 680f)
                quadToRelative(0f, -51f, 23f, -94f)
                reflectiveQuadToRelative(61f, -70f)
                quadToRelative(14f, -10f, 30f, -7f)
                reflectiveQuadToRelative(26f, 17f)
                quadToRelative(10f, 14f, 7.5f, 30f)
                reflectiveQuadTo(331f, 582f)
                quadToRelative(-23f, 17f, -37f, 42.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                quadToRelative(30f, 0f, 55.5f, -14f)
                reflectiveQuadToRelative(42.5f, -37f)
                quadToRelative(10f, -14f, 26f, -16.5f)
                reflectiveQuadToRelative(30f, 7.5f)
                quadToRelative(14f, 10f, 17f, 26f)
                reflectiveQuadToRelative(-7f, 30f)
                quadToRelative(-27f, 38f, -70f, 61f)
                reflectiveQuadToRelative(-94f, 23f)
                close()
                moveToRelative(320f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 840f)
                verticalLineToRelative(-160f)
                horizontalLineTo(480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 600f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(24f, 0f, 41.5f, 10.5f)
                reflectiveQuadTo(559f, 324f)
                quadToRelative(45f, 54f, 81.5f, 79f)
                reflectiveQuadToRelative(78.5f, 33f)
                quadToRelative(17f, 3f, 29f, 15f)
                reflectiveQuadToRelative(12f, 29f)
                quadToRelative(0f, 17f, -12.5f, 28f)
                reflectiveQuadToRelative(-28.5f, 8f)
                quadToRelative(-44f, -8f, -85.5f, -28f)
                reflectiveQuadTo(560f, 442f)
                verticalLineToRelative(138f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 660f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveTo(480f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Accessible!!
    }

private var _Accessible: ImageVector? = null

