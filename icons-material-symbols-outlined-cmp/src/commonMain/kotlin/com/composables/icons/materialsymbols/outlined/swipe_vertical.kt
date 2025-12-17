package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Swipe_vertical: ImageVector
    get() {
        if (_Swipe_vertical != null) return _Swipe_vertical!!
        
        _Swipe_vertical = ImageVector.Builder(
            name = "swipe_vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 880f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(81f)
                quadToRelative(-59f, -72f, -90f, -159f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -94f, 31f, -181f)
                reflectiveQuadToRelative(90f, -159f)
                horizontalLineTo(80f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-116f)
                quadToRelative(-58f, 66f, -89f, 147f)
                reflectiveQuadToRelative(-31f, 169f)
                quadToRelative(0f, 88f, 31f, 169f)
                reflectiveQuadToRelative(89f, 147f)
                verticalLineToRelative(-116f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(578f, -47f)
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
                moveToRelative(8f, 88f)
                close()
            }
        }.build()
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

