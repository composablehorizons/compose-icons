package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Swipe_down: ImageVector
    get() {
        if (_Swipe_down != null) return _Swipe_down!!
        
        _Swipe_down = ImageVector.Builder(
            name = "swipe_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(180f, 600f)
                lineTo(40f, 460f)
                lineToRelative(42f, -42f)
                lineToRelative(70f, 70f)
                quadToRelative(-6f, -27f, -9f, -54f)
                reflectiveQuadToRelative(-3f, -54f)
                quadToRelative(0f, -82f, 27f, -159f)
                reflectiveQuadToRelative(78f, -141f)
                lineToRelative(43f, 43f)
                quadToRelative(-43f, 56f, -65.5f, 121.5f)
                reflectiveQuadTo(200f, 380f)
                quadToRelative(0f, 26f, 3f, 51.5f)
                reflectiveQuadToRelative(10f, 50.5f)
                lineToRelative(65f, -64f)
                lineToRelative(42f, 42f)
                lineToRelative(-140f, 140f)
                close()
                moveToRelative(478f, 233f)
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
                lineToRelative(96f, 263f)
                lineToRelative(38f, -14f)
                lineToRelative(-41f, -113f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(41f, 113f)
                lineToRelative(37f, -14f)
                lineToRelative(-27f, -75f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(27f, 75f)
                lineToRelative(38f, -14f)
                quadToRelative(-6f, -16f, 1f, -30.5f)
                reflectiveQuadToRelative(23f, -20.5f)
                quadToRelative(16f, -6f, 30.5f, 1f)
                reflectiveQuadToRelative(20.5f, 23f)
                lineToRelative(55f, 150f)
                quadToRelative(23f, 63f, -4.5f, 122.5f)
                reflectiveQuadTo(815f, 776f)
                lineToRelative(-157f, 57f)
                close()
            }
        }.build()
        
        return _Swipe_down!!
    }

private var _Swipe_down: ImageVector? = null

