package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Water_pump: ImageVector
    get() {
        if (_Water_pump != null) return _Water_pump!!
        
        _Water_pump = ImageVector.Builder(
            name = "water_pump",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 600f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, -23f, -9.5f, -45.5f)
                reflectiveQuadTo(514f, 410f)
                lineToRelative(-17f, -25f)
                quadToRelative(-6f, -9f, -17f, -9f)
                reflectiveQuadToRelative(-17f, 9f)
                lineToRelative(-17f, 25f)
                quadToRelative(-27f, 42f, -36.5f, 64.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 600f)
                close()
                moveToRelative(0f, 130f)
                quadToRelative(-104f, 0f, -177f, -73f)
                reflectiveQuadToRelative(-73f, -177f)
                quadToRelative(0f, -104f, 73f, -177f)
                reflectiveQuadToRelative(177f, -73f)
                quadToRelative(104f, 0f, 177f, 73f)
                reflectiveQuadToRelative(73f, 177f)
                quadToRelative(0f, 104f, -73f, 177f)
                reflectiveQuadToRelative(-177f, 73f)
                close()
                moveToRelative(360f, -290f)
                horizontalLineToRelative(-53f)
                quadToRelative(-10f, -78f, -56f, -142f)
                reflectiveQuadToRelative(-118f, -98f)
                horizontalLineToRelative(227f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(880f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(-16f, 0f, -22.5f, -14.5f)
                reflectiveQuadTo(840f, 440f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 520f)
                horizontalLineToRelative(53f)
                quadToRelative(10f, 78f, 56f, 142f)
                reflectiveQuadToRelative(118f, 98f)
                horizontalLineTo(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(80f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 760f)
                close()
            }
        }.build()
        
        return _Water_pump!!
    }

private var _Water_pump: ImageVector? = null

