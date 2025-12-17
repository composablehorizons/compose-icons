package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Speed_0_7x: ImageVector
    get() {
        if (_Speed_0_7x != null) return _Speed_0_7x!!
        
        _Speed_0_7x = ImageVector.Builder(
            name = "speed_0_7x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 547f)
                lineToRelative(-70f, 116f)
                quadToRelative(-5f, 8f, -12.5f, 12.5f)
                reflectiveQuadTo(581f, 680f)
                quadToRelative(-20f, 0f, -30.5f, -17.5f)
                reflectiveQuadToRelative(0.5f, -34.5f)
                lineToRelative(89f, -148f)
                lineToRelative(-89f, -148f)
                quadToRelative(-11f, -17f, -0.5f, -34.5f)
                reflectiveQuadTo(581f, 280f)
                quadToRelative(9f, 0f, 16.5f, 4.5f)
                reflectiveQuadTo(610f, 297f)
                lineToRelative(70f, 116f)
                lineToRelative(70f, -116f)
                quadToRelative(5f, -8f, 12.5f, -12.5f)
                reflectiveQuadTo(779f, 280f)
                quadToRelative(20f, 0f, 30.5f, 17.5f)
                reflectiveQuadTo(809f, 332f)
                lineToRelative(-89f, 148f)
                lineToRelative(89f, 148f)
                quadToRelative(11f, 17f, 0.5f, 34.5f)
                reflectiveQuadTo(779f, 680f)
                quadToRelative(-9f, 0f, -16.5f, -4.5f)
                reflectiveQuadTo(750f, 663f)
                lineToRelative(-70f, -116f)
                close()
                moveTo(370f, 680f)
                quadToRelative(-19f, 0f, -31f, -15f)
                reflectiveQuadToRelative(-7f, -33f)
                lineToRelative(68f, -272f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 280f)
                horizontalLineToRelative(130f)
                quadToRelative(29f, 0f, 49.5f, 21.5f)
                reflectiveQuadTo(480f, 352f)
                lineToRelative(-2f, 18f)
                lineToRelative(-71f, 281f)
                quadToRelative(-3f, 13f, -13f, 21f)
                reflectiveQuadToRelative(-24f, 8f)
                close()
                moveToRelative(-170f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 680f)
                close()
            }
        }.build()
        
        return _Speed_0_7x!!
    }

private var _Speed_0_7x: ImageVector? = null

