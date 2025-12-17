package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Pace: ImageVector
    get() {
        if (_Pace != null) return _Pace!!
        
        _Pace = ImageVector.Builder(
            name = "pace",
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
                quadToRelative(0f, -83f, 31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                quadToRelative(54f, -54f, 127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 27f, -3f, 53f)
                reflectiveQuadToRelative(-10f, 51f)
                quadToRelative(-14f, -16f, -32.5f, -27f)
                reflectiveQuadTo(794f, 542f)
                quadToRelative(3f, -15f, 4.5f, -30.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(51f, 0f, 97.5f, -15f)
                reflectiveQuadToRelative(85.5f, -42f)
                quadToRelative(12f, 17f, 29.5f, 30f)
                reflectiveQuadToRelative(37.5f, 20f)
                quadToRelative(-51f, 41f, -114.5f, 64f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(290f, -160f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(720f, 670f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(770f, 620f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(820f, 670f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(770f, 720f)
                close()
                moveToRelative(-158f, -52f)
                lineTo(440f, 496f)
                verticalLineToRelative(-216f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(184f)
                lineToRelative(148f, 148f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Pace!!
    }

private var _Pace: ImageVector? = null

