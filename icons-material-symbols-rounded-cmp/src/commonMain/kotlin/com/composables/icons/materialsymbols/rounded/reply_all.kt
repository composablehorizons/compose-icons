package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Reply_all: ImageVector
    get() {
        if (_Reply_all != null) return _Reply_all!!
        
        _Reply_all = ImageVector.Builder(
            name = "reply_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(193f, 440f)
                lineToRelative(156f, 156f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(348f, 652f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(292f, 652f)
                lineTo(108f, 468f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadTo(97f, 440f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(348f, 285f)
                lineTo(193f, 440f)
                close()
                moveToRelative(240f, 40f)
                lineToRelative(116f, 116f)
                quadToRelative(12f, 12f, 11.5f, 28f)
                reflectiveQuadTo(548f, 652f)
                quadToRelative(-12f, 11f, -28f, 11.5f)
                reflectiveQuadTo(492f, 652f)
                lineTo(308f, 468f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(548f, 285f)
                lineTo(433f, 400f)
                horizontalLineToRelative(247f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 600f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 760f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 720f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(433f)
                close()
            }
        }.build()
        
        return _Reply_all!!
    }

private var _Reply_all: ImageVector? = null

