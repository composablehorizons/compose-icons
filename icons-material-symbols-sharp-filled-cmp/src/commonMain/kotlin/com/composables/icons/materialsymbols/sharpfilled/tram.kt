package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Tram: ImageVector
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
                horizontalLineTo(280f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(60f)
                horizontalLineTo(550f)
                lineToRelative(-30f, 60f)
                quadToRelative(119f, 3f, 199.5f, 32.5f)
                reflectiveQuadTo(800f, 320f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 59f, -40.5f, 99.5f)
                reflectiveQuadTo(660f, 840f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(-80f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(400f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-20f)
                lineToRelative(60f, -60f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(160f, 700f)
                close()
                moveToRelative(320f, 20f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(540f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(420f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(480f, 720f)
                close()
                moveTo(240f, 480f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Tram!!
    }

private var _Tram: ImageVector? = null

