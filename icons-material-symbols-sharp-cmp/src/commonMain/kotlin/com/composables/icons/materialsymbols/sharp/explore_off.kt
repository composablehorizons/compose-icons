package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Explore_off: ImageVector
    get() {
        if (_Explore_off != null) return _Explore_off!!
        
        _Explore_off = ImageVector.Builder(
            name = "explore_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(596f, 482f)
                lineTo(478f, 364f)
                lineToRelative(222f, -104f)
                lineToRelative(-104f, 222f)
                close()
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
                moveToRelative(23f, -205f)
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
                moveToRelative(57f, 263f)
                quadToRelative(43f, 0f, 83.5f, -11f)
                reflectiveQuadToRelative(78.5f, -33f)
                lineTo(482f, 596f)
                lineTo(260f, 700f)
                lineToRelative(102f, -224f)
                lineToRelative(-158f, -158f)
                quadToRelative(-22f, 38f, -33f, 78.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

