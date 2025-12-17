package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Waving_hand: ImageVector
    get() {
        if (_Waving_hand != null) return _Waving_hand!!
        
        _Waving_hand = ImageVector.Builder(
            name = "waving_hand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(430f, 460f)
                lineToRelative(283f, -283f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineTo(487f, 516f)
                lineToRelative(-57f, -56f)
                close()
                moveToRelative(99f, 99f)
                lineToRelative(254f, -255f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(840f, 361f)
                lineTo(586f, 615f)
                lineToRelative(-57f, -56f)
                close()
                moveTo(211f, 749f)
                quadToRelative(-91f, -91f, -91f, -219f)
                reflectiveQuadToRelative(91f, -219f)
                lineToRelative(120f, -120f)
                lineToRelative(59f, 59f)
                quadToRelative(7f, 7f, 12f, 14.5f)
                reflectiveQuadToRelative(10f, 15.5f)
                lineToRelative(148f, -149f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(617f, 188f)
                lineTo(444f, 361f)
                lineToRelative(-85f, 84f)
                lineToRelative(19f, 19f)
                quadToRelative(46f, 46f, 44f, 110f)
                reflectiveQuadToRelative(-49f, 111f)
                lineToRelative(-57f, -56f)
                quadToRelative(23f, -23f, 25.5f, -54.5f)
                reflectiveQuadTo(321f, 520f)
                lineToRelative(-47f, -46f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(57f, -56f)
                quadToRelative(12f, -12f, 12f, -28.5f)
                reflectiveQuadTo(331f, 304f)
                lineToRelative(-64f, 64f)
                quadToRelative(-68f, 68f, -68f, 162.5f)
                reflectiveQuadTo(267f, 693f)
                quadToRelative(68f, 68f, 163f, 68f)
                reflectiveQuadToRelative(163f, -68f)
                lineToRelative(239f, -240f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(889f, 510f)
                lineTo(649f, 749f)
                quadToRelative(-91f, 91f, -219f, 91f)
                reflectiveQuadToRelative(-219f, -91f)
                close()
                moveToRelative(219f, -219f)
                close()
                moveTo(680f, 921f)
                verticalLineToRelative(-81f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                horizontalLineToRelative(81f)
                quadToRelative(0f, 100f, -70.5f, 170.5f)
                reflectiveQuadTo(680f, 921f)
                close()
                moveTo(39f, 280f)
                quadToRelative(0f, -100f, 70.5f, -170.5f)
                reflectiveQuadTo(280f, 39f)
                verticalLineToRelative(81f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                horizontalLineTo(39f)
                close()
            }
        }.build()
        
        return _Waving_hand!!
    }

private var _Waving_hand: ImageVector? = null

