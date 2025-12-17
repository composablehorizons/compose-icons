package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Contrast_rtl_off: ImageVector
    get() {
        if (_Contrast_rtl_off != null) return _Contrast_rtl_off!!
        
        _Contrast_rtl_off = ImageVector.Builder(
            name = "contrast_rtl_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -11.5f, -28.5f)
                reflectiveQuadTo(56f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(735f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                close()
                moveTo(480f, 800f)
                quadToRelative(45f, 0f, 85.5f, -12f)
                reflectiveQuadToRelative(76.5f, -33f)
                lineTo(480f, 593f)
                verticalLineToRelative(207f)
                close()
                moveToRelative(400f, -320f)
                quadToRelative(0f, 48f, -9.5f, 91f)
                reflectiveQuadTo(845f, 648f)
                quadToRelative(-7f, 15f, -23.5f, 19f)
                reflectiveQuadToRelative(-30.5f, -5f)
                quadToRelative(-14f, -8f, -19f, -24.5f)
                reflectiveQuadToRelative(2f, -31.5f)
                quadToRelative(13f, -29f, 19.5f, -60.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                verticalLineToRelative(157f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(308f, 193f)
                quadToRelative(-18f, -18f, -14.5f, -43.5f)
                reflectiveQuadTo(320f, 113f)
                quadToRelative(37f, -16f, 77f, -24.5f)
                reflectiveQuadToRelative(83f, -8.5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                close()
            }
        }.build()
        
        return _Contrast_rtl_off!!
    }

private var _Contrast_rtl_off: ImageVector? = null

