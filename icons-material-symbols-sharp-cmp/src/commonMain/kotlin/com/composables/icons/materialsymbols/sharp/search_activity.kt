package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Search_activity: ImageVector
    get() {
        if (_Search_activity != null) return _Search_activity!!
        
        _Search_activity = ImageVector.Builder(
            name = "search_activity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(610f, 200f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(560f, 150f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(610f, 100f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(660f, 150f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(610f, 200f)
                close()
                moveToRelative(0f, 660f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(560f, 810f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(610f, 760f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(660f, 810f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(610f, 860f)
                close()
                moveToRelative(160f, -520f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 290f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 240f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 290f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 340f)
                close()
                moveToRelative(0f, 380f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 670f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 620f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 670f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 720f)
                close()
                moveToRelative(60f, -190f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(830f, 430f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(830f, 530f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                quadToRelative(-54f, -54f, -85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                verticalLineToRelative(80f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(132f, -212f)
                lineTo(440f, 496f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(148f, 148f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Search_activity!!
    }

private var _Search_activity: ImageVector? = null

