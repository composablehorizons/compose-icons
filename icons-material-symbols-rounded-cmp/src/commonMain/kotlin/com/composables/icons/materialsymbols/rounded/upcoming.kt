package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Upcoming: ImageVector
    get() {
        if (_Upcoming != null) return _Upcoming!!
        
        _Upcoming = ImageVector.Builder(
            name = "upcoming",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 480f)
                horizontalLineToRelative(166f)
                quadToRelative(15f, 0f, 26f, 10f)
                reflectiveQuadToRelative(13f, 24f)
                quadToRelative(5f, 34f, 40f, 60f)
                reflectiveQuadToRelative(75f, 26f)
                quadToRelative(40f, 0f, 75f, -26f)
                reflectiveQuadToRelative(40f, -60f)
                quadToRelative(2f, -14f, 13f, -24f)
                reflectiveQuadToRelative(26f, -10f)
                horizontalLineToRelative(166f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 560f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-200f)
                horizontalLineTo(664f)
                quadToRelative(-25f, 55f, -74.5f, 87.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(-60f, 0f, -109.5f, -32.5f)
                reflectiveQuadTo(296f, 560f)
                horizontalLineTo(160f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(516f, -356f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(86f, -86f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-86f, 86f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                close()
                moveToRelative(-392f, 0f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-86f, -86f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(86f, 86f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                close()
                moveToRelative(196f, -84f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 280f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 320f)
                close()
                moveTo(160f, 760f)
                horizontalLineToRelative(640f)
                horizontalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Upcoming!!
    }

private var _Upcoming: ImageVector? = null

