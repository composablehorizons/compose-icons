package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Crowdsource: ImageVector
    get() {
        if (_Crowdsource != null) return _Crowdsource!!
        
        _Crowdsource = ImageVector.Builder(
            name = "crowdsource",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 390f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(600f, 330f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(660f, 270f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(720f, 330f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(660f, 390f)
                close()
                moveToRelative(-360f, 0f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(240f, 330f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(300f, 270f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(360f, 330f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(300f, 390f)
                close()
                moveToRelative(180f, 110f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 440f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 380f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 440f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 500f)
                close()
                moveToRelative(0f, -220f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(540f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 280f)
                close()
                moveToRelative(0f, 520f)
                quadToRelative(-20f, 0f, -40.5f, -3f)
                reflectiveQuadToRelative(-39.5f, -8f)
                verticalLineToRelative(-143f)
                quadToRelative(0f, -35f, 23.5f, -60.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(33f, 0f, 56.5f, 25.5f)
                reflectiveQuadTo(560f, 646f)
                verticalLineToRelative(143f)
                quadToRelative(-19f, 5f, -39.5f, 8f)
                reflectiveQuadToRelative(-40.5f, 3f)
                close()
                moveToRelative(-140f, -32f)
                quadToRelative(-20f, -8f, -38.5f, -18f)
                reflectiveQuadTo(266f, 728f)
                quadToRelative(-28f, -20f, -44.5f, -52f)
                reflectiveQuadTo(205f, 608f)
                quadToRelative(0f, -26f, -5.5f, -48.5f)
                reflectiveQuadTo(180f, 517f)
                quadToRelative(-10f, -13f, -37.5f, -39.5f)
                reflectiveQuadTo(92f, 428f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(153f, 145f)
                quadToRelative(20f, 18f, 29.5f, 42.5f)
                reflectiveQuadTo(340f, 610f)
                verticalLineToRelative(158f)
                close()
                moveToRelative(280f, 0f)
                verticalLineToRelative(-158f)
                quadToRelative(0f, -26f, 10f, -51f)
                reflectiveQuadToRelative(29f, -42f)
                lineToRelative(153f, -145f)
                quadToRelative(12f, -11f, 28.5f, -11f)
                reflectiveQuadToRelative(27.5f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-23f, 23f, -50.5f, 49f)
                reflectiveQuadTo(780f, 517f)
                quadToRelative(-14f, 20f, -19.5f, 42.5f)
                reflectiveQuadTo(755f, 608f)
                quadToRelative(0f, 36f, -16.5f, 68.5f)
                reflectiveQuadTo(693f, 729f)
                quadToRelative(-16f, 11f, -34.5f, 21f)
                reflectiveQuadTo(620f, 768f)
                close()
            }
        }.build()
        
        return _Crowdsource!!
    }

private var _Crowdsource: ImageVector? = null

