package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Weather_snowy: ImageVector
    get() {
        if (_Weather_snowy != null) return _Weather_snowy!!
        
        _Weather_snowy = ImageVector.Builder(
            name = "weather_snowy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(260f, 760f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(210f, 710f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(260f, 660f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(310f, 710f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(260f, 760f)
                close()
                moveTo(380f, 880f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(330f, 830f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(380f, 780f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(430f, 830f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(380f, 880f)
                close()
                moveToRelative(120f, -120f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(450f, 710f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(500f, 660f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(550f, 710f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(500f, 760f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(690f, 710f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(740f, 660f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(790f, 710f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(740f, 760f)
                close()
                moveTo(620f, 880f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(570f, 830f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(620f, 780f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(670f, 830f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(620f, 880f)
                close()
                moveTo(300f, 600f)
                quadToRelative(-91f, 0f, -155.5f, -64.5f)
                reflectiveQuadTo(80f, 380f)
                quadToRelative(0f, -83f, 55f, -145f)
                reflectiveQuadToRelative(136f, -73f)
                quadToRelative(32f, -57f, 87.5f, -89.5f)
                reflectiveQuadTo(480f, 40f)
                quadToRelative(90f, 0f, 156.5f, 57.5f)
                reflectiveQuadTo(717f, 241f)
                quadToRelative(69f, 6f, 116f, 57f)
                reflectiveQuadToRelative(47f, 122f)
                quadToRelative(0f, 75f, -52.5f, 127.5f)
                reflectiveQuadTo(700f, 600f)
                horizontalLineTo(300f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-48f, 0f, -87.5f, 26f)
                reflectiveQuadTo(333f, 216f)
                lineToRelative(-10f, 24f)
                horizontalLineToRelative(-25f)
                quadToRelative(-57f, 2f, -97.5f, 42.5f)
                reflectiveQuadTo(160f, 380f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(180f, -100f)
                close()
            }
        }.build()
        
        return _Weather_snowy!!
    }

private var _Weather_snowy: ImageVector? = null

