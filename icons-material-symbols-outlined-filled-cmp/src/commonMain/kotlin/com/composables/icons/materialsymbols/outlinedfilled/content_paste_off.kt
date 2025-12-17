package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Content_paste_off: ImageVector
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
                moveTo(840f, 726f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-446f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineTo(434f)
                lineTo(234f, 120f)
                horizontalLineToRelative(133f)
                quadToRelative(11f, -35f, 43f, -57.5f)
                reflectiveQuadToRelative(70f, -22.5f)
                quadToRelative(40f, 0f, 71.5f, 22.5f)
                reflectiveQuadTo(594f, 120f)
                horizontalLineToRelative(166f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(526f)
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
                lineToRelative(-65f, -65f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                lineToRelative(-65f, -65f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Content_paste_off!!
    }

private var _Content_paste_off: ImageVector? = null

