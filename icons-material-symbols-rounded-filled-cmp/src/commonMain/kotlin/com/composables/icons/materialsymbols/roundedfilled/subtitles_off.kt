package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Subtitles_off: ImageVector
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
                moveTo(280f, 480f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 480f)
                close()
                moveToRelative(600f, -240f)
                verticalLineToRelative(429f)
                quadToRelative(0f, 27f, -24.5f, 37.5f)
                reflectiveQuadTo(812f, 698f)
                lineTo(594f, 480f)
                horizontalLineToRelative(86f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(680f, 400f)
                horizontalLineTo(514f)
                lineTo(342f, 228f)
                quadToRelative(-19f, -19f, -8.5f, -43.5f)
                reflectiveQuadTo(371f, 160f)
                horizontalLineToRelative(429f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                lineToRelative(320f, 320f)
                horizontalLineTo(368f)
                lineTo(54f, 166f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
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
                moveToRelative(286f, -240f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(240f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(280f, 640f)
                horizontalLineToRelative(246f)
                lineToRelative(-80f, -80f)
                close()
            }
        }.build()
        
        return _Subtitles_off!!
    }

private var _Subtitles_off: ImageVector? = null

