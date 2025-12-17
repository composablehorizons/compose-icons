package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_dots: ImageVector
    get() {
        if (_Mobile_dots != null) return _Mobile_dots!!
        
        _Mobile_dots = ImageVector.Builder(
            name = "mobile_dots",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 520f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 520f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 520f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(560f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(520f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(560f, 520f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 520f)
                close()
                moveTo(40f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(204f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(484f)
                verticalLineToRelative(560f)
                horizontalLineTo(40f)
                close()
                moveToRelative(800f, -80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(120f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(720f)
                close()
                moveToRelative(-720f, 0f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
            }
        }.build()
        
        return _Mobile_dots!!
    }

private var _Mobile_dots: ImageVector? = null

