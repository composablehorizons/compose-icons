package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Report_off: ImageVector
    get() {
        if (_Report_off != null) return _Report_off!!
        
        _Report_off = ImageVector.Builder(
            name = "report_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(597f, 120f)
                quadToRelative(16f, 0f, 30.5f, 6f)
                reflectiveQuadToRelative(25.5f, 17f)
                lineToRelative(164f, 164f)
                quadToRelative(11f, 11f, 17f, 25.5f)
                reflectiveQuadToRelative(6f, 30.5f)
                verticalLineToRelative(237f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 600f)
                verticalLineToRelative(-236f)
                lineTo(596f, 200f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(320f, 160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(360f, 120f)
                horizontalLineToRelative(237f)
                close()
                moveToRelative(-77f, 288f)
                verticalLineToRelative(-88f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 320f)
                verticalLineToRelative(8f)
                lineToRelative(80f, 80f)
                close()
                moveTo(363f, 840f)
                quadToRelative(-16f, 0f, -30.5f, -6.5f)
                reflectiveQuadTo(307f, 816f)
                lineTo(143f, 651f)
                quadToRelative(-11f, -11f, -17f, -25.5f)
                reflectiveQuadToRelative(-6f, -30.5f)
                verticalLineToRelative(-232f)
                quadToRelative(0f, -16f, 6f, -30.5f)
                reflectiveQuadToRelative(17f, -25.5f)
                lineToRelative(25f, -25f)
                lineToRelative(-84f, -86f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(84f, 140f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(680f, 680f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineToRelative(-86f, -86f)
                lineToRelative(-24f, 25f)
                quadToRelative(-11f, 12f, -26f, 18.5f)
                reflectiveQuadToRelative(-32f, 6.5f)
                horizontalLineTo(363f)
                close()
                moveToRelative(173f, -416f)
                close()
                moveTo(364f, 760f)
                horizontalLineToRelative(232f)
                lineToRelative(26f, -26f)
                lineToRelative(-396f, -396f)
                lineToRelative(-26f, 26f)
                verticalLineToRelative(232f)
                lineToRelative(164f, 164f)
                close()
                moveToRelative(116f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 600f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(-56f, -144f)
                close()
            }
        }.build()
        
        return _Report_off!!
    }

private var _Report_off: ImageVector? = null

