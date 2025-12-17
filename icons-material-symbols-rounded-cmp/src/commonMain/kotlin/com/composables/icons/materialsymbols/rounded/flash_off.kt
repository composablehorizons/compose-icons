package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Flash_off: ImageVector
    get() {
        if (_Flash_off != null) return _Flash_off!!
        
        _Flash_off = ImageVector.Builder(
            name = "flash_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(657f, 160f)
                lineToRelative(-57f, 200f)
                horizontalLineToRelative(45f)
                quadToRelative(36f, 0f, 53.5f, 32f)
                reflectiveQuadToRelative(-3.5f, 62f)
                lineToRelative(-25f, 36f)
                quadToRelative(-11f, 15f, -29f, 17f)
                reflectiveQuadToRelative(-32f, -12f)
                quadToRelative(-10f, -10f, -11.5f, -24f)
                reflectiveQuadToRelative(6.5f, -26f)
                lineToRelative(4f, -5f)
                horizontalLineToRelative(-61f)
                quadToRelative(-20f, 0f, -32f, -15.5f)
                reflectiveQuadToRelative(-7f, -35.5f)
                lineToRelative(66f, -229f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(274f)
                quadToRelative(32f, 0f, 51.5f, 25f)
                reflectiveQuadToRelative(11.5f, 55f)
                close()
                moveTo(763f, 876f)
                lineTo(550f, 664f)
                lineToRelative(-95f, 137f)
                quadToRelative(-6f, 9f, -15.5f, 12f)
                reflectiveQuadToRelative(-18.5f, 0f)
                quadToRelative(-9f, -3f, -15f, -10.5f)
                reflectiveQuadToRelative(-6f, -18.5f)
                verticalLineToRelative(-224f)
                horizontalLineToRelative(-40f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 480f)
                verticalLineToRelative(-86f)
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
                moveTo(444f, 316f)
                close()
            }
        }.build()
        
        return _Flash_off!!
    }

private var _Flash_off: ImageVector? = null

