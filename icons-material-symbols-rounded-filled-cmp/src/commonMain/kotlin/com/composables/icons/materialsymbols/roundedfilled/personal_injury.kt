package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Personal_injury: ImageVector
    get() {
        if (_Personal_injury != null) return _Personal_injury!!
        
        _Personal_injury = ImageVector.Builder(
            name = "personal_injury",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                quadToRelative(0f, 66f, -47f, 113f)
                reflectiveQuadToRelative(-113f, 47f)
                close()
                moveToRelative(-90f, 400f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(360f, 770f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(390f, 740f)
                horizontalLineToRelative(44f)
                quadToRelative(11f, 0f, 17f, 9.5f)
                reflectiveQuadToRelative(1f, 19.5f)
                lineToRelative(-4f, 8f)
                quadToRelative(-5f, 11f, -14.5f, 17f)
                reflectiveQuadToRelative(-21.5f, 6f)
                horizontalLineToRelative(-22f)
                close()
                moveTo(224f, 502f)
                quadToRelative(60f, -30f, 124.5f, -46f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(23f, 0f, 46f, 2f)
                reflectiveQuadToRelative(46f, 6f)
                quadToRelative(11f, 2f, 16f, 11.5f)
                reflectiveQuadToRelative(0f, 19.5f)
                lineToRelative(-75f, 158f)
                quadToRelative(-5f, 11f, -14.5f, 17f)
                reflectiveQuadToRelative(-21.5f, 6f)
                horizontalLineToRelative(-87f)
                quadToRelative(-46f, 0f, -78f, 32f)
                reflectiveQuadToRelative(-32f, 78f)
                quadToRelative(0f, 26f, 11f, 48.5f)
                reflectiveQuadToRelative(30f, 38.5f)
                quadToRelative(8f, 6f, 6f, 14.5f)
                reflectiveQuadTo(317f, 880f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 840f)
                verticalLineToRelative(-231f)
                quadToRelative(0f, -34f, 16.5f, -62.5f)
                reflectiveQuadTo(224f, 502f)
                close()
                moveToRelative(576f, 298f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineToRelative(-2f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(678f, 840f)
                verticalLineToRelative(-332f)
                quadToRelative(0f, -11f, 8.5f, -17.5f)
                reflectiveQuadTo(706f, 489f)
                quadToRelative(8f, 3f, 15f, 6.5f)
                reflectiveQuadToRelative(15f, 6.5f)
                quadToRelative(30f, 16f, 47f, 44.5f)
                reflectiveQuadToRelative(17f, 62.5f)
                verticalLineToRelative(191f)
                close()
            }
        }.build()
        
        return _Personal_injury!!
    }

private var _Personal_injury: ImageVector? = null

