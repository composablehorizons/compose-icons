package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Public_off: ImageVector
    get() {
        if (_Public_off != null) return _Public_off!!
        
        _Public_off = ImageVector.Builder(
            name = "public_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -62f, 17f, -117.5f)
                reflectiveQuadTo(146f, 259f)
                lineToRelative(-91f, -91f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadTo(55f, 111f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(736f, 736f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                quadToRelative(-12f, 12f, -28.5f, 12f)
                reflectiveQuadTo(791f, 903f)
                lineToRelative(-90f, -89f)
                quadToRelative(-48f, 32f, -103.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-40f, -82f)
                verticalLineToRelative(-78f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 640f)
                verticalLineToRelative(-40f)
                lineTo(168f, 408f)
                quadToRelative(-3f, 18f, -5.5f, 36f)
                reflectiveQuadToRelative(-2.5f, 36f)
                quadToRelative(0f, 121f, 79.5f, 212f)
                reflectiveQuadTo(440f, 798f)
                close()
                moveToRelative(440f, -318f)
                quadToRelative(0f, 45f, -10f, 86.5f)
                reflectiveQuadTo(843f, 646f)
                quadToRelative(-7f, 14f, -22.5f, 18.5f)
                reflectiveQuadTo(791f, 661f)
                quadToRelative(-14f, -8f, -19.5f, -24f)
                reflectiveQuadToRelative(1.5f, -31f)
                quadToRelative(13f, -30f, 20f, -61.5f)
                reflectiveQuadToRelative(7f, -64.5f)
                quadToRelative(0f, -98f, -54.5f, -179f)
                reflectiveQuadTo(600f, 184f)
                verticalLineToRelative(16f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(17f)
                quadToRelative(0f, 14f, -12f, 19f)
                reflectiveQuadToRelative(-22f, -5f)
                lineTo(308f, 193f)
                quadToRelative(-18f, -18f, -14.5f, -43f)
                reflectiveQuadToRelative(26.5f, -36f)
                quadToRelative(37f, -17f, 77f, -25.5f)
                reflectiveQuadToRelative(83f, -8.5f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                close()
            }
        }.build()
        
        return _Public_off!!
    }

private var _Public_off: ImageVector? = null

