package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Door_open: ImageVector
    get() {
        if (_Door_open != null) return _Door_open!!
        
        _Door_open = ImageVector.Builder(
            name = "door_open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(440f, 520f)
                close()
                moveTo(280f, 840f)
                verticalLineToRelative(-80f)
                lineToRelative(240f, -40f)
                verticalLineToRelative(-445f)
                quadToRelative(0f, -15f, -9f, -27f)
                reflectiveQuadToRelative(-23f, -14f)
                lineToRelative(-208f, -34f)
                verticalLineToRelative(-80f)
                lineToRelative(220f, 36f)
                quadToRelative(44f, 8f, 72f, 41f)
                reflectiveQuadToRelative(28f, 77f)
                verticalLineToRelative(444f)
                quadToRelative(0f, 29f, -19f, 51.5f)
                reflectiveQuadTo(533f, 797f)
                lineToRelative(-253f, 43f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-560f)
                horizontalLineTo(280f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(-120f, 80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 760f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 200f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Door_open!!
    }

private var _Door_open: ImageVector? = null

