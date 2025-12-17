package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Local_bar: ImageVector
    get() {
        if (_Local_bar != null) return _Local_bar!!
        
        _Local_bar = ImageVector.Builder(
            name = "local_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 760f)
                verticalLineToRelative(-200f)
                lineTo(138f, 220f)
                quadToRelative(-8f, -8f, -13f, -18.5f)
                reflectiveQuadToRelative(-5f, -21.5f)
                quadToRelative(0f, -26f, 18f, -43f)
                reflectiveQuadToRelative(44f, -17f)
                horizontalLineToRelative(596f)
                quadToRelative(26f, 0f, 44f, 17f)
                reflectiveQuadToRelative(18f, 43f)
                quadToRelative(0f, 11f, -5f, 21.5f)
                reflectiveQuadTo(822f, 220f)
                lineTo(520f, 560f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 840f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 800f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 760f)
                horizontalLineToRelative(160f)
                close()
                moveTo(298f, 280f)
                horizontalLineToRelative(364f)
                lineToRelative(72f, -80f)
                horizontalLineTo(226f)
                lineToRelative(72f, 80f)
                close()
                moveToRelative(182f, 204f)
                lineToRelative(111f, -124f)
                horizontalLineTo(369f)
                lineToRelative(111f, 124f)
                close()
                moveToRelative(0f, 0f)
                close()
            }
        }.build()
        
        return _Local_bar!!
    }

private var _Local_bar: ImageVector? = null

