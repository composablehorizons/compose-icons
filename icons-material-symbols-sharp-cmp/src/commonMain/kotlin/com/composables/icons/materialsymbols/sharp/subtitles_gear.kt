package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Subtitles_gear: ImageVector
    get() {
        if (_Subtitles_gear != null) return _Subtitles_gear!!
        
        _Subtitles_gear = ImageVector.Builder(
            name = "subtitles_gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 720f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(160f, -240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(108f, 0f)
                quadToRelative(11f, -23f, 25.5f, -43f)
                reflectiveQuadToRelative(32.5f, -37f)
                horizontalLineToRelative(-86f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(28f)
                close()
                moveToRelative(-24f, 160f)
                quadToRelative(-2f, -10f, -2.5f, -19.5f)
                reflectiveQuadTo(401f, 600f)
                quadToRelative(0f, -11f, 0.5f, -20.5f)
                reflectiveQuadTo(404f, 560f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(164f)
                close()
                moveToRelative(81f, 160f)
                horizontalLineTo(80f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(246f)
                quadToRelative(-17f, -18f, -37f, -32.5f)
                reflectiveQuadTo(800f, 348f)
                verticalLineToRelative(-108f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(268f)
                quadToRelative(11f, 23f, 25f, 43f)
                reflectiveQuadToRelative(32f, 37f)
                close()
                moveToRelative(235f, 0f)
                horizontalLineToRelative(-80f)
                lineToRelative(-12f, -60f)
                quadToRelative(-12f, -5f, -22.5f, -10.5f)
                reflectiveQuadTo(584f, 716f)
                lineToRelative(-58f, 18f)
                lineToRelative(-40f, -68f)
                lineToRelative(46f, -40f)
                quadToRelative(-2f, -13f, -2f, -26f)
                reflectiveQuadToRelative(2f, -26f)
                lineToRelative(-46f, -40f)
                lineToRelative(40f, -68f)
                lineToRelative(58f, 18f)
                quadToRelative(11f, -8f, 21.5f, -13.5f)
                reflectiveQuadTo(628f, 460f)
                lineToRelative(12f, -60f)
                horizontalLineToRelative(80f)
                lineToRelative(12f, 60f)
                quadToRelative(12f, 5f, 23f, 11.5f)
                reflectiveQuadToRelative(21f, 14.5f)
                lineToRelative(58f, -20f)
                lineToRelative(40f, 70f)
                lineToRelative(-46f, 40f)
                quadToRelative(2f, 13f, 2f, 25f)
                reflectiveQuadToRelative(-2f, 25f)
                lineToRelative(46f, 40f)
                lineToRelative(-40f, 68f)
                lineToRelative(-58f, -18f)
                quadToRelative(-11f, 8f, -21.5f, 13.5f)
                reflectiveQuadTo(732f, 740f)
                lineToRelative(-12f, 60f)
                close()
                moveToRelative(-40f, -120f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(760f, 600f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(600f, 600f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(680f, 680f)
                close()
            }
        }.build()
        
        return _Subtitles_gear!!
    }

private var _Subtitles_gear: ImageVector? = null

