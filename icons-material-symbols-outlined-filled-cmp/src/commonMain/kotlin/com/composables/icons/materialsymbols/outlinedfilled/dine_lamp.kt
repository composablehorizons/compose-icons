package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dine_lamp: ImageVector
    get() {
        if (_Dine_lamp != null) return _Dine_lamp!!
        
        _Dine_lamp = ImageVector.Builder(
            name = "dine_lamp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-122f)
                quadToRelative(-18f, -5f, -30f, -19f)
                reflectiveQuadToRelative(-14f, -34f)
                lineTo(40f, 280f)
                horizontalLineToRelative(25f)
                quadToRelative(23f, 0f, 40.5f, 16f)
                reflectiveQuadToRelative(19.5f, 39f)
                lineToRelative(24f, 265f)
                horizontalLineToRelative(171f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 680f)
                verticalLineToRelative(40f)
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
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 520f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 360f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(40f)
                horizontalLineTo(280f)
                close()
                moveToRelative(320f, 480f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 600f)
                horizontalLineToRelative(172f)
                lineToRelative(24f, -265f)
                quadToRelative(2f, -23f, 19f, -39f)
                reflectiveQuadToRelative(40f, -16f)
                horizontalLineToRelative(25f)
                lineToRelative(-35f, 385f)
                quadToRelative(-2f, 20f, -14.5f, 34f)
                reflectiveQuadTo(840f, 718f)
                verticalLineToRelative(122f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-120f)
                horizontalLineTo(660f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-60f)
                close()
            }
        }.build()
        
        return _Dine_lamp!!
    }

private var _Dine_lamp: ImageVector? = null

