package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Swipe_vertical: ImageVector
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
                moveTo(161f, 820f)
                quadToRelative(-59f, -72f, -90f, -159f)
                reflectiveQuadTo(40f, 480f)
                quadToRelative(0f, -94f, 31f, -181f)
                reflectiveQuadToRelative(90f, -159f)
                horizontalLineToRelative(-51f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(80f, 110f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(110f, 80f)
                horizontalLineToRelative(130f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(280f, 120f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 13f, -8.5f, 21.5f)
                reflectiveQuadTo(250f, 280f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(220f, 250f)
                verticalLineToRelative(-86f)
                quadToRelative(-58f, 66f, -89f, 147f)
                reflectiveQuadToRelative(-31f, 169f)
                quadToRelative(0f, 88f, 31f, 169f)
                reflectiveQuadToRelative(89f, 147f)
                verticalLineToRelative(-86f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(250f, 680f)
                quadToRelative(13f, 0f, 21.5f, 8.5f)
                reflectiveQuadTo(280f, 710f)
                verticalLineToRelative(130f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(240f, 880f)
                horizontalLineTo(110f)
                quadToRelative(-13f, 0f, -21.5f, -8.5f)
                reflectiveQuadTo(80f, 850f)
                quadToRelative(0f, -13f, 8.5f, -21.5f)
                reflectiveQuadTo(110f, 820f)
                horizontalLineToRelative(51f)
                close()
                moveToRelative(497f, 13f)
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
                lineToRelative(96f, 263f)
                lineToRelative(38f, -14f)
                lineToRelative(-37f, -103f)
                quadToRelative(-6f, -16f, -1f, -35.5f)
                reflectiveQuadToRelative(21f, -25.5f)
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
        
        return _Swipe_vertical!!
    }

private var _Swipe_vertical: ImageVector? = null

