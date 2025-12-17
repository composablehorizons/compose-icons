package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Filter_list_off: ImageVector
    get() {
        if (_Filter_list_off != null) return _Filter_list_off!!
        
        _Filter_list_off = ImageVector.Builder(
            name = "filter_list_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineTo(83f, 197f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(83f, 140f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(680f, 680f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(763f, 876f)
                close()
                moveTo(650f, 520f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(609f, 480f)
                quadToRelative(0f, -16f, 11.5f, -28f)
                reflectiveQuadToRelative(29.5f, -12f)
                horizontalLineToRelative(30f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 520f)
                horizontalLineToRelative(-30f)
                close()
                moveTo(450f, 320f)
                quadToRelative(-17f, 0f, -29f, -11.5f)
                reflectiveQuadTo(409f, 280f)
                quadToRelative(0f, -16f, 11.5f, -28f)
                reflectiveQuadToRelative(29.5f, -12f)
                horizontalLineToRelative(350f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 280f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 320f)
                horizontalLineTo(450f)
                close()
                moveToRelative(-10f, 400f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(440f, 640f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 720f)
                horizontalLineToRelative(-80f)
                close()
                moveTo(280f, 520f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(126f)
                verticalLineToRelative(80f)
                horizontalLineTo(280f)
                close()
                moveTo(160f, 320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 240f)
                horizontalLineToRelative(46f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-46f)
                close()
            }
        }.build()
        
        return _Filter_list_off!!
    }

private var _Filter_list_off: ImageVector? = null

