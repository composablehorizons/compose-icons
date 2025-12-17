package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Swipe_up: ImageVector
    get() {
        if (_Swipe_up != null) return _Swipe_up!!
        
        _Swipe_up = ImageVector.Builder(
            name = "swipe_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(213f, 158f)
                quadToRelative(-7f, 25f, -10f, 50.5f)
                reflectiveQuadToRelative(-3f, 51.5f)
                quadToRelative(0f, 63f, 18f, 121.5f)
                reflectiveQuadTo(270f, 492f)
                quadToRelative(8f, 11f, 7f, 24f)
                reflectiveQuadToRelative(-10f, 22f)
                quadToRelative(-9f, 9f, -21f, 8f)
                reflectiveQuadToRelative(-20f, -12f)
                quadToRelative(-42f, -60f, -64f, -130f)
                reflectiveQuadToRelative(-22f, -144f)
                quadToRelative(0f, -27f, 3f, -54f)
                reflectiveQuadToRelative(9f, -54f)
                lineToRelative(-49f, 49f)
                quadToRelative(-9f, 9f, -21f, 9f)
                reflectiveQuadToRelative(-21f, -9f)
                quadToRelative(-9f, -9f, -9f, -21f)
                reflectiveQuadToRelative(9f, -21f)
                lineToRelative(91f, -91f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(91f, 91f)
                quadToRelative(9f, 9f, 9f, 21f)
                reflectiveQuadToRelative(-9f, 21f)
                quadToRelative(-9f, 9f, -21f, 8.5f)
                reflectiveQuadToRelative(-21f, -8.5f)
                lineToRelative(-44f, -43f)
                close()
                moveToRelative(445f, 675f)
                quadToRelative(-23f, 8f, -46.5f, 7.5f)
                reflectiveQuadTo(566f, 829f)
                lineTo(340f, 724f)
                quadToRelative(-15f, -7f, -21f, -22.5f)
                reflectiveQuadToRelative(1f, -30.5f)
                lineToRelative(2f, -4f)
                quadToRelative(10f, -20f, 28f, -32.5f)
                reflectiveQuadToRelative(40f, -14.5f)
                lineToRelative(68f, -5f)
                lineToRelative(-112f, -307f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(130f, 357f)
                quadToRelative(7f, 19f, -4f, 35.5f)
                reflectiveQuadTo(516f, 692f)
                lineToRelative(-47f, 3f)
                lineToRelative(131f, 61f)
                quadToRelative(7f, 3f, 15f, 3.5f)
                reflectiveQuadToRelative(15f, -1.5f)
                lineToRelative(157f, -57f)
                quadToRelative(31f, -11f, 45f, -41.5f)
                reflectiveQuadToRelative(3f, -61.5f)
                lineToRelative(-55f, -150f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(55f, 150f)
                quadToRelative(23f, 63f, -4.5f, 122.5f)
                reflectiveQuadTo(815f, 776f)
                lineToRelative(-157f, 57f)
                close()
                moveTo(538f, 366f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(41f, 112f)
                quadToRelative(6f, 16f, -1f, 31f)
                reflectiveQuadToRelative(-23f, 21f)
                quadToRelative(-16f, 6f, -31f, -1f)
                reflectiveQuadToRelative(-21f, -23f)
                lineToRelative(-40f, -113f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                close()
                moveToRelative(126f, -3f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(27f, 75f)
                quadToRelative(6f, 16f, -0.5f, 30.5f)
                reflectiveQuadTo(719f, 513f)
                quadToRelative(-16f, 6f, -31f, -1f)
                reflectiveQuadToRelative(-21f, -23f)
                lineToRelative(-27f, -75f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                close()
                moveToRelative(15f, 242f)
                close()
            }
        }.build()
        
        return _Swipe_up!!
    }

private var _Swipe_up: ImageVector? = null

