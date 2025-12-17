package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Box_edit: ImageVector
    get() {
        if (_Box_edit != null) return _Box_edit!!
        
        _Box_edit = ImageVector.Builder(
            name = "box_edit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-499f)
                quadToRelative(0f, -14f, 4.5f, -27f)
                reflectiveQuadToRelative(13.5f, -24f)
                lineToRelative(50f, -61f)
                quadToRelative(11f, -14f, 27.5f, -21.5f)
                reflectiveQuadTo(250f, 120f)
                horizontalLineToRelative(460f)
                quadToRelative(18f, 0f, 34.5f, 7.5f)
                reflectiveQuadTo(772f, 149f)
                lineToRelative(50f, 61f)
                quadToRelative(9f, 11f, 13.5f, 24f)
                reflectiveQuadToRelative(4.5f, 27f)
                verticalLineToRelative(111f)
                quadToRelative(0f, 12f, -8.5f, 20f)
                reflectiveQuadToRelative(-20.5f, 9f)
                quadToRelative(-25f, 2f, -46.5f, 11f)
                reflectiveQuadTo(725f, 440f)
                lineToRelative(-85f, 85f)
                verticalLineToRelative(-205f)
                horizontalLineTo(320f)
                verticalLineToRelative(255f)
                quadToRelative(0f, 23f, 19f, 34.5f)
                reflectiveQuadToRelative(39f, 1.5f)
                lineToRelative(102f, -51f)
                lineToRelative(83f, 42f)
                lineToRelative(-59f, 58f)
                quadToRelative(-11f, 11f, -17.5f, 26f)
                reflectiveQuadToRelative(-6.5f, 31f)
                verticalLineToRelative(83f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 840f)
                horizontalLineTo(200f)
                close()
                moveToRelative(360f, -40f)
                verticalLineToRelative(-66f)
                quadToRelative(0f, -8f, 3f, -15.5f)
                reflectiveQuadToRelative(9f, -13.5f)
                lineToRelative(209f, -208f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                quadToRelative(0f, 11f, -4f, 22.5f)
                reflectiveQuadTo(903f, 620f)
                lineTo(695f, 828f)
                quadToRelative(-6f, 6f, -13.5f, 9f)
                reflectiveQuadToRelative(-15.5f, 3f)
                horizontalLineToRelative(-66f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(560f, 800f)
                close()
                moveToRelative(263f, -184f)
                lineToRelative(37f, -39f)
                lineToRelative(-37f, -37f)
                lineToRelative(-38f, 38f)
                lineToRelative(38f, 38f)
                close()
                moveTo(216f, 240f)
                horizontalLineToRelative(528f)
                lineToRelative(-34f, -40f)
                horizontalLineTo(250f)
                lineToRelative(-34f, 40f)
                close()
            }
        }.build()
        
        return _Box_edit!!
    }

private var _Box_edit: ImageVector? = null

