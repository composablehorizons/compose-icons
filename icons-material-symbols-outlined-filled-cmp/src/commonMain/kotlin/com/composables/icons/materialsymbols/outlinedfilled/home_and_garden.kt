package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Home_and_garden: ImageVector
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
                lineToRelative(440f, -337f)
                lineToRelative(439f, 337f)
                lineToRelative(-16f, 21f)
                quadToRelative(-45f, -31f, -99f, -37f)
                reflectiveQuadToRelative(-105f, 14f)
                quadToRelative(-60f, -23f, -123.5f, -10.5f)
                reflectiveQuadTo(465f, 465f)
                quadToRelative(-48f, 48f, -60.5f, 111.5f)
                reflectiveQuadTo(415f, 700f)
                quadToRelative(-10f, 24f, -13f, 49f)
                reflectiveQuadToRelative(-1f, 51f)
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

