package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mode_heat_cool: ImageVector
    get() {
        if (_Mode_heat_cool != null) return _Mode_heat_cool!!
        
        _Mode_heat_cool = ImageVector.Builder(
            name = "mode_heat_cool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(217f, 642f)
                quadToRelative(-45f, -33f, -71f, -82.5f)
                reflectiveQuadTo(120f, 450f)
                quadToRelative(0f, -79f, 37.5f, -140.5f)
                reflectiveQuadTo(240f, 206f)
                quadToRelative(45f, -42f, 82.5f, -64f)
                lineToRelative(37.5f, -22f)
                verticalLineToRelative(99f)
                quadToRelative(0f, 25f, 18f, 42.5f)
                reflectiveQuadToRelative(43f, 17.5f)
                quadToRelative(14f, 0f, 26f, -6f)
                reflectiveQuadToRelative(20f, -17f)
                lineToRelative(13f, -16f)
                quadToRelative(38f, 21f, 65f, 53.5f)
                reflectiveQuadToRelative(41f, 72.5f)
                lineTo(483f, 469f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-114f, -112f)
                lineToRelative(-112f, 112f)
                quadToRelative(-22f, 22f, -35f, 50.5f)
                reflectiveQuadTo(200f, 571f)
                quadToRelative(0f, 20f, 4.5f, 37.5f)
                reflectiveQuadTo(217f, 642f)
                close()
                moveToRelative(98f, -5f)
                quadToRelative(-16f, -11f, -25.5f, -28.5f)
                reflectiveQuadTo(280f, 571f)
                quadToRelative(0f, -17f, 6.5f, -30f)
                reflectiveQuadToRelative(17.5f, -24f)
                lineToRelative(56f, -56f)
                lineToRelative(57f, 55f)
                quadToRelative(3f, 2f, 5f, 5f)
                reflectiveQuadToRelative(4f, 5f)
                lineTo(315f, 637f)
                close()
                moveTo(296f, 880f)
                lineToRelative(-56f, -56f)
                lineToRelative(544f, -544f)
                lineToRelative(56f, 56f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(144f)
                verticalLineToRelative(80f)
                horizontalLineTo(616f)
                lineToRelative(-20f, 20f)
                lineToRelative(60f, 60f)
                horizontalLineToRelative(184f)
                verticalLineToRelative(80f)
                horizontalLineTo(736f)
                lineToRelative(84f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -84f)
                verticalLineToRelative(104f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-184f)
                lineToRelative(-60f, -60f)
                lineToRelative(-20f, 20f)
                verticalLineToRelative(224f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-144f)
                lineTo(296f, 880f)
                close()
            }
        }.build()
        
        return _Mode_heat_cool!!
    }

private var _Mode_heat_cool: ImageVector? = null

