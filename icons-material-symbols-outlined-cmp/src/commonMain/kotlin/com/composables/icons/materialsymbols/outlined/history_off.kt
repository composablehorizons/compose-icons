package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.History_off: ImageVector
    get() {
        if (_History_off != null) return _History_off!!
        
        _History_off = ImageVector.Builder(
            name = "history_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(785f, 671f)
                lineToRelative(-58f, -58f)
                quadToRelative(16f, -29f, 24.5f, -63f)
                reflectiveQuadToRelative(8.5f, -70f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-35f, 0f, -68.5f, 8.5f)
                reflectiveQuadTo(348f, 234f)
                lineToRelative(-59f, -59f)
                quadToRelative(43f, -26f, 91.5f, -40.5f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 480f)
                quadToRelative(0f, 53f, -14.5f, 101f)
                reflectiveQuadTo(785f, 671f)
                close()
                moveTo(520f, 406f)
                lineToRelative(-80f, -80f)
                verticalLineToRelative(-46f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(126f)
                close()
                moveTo(792f, 904f)
                lineTo(672f, 784f)
                quadToRelative(-42f, 26f, -90f, 41f)
                reflectiveQuadToRelative(-102f, 15f)
                quadToRelative(-138f, 0f, -240.5f, -91.5f)
                reflectiveQuadTo(122f, 520f)
                horizontalLineToRelative(82f)
                quadToRelative(14f, 104f, 92.5f, 172f)
                reflectiveQuadTo(480f, 760f)
                quadToRelative(37f, 0f, 70.5f, -8.5f)
                reflectiveQuadTo(614f, 726f)
                lineTo(288f, 400f)
                horizontalLineTo(120f)
                verticalLineToRelative(-168f)
                lineToRelative(-64f, -64f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _History_off!!
    }

private var _History_off: ImageVector? = null

