package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Motion_photos_off: ImageVector
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
                moveTo(791f, 905f)
                lineToRelative(-91f, -91f)
                quadToRelative(-49f, 32f, -104.5f, 49f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -60f, 17f, -115.5f)
                reflectiveQuadTo(146f, 260f)
                lineToRelative(-91f, -91f)
                lineToRelative(57f, -57f)
                lineToRelative(736f, 736f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(480f, 800f)
                quadToRelative(43f, 0f, 83.5f, -11f)
                reflectiveQuadToRelative(78.5f, -33f)
                lineTo(204f, 318f)
                quadToRelative(-22f, 38f, -33f, 78.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(334f, -100f)
                lineToRelative(-58f, -58f)
                quadToRelative(22f, -38f, 33f, -78.5f)
                reflectiveQuadToRelative(11f, -83.5f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-43f, 0f, -83.5f, 11f)
                reflectiveQuadTo(318f, 204f)
                lineToRelative(-58f, -58f)
                quadToRelative(49f, -32f, 104.5f, -49f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 60f, -17f, 115.5f)
                reflectiveQuadTo(814f, 700f)
                close()
                moveTo(537f, 423f)
                close()
                moveTo(423f, 537f)
                close()
            }
        }.build()
        
        return _Motion_photos_off!!
    }

private var _Motion_photos_off: ImageVector? = null

