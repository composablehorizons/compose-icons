package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Takeout_dining_2: ImageVector
    get() {
        if (_Takeout_dining_2 != null) return _Takeout_dining_2!!
        
        _Takeout_dining_2 = ImageVector.Builder(
            name = "takeout_dining_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                lineToRelative(162f, -650f)
                lineToRelative(-2f, -28f)
                quadToRelative(-1f, -17f, -12f, -29.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(442f)
                quadToRelative(48f, 0f, 82.5f, 32.5f)
                reflectiveQuadTo(802f, 193f)
                lineToRelative(38f, 687f)
                horizontalLineTo(120f)
                close()
                moveToRelative(104f, -80f)
                horizontalLineToRelative(93f)
                lineToRelative(-19f, -304f)
                lineToRelative(-74f, 304f)
                close()
                moveToRelative(174f, 0f)
                horizontalLineToRelative(358f)
                lineToRelative(-34f, -602f)
                quadToRelative(-1f, -16f, -12.5f, -27f)
                reflectiveQuadTo(682f, 160f)
                horizontalLineTo(353f)
                quadToRelative(4f, 10f, 5f, 19.5f)
                reflectiveQuadToRelative(2f, 20.5f)
                lineToRelative(38f, 600f)
                close()
                moveToRelative(122f, -80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-160f)
                quadToRelative(26f, -6f, 43f, -27.5f)
                reflectiveQuadToRelative(17f, -49.5f)
                verticalLineToRelative(-163f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(151f)
                horizontalLineToRelative(-30f)
                verticalLineToRelative(-151f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(163f)
                quadToRelative(0f, 28f, 17f, 49.5f)
                reflectiveQuadToRelative(43f, 27.5f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(-122f, 80f)
                horizontalLineToRelative(358f)
                horizontalLineToRelative(-358f)
                close()
            }
        }.build()
        
        return _Takeout_dining_2!!
    }

private var _Takeout_dining_2: ImageVector? = null

