package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Checkroom: ImageVector
    get() {
        if (_Checkroom != null) return _Checkroom!!
        
        _Checkroom = ImageVector.Builder(
            name = "checkroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                horizontalLineToRelative(480f)
                lineTo(480f, 540f)
                lineTo(240f, 720f)
                close()
                moveToRelative(185f, -444f)
                quadToRelative(-5f, 11f, -14.5f, 18f)
                reflectiveQuadToRelative(-22.5f, 7f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(348f, 261f)
                quadToRelative(0f, -5f, 0.5f, -8.5f)
                reflectiveQuadToRelative(2.5f, -7.5f)
                quadToRelative(17f, -38f, 52f, -61.5f)
                reflectiveQuadToRelative(77f, -23.5f)
                quadToRelative(58f, 0f, 99f, 40.5f)
                reflectiveQuadToRelative(41f, 98.5f)
                quadToRelative(0f, 47f, -27.5f, 84f)
                reflectiveQuadTo(520f, 434f)
                verticalLineToRelative(36f)
                lineToRelative(344f, 258f)
                quadToRelative(8f, 5f, 12f, 13.5f)
                reflectiveQuadToRelative(4f, 18.5f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 800f)
                horizontalLineTo(120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 760f)
                quadToRelative(0f, -10f, 4f, -18.5f)
                reflectiveQuadTo(96f, 728f)
                lineToRelative(344f, -258f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 12f, -28.5f)
                reflectiveQuadToRelative(29f, -11.5f)
                quadToRelative(25f, 0f, 42f, -18f)
                reflectiveQuadToRelative(17f, -43f)
                quadToRelative(0f, -25f, -17.5f, -42f)
                reflectiveQuadTo(480f, 240f)
                quadToRelative(-18f, 0f, -33f, 9.5f)
                reflectiveQuadTo(425f, 276f)
                close()
            }
        }.build()
        
        return _Checkroom!!
    }

private var _Checkroom: ImageVector? = null

