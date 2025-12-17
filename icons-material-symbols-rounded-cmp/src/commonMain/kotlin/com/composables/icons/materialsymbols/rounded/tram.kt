package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Tram: ImageVector
    get() {
        if (_Tram != null) return _Tram!!
        
        _Tram = ImageVector.Builder(
            name = "tram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 700f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -97f, 85f, -127f)
                reflectiveQuadToRelative(195f, -33f)
                lineToRelative(30f, -60f)
                horizontalLineTo(310f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(280f, 70f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(310f, 40f)
                horizontalLineToRelative(340f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(680f, 70f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(650f, 100f)
                horizontalLineTo(550f)
                lineToRelative(-30f, 60f)
                quadToRelative(119f, 3f, 199.5f, 32.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(660f, 840f)
                lineToRelative(20f, 20f)
                quadToRelative(17f, 17f, 8f, 38.5f)
                reflectiveQuadTo(655f, 920f)
                quadToRelative(-7f, 0f, -13.5f, -2.5f)
                reflectiveQuadTo(630f, 910f)
                lineToRelative(-70f, -70f)
                horizontalLineTo(400f)
                lineToRelative(-70f, 70f)
                quadToRelative(-5f, 5f, -11.5f, 7.5f)
                reflectiveQuadTo(305f, 920f)
                quadToRelative(-23f, 0f, -32.5f, -21.5f)
                reflectiveQuadTo(280f, 860f)
                lineToRelative(20f, -20f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(160f, 700f)
                close()
                moveToRelative(500f, -140f)
                horizontalLineTo(240f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(480f, 720f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveToRelative(-2f, -440f)
                horizontalLineToRelative(228f)
                horizontalLineToRelative(-450f)
                horizontalLineToRelative(222f)
                close()
                moveTo(240f, 480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(60f, 280f)
                horizontalLineToRelative(360f)
                quadToRelative(26f, 0f, 43f, -17f)
                reflectiveQuadToRelative(17f, -43f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveToRelative(178f, -520f)
                quadToRelative(-134f, 0f, -172f, 14.5f)
                reflectiveQuadTo(256f, 280f)
                horizontalLineToRelative(450f)
                quadToRelative(-12f, -14f, -52f, -27f)
                reflectiveQuadToRelative(-176f, -13f)
                close()
            }
        }.build()
        
        return _Tram!!
    }

private var _Tram: ImageVector? = null

