package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Reset_wrench: ImageVector
    get() {
        if (_Reset_wrench != null) return _Reset_wrench!!
        
        _Reset_wrench = ImageVector.Builder(
            name = "reset_wrench",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(653f, 752f)
                lineToRelative(-88f, 88f)
                lineToRelative(-85f, -85f)
                lineToRelative(88f, -88f)
                quadToRelative(-4f, -11f, -6f, -23f)
                reflectiveQuadToRelative(-2f, -24f)
                quadToRelative(0f, -58f, 41f, -99f)
                reflectiveQuadToRelative(99f, -41f)
                quadToRelative(18f, 0f, 35f, 4.5f)
                reflectiveQuadToRelative(32f, 12.5f)
                lineToRelative(-95f, 95f)
                lineToRelative(56f, 56f)
                lineToRelative(95f, -94f)
                quadToRelative(8f, 15f, 12.5f, 31.5f)
                reflectiveQuadTo(840f, 620f)
                quadToRelative(0f, 58f, -41f, 99f)
                reflectiveQuadToRelative(-99f, 41f)
                quadToRelative(-13f, 0f, -24.5f, -2f)
                reflectiveQuadToRelative(-22.5f, -6f)
                close()
                moveToRelative(178f, -352f)
                horizontalLineToRelative(-83f)
                quadToRelative(-26f, -88f, -99f, -144f)
                reflectiveQuadToRelative(-169f, -56f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 72f, 32.5f, 132f)
                reflectiveQuadToRelative(87.5f, 98f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(94f)
                quadToRelative(-62f, -50f, -98f, -122.5f)
                reflectiveQuadTo(120f, 480f)
                quadToRelative(0f, -75f, 28.5f, -140.5f)
                reflectiveQuadToRelative(77f, -114f)
                quadToRelative(48.5f, -48.5f, 114f, -77f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(129f, 0f, 226.5f, 79.5f)
                reflectiveQuadTo(831f, 400f)
                close()
            }
        }.build()
        
        return _Reset_wrench!!
    }

private var _Reset_wrench: ImageVector? = null

