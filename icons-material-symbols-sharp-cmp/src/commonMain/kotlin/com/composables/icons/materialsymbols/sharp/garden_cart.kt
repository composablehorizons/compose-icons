package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Garden_cart: ImageVector
    get() {
        if (_Garden_cart != null) return _Garden_cart!!
        
        _Garden_cart = ImageVector.Builder(
            name = "garden_cart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(489f, 618f)
                lineTo(341f, 840f)
                horizontalLineTo(200f)
                verticalLineToRelative(-464f)
                lineToRelative(-73f, -176f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(141f)
                lineToRelative(66f, 160f)
                horizontalLineToRelative(657f)
                lineTo(760f, 561f)
                quadToRelative(51f, 8f, 85.5f, 47f)
                reflectiveQuadToRelative(34.5f, 92f)
                quadToRelative(0f, 58f, -40.5f, 99f)
                reflectiveQuadTo(741f, 840f)
                quadToRelative(-59f, 0f, -99.5f, -41f)
                reflectiveQuadTo(601f, 700f)
                quadToRelative(0f, -20f, 5f, -37f)
                reflectiveQuadToRelative(14f, -33f)
                lineToRelative(-131f, -12f)
                close()
                moveToRelative(185f, -63f)
                lineToRelative(99f, -195f)
                horizontalLineTo(280f)
                lineToRelative(69f, 165f)
                lineToRelative(325f, 30f)
                close()
                moveTo(280f, 759f)
                horizontalLineToRelative(19f)
                lineToRelative(100f, -149f)
                lineToRelative(-106f, -10f)
                lineToRelative(-13f, -31f)
                verticalLineToRelative(190f)
                close()
                moveToRelative(460f, 1f)
                quadToRelative(26f, 0f, 43f, -17.5f)
                reflectiveQuadToRelative(17f, -42.5f)
                quadToRelative(0f, -26f, -17f, -43f)
                reflectiveQuadToRelative(-43f, -17f)
                quadToRelative(-25f, 0f, -42.5f, 17f)
                reflectiveQuadTo(680f, 700f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(740f, 760f)
                close()
                moveToRelative(-66f, -205f)
                lineToRelative(-325f, -30f)
                lineToRelative(325f, 30f)
                close()
            }
        }.build()
        
        return _Garden_cart!!
    }

private var _Garden_cart: ImageVector? = null

