package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swipe_up: ImageVector
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
                moveTo(245f, 560f)
                quadToRelative(-51f, -64f, -78f, -141f)
                reflectiveQuadToRelative(-27f, -159f)
                quadToRelative(0f, -27f, 3f, -54f)
                reflectiveQuadToRelative(9f, -54f)
                lineToRelative(-70f, 70f)
                lineToRelative(-42f, -42f)
                lineToRelative(140f, -140f)
                lineToRelative(140f, 140f)
                lineToRelative(-42f, 42f)
                lineToRelative(-65f, -64f)
                quadToRelative(-7f, 25f, -10f, 50.5f)
                reflectiveQuadToRelative(-3f, 51.5f)
                quadToRelative(0f, 70f, 22.5f, 135.5f)
                reflectiveQuadTo(288f, 517f)
                lineToRelative(-43f, 43f)
                close()
                moveToRelative(413f, 273f)
                quadToRelative(-23f, 8f, -46.5f, 7.5f)
                reflectiveQuadTo(566f, 829f)
                lineTo(304f, 707f)
                lineToRelative(18f, -40f)
                quadToRelative(10f, -20f, 28f, -32.5f)
                reflectiveQuadToRelative(40f, -14.5f)
                lineToRelative(68f, -5f)
                lineToRelative(-112f, -307f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(148f, 407f)
                lineToRelative(-100f, 7f)
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
                moveToRelative(-90f, -265f)
                lineToRelative(-54f, -151f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(55f, 150f)
                lineToRelative(-76f, 28f)
                close()
                moveToRelative(113f, -41f)
                lineToRelative(-41f, -113f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(41f, 112f)
                lineToRelative(-75f, 28f)
                close()
                moveToRelative(8f, 78f)
                close()
            }
        }.build()
        
        return _Swipe_up!!
    }

private var _Swipe_up: ImageVector? = null

