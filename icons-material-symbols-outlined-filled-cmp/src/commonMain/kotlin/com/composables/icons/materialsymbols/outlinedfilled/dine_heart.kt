package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Dine_heart: ImageVector
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
                moveTo(120f, 880f)
                verticalLineToRelative(-122f)
                quadToRelative(-18f, -5f, -30f, -19f)
                reflectiveQuadToRelative(-14f, -34f)
                lineTo(40f, 320f)
                horizontalLineToRelative(25f)
                quadToRelative(23f, 0f, 40.5f, 16f)
                reflectiveQuadToRelative(19.5f, 39f)
                lineToRelative(24f, 265f)
                horizontalLineToRelative(171f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 720f)
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
                reflectiveQuadTo(280f, 480f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 560f)
                horizontalLineTo(520f)
                verticalLineToRelative(320f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(640f, 640f)
                horizontalLineToRelative(172f)
                lineToRelative(24f, -265f)
                quadToRelative(2f, -23f, 19f, -39f)
                reflectiveQuadToRelative(40f, -16f)
                horizontalLineToRelative(25f)
                lineToRelative(-35f, 385f)
                quadToRelative(-2f, 20f, -14.5f, 34f)
                reflectiveQuadTo(840f, 758f)
                verticalLineToRelative(122f)
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

