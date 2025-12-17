package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Bus_railway: ImageVector
    get() {
        if (_Bus_railway != null) return _Bus_railway!!
        
        _Bus_railway = ImageVector.Builder(
            name = "bus_railway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                close()
                moveTo(520f, 880f)
                lineToRelative(80f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -71f, 50f, -115.5f)
                reflectiveQuadTo(700f, 400f)
                quadToRelative(80f, 0f, 130f, 44.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                lineToRelative(80f, 80f)
                horizontalLineTo(520f)
                close()
                moveToRelative(180f, -160f)
                quadToRelative(12f, 0f, 21f, -9f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                close()
                moveTo(580f, 600f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -11f, -2f, -21f)
                reflectiveQuadToRelative(-6f, -19f)
                horizontalLineTo(588f)
                quadToRelative(-4f, 9f, -6f, 19f)
                reflectiveQuadToRelative(-2f, 21f)
                verticalLineToRelative(40f)
                close()
                moveTo(200f, 840f)
                verticalLineToRelative(-122f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -83f, 77f, -121.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(96f)
                quadToRelative(-18f, -6f, -38f, -9.5f)
                reflectiveQuadToRelative(-42f, -5.5f)
                verticalLineToRelative(-41f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(260f)
                quadToRelative(-30f, 33f, -45f, 74f)
                reflectiveQuadToRelative(-15f, 86f)
                verticalLineToRelative(200f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Bus_railway!!
    }

private var _Bus_railway: ImageVector? = null

