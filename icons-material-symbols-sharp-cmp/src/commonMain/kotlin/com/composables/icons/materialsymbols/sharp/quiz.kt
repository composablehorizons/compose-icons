package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Quiz: ImageVector
    get() {
        if (_Quiz != null) return _Quiz!!
        
        _Quiz = ImageVector.Builder(
            name = "quiz",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 600f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(602f, 558f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(560f, 516f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(518f, 558f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(560f, 600f)
                close()
                moveToRelative(-30f, -128f)
                horizontalLineToRelative(60f)
                quadToRelative(0f, -29f, 6f, -42.5f)
                reflectiveQuadToRelative(28f, -35.5f)
                quadToRelative(30f, -30f, 40f, -48.5f)
                reflectiveQuadToRelative(10f, -43.5f)
                quadToRelative(0f, -45f, -31.5f, -73.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(-41f, 0f, -71.5f, 23f)
                reflectiveQuadTo(446f, 284f)
                lineToRelative(54f, 22f)
                quadToRelative(9f, -25f, 24.5f, -37.5f)
                reflectiveQuadTo(560f, 256f)
                quadToRelative(24f, 0f, 39f, 13.5f)
                reflectiveQuadToRelative(15f, 36.5f)
                quadToRelative(0f, 14f, -8f, 26.5f)
                reflectiveQuadTo(578f, 364f)
                quadToRelative(-33f, 29f, -40.5f, 45.5f)
                reflectiveQuadTo(530f, 472f)
                close()
                moveTo(240f, 720f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(640f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveTo(80f, 880f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(80f)
                horizontalLineTo(80f)
                close()
                moveToRelative(240f, -720f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

