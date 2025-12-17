package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Aq: ImageVector
    get() {
        if (_Aq != null) return _Aq!!
        
        _Aq = ImageVector.Builder(
            name = "aq",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 706f)
                lineToRelative(-26f, -39f)
                quadToRelative(-19f, 9f, -39f, 13.5f)
                reflectiveQuadToRelative(-41f, 4.5f)
                quadToRelative(-78f, 0f, -132f, -54f)
                reflectiveQuadToRelative(-54f, -132f)
                quadToRelative(0f, -77f, 54f, -131.5f)
                reflectiveQuadTo(656f, 313f)
                quadToRelative(77f, 0f, 130.5f, 54.5f)
                reflectiveQuadTo(840f, 499f)
                quadToRelative(0f, 40f, -16f, 76f)
                reflectiveQuadToRelative(-45f, 63f)
                lineToRelative(26f, 39f)
                lineToRelative(-42f, 29f)
                close()
                moveToRelative(-643f, -29f)
                lineToRelative(133f, -356f)
                horizontalLineToRelative(64f)
                lineToRelative(134f, 356f)
                horizontalLineToRelative(-62f)
                lineToRelative(-32f, -91f)
                horizontalLineTo(214f)
                lineToRelative(-33f, 91f)
                horizontalLineToRelative(-61f)
                close()
                moveToRelative(536f, -44f)
                quadToRelative(14f, 0f, 26.5f, -3f)
                reflectiveQuadToRelative(24.5f, -8f)
                lineToRelative(-42f, -62f)
                lineToRelative(43f, -28f)
                lineToRelative(40f, 60f)
                quadToRelative(17f, -19f, 26f, -43f)
                reflectiveQuadToRelative(9f, -50f)
                quadToRelative(0f, -55f, -36.5f, -94.5f)
                reflectiveQuadTo(656f, 365f)
                quadToRelative(-54f, 0f, -91f, 39.5f)
                reflectiveQuadTo(528f, 499f)
                quadToRelative(0f, 55f, 37f, 94.5f)
                reflectiveQuadToRelative(91f, 39.5f)
                close()
                moveToRelative(-424f, -99f)
                horizontalLineToRelative(106f)
                lineToRelative(-51f, -144f)
                horizontalLineToRelative(-4f)
                lineToRelative(-51f, 144f)
                close()
            }
        }.build()
        
        return _Aq!!
    }

private var _Aq: ImageVector? = null

