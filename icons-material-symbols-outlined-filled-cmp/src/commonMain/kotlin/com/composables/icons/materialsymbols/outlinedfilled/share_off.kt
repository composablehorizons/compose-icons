package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Share_off: ImageVector
    get() {
        if (_Share_off != null) return _Share_off!!
        
        _Share_off = ImageVector.Builder(
            name = "share_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(240f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(40f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(240f, 520f)
                close()
                moveToRelative(0f, 228f)
                lineToRelative(70f, 71f)
                lineToRelative(29f, -28f)
                lineToRelative(-71f, -71f)
                lineToRelative(71f, -71f)
                lineToRelative(-28f, -28f)
                lineToRelative(-71f, 71f)
                lineToRelative(-71f, -71f)
                lineToRelative(-28f, 28f)
                lineToRelative(71f, 71f)
                lineToRelative(-71f, 71f)
                lineToRelative(28f, 28f)
                lineToRelative(71f, -71f)
                close()
                moveToRelative(480f, -428f)
                quadToRelative(-23f, 0f, -44f, -8.5f)
                reflectiveQuadTo(638f, 288f)
                lineTo(356f, 452f)
                quadToRelative(1f, 4f, 1.5f, 7.5f)
                reflectiveQuadToRelative(1.5f, 7.5f)
                quadToRelative(-27f, -13f, -57f, -20f)
                reflectiveQuadToRelative(-62f, -7f)
                quadToRelative(-32f, 0f, -62f, 7f)
                reflectiveQuadToRelative(-57f, 20f)
                quadToRelative(5f, -45f, 38.5f, -76f)
                reflectiveQuadToRelative(80.5f, -31f)
                quadToRelative(23f, 0f, 44f, 8.5f)
                reflectiveQuadToRelative(38f, 23.5f)
                lineToRelative(282f, -164f)
                quadToRelative(-2f, -6f, -3f, -13.5f)
                reflectiveQuadToRelative(-1f, -14.5f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, 560f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -7f, 1f, -14.5f)
                reflectiveQuadToRelative(3f, -13.5f)
                lineToRelative(-87f, -50f)
                quadToRelative(-4f, -27f, -12.5f, -52f)
                reflectiveQuadTo(483f, 582f)
                lineToRelative(155f, 90f)
                quadToRelative(17f, -15f, 38f, -23.5f)
                reflectiveQuadToRelative(44f, -8.5f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Share_off!!
    }

private var _Share_off: ImageVector? = null

