package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Dine_heart: ImageVector
    get() {
        if (_Dine_heart != null) return _Dine_heart!!
        
        _Dine_heart = ImageVector.Builder(
            name = "dine_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 440f)
                quadToRelative(-68f, -62f, -111f, -104.5f)
                reflectiveQuadTo(302f, 262f)
                quadToRelative(-24f, -31f, -33f, -54.5f)
                reflectiveQuadToRelative(-9f, -47.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(86f, -35f)
                quadToRelative(28f, 0f, 54f, 12.5f)
                reflectiveQuadToRelative(45f, 33.5f)
                quadToRelative(19f, -21f, 45f, -33.5f)
                reflectiveQuadToRelative(54f, -12.5f)
                quadToRelative(51f, 0f, 86f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 24f, -9f, 47.5f)
                reflectiveQuadTo(658f, 262f)
                quadToRelative(-24f, 31f, -67f, 73.5f)
                reflectiveQuadTo(480f, 440f)
                close()
                moveToRelative(0f, -108f)
                quadToRelative(72f, -66f, 106f, -107.5f)
                reflectiveQuadToRelative(34f, -64.5f)
                quadToRelative(0f, -17f, -12f, -28.5f)
                reflectiveQuadTo(579f, 120f)
                quadToRelative(-12f, 0f, -23.5f, 7f)
                reflectiveQuadTo(532f, 148f)
                lineToRelative(-51f, 59f)
                lineToRelative(-51f, -57f)
                quadToRelative(-14f, -16f, -25.5f, -23f)
                reflectiveQuadToRelative(-23.5f, -7f)
                quadToRelative(-17f, 0f, -29f, 11.5f)
                reflectiveQuadTo(340f, 160f)
                quadToRelative(0f, 23f, 34f, 64.5f)
                reflectiveQuadTo(480f, 332f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(120f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(81f)
                lineTo(40f, 320f)
                horizontalLineToRelative(80f)
                lineToRelative(29f, 320f)
                horizontalLineToRelative(251f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(180f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-320f)
                horizontalLineTo(200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(252f)
                lineToRelative(29f, -320f)
                horizontalLineToRelative(79f)
                lineToRelative(-40f, 440f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(660f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Dine_heart!!
    }

private var _Dine_heart: ImageVector? = null

