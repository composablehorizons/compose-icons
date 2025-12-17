package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Atm: ImageVector
    get() {
        if (_Atm != null) return _Atm!!
        
        _Atm = ImageVector.Builder(
            name = "atm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(415f, 420f)
                horizontalLineToRelative(-60f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(325f, 390f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(355f, 360f)
                horizontalLineToRelative(180f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(565f, 390f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(535f, 420f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(445f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(415f, 570f)
                verticalLineToRelative(-150f)
                close()
                moveTo(140f, 540f)
                verticalLineToRelative(30f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(110f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(80f, 570f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 360f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(250f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(220f, 570f)
                verticalLineToRelative(-30f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -60f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(60f)
                close()
                moveToRelative(540f, -60f)
                verticalLineToRelative(150f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(650f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(620f, 570f)
                verticalLineToRelative(-170f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(660f, 360f)
                horizontalLineToRelative(180f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 400f)
                verticalLineToRelative(170f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(850f, 600f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(820f, 570f)
                verticalLineToRelative(-150f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(110f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(750f, 560f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(720f, 530f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(-40f)
                close()
            }
        }.build()
        
        return _Atm!!
    }

private var _Atm: ImageVector? = null

