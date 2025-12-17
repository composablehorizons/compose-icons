package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Cookie_off: ImageVector
    get() {
        if (_Cookie_off != null) return _Cookie_off!!
        
        _Cookie_off = ImageVector.Builder(
            name = "cookie_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 600f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 540f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(340f, 480f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(280f, 540f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(340f, 600f)
                close()
                moveTo(819f, 932f)
                lineTo(701f, 814f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveToRelative(-4f, -232f)
                lineTo(260f, 145f)
                quadToRelative(61f, -42f, 137.5f, -58.5f)
                reflectiveQuadTo(563f, 88f)
                quadToRelative(-9f, 45f, 6f, 84.5f)
                reflectiveQuadToRelative(45f, 66.5f)
                quadToRelative(30f, 27f, 71f, 37f)
                reflectiveQuadToRelative(86f, -5f)
                quadToRelative(-31f, 69f, 11f, 118f)
                reflectiveQuadToRelative(96f, 51f)
                quadToRelative(8f, 72f, -9.5f, 138f)
                reflectiveQuadTo(815f, 700f)
                close()
            }
        }.build()
        
        return _Cookie_off!!
    }

private var _Cookie_off: ImageVector? = null

