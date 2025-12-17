package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Rowing: ImageVector
    get() {
        if (_Rowing != null) return _Rowing!!
        
        _Rowing = ImageVector.Builder(
            name = "rowing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 960f)
                lineTo(600f, 840f)
                verticalLineToRelative(-60f)
                lineTo(316f, 496f)
                quadToRelative(-9f, 2f, -18f, 3f)
                reflectiveQuadToRelative(-18f, 1f)
                verticalLineToRelative(-88f)
                quadToRelative(50f, 2f, 102f, -21.5f)
                reflectiveQuadToRelative(84f, -58.5f)
                lineToRelative(56f, -62f)
                quadToRelative(13f, -15f, 30.5f, -22.5f)
                reflectiveQuadTo(590f, 240f)
                quadToRelative(38f, 0f, 64f, 26f)
                reflectiveQuadToRelative(26f, 64f)
                verticalLineToRelative(230f)
                quadToRelative(0f, 26f, -9.5f, 47.5f)
                reflectiveQuadTo(644f, 646f)
                lineTo(500f, 504f)
                verticalLineToRelative(-92f)
                quadToRelative(-20f, 17f, -43f, 31f)
                reflectiveQuadToRelative(-49f, 25f)
                lineToRelative(252f, 252f)
                horizontalLineToRelative(60f)
                lineToRelative(120f, 120f)
                lineTo(720f, 960f)
                close()
                moveTo(220f, 820f)
                lineToRelative(-60f, -60f)
                lineToRelative(180f, -180f)
                lineToRelative(100f, 100f)
                horizontalLineToRelative(-80f)
                lineTo(220f, 820f)
                close()
                moveToRelative(380f, -620f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 200f)
                close()
            }
        }.build()
        
        return _Rowing!!
    }

private var _Rowing: ImageVector? = null

