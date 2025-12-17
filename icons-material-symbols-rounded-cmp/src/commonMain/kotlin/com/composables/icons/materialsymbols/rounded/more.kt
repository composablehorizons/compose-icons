package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.More: ImageVector
    get() {
        if (_More != null) return _More!!
        
        _More = ImageVector.Builder(
            name = "more",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 760f)
                quadToRelative(-20f, 0f, -37.5f, -9f)
                reflectiveQuadTo(294f, 726f)
                lineTo(153f, 526f)
                quadToRelative(-15f, -21f, -15f, -46f)
                reflectiveQuadToRelative(15f, -46f)
                lineToRelative(141f, -200f)
                quadToRelative(11f, -16f, 28.5f, -25f)
                reflectiveQuadToRelative(37.5f, -9f)
                horizontalLineToRelative(400f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 760f)
                horizontalLineTo(360f)
                close()
                moveToRelative(400f, -80f)
                verticalLineToRelative(-400f)
                verticalLineToRelative(400f)
                close()
                moveToRelative(-400f, 0f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-400f)
                horizontalLineTo(360f)
                lineTo(218f, 480f)
                lineToRelative(142f, 200f)
                close()
                moveToRelative(20f, -160f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(420f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(380f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(380f, 520f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(520f, 520f)
                close()
                moveToRelative(140f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(660f, 440f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(620f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(660f, 520f)
                close()
            }
        }.build()
        
        return _More!!
    }

private var _More: ImageVector? = null

