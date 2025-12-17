package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Reset_white_balance: ImageVector
    get() {
        if (_Reset_white_balance != null) return _Reset_white_balance!!
        
        _Reset_white_balance = ImageVector.Builder(
            name = "reset_white_balance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 880f)
                quadToRelative(-51f, 0f, -85.5f, -34.5f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(0f, -26f, 10.5f, -48.5f)
                reflectiveQuadTo(520f, 672f)
                verticalLineToRelative(-112f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 560f)
                verticalLineToRelative(112f)
                quadToRelative(18f, 17f, 29f, 39.5f)
                reflectiveQuadToRelative(11f, 48.5f)
                quadToRelative(0f, 51f, -35f, 85.5f)
                reflectiveQuadTo(600f, 880f)
                close()
                moveToRelative(-60f, -120f)
                horizontalLineToRelative(120f)
                quadToRelative(0f, -23f, -12.5f, -35.5f)
                reflectiveQuadTo(620f, 698f)
                verticalLineToRelative(-138f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(138f)
                quadToRelative(-16f, 14f, -28f, 26.5f)
                reflectiveQuadTo(540f, 760f)
                close()
                moveToRelative(180f, -100f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(60f)
                horizontalLineTo(720f)
                close()
                moveToRelative(0f, -100f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(60f)
                horizontalLineTo(720f)
                close()
                moveToRelative(111f, -160f)
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
        
        return _Reset_white_balance!!
    }

private var _Reset_white_balance: ImageVector? = null

