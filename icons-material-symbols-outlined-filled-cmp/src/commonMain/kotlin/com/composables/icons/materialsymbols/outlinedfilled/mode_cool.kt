package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mode_cool: ImageVector
    get() {
        if (_Mode_cool != null) return _Mode_cool!!
        
        _Mode_cool = ImageVector.Builder(
            name = "mode_cool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 714f)
                lineTo(337f, 815f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(282f, 814f)
                quadToRelative(-12f, -11f, -12f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(158f, -158f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                lineTo(201f, 679f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(145f, 678f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(11f, -27.5f)
                lineToRelative(101f, -103f)
                horizontalLineTo(119f)
                quadToRelative(-17f, 0f, -28f, -11.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 440f)
                horizontalLineToRelative(126f)
                lineTo(145f, 338f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                lineToRelative(158f, 158f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                lineTo(281f, 202f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(27.5f, 11f)
                lineToRelative(103f, 100f)
                verticalLineToRelative(-126f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                verticalLineToRelative(126f)
                lineToRelative(102f, -100f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(11f, 12f, 11f, 28.5f)
                reflectiveQuadTo(678f, 202f)
                lineTo(520f, 360f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                lineToRelative(158f, -158f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(814f, 338f)
                lineTo(714f, 440f)
                horizontalLineToRelative(126f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(714f)
                lineToRelative(100f, 103f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(814f, 678f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(758f, 678f)
                lineTo(600f, 520f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                lineToRelative(158f, 159f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(677f, 815f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(622f, 815f)
                lineTo(520f, 714f)
                verticalLineToRelative(127f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 840f)
                verticalLineToRelative(-126f)
                close()
            }
        }.build()
        
        return _Mode_cool!!
    }

private var _Mode_cool: ImageVector? = null

