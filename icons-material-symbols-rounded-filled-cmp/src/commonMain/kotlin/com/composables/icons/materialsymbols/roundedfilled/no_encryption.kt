package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.No_encryption: ImageVector
    get() {
        if (_No_encryption != null) return _No_encryption!!
        
        _No_encryption = ImageVector.Builder(
            name = "no_encryption",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(775f, 626f)
                quadToRelative(-11f, 5f, -22f, 3.5f)
                reflectiveQuadTo(732f, 618f)
                lineTo(502f, 388f)
                quadToRelative(-10f, -10f, -11.5f, -21f)
                reflectiveQuadToRelative(3.5f, -22f)
                quadToRelative(5f, -11f, 14f, -18f)
                reflectiveQuadToRelative(23f, -7f)
                horizontalLineToRelative(69f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, -34.5f, -85f)
                reflectiveQuadTo(481f, 120f)
                quadToRelative(-35f, 0f, -63f, 16.5f)
                reflectiveQuadTo(379f, 181f)
                quadToRelative(-7f, 17f, -22.5f, 23.5f)
                reflectiveQuadToRelative(-31.5f, 0.5f)
                quadToRelative(-17f, -6f, -24f, -21.5f)
                reflectiveQuadToRelative(-1f, -31.5f)
                quadToRelative(20f, -51f, 69f, -81.5f)
                reflectiveQuadTo(481f, 40f)
                quadToRelative(83f, 0f, 141f, 58.5f)
                reflectiveQuadTo(680f, 240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 400f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 14f, -7f, 23f)
                reflectiveQuadToRelative(-18f, 14f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -26f, 14.5f, -46.5f)
                reflectiveQuadTo(212f, 324f)
                lineTo(56f, 168f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(736f, 736f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-34f, -34f)
                quadToRelative(-9f, 5f, -18f, 7.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(184f, -342f)
                quadToRelative(-11f, 11f, -17f, 25.5f)
                reflectiveQuadToRelative(-6f, 31.5f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(481f, 675f)
                quadToRelative(17f, 0f, 31.5f, -6f)
                reflectiveQuadToRelative(25.5f, -17f)
                lineTo(424f, 538f)
                close()
            }
        }.build()
        
        return _No_encryption!!
    }

private var _No_encryption: ImageVector? = null

