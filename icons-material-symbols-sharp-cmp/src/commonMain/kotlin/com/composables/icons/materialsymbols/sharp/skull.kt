package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Skull: ImageVector
    get() {
        if (_Skull != null) return _Skull!!
        
        _Skull = ImageVector.Builder(
            name = "skull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                verticalLineToRelative(-170f)
                quadToRelative(-39f, -17f, -68.5f, -45.5f)
                reflectiveQuadToRelative(-50f, -64.5f)
                quadToRelative(-20.5f, -36f, -31f, -77f)
                reflectiveQuadTo(80f, 440f)
                quadToRelative(0f, -158f, 112f, -259f)
                reflectiveQuadToRelative(288f, -101f)
                quadToRelative(176f, 0f, 288f, 101f)
                reflectiveQuadToRelative(112f, 259f)
                quadToRelative(0f, 42f, -10.5f, 83f)
                reflectiveQuadToRelative(-31f, 77f)
                quadToRelative(-20.5f, 36f, -50f, 64.5f)
                reflectiveQuadTo(720f, 710f)
                verticalLineToRelative(170f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-142f)
                quadToRelative(38f, -9f, 67.5f, -30f)
                reflectiveQuadToRelative(50f, -50f)
                quadToRelative(20.5f, -29f, 31.5f, -64f)
                reflectiveQuadToRelative(11f, -74f)
                quadToRelative(0f, -125f, -88.5f, -202.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-143f, 0f, -231.5f, 77.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, 39f, 11f, 74f)
                reflectiveQuadToRelative(31.5f, 64f)
                quadToRelative(20.5f, 29f, 50.5f, 50f)
                reflectiveQuadToRelative(67f, 30f)
                verticalLineToRelative(142f)
                close()
                moveToRelative(100f, -200f)
                horizontalLineToRelative(120f)
                lineToRelative(-60f, -120f)
                lineToRelative(-60f, 120f)
                close()
                moveToRelative(-80f, -80f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(340f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(260f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(340f, 520f)
                close()
                moveToRelative(280f, 0f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(700f, 440f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(620f, 360f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(620f, 520f)
                close()
                moveTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Skull!!
    }

private var _Skull: ImageVector? = null

