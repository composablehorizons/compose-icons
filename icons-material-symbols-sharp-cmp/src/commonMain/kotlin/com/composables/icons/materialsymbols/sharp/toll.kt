package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Toll: ImageVector
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
                moveToRelative(-320f, -10f)
                quadToRelative(-106f, -28f, -173f, -114f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -110f, 67f, -196f)
                reflectiveQuadToRelative(173f, -114f)
                verticalLineToRelative(84f)
                quadToRelative(-72f, 25f, -116f, 87f)
                reflectiveQuadToRelative(-44f, 139f)
                quadToRelative(0f, 77f, 44f, 139f)
                reflectiveQuadToRelative(116f, 87f)
                verticalLineToRelative(84f)
                close()
                moveToRelative(320f, -310f)
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

