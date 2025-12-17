package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Supervised_user_circle: ImageVector
    get() {
        if (_Supervised_user_circle != null) return _Supervised_user_circle!!
        
        _Supervised_user_circle = ImageVector.Builder(
            name = "supervised_user_circle",
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
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveTo(380f, 540f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                quadToRelative(0f, -58f, -41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                quadToRelative(-58f, 0f, -99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveToRelative(280f, 40f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(480f, 800f)
                quadToRelative(85f, 0f, 155f, -40f)
                reflectiveQuadToRelative(113f, -106f)
                quadToRelative(-21f, -6f, -43f, -10f)
                reflectiveQuadToRelative(-45f, -4f)
                quadToRelative(-53f, 0f, -128f, 31f)
                reflectiveQuadTo(412f, 793f)
                quadToRelative(17f, 4f, 34f, 5.5f)
                reflectiveQuadToRelative(34f, 1.5f)
                close()
                moveToRelative(-127f, -26f)
                quadToRelative(35f, -72f, 79.5f, -107f)
                reflectiveQuadToRelative(67.5f, -47f)
                quadToRelative(-29f, -9f, -58.5f, -14.5f)
                reflectiveQuadTo(380f, 600f)
                quadToRelative(-45f, 0f, -89f, 11f)
                reflectiveQuadToRelative(-85f, 31f)
                quadToRelative(26f, 43f, 63.5f, 77.5f)
                reflectiveQuadTo(353f, 774f)
                close()
            }
        }.build()
        
        return _Supervised_user_circle!!
    }

private var _Supervised_user_circle: ImageVector? = null

