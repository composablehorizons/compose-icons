package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Format_strikethrough: ImageVector
    get() {
        if (_Format_strikethrough != null) return _Format_strikethrough!!
        
        _Format_strikethrough = ImageVector.Builder(
            name = "format_strikethrough",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 480f)
                horizontalLineToRelative(720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(300f, -160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(260f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(200f, 220f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(260f, 160f)
                horizontalLineToRelative(440f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(760f, 220f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(700f, 280f)
                horizontalLineTo(540f)
                verticalLineToRelative(120f)
                horizontalLineTo(420f)
                close()
                moveToRelative(0f, 240f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(100f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(480f, 800f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(420f, 740f)
                verticalLineToRelative(-100f)
                close()
            }
        }.build()
        
        return _Format_strikethrough!!
    }

private var _Format_strikethrough: ImageVector? = null

