package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Bus_railway: ImageVector
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
                moveTo(340f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 520f)
                close()
                moveToRelative(360f, -120f)
                quadToRelative(80f, 0f, 130f, 44.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                lineToRelative(80f, 80f)
                horizontalLineTo(520f)
                lineToRelative(80f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -71f, 50f, -115.5f)
                reflectiveQuadTo(700f, 400f)
                close()
                moveToRelative(0f, 260f)
                quadToRelative(-12f, 0f, -21f, 9f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(0f, 12f, 9f, 21f)
                reflectiveQuadToRelative(21f, 9f)
                quadToRelative(12f, 0f, 21f, -9f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(0f, -12f, -9f, -21f)
                reflectiveQuadToRelative(-21f, -9f)
                close()
                moveTo(588f, 520f)
                quadToRelative(-4f, 9f, -6f, 19f)
                reflectiveQuadToRelative(-2f, 21f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -11f, -2f, -21f)
                reflectiveQuadToRelative(-6f, -19f)
                horizontalLineTo(588f)
                close()
                moveTo(480f, 80f)
                quadToRelative(172f, 0f, 246f, 37f)
                reflectiveQuadToRelative(74f, 123f)
                verticalLineToRelative(96f)
                quadToRelative(-18f, -6f, -38f, -9.5f)
                reflectiveQuadToRelative(-42f, -5.5f)
                verticalLineToRelative(-41f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(260f)
                quadToRelative(-16f, 17f, -27.5f, 37f)
                reflectiveQuadTo(453f, 480f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(320f, 680f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                verticalLineToRelative(-122f)
                quadToRelative(-18f, -20f, -29f, -44.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -83f, 77f, -121.5f)
                reflectiveQuadTo(480f, 80f)
                close()
                moveToRelative(2f, 120f)
                horizontalLineToRelative(224f)
                horizontalLineToRelative(-448f)
                horizontalLineToRelative(224f)
                close()
                moveToRelative(-224f, 0f)
                horizontalLineToRelative(448f)
                quadToRelative(-15f, -17f, -64.5f, -28.5f)
                reflectiveQuadTo(482f, 160f)
                quadToRelative(-107f, 0f, -156.5f, 12.5f)
                reflectiveQuadTo(258f, 200f)
                close()
                moveToRelative(195f, 280f)
                close()
            }
        }.build()
        
        return _Bus_railway!!
    }

private var _Bus_railway: ImageVector? = null

