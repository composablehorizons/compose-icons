package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Tab_new_right: ImageVector
    get() {
        if (_Tab_new_right != null) return _Tab_new_right!!
        
        _Tab_new_right = ImageVector.Builder(
            name = "tab_new_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(767f, 800f)
                horizontalLineTo(640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                horizontalLineToRelative(127f)
                lineToRelative(-36f, -36f)
                quadToRelative(-11f, -11f, -11f, -27.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(104f, 104f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(788f, 892f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(732f, 892f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(35f, -36f)
                close()
                moveTo(440f, 520f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 640f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 440f)
                horizontalLineTo(520f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                verticalLineToRelative(120f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(120f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(286f)
                quadToRelative(0f, 18f, -14f, 29.5f)
                reflectiveQuadToRelative(-32f, 7.5f)
                quadToRelative(-57f, -8f, -110f, 9f)
                reflectiveQuadToRelative(-94f, 58f)
                quadToRelative(-40f, 40f, -58f, 94f)
                reflectiveQuadToRelative(-10f, 110f)
                quadToRelative(2f, 18f, -8.5f, 32f)
                reflectiveQuadTo(486f, 840f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Tab_new_right!!
    }

private var _Tab_new_right: ImageVector? = null

