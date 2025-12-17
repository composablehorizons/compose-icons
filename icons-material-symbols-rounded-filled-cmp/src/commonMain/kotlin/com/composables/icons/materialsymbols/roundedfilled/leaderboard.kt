package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Leaderboard: ImageVector
    get() {
        if (_Leaderboard != null) return _Leaderboard!!
        
        _Leaderboard = ImageVector.Builder(
            name = "leaderboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 360f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(300f, 400f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(260f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(290f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(370f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(410f, 120f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(590f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(550f, 840f)
                horizontalLineTo(410f)
                close()
                moveToRelative(290f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(660f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(700f, 440f)
                horizontalLineToRelative(140f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(700f)
                close()
            }
        }.build()
        
        return _Leaderboard!!
    }

private var _Leaderboard: ImageVector? = null

