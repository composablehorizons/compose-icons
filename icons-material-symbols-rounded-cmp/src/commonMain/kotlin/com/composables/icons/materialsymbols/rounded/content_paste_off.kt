package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Content_paste_off: ImageVector
    get() {
        if (_Content_paste_off != null) return _Content_paste_off!!
        
        _Content_paste_off = ImageVector.Builder(
            name = "content_paste_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(800f, 680f)
                quadToRelative(-15f, 0f, -27.5f, -10.5f)
                reflectiveQuadTo(760f, 639f)
                verticalLineToRelative(-439f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 320f)
                horizontalLineTo(467f)
                quadToRelative(-16f, 0f, -30.5f, -6f)
                reflectiveQuadTo(411f, 297f)
                lineTo(302f, 188f)
                quadToRelative(-6f, -6f, -9f, -13f)
                reflectiveQuadToRelative(-3f, -15f)
                quadToRelative(0f, -16f, 11.5f, -28f)
                reflectiveQuadToRelative(29.5f, -12f)
                horizontalLineToRelative(36f)
                quadToRelative(11f, -35f, 43f, -57.5f)
                reflectiveQuadToRelative(70f, -22.5f)
                quadToRelative(40f, 0f, 71.5f, 22.5f)
                reflectiveQuadTo(594f, 120f)
                horizontalLineToRelative(166f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 20f, -12.5f, 30f)
                reflectiveQuadTo(800f, 680f)
                close()
                moveTo(480f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 160f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 160f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 200f)
                close()
                moveToRelative(166f, 560f)
                lineTo(200f, 314f)
                verticalLineToRelative(446f)
                horizontalLineToRelative(446f)
                close()
                moveToRelative(-446f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-526f)
                lineToRelative(-37f, -37f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                lineToRelative(-37f, -36f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Content_paste_off!!
    }

private var _Content_paste_off: ImageVector? = null

