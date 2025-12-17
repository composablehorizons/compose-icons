package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Agender: ImageVector
    get() {
        if (_Agender != null) return _Agender!!
        
        _Agender = ImageVector.Builder(
            name = "agender",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -90f, 57.5f, -156.5f)
                reflectiveQuadTo(440f, 363f)
                verticalLineToRelative(-203f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 160f)
                verticalLineToRelative(203f)
                quadToRelative(86f, 14f, 143f, 80.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(56f, 0f, 98.5f, -34f)
                reflectiveQuadToRelative(56.5f, -86f)
                horizontalLineTo(325f)
                quadToRelative(14f, 52f, 56.5f, 86f)
                reflectiveQuadToRelative(98.5f, 34f)
                close()
                moveTo(325f, 560f)
                horizontalLineToRelative(310f)
                quadToRelative(-14f, -52f, -56.5f, -86f)
                reflectiveQuadTo(480f, 440f)
                quadToRelative(-56f, 0f, -98.5f, 34f)
                reflectiveQuadTo(325f, 560f)
                close()
            }
        }.build()
        
        return _Agender!!
    }

private var _Agender: ImageVector? = null

