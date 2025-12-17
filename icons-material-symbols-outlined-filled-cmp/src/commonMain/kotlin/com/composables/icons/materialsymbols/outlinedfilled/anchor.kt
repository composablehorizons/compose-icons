package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Anchor: ImageVector
    get() {
        if (_Anchor != null) return _Anchor!!
        
        _Anchor = ImageVector.Builder(
            name = "anchor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-61f, 0f, -125f, -22f)
                reflectiveQuadToRelative(-116f, -60f)
                quadToRelative(-52f, -38f, -85.5f, -89f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-120f)
                lineToRelative(160f, 120f)
                lineToRelative(-62f, 62f)
                quadToRelative(29f, 51f, 92f, 88f)
                reflectiveQuadToRelative(130f, 47f)
                verticalLineToRelative(-357f)
                horizontalLineTo(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-47f)
                quadToRelative(-35f, -13f, -57.5f, -43.5f)
                reflectiveQuadTo(360f, 200f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 39f, -22.5f, 69.5f)
                reflectiveQuadTo(520f, 313f)
                verticalLineToRelative(47f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(357f)
                quadToRelative(67f, -10f, 130f, -47f)
                reflectiveQuadToRelative(92f, -88f)
                lineToRelative(-62f, -62f)
                lineToRelative(160f, -120f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 58f, -33.5f, 109f)
                reflectiveQuadTo(721f, 798f)
                quadToRelative(-52f, 38f, -116f, 60f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -640f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Anchor!!
    }

private var _Anchor: ImageVector? = null

