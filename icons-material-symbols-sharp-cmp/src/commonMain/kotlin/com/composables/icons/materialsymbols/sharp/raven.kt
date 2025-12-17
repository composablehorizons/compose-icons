package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Raven: ImageVector
    get() {
        if (_Raven != null) return _Raven!!
        
        _Raven = ImageVector.Builder(
            name = "raven",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(334f, 880f)
                lineToRelative(-74f, -30f)
                lineToRelative(58f, -141f)
                quadToRelative(-106f, -28f, -172f, -114f)
                reflectiveQuadTo(80f, 400f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -66f, 47f, -113f)
                reflectiveQuadToRelative(113f, -47f)
                quadToRelative(22f, 0f, 42f, 7.5f)
                reflectiveQuadToRelative(40f, 15.5f)
                lineToRelative(238f, 97f)
                lineToRelative(-160f, 60f)
                verticalLineToRelative(60f)
                lineToRelative(440f, 280f)
                lineToRelative(40f, 200f)
                horizontalLineToRelative(-80f)
                lineToRelative(-40f, -80f)
                horizontalLineTo(560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-80f)
                lineTo(334f, 880f)
                close()
                moveToRelative(66f, -240f)
                horizontalLineToRelative(353f)
                lineToRelative(-63f, -40f)
                horizontalLineTo(400f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadToRelative(-47f, -113f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(400f, 520f)
                horizontalLineToRelative(165f)
                lineTo(320f, 364f)
                verticalLineToRelative(-124f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(160f, 240f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 100f, 70f, 170f)
                reflectiveQuadToRelative(170f, 70f)
                close()
                moveTo(240f, 280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 280f)
                close()
                moveToRelative(160f, 320f)
                close()
            }
        }.build()
        
        return _Raven!!
    }

private var _Raven: ImageVector? = null

