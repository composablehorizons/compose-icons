package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Pace: ImageVector
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
                quadToRelative(84f, 0f, 156.5f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                quadToRelative(54f, 54f, 85.5f, 126.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 10f, -0.5f, 19.5f)
                reflectiveQuadTo(878f, 518f)
                quadToRelative(-2f, 17f, -14.5f, 26f)
                reflectiveQuadToRelative(-29.5f, 6f)
                quadToRelative(-17f, -3f, -27f, -17f)
                reflectiveQuadToRelative(-8f, -31f)
                quadToRelative(0f, -5f, 0.5f, -11f)
                reflectiveQuadToRelative(0.5f, -11f)
                quadToRelative(0f, -67f, -24.5f, -125f)
                reflectiveQuadTo(707f, 253f)
                quadToRelative(-44f, -44f, -102f, -68.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-134f, 0f, -227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                quadToRelative(0f, 134f, 93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
                quadToRelative(45f, 0f, 86.5f, -11.5f)
                reflectiveQuadTo(645f, 754f)
                quadToRelative(14f, -8f, 30.5f, -6f)
                reflectiveQuadToRelative(25.5f, 16f)
                quadToRelative(10f, 14f, 6.5f, 30.5f)
                reflectiveQuadTo(690f, 820f)
                quadToRelative(-47f, 29f, -99.5f, 44.5f)
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
                moveTo(520f, 464f)
                lineToRelative(120f, 120f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(452f, 508f)
                quadToRelative(-6f, -6f, -9f, -13.5f)
                reflectiveQuadToRelative(-3f, -15.5f)
                verticalLineToRelative(-159f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 320f)
                verticalLineToRelative(144f)
                close()
            }
        }.build()
        
        return _Pace!!
    }

private var _Pace: ImageVector? = null

