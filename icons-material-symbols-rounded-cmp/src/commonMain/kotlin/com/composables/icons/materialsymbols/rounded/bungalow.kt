package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Bungalow: ImageVector
    get() {
        if (_Bungalow != null) return _Bungalow!!
        
        _Bungalow = ImageVector.Builder(
            name = "bungalow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 800f)
                verticalLineToRelative(-208f)
                lineToRelative(-23f, 37f)
                quadToRelative(-9f, 14f, -25f, 17.5f)
                reflectiveQuadToRelative(-30f, -5.5f)
                quadToRelative(-14f, -9f, -18f, -25f)
                reflectiveQuadToRelative(5f, -30f)
                lineToRelative(257f, -412f)
                quadToRelative(6f, -10f, 15f, -14f)
                reflectiveQuadToRelative(19f, -4f)
                quadToRelative(10f, 0f, 19f, 4f)
                reflectiveQuadToRelative(15f, 14f)
                lineToRelative(257f, 412f)
                quadToRelative(9f, 14f, 5f, 30f)
                reflectiveQuadToRelative(-18f, 25f)
                quadToRelative(-14f, 9f, -30f, 5f)
                reflectiveQuadToRelative(-25f, -18f)
                lineToRelative(-23f, -36f)
                verticalLineToRelative(208f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 840f)
                horizontalLineTo(320f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-296f)
                lineTo(480f, 272f)
                lineTo(360f, 464f)
                verticalLineToRelative(296f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(240f)
                horizontalLineToRelative(-240f)
                close()
                moveToRelative(120f, -200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Bungalow!!
    }

private var _Bungalow: ImageVector? = null

