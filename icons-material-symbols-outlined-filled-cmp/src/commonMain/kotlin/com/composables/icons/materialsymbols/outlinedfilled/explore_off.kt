package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Explore_off: ImageVector
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
                moveTo(260f, 700f)
                lineToRelative(222f, -104f)
                lineToRelative(-120f, -120f)
                lineToRelative(-102f, 224f)
                close()
                moveToRelative(554f, 0f)
                lineTo(596f, 482f)
                lineToRelative(104f, -222f)
                lineToRelative(-222f, 104f)
                lineToRelative(-218f, -218f)
                quadToRelative(49f, -32f, 104.5f, -49f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 60f, -17f, 115.5f)
                reflectiveQuadTo(814f, 700f)
                close()
            }
        }.build()
        
        return _Explore_off!!
    }

private var _Explore_off: ImageVector? = null

