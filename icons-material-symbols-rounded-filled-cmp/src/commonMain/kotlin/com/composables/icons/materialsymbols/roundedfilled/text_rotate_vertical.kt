package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_rotate_vertical: ImageVector
    get() {
        if (_Text_rotate_vertical != null) return _Text_rotate_vertical!!
        
        _Text_rotate_vertical = ImageVector.Builder(
            name = "text_rotate_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(552f, 528f)
                lineToRelative(-32f, 89f)
                quadToRelative(-4f, 11f, -13f, 17f)
                reflectiveQuadToRelative(-20f, 6f)
                quadToRelative(-19f, 0f, -29.5f, -15.5f)
                reflectiveQuadTo(454f, 592f)
                lineToRelative(137f, -368f)
                quadToRelative(4f, -11f, 13.5f, -17.5f)
                reflectiveQuadTo(626f, 200f)
                horizontalLineToRelative(28f)
                quadToRelative(12f, 0f, 21.5f, 6.5f)
                reflectiveQuadTo(689f, 224f)
                lineToRelative(137f, 369f)
                quadToRelative(7f, 17f, -3.5f, 32f)
                reflectiveQuadTo(793f, 640f)
                quadToRelative(-11f, 0f, -20f, -6.5f)
                reflectiveQuadTo(760f, 616f)
                lineToRelative(-32f, -88f)
                horizontalLineTo(552f)
                close()
                moveToRelative(22f, -64f)
                horizontalLineToRelative(132f)
                lineToRelative(-64f, -182f)
                horizontalLineToRelative(-4f)
                lineToRelative(-64f, 182f)
                close()
                moveTo(200f, 646f)
                verticalLineToRelative(-486f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 160f)
                verticalLineToRelative(486f)
                lineToRelative(16f, -15f)
                quadToRelative(12f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-84f, -84f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(11f, -11f, 27f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(16f, 15f)
                close()
            }
        }.build()
        
        return _Text_rotate_vertical!!
    }

private var _Text_rotate_vertical: ImageVector? = null

