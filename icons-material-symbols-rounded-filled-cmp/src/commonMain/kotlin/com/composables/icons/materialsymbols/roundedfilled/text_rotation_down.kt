package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_rotation_down: ImageVector
    get() {
        if (_Text_rotation_down != null) return _Text_rotation_down!!
        
        _Text_rotation_down = ImageVector.Builder(
            name = "text_rotation_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 688f)
                lineToRelative(14f, -14f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-82f, 82f)
                quadToRelative(-12f, 12f, -28f, 11.5f)
                reflectiveQuadTo(212f, 812f)
                lineToRelative(-83f, -81f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(130f, 674f)
                quadToRelative(12f, -11f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(14f, 14f)
                verticalLineToRelative(-488f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(488f)
                close()
                moveToRelative(232f, -118f)
                verticalLineToRelative(-178f)
                lineToRelative(-89f, -32f)
                quadToRelative(-11f, -4f, -17f, -13f)
                reflectiveQuadToRelative(-6f, -20f)
                quadToRelative(0f, -19f, 15.5f, -29.5f)
                reflectiveQuadTo(448f, 294f)
                lineToRelative(368f, 137f)
                quadToRelative(11f, 4f, 17.5f, 13.5f)
                reflectiveQuadTo(840f, 466f)
                verticalLineToRelative(28f)
                quadToRelative(0f, 12f, -6.5f, 21.5f)
                reflectiveQuadTo(816f, 529f)
                lineTo(447f, 666f)
                quadToRelative(-17f, 6f, -32f, -4f)
                reflectiveQuadToRelative(-15f, -28f)
                quadToRelative(0f, -11f, 6.5f, -20.5f)
                reflectiveQuadTo(424f, 600f)
                lineToRelative(88f, -30f)
                close()
                moveToRelative(64f, -24f)
                lineToRelative(182f, -64f)
                verticalLineToRelative(-4f)
                lineToRelative(-182f, -64f)
                verticalLineToRelative(132f)
                close()
            }
        }.build()
        
        return _Text_rotation_down!!
    }

private var _Text_rotation_down: ImageVector? = null

