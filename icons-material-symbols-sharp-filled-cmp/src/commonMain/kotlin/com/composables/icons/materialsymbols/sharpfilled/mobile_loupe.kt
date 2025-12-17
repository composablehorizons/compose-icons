package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_loupe: ImageVector
    get() {
        if (_Mobile_loupe != null) return _Mobile_loupe!!
        
        _Mobile_loupe = ImageVector.Builder(
            name = "mobile_loupe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(296f)
                quadToRelative(-26f, -8f, -52f, -12f)
                reflectiveQuadToRelative(-53f, -4f)
                quadToRelative(-136f, 2f, -234.5f, 100f)
                reflectiveQuadTo(320f, 655f)
                quadToRelative(-2f, 91f, 31f, 149.5f)
                reflectiveQuadTo(447f, 920f)
                horizontalLineTo(200f)
                close()
                moveToRelative(460f, 0f)
                quadToRelative(-109f, 0f, -185.5f, -77.5f)
                reflectiveQuadTo(400f, 656f)
                quadToRelative(2f, -104f, 77f, -179f)
                reflectiveQuadToRelative(179f, -77f)
                quadToRelative(109f, -2f, 186.5f, 74.5f)
                reflectiveQuadTo(920f, 660f)
                verticalLineToRelative(260f)
                horizontalLineTo(660f)
                close()
                moveToRelative(-30f, -140f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(-85f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(85f)
                verticalLineToRelative(-90f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(85f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-85f)
                verticalLineToRelative(90f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(180f, 600f)
                quadToRelative(75f, 0f, 127.5f, -52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, -75f, -52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(-75f, 0f, -127.5f, 52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, 75f, 52.5f, 127.5f)
                reflectiveQuadTo(660f, 840f)
                close()
            }
        }.build()
        
        return _Mobile_loupe!!
    }

private var _Mobile_loupe: ImageVector? = null

