package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Woman: ImageVector
    get() {
        if (_Woman != null) return _Woman!!
        
        _Woman = ImageVector.Builder(
            name = "woman",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-61f)
                quadToRelative(-21f, 0f, -33f, -17.5f)
                reflectiveQuadToRelative(-4f, -37.5f)
                lineToRelative(100f, -253f)
                quadToRelative(10f, -24f, 31f, -38f)
                reflectiveQuadToRelative(47f, -14f)
                quadToRelative(26f, 0f, 47f, 14f)
                reflectiveQuadToRelative(31f, 38f)
                lineToRelative(100f, 253f)
                quadToRelative(8f, 20f, -4f, 37.5f)
                reflectiveQuadTo(621f, 640f)
                horizontalLineToRelative(-61f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 880f)
                horizontalLineToRelative(-80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(400f, 840f)
                close()
                moveToRelative(80f, -600f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Woman!!
    }

private var _Woman: ImageVector? = null

