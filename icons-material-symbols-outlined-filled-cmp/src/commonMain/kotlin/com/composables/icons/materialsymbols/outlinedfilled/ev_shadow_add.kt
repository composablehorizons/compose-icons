package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Ev_shadow_add: ImageVector
    get() {
        if (_Ev_shadow_add != null) return _Ev_shadow_add!!
        
        _Ev_shadow_add = ImageVector.Builder(
            name = "ev_shadow_add",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 880f)
                verticalLineToRelative(-120f)
                horizontalLineTo(560f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-200f, 0f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 15f, -1f, 29f)
                reflectiveQuadToRelative(-3f, 28f)
                quadToRelative(-30f, -26f, -67.5f, -40.5f)
                reflectiveQuadTo(728f, 480f)
                lineToRelative(64f, -67f)
                quadToRelative(-4f, -18f, -9f, -35f)
                reflectiveQuadToRelative(-13f, -33f)
                lineTo(432f, 682f)
                quadToRelative(11f, 13f, 22.5f, 25f)
                reflectiveQuadToRelative(25.5f, 23f)
                quadToRelative(2f, 42f, 17f, 79f)
                reflectiveQuadToRelative(41f, 67f)
                quadToRelative(-14f, 2f, -28.5f, 3f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(-91f, -267f)
                lineToRelative(337f, -337f)
                quadToRelative(-11f, -12f, -22f, -23.5f)
                reflectiveQuadTo(680f, 231f)
                lineTo(367f, 545f)
                quadToRelative(4f, 18f, 9f, 34.5f)
                reflectiveQuadToRelative(13f, 33.5f)
                close()
                moveToRelative(-26f, -178f)
                lineToRelative(247f, -247f)
                quadToRelative(-8f, -3f, -14.5f, -6.5f)
                reflectiveQuadTo(581f, 176f)
                quadToRelative(-86f, 28f, -145.5f, 97.5f)
                reflectiveQuadTo(363f, 435f)
                close()
            }
        }.build()
        
        return _Ev_shadow_add!!
    }

private var _Ev_shadow_add: ImageVector? = null

