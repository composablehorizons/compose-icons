package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.House: ImageVector
    get() {
        if (_House != null) return _House!!
        
        _House = ImageVector.Builder(
            name = "house",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(200f, 720f)
                verticalLineToRelative(-286f)
                lineToRelative(-80f, 61f)
                quadToRelative(-14f, 10f, -30f, 8.5f)
                reflectiveQuadTo(64f, 488f)
                quadToRelative(-10f, -14f, -8f, -30f)
                reflectiveQuadToRelative(16f, -26f)
                lineToRelative(359f, -275f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25.5f, 4f)
                reflectiveQuadToRelative(23.5f, 12f)
                lineToRelative(111f, 85f)
                verticalLineToRelative(-22f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(700f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 220f)
                verticalLineToRelative(114f)
                lineToRelative(128f, 98f)
                quadToRelative(13f, 10f, 15.5f, 26f)
                reflectiveQuadToRelative(-7.5f, 30f)
                quadToRelative(-10f, 14f, -26f, 15.5f)
                reflectiveQuadToRelative(-30f, -8.5f)
                lineToRelative(-80f, -61f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(680f, 800f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 720f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 800f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-347f)
                lineTo(480f, 221f)
                lineTo(280f, 373f)
                verticalLineToRelative(347f)
                close()
                moveToRelative(120f, -319f)
                horizontalLineToRelative(160f)
                quadToRelative(0f, -32f, -24f, -52.5f)
                reflectiveQuadTo(480f, 328f)
                quadToRelative(-32f, 0f, -56f, 20.5f)
                reflectiveQuadTo(400f, 401f)
                close()
                moveToRelative(-40f, 319f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(440f, 480f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(600f, 560f)
                verticalLineToRelative(160f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(520f, 480f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(360f, 560f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _House!!
    }

private var _House: ImageVector? = null

