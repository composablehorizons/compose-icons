package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Motion_photos_off: ImageVector
    get() {
        if (_Motion_photos_off != null) return _Motion_photos_off!!
        
        _Motion_photos_off = ImageVector.Builder(
            name = "motion_photos_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(763f, 876f)
                lineToRelative(-63f, -62f)
                quadToRelative(-49f, 32f, -104.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -60f, 17f, -115.5f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-63f, -63f)
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
                moveToRelative(4f, -223f)
                lineTo(307f, 193f)
                quadToRelative(-18f, -18f, -14.5f, -43f)
                reflectiveQuadToRelative(26.5f, -36f)
                quadToRelative(38f, -17f, 78.5f, -25.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 42f, -8.5f, 82.5f)
                reflectiveQuadTo(846f, 641f)
                quadToRelative(-11f, 23f, -35.5f, 27f)
                reflectiveQuadTo(767f, 653f)
                close()
            }
        }.build()
        
        return _Motion_photos_off!!
    }

private var _Motion_photos_off: ImageVector? = null

