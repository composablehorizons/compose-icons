package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Fact_check: ImageVector
    get() {
        if (_Fact_check != null) return _Fact_check!!
        
        _Fact_check = ImageVector.Builder(
            name = "fact_check",
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
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 600f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 680f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(222f, -193f)
                lineToRelative(-29f, -29f)
                quadToRelative(-12f, -12f, -28f, -11.5f)
                reflectiveQuadTo(497f, 459f)
                quadToRelative(-11f, 12f, -11.5f, 28f)
                reflectiveQuadToRelative(11.5f, 28f)
                lineToRelative(57f, 57f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                lineToRelative(142f, -142f)
                quadToRelative(12f, -12f, 12f, -28f)
                reflectiveQuadToRelative(-12f, -28f)
                quadToRelative(-12f, -12f, -28.5f, -12f)
                reflectiveQuadTo(695f, 374f)
                lineTo(582f, 487f)
                close()
                moveToRelative(-222f, 33f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 440f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 520f)
                horizontalLineToRelative(120f)
                close()
                moveToRelative(0f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 280f)
                horizontalLineTo(240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 360f)
                horizontalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Fact_check!!
    }

private var _Fact_check: ImageVector? = null

