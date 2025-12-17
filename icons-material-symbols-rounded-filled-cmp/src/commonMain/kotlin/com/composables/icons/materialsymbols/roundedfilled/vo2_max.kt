package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Vo2_max: ImageVector
    get() {
        if (_Vo2_max != null) return _Vo2_max!!
        
        _Vo2_max = ImageVector.Builder(
            name = "vo2_max",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 760f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 560f)
                horizontalLineToRelative(100f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(700f, 600f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(660f, 800f)
                horizontalLineTo(560f)
                close()
                moveToRelative(20f, -60f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(190f, -40f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(740f, 670f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(770f, 640f)
                horizontalLineToRelative(110f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(920f, 680f)
                verticalLineToRelative(70f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(880f, 790f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(30f)
                horizontalLineToRelative(90f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(920f, 850f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(890f, 880f)
                horizontalLineTo(780f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(740f, 840f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(780f, 730f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-90f)
                close()
                moveTo(180f, 800f)
                quadToRelative(-59f, 0f, -99.5f, -42f)
                reflectiveQuadTo(40f, 656f)
                verticalLineToRelative(-178f)
                quadToRelative(0f, -47f, 20f, -88f)
                reflectiveQuadToRelative(57f, -70f)
                lineToRelative(173f, -136f)
                quadToRelative(14f, -11f, 22f, -27.5f)
                reflectiveQuadToRelative(8f, -34.5f)
                verticalLineToRelative(-42f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(400f, 80f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 18f, 8f, 34.5f)
                reflectiveQuadToRelative(23f, 27.5f)
                lineToRelative(173f, 136f)
                quadToRelative(36f, 29f, 55.5f, 68.5f)
                reflectiveQuadTo(679f, 474f)
                quadToRelative(0f, 19f, -12.5f, 32.5f)
                reflectiveQuadTo(634f, 520f)
                horizontalLineToRelative(-74f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(480f, 600f)
                verticalLineToRelative(151f)
                quadToRelative(0f, 12f, -10f, 17.5f)
                reflectiveQuadToRelative(-20f, -1.5f)
                quadToRelative(-24f, -20f, -37.5f, -48f)
                reflectiveQuadTo(400f, 656f)
                verticalLineToRelative(-394f)
                lineToRelative(-40f, -32f)
                lineToRelative(-40f, 32f)
                verticalLineToRelative(394f)
                quadToRelative(1f, 60f, -40f, 102f)
                reflectiveQuadToRelative(-100f, 42f)
                close()
            }
        }.build()
        
        return _Vo2_max!!
    }

private var _Vo2_max: ImageVector? = null

