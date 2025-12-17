package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Brightness_2: ImageVector
    get() {
        if (_Brightness_2 != null) return _Brightness_2!!
        
        _Brightness_2 = ImageVector.Builder(
            name = "brightness_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 800f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(700f, 480f)
                quadToRelative(0f, -133f, -93.5f, -226.5f)
                reflectiveQuadTo(380f, 160f)
                horizontalLineToRelative(-21f)
                quadToRelative(-10f, 0f, -19f, 2f)
                quadToRelative(57f, 66f, 88.5f, 147.5f)
                reflectiveQuadTo(460f, 480f)
                quadToRelative(0f, 89f, -31.5f, 170.5f)
                reflectiveQuadTo(340f, 798f)
                quadToRelative(9f, 2f, 19f, 2f)
                horizontalLineToRelative(21f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-35f, 0f, -70f, -7f)
                reflectiveQuadToRelative(-67f, -21f)
                quadToRelative(-11f, -5f, -18f, -15f)
                reflectiveQuadToRelative(-7f, -22f)
                quadToRelative(0f, -9f, 4f, -17f)
                reflectiveQuadToRelative(12f, -14f)
                quadToRelative(70f, -55f, 108f, -135f)
                reflectiveQuadToRelative(38f, -169f)
                quadToRelative(0f, -89f, -38.5f, -168.5f)
                reflectiveQuadTo(233f, 176f)
                quadToRelative(-7f, -6f, -11f, -14f)
                reflectiveQuadToRelative(-4f, -17f)
                quadToRelative(0f, -12f, 6.5f, -22f)
                reflectiveQuadToRelative(17.5f, -15f)
                quadToRelative(33f, -14f, 68f, -21f)
                reflectiveQuadToRelative(70f, -7f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(663f, 197f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(780f, 480f)
                quadToRelative(0f, 83f, -31.5f, 156f)
                reflectiveQuadTo(663f, 763f)
                quadToRelative(-54f, 54f, -127f, 85.5f)
                reflectiveQuadTo(380f, 880f)
                close()
                moveToRelative(80f, -400f)
                close()
            }
        }.build()
        
        return _Brightness_2!!
    }

private var _Brightness_2: ImageVector? = null

