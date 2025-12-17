package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Home_and_garden: ImageVector
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
                moveTo(160f, 800f)
                verticalLineToRelative(-375f)
                lineToRelative(-72f, 55f)
                lineToRelative(-47f, -63f)
                lineToRelative(439f, -337f)
                lineToRelative(440f, 336f)
                lineToRelative(-48f, 64f)
                lineToRelative(-392f, -300f)
                lineToRelative(-240f, 184f)
                verticalLineToRelative(356f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(540f, 95f)
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
                moveToRelative(0f, -98f)
                lineToRelative(46f, 32f)
                quadToRelative(18f, 13f, 39f, 11f)
                reflectiveQuadToRelative(37f, -18f)
                quadToRelative(16f, -16f, 18f, -37f)
                reflectiveQuadToRelative(-11f, -39f)
                lineToRelative(-32f, -46f)
                lineToRelative(32f, -46f)
                quadToRelative(13f, -18f, 11f, -39f)
                reflectiveQuadToRelative(-18f, -37f)
                quadToRelative(-16f, -16f, -37f, -18f)
                reflectiveQuadToRelative(-39f, 11f)
                lineToRelative(-46f, 32f)
                lineToRelative(-46f, -32f)
                quadToRelative(-18f, -13f, -39f, -11f)
                reflectiveQuadToRelative(-37f, 18f)
                quadToRelative(-16f, 16f, -18f, 37f)
                reflectiveQuadToRelative(11f, 39f)
                lineToRelative(32f, 46f)
                lineToRelative(-32f, 46f)
                quadToRelative(-13f, 18f, -11f, 39f)
                reflectiveQuadToRelative(18f, 37f)
                quadToRelative(16f, 16f, 37f, 18f)
                reflectiveQuadToRelative(39f, -11f)
                lineToRelative(46f, -32f)
                close()
                moveToRelative(0f, -47f)
                quadToRelative(21f, 0f, 35.5f, -14.5f)
                reflectiveQuadTo(750f, 700f)
                quadToRelative(0f, -21f, -14.5f, -35.5f)
                reflectiveQuadTo(700f, 650f)
                quadToRelative(-21f, 0f, -35.5f, 14.5f)
                reflectiveQuadTo(650f, 700f)
                quadToRelative(0f, 21f, 14.5f, 35.5f)
                reflectiveQuadTo(700f, 750f)
                close()
                moveTo(480f, 490f)
                close()
                moveToRelative(220f, 210f)
                close()
            }
        }.build()
        
        return _Home_and_garden!!
    }

private var _Home_and_garden: ImageVector? = null

