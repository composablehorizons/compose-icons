package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fertile: ImageVector
    get() {
        if (_Fertile != null) return _Fertile!!
        
        _Fertile = ImageVector.Builder(
            name = "fertile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(533f, 140f)
                quadToRelative(29f, 34f, 55f, 69f)
                reflectiveQuadToRelative(50f, 72f)
                lineToRelative(178f, -133f)
                quadToRelative(9f, -7f, 20f, -8f)
                reflectiveQuadToRelative(22f, 4f)
                quadToRelative(11f, 5f, 16.5f, 15f)
                reflectiveQuadToRelative(5.5f, 21f)
                verticalLineToRelative(300f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                verticalLineToRelative(-300f)
                quadToRelative(0f, -11f, 5.5f, -21f)
                reflectiveQuadToRelative(16.5f, -15f)
                quadToRelative(11f, -5f, 22f, -4f)
                reflectiveQuadToRelative(20f, 8f)
                lineToRelative(177f, 133f)
                quadToRelative(24f, -37f, 50.5f, -72f)
                reflectiveQuadToRelative(55.5f, -69f)
                quadToRelative(10f, -12f, 24f, -18.5f)
                reflectiveQuadToRelative(29f, -6.5f)
                quadToRelative(15f, 0f, 29f, 6.5f)
                reflectiveQuadToRelative(24f, 18.5f)
                close()
                moveToRelative(-53f, 660f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                verticalLineToRelative(-220f)
                lineTo(616f, 398f)
                quadToRelative(-45f, -72f, -73f, -114f)
                reflectiveQuadToRelative(-63f, -84f)
                quadToRelative(-35f, 43f, -65f, 87f)
                reflectiveQuadToRelative(-71f, 111f)
                lineTo(160f, 260f)
                verticalLineToRelative(220f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                close()
                moveToRelative(0f, -300f)
                close()
            }
        }.build()
        
        return _Fertile!!
    }

private var _Fertile: ImageVector? = null

