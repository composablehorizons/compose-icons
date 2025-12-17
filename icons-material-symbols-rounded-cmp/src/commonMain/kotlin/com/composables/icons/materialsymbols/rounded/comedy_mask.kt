package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Comedy_mask: ImageVector
    get() {
        if (_Comedy_mask != null) return _Comedy_mask!!
        
        _Comedy_mask = ImageVector.Builder(
            name = "comedy_mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                quadToRelative(60f, 0f, 104.5f, -39f)
                reflectiveQuadToRelative(53.5f, -97f)
                quadToRelative(2f, -10f, -4.5f, -17f)
                reflectiveQuadToRelative(-17.5f, -7f)
                horizontalLineTo(344f)
                quadToRelative(-10f, 0f, -17f, 7f)
                reflectiveQuadToRelative(-5f, 17f)
                quadToRelative(9f, 58f, 53.5f, 97f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(-75f, 0f, -140.5f, -28.5f)
                reflectiveQuadToRelative(-114f, -77f)
                quadToRelative(-48.5f, -48.5f, -77f, -114f)
                reflectiveQuadTo(120f, 520f)
                verticalLineToRelative(-360f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 75f, -28.5f, 140.5f)
                reflectiveQuadToRelative(-77f, 114f)
                quadToRelative(-48.5f, 48.5f, -114f, 77f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(116f, 0f, 198f, -82f)
                reflectiveQuadToRelative(82f, -198f)
                verticalLineToRelative(-360f)
                horizontalLineTo(200f)
                verticalLineToRelative(360f)
                quadToRelative(0f, 116f, 82f, 198f)
                reflectiveQuadToRelative(198f, 82f)
                close()
                moveToRelative(0f, -320f)
                close()
                moveTo(360f, 280f)
                quadToRelative(-27f, 0f, -47.5f, 16f)
                reflectiveQuadTo(284f, 336f)
                quadToRelative(-3f, 9f, 3f, 16.5f)
                reflectiveQuadToRelative(17f, 7.5f)
                horizontalLineToRelative(112f)
                quadToRelative(10f, 0f, 16f, -7.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(-8f, -24f, -28.5f, -40f)
                reflectiveQuadTo(360f, 280f)
                close()
                moveToRelative(240f, 0f)
                quadToRelative(-27f, 0f, -47.5f, 16f)
                reflectiveQuadTo(524f, 336f)
                quadToRelative(-3f, 9f, 3f, 16.5f)
                reflectiveQuadToRelative(17f, 7.5f)
                horizontalLineToRelative(112f)
                quadToRelative(10f, 0f, 16f, -7.5f)
                reflectiveQuadToRelative(4f, -16.5f)
                quadToRelative(-8f, -24f, -28.5f, -40f)
                reflectiveQuadTo(600f, 280f)
                close()
            }
        }.build()
        
        return _Comedy_mask!!
    }

private var _Comedy_mask: ImageVector? = null

