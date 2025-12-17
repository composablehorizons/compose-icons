package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Home_and_garden: ImageVector
    get() {
        if (_Home_and_garden != null) return _Home_and_garden!!
        
        _Home_and_garden = ImageVector.Builder(
            name = "home_and_garden",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 720f)
                verticalLineToRelative(-295f)
                lineToRelative(-40f, 31f)
                quadToRelative(-13f, 10f, -29.5f, 8f)
                reflectiveQuadTo(64f, 448f)
                quadToRelative(-10f, -13f, -7.5f, -29f)
                reflectiveQuadTo(72f, 393f)
                lineToRelative(360f, -276f)
                quadToRelative(11f, -8f, 23.5f, -12f)
                reflectiveQuadToRelative(25.5f, -4f)
                quadToRelative(13f, 0f, 25f, 4f)
                reflectiveQuadToRelative(23f, 12f)
                lineToRelative(299f, 229f)
                quadToRelative(19f, 14f, 9.5f, 36f)
                reflectiveQuadTo(805f, 401f)
                quadToRelative(-26f, -3f, -52.5f, 0.5f)
                reflectiveQuadTo(700f, 415f)
                quadToRelative(-60f, -23f, -123.5f, -10.5f)
                reflectiveQuadTo(465f, 465f)
                quadToRelative(-48f, 48f, -60.5f, 111.5f)
                reflectiveQuadTo(415f, 700f)
                quadToRelative(-6f, 16f, -10f, 32f)
                reflectiveQuadToRelative(-5f, 33f)
                quadToRelative(-1f, 14f, -10.5f, 24.5f)
                reflectiveQuadTo(366f, 800f)
                horizontalLineTo(240f)
                close()
                moveToRelative(460f, 95f)
                quadToRelative(-42f, 29f, -92.5f, 24.5f)
                reflectiveQuadTo(521f, 879f)
                quadToRelative(-36f, -36f, -40.5f, -86.5f)
                reflectiveQuadTo(505f, 700f)
                quadToRelative(-29f, -42f, -24.5f, -92.5f)
                reflectiveQuadTo(521f, 521f)
                quadToRelative(36f, -36f, 86.5f, -40.5f)
                reflectiveQuadTo(700f, 505f)
                quadToRelative(42f, -29f, 92.5f, -24.5f)
                reflectiveQuadTo(879f, 521f)
                quadToRelative(36f, 36f, 40.5f, 86.5f)
                reflectiveQuadTo(895f, 700f)
                quadToRelative(29f, 42f, 24.5f, 92.5f)
                reflectiveQuadTo(879f, 879f)
                quadToRelative(-36f, 36f, -86.5f, 40.5f)
                reflectiveQuadTo(700f, 895f)
                close()
                moveToRelative(0f, -145f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(750f, 700f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(700f, 650f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(650f, 700f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(700f, 750f)
                close()
            }
        }.build()
        
        return _Home_and_garden!!
    }

private var _Home_and_garden: ImageVector? = null

