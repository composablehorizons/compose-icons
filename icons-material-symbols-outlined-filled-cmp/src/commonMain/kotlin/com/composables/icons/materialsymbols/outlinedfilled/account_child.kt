package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Account_child: ImageVector
    get() {
        if (_Account_child != null) return _Account_child!!
        
        _Account_child = ImageVector.Builder(
            name = "account_child",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 80f)
                quadToRelative(83f, 0f, 155.5f, 31.5f)
                reflectiveQuadToRelative(127f, 86f)
                quadToRelative(54.5f, 54.5f, 86f, 127f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 82f, -31.5f, 155f)
                reflectiveQuadToRelative(-86f, 127.5f)
                quadToRelative(-54.5f, 54.5f, -127f, 86f)
                reflectiveQuadTo(480f, 880f)
                quadToRelative(-82f, 0f, -155f, -31.5f)
                reflectiveQuadToRelative(-127.5f, -86f)
                quadTo(143f, 708f, 111.5f, 635f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 31.5f, -155.5f)
                reflectiveQuadToRelative(86f, -127f)
                quadTo(252f, 143f, 325f, 111.5f)
                reflectiveQuadTo(480f, 80f)
                close()
                moveToRelative(-80f, 200f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(480f, 360f)
                quadToRelative(33f, 0f, 56.5f, -23.5f)
                reflectiveQuadTo(560f, 280f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-33f, 0f, -56.5f, 23.5f)
                reflectiveQuadTo(400f, 280f)
                close()
                moveToRelative(80f, 120f)
                quadToRelative(-53f, 0f, -116.5f, 26f)
                reflectiveQuadTo(300f, 500f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 44f, 63f, 74f)
                reflectiveQuadToRelative(137f, 24f)
                verticalLineToRelative(-80f)
                quadToRelative(-35f, 2f, -66f, -5f)
                reflectiveQuadToRelative(-54f, -21f)
                quadToRelative(5f, -23f, 35f, -37.5f)
                reflectiveQuadToRelative(65f, -14.5f)
                quadToRelative(35f, 0f, 67.5f, 16f)
                reflectiveQuadToRelative(32.5f, 42f)
                verticalLineToRelative(82f)
                quadToRelative(44f, -16f, 62f, -38.5f)
                reflectiveQuadToRelative(18f, -41.5f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -48f, -63.5f, -74f)
                reflectiveQuadTo(480f, 400f)
                close()
                moveToRelative(0f, 180f)
                quadToRelative(-21f, 0f, -35.5f, -14.5f)
                reflectiveQuadTo(430f, 530f)
                quadToRelative(0f, -21f, 14.5f, -35.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(21f, 0f, 35.5f, 14.5f)
                reflectiveQuadTo(530f, 530f)
                quadToRelative(0f, 21f, -14.5f, 35.5f)
                reflectiveQuadTo(480f, 580f)
                close()
            }
        }.build()
        
        return _Account_child!!
    }

private var _Account_child: ImageVector? = null

