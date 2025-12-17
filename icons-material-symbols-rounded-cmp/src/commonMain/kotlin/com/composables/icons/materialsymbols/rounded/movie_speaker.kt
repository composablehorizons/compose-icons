package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Movie_speaker: ImageVector
    get() {
        if (_Movie_speaker != null) return _Movie_speaker!!
        
        _Movie_speaker = ImageVector.Builder(
            name = "movie_speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-380f)
                verticalLineToRelative(80f)
                verticalLineToRelative(-70f)
                verticalLineToRelative(370f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(80f)
                lineToRelative(65f, 130f)
                quadToRelative(7f, 14f, 20f, 22f)
                reflectiveQuadToRelative(28f, 8f)
                quadToRelative(30f, 0f, 46f, -25.5f)
                reflectiveQuadToRelative(2f, -52.5f)
                lineToRelative(-41f, -82f)
                horizontalLineToRelative(120f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(160f)
                horizontalLineTo(160f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(280f, -40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 720f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 600f)
                horizontalLineToRelative(80f)
                lineToRelative(86f, -86f)
                quadToRelative(10f, -10f, 22f, -5f)
                reflectiveQuadToRelative(12f, 19f)
                verticalLineToRelative(304f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineToRelative(-86f, -86f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(480f, -80f)
                quadToRelative(0f, 72f, -38.5f, 131f)
                reflectiveQuadTo(778f, 899f)
                quadToRelative(-15f, 7f, -29f, -1f)
                reflectiveQuadToRelative(-19f, -25f)
                quadToRelative(-5f, -17f, 4f, -31.5f)
                reflectiveQuadToRelative(24f, -22.5f)
                quadToRelative(37f, -20f, 59.5f, -57f)
                reflectiveQuadToRelative(22.5f, -82f)
                quadToRelative(0f, -45f, -22.5f, -82f)
                reflectiveQuadTo(758f, 541f)
                quadToRelative(-15f, -8f, -24f, -22.5f)
                reflectiveQuadToRelative(-4f, -31.5f)
                quadToRelative(5f, -17f, 19f, -25f)
                reflectiveQuadToRelative(29f, -1f)
                quadToRelative(65f, 29f, 103.5f, 88f)
                reflectiveQuadTo(920f, 680f)
                close()
                moveToRelative(-172f, -74f)
                quadToRelative(15f, 14f, 23.5f, 33f)
                reflectiveQuadToRelative(8.5f, 41f)
                quadToRelative(0f, 22f, -8.5f, 41f)
                reflectiveQuadTo(748f, 754f)
                quadToRelative(-8f, 8f, -18f, 2.5f)
                reflectiveQuadTo(720f, 739f)
                verticalLineToRelative(-118f)
                quadToRelative(0f, -11f, 10f, -16.5f)
                reflectiveQuadToRelative(18f, 1.5f)
                close()
            }
        }.build()
        
        return _Movie_speaker!!
    }

private var _Movie_speaker: ImageVector? = null

