package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Waterfall_chart: ImageVector
    get() {
        if (_Waterfall_chart != null) return _Waterfall_chart!!
        
        _Waterfall_chart = ImageVector.Builder(
            name = "waterfall_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(120f, 740f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(180f, 560f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(240f, 620f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(180f, 800f)
                close()
                moveToRelative(200f, -240f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 500f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 360f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(440f, 420f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(380f, 560f)
                close()
                moveToRelative(200f, -200f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(520f, 300f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(580f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(640f, 220f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(580f, 360f)
                close()
                moveToRelative(200f, 440f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(720f, 740f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(780f, 160f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(840f, 220f)
                verticalLineToRelative(520f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(780f, 800f)
                close()
            }
        }.build()
        
        return _Waterfall_chart!!
    }

private var _Waterfall_chart: ImageVector? = null

