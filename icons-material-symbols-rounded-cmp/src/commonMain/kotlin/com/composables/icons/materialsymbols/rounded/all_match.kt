package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.All_match: ImageVector
    get() {
        if (_All_match != null) return _All_match!!
        
        _All_match = ImageVector.Builder(
            name = "all_match",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(490f, 480f)
                close()
                moveTo(193f, 760f)
                quadToRelative(-24f, 0f, -35f, -21f)
                reflectiveQuadToRelative(2f, -41f)
                lineToRelative(140f, -218f)
                lineToRelative(-140f, -218f)
                quadToRelative(-13f, -20f, -2f, -41f)
                reflectiveQuadToRelative(35f, -21f)
                horizontalLineToRelative(407f)
                quadToRelative(20f, 0f, 37.5f, 9f)
                reflectiveQuadToRelative(28.5f, 25f)
                lineToRelative(104f, 147f)
                quadToRelative(11f, 17f, 7f, 31.5f)
                reflectiveQuadTo(761f, 436f)
                quadToRelative(-12f, 9f, -28f, 8.5f)
                reflectiveQuadTo(705f, 427f)
                lineTo(600f, 280f)
                horizontalLineTo(266f)
                lineToRelative(102f, 156f)
                quadToRelative(13f, 20f, 13f, 44f)
                reflectiveQuadToRelative(-13f, 44f)
                lineTo(266f, 680f)
                horizontalLineToRelative(137f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(443f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(403f, 760f)
                horizontalLineTo(193f)
                close()
                moveToRelative(498f, -35f)
                lineToRelative(-17f, -17f)
                quadToRelative(-9f, -9f, -21.5f, -9f)
                reflectiveQuadToRelative(-21.5f, 9f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(39f, 39f)
                quadToRelative(9f, 9f, 21f, 9f)
                reflectiveQuadToRelative(21f, -9f)
                lineToRelative(97f, -95f)
                quadToRelative(9f, -9f, 9f, -21.5f)
                reflectiveQuadToRelative(-9f, -21.5f)
                quadToRelative(-9f, -9f, -21.5f, -9f)
                reflectiveQuadToRelative(-21.5f, 9f)
                lineToRelative(-75f, 74f)
                close()
                moveToRelative(29f, 195f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
            }
        }.build()
        
        return _All_match!!
    }

private var _All_match: ImageVector? = null

