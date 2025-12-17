package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Router: ImageVector
    get() {
        if (_Router != null) return _Router!!
        
        _Router = ImageVector.Builder(
            name = "router",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 520f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 400f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 720f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(460f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(420f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(380f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(420f, 720f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 720f)
                close()
                moveToRelative(80f, -420f)
                quadToRelative(-11f, 0f, -20f, 2f)
                reflectiveQuadToRelative(-18f, 6f)
                quadToRelative(-16f, 7f, -32.5f, 6f)
                reflectiveQuadTo(541f, 301f)
                quadToRelative(-12f, -12f, -11.5f, -29f)
                reflectiveQuadToRelative(14.5f, -25f)
                quadToRelative(21f, -13f, 45.5f, -20f)
                reflectiveQuadToRelative(50.5f, -7f)
                quadToRelative(27f, 0f, 51f, 7f)
                reflectiveQuadToRelative(45f, 20f)
                quadToRelative(14f, 8f, 14.5f, 25f)
                reflectiveQuadTo(739f, 301f)
                quadToRelative(-12f, 12f, -29f, 13f)
                reflectiveQuadToRelative(-33f, -6f)
                quadToRelative(-8f, -4f, -17.5f, -6f)
                reflectiveQuadToRelative(-19.5f, -2f)
                close()
                moveToRelative(0f, -140f)
                quadToRelative(-39f, 0f, -74.5f, 11.5f)
                reflectiveQuadTo(500f, 205f)
                quadToRelative(-14f, 10f, -30.5f, 9f)
                reflectiveQuadTo(442f, 202f)
                quadToRelative(-12f, -12f, -12f, -28f)
                reflectiveQuadToRelative(13f, -26f)
                quadToRelative(41f, -32f, 91f, -50f)
                reflectiveQuadToRelative(106f, -18f)
                quadToRelative(56f, 0f, 106f, 18f)
                reflectiveQuadToRelative(91f, 50f)
                quadToRelative(13f, 10f, 13f, 26f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-11f, 11f, -27.5f, 12f)
                reflectiveQuadToRelative(-30.5f, -9f)
                quadToRelative(-30f, -22f, -65.5f, -33.5f)
                reflectiveQuadTo(640f, 160f)
                close()
            }
        }.build()
        
        return _Router!!
    }

private var _Router: ImageVector? = null

