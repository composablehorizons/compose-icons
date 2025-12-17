package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Falling: ImageVector
    get() {
        if (_Falling != null) return _Falling!!
        
        _Falling = ImageVector.Builder(
            name = "falling",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(492f, 712f)
                lineToRelative(-121f, -90f)
                quadToRelative(-11f, -8f, -19f, -20.5f)
                reflectiveQuadTo(341f, 575f)
                lineToRelative(-45f, -199f)
                lineToRelative(-88f, 76f)
                lineToRelative(24f, 112f)
                quadToRelative(4f, 17f, -5.5f, 31f)
                reflectiveQuadTo(200f, 612f)
                quadToRelative(-17f, 3f, -31f, -6f)
                reflectiveQuadToRelative(-17f, -26f)
                lineToRelative(-23f, -111f)
                quadToRelative(-5f, -21f, 2f, -41.5f)
                reflectiveQuadToRelative(23f, -34.5f)
                lineToRelative(144f, -128f)
                quadToRelative(23f, -20f, 54.5f, -16.5f)
                reflectiveQuadTo(413f, 264f)
                quadToRelative(32f, 14f, 66.5f, 20f)
                reflectiveQuadToRelative(69.5f, 1f)
                quadToRelative(24f, -4f, 46f, -14f)
                reflectiveQuadToRelative(42f, -24f)
                quadToRelative(14f, -10f, 30.5f, -8.5f)
                reflectiveQuadTo(695f, 253f)
                quadToRelative(11f, 13f, 8.5f, 29.5f)
                reflectiveQuadTo(687f, 309f)
                quadToRelative(-23f, 16f, -47f, 28.5f)
                reflectiveQuadTo(589f, 358f)
                quadToRelative(-33f, 9f, -66.5f, 9.5f)
                reflectiveQuadTo(456f, 360f)
                lineToRelative(28f, 124f)
                lineToRelative(115f, -22f)
                quadToRelative(16f, -3f, 31.5f, 0.5f)
                reflectiveQuadTo(660f, 476f)
                lineToRelative(147f, 104f)
                quadToRelative(14f, 10f, 16.5f, 26.5f)
                reflectiveQuadTo(815f, 637f)
                quadToRelative(-10f, 13f, -25.5f, 15.5f)
                reflectiveQuadTo(760f, 646f)
                lineToRelative(-140f, -98f)
                lineToRelative(-144f, 28f)
                lineToRelative(68f, 50f)
                quadToRelative(18f, 14f, 26.5f, 35f)
                reflectiveQuadToRelative(4.5f, 44f)
                lineToRelative(-28f, 154f)
                quadToRelative(-3f, 17f, -17f, 26.5f)
                reflectiveQuadTo(499f, 892f)
                quadToRelative(-17f, -3f, -26f, -17f)
                reflectiveQuadToRelative(-6f, -31f)
                lineToRelative(25f, -132f)
                close()
                moveTo(320f, 220f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 140f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 60f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(400f, 140f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(320f, 220f)
                close()
            }
        }.build()
        
        return _Falling!!
    }

private var _Falling: ImageVector? = null

