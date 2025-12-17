package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Account_child: ImageVector
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
                moveToRelative(0f, 720f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-133f, 0f, -226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                quadToRelative(0f, 133f, 93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
                close()
                moveToRelative(-80f, -520f)
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
                quadToRelative(-66f, 0f, -123f, 21.5f)
                reflectiveQuadTo(300f, 500f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 57f, 57f, 77.5f)
                reflectiveQuadTo(480f, 758f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 718f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 678f)
                quadToRelative(-20f, 0f, -39.5f, -3f)
                reflectiveQuadTo(403f, 664f)
                quadToRelative(-11f, -5f, -14f, -15.5f)
                reflectiveQuadToRelative(4f, -18.5f)
                quadToRelative(17f, -17f, 40f, -23.5f)
                reflectiveQuadToRelative(47f, -6.5f)
                quadToRelative(37f, 0f, 68.5f, 13f)
                reflectiveQuadToRelative(31.5f, 45f)
                verticalLineToRelative(34f)
                quadToRelative(0f, 12f, 8.5f, 21f)
                reflectiveQuadToRelative(20.5f, 9f)
                quadToRelative(23f, 0f, 37f, -19f)
                reflectiveQuadToRelative(14f, -43f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -57f, -57f, -78.5f)
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
                moveToRelative(0f, -100f)
                close()
            }
        }.build()
        
        return _Account_child!!
    }

private var _Account_child: ImageVector? = null

