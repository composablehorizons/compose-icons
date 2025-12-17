package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Subtitles_off: ImageVector
    get() {
        if (_Subtitles_off != null) return _Subtitles_off!!
        
        _Subtitles_off = ImageVector.Builder(
            name = "subtitles_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(446f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 560f)
                horizontalLineToRelative(166f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(54f, 110f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(740f, 740f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(850f, 906f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(686f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(720f, -560f)
                verticalLineToRelative(430f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(840f, 710f)
                quadToRelative(-17f, 0f, -28.5f, -12f)
                reflectiveQuadTo(800f, 669f)
                verticalLineToRelative(-429f)
                horizontalLineTo(371f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(331f, 200f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(371f, 160f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
                moveTo(680f, 480f)
                horizontalLineToRelative(-69f)
                quadToRelative(-20f, 0f, -30f, -12.5f)
                reflectiveQuadTo(571f, 440f)
                quadToRelative(0f, -15f, 10f, -27.5f)
                reflectiveQuadToRelative(30f, -12.5f)
                horizontalLineToRelative(69f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 480f)
                close()
                moveToRelative(-103f, -17f)
                close()
                moveToRelative(-194f, 34f)
                close()
                moveToRelative(-103f, -17f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 480f)
                close()
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

