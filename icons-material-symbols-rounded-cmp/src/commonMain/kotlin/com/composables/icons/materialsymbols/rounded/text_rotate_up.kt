package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Text_rotate_up: ImageVector
    get() {
        if (_Text_rotate_up != null) return _Text_rotate_up!!
        
        _Text_rotate_up = ImageVector.Builder(
            name = "text_rotate_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 272f)
                lineToRelative(-14f, 14f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(82f, -82f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 11.5f)
                lineToRelative(83f, 81f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(830f, 286f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(774f, 286f)
                lineToRelative(-14f, -14f)
                verticalLineToRelative(488f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 760f)
                verticalLineToRelative(-488f)
                close()
                moveTo(448f, 568f)
                lineToRelative(89f, 32f)
                quadToRelative(11f, 4f, 17f, 13f)
                reflectiveQuadToRelative(6f, 20f)
                quadToRelative(0f, 19f, -15.5f, 29.5f)
                reflectiveQuadTo(512f, 666f)
                lineTo(144f, 529f)
                quadToRelative(-11f, -4f, -17.5f, -13.5f)
                reflectiveQuadTo(120f, 494f)
                verticalLineToRelative(-28f)
                quadToRelative(0f, -12f, 6.5f, -21.5f)
                reflectiveQuadTo(144f, 431f)
                lineToRelative(369f, -137f)
                quadToRelative(17f, -6f, 32f, 4f)
                reflectiveQuadToRelative(15f, 28f)
                quadToRelative(0f, 11f, -6.5f, 20.5f)
                reflectiveQuadTo(536f, 360f)
                lineToRelative(-88f, 30f)
                verticalLineToRelative(178f)
                close()
                moveToRelative(-64f, -22f)
                verticalLineToRelative(-132f)
                lineToRelative(-182f, 64f)
                verticalLineToRelative(4f)
                lineToRelative(182f, 64f)
                close()
            }
        }.build()
        
        return _Text_rotate_up!!
    }

private var _Text_rotate_up: ImageVector? = null

