package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Toll: ImageVector
    get() {
        if (_Toll != null) return _Toll!!
        
        _Toll = ImageVector.Builder(
            name = "toll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 800f)
                quadToRelative(-134f, 0f, -227f, -93f)
                reflectiveQuadToRelative(-93f, -227f)
                quadToRelative(0f, -134f, 93f, -227f)
                reflectiveQuadToRelative(227f, -93f)
                quadToRelative(134f, 0f, 227f, 93f)
                reflectiveQuadToRelative(93f, 227f)
                quadToRelative(0f, 134f, -93f, 227f)
                reflectiveQuadToRelative(-227f, 93f)
                close()
                moveToRelative(-375f, -30f)
                quadToRelative(-84f, -39f, -134.5f, -117f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -95f, 50.5f, -173f)
                reflectiveQuadTo(225f, 190f)
                quadToRelative(21f, -10f, 38f, 1.5f)
                reflectiveQuadToRelative(17f, 37.5f)
                quadToRelative(0f, 10f, -6.5f, 19.5f)
                reflectiveQuadTo(257f, 263f)
                quadToRelative(-63f, 29f, -100f, 87.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, 71f, 37f, 129.5f)
                reflectiveQuadTo(257f, 697f)
                quadToRelative(10f, 5f, 16.5f, 14f)
                reflectiveQuadToRelative(6.5f, 20f)
                quadToRelative(0f, 25f, -17f, 37f)
                reflectiveQuadToRelative(-38f, 2f)
                close()
                moveToRelative(375f, -290f)
                close()
                moveToRelative(0f, 240f)
                quadToRelative(100f, 0f, 170f, -70f)
                reflectiveQuadToRelative(70f, -170f)
                quadToRelative(0f, -100f, -70f, -170f)
                reflectiveQuadToRelative(-170f, -70f)
                quadToRelative(-100f, 0f, -170f, 70f)
                reflectiveQuadToRelative(-70f, 170f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
            }
        }.build()
        
        return _Toll!!
    }

private var _Toll: ImageVector? = null

