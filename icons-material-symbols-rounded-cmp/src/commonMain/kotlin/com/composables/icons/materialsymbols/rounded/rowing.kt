package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Rowing: ImageVector
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
                moveTo(692f, 932f)
                lineToRelative(-80f, -80f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-43f)
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
                horizontalLineToRelative(43f)
                quadToRelative(8f, 0f, 15.5f, 3f)
                reflectiveQuadToRelative(13.5f, 9f)
                lineToRelative(80f, 80f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-64f, 64f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                close()
                moveTo(360f, 680f)
                lineTo(250f, 790f)
                quadToRelative(-13f, 13f, -30f, 13f)
                reflectiveQuadToRelative(-30f, -13f)
                quadToRelative(-13f, -13f, -13f, -30f)
                reflectiveQuadToRelative(13f, -30f)
                lineToRelative(150f, -150f)
                lineToRelative(100f, 100f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(240f, -480f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 200f)
                close()
                moveTo(280f, 500f)
                quadToRelative(-18f, 0f, -31f, -13f)
                reflectiveQuadToRelative(-13f, -31f)
                quadToRelative(0f, -18f, 13f, -31f)
                reflectiveQuadToRelative(31f, -13f)
                quadToRelative(18f, 0f, 31f, 13f)
                reflectiveQuadToRelative(13f, 31f)
                quadToRelative(0f, 18f, -13f, 31f)
                reflectiveQuadToRelative(-31f, 13f)
                close()
            }
        }.build()
        
        return _Rowing!!
    }

private var _Rowing: ImageVector? = null

