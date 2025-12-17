package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Avg_pace: ImageVector
    get() {
        if (_Avg_pace != null) return _Avg_pace!!
        
        _Avg_pace = ImageVector.Builder(
            name = "avg_pace",
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
                moveToRelative(0f, -320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(0f, -5f, 0.5f, -10.5f)
                reflectiveQuadTo(403f, 459f)
                lineToRelative(-83f, -83f)
                lineToRelative(56f, -56f)
                lineToRelative(83f, 83f)
                quadToRelative(4f, -1f, 21f, -3f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 560f)
                close()
            }
        }.build()
        
        return _Avg_pace!!
    }

private var _Avg_pace: ImageVector? = null

