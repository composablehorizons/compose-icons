package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Circles: ImageVector
    get() {
        if (_Circles != null) return _Circles!!
        
        _Circles = ImageVector.Builder(
            name = "circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 40f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                close()
                moveToRelative(4f, 561f)
                quadToRelative(29f, 0f, 56.5f, -6f)
                reflectiveQuadToRelative(53.5f, -17f)
                quadToRelative(-21f, 131f, -121f, 216.5f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -133f, 85.5f, -233f)
                reflectiveQuadTo(382f, 166f)
                quadToRelative(-11f, 27f, -16.5f, 56f)
                reflectiveQuadToRelative(-5.5f, 58f)
                quadToRelative(2f, 134f, 96f, 227.5f)
                reflectiveQuadTo(684f, 601f)
                close()
            }
        }.build()
        
        return _Circles!!
    }

private var _Circles: ImageVector? = null

