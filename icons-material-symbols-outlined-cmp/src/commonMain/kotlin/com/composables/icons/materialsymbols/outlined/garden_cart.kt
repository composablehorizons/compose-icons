package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Garden_cart: ImageVector
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
                moveTo(292f, 840f)
                quadToRelative(-38f, 0f, -65f, -27.5f)
                reflectiveQuadTo(200f, 747f)
                verticalLineToRelative(-371f)
                lineToRelative(-73f, -176f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(141f)
                lineToRelative(66f, 160f)
                horizontalLineToRelative(591f)
                quadToRelative(23f, 0f, 35f, 19f)
                reflectiveQuadToRelative(1f, 39f)
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
                lineToRelative(-120f, 180f)
                quadToRelative(-13f, 20f, -33.5f, 31f)
                reflectiveQuadTo(292f, 840f)
                close()
                moveToRelative(382f, -285f)
                lineToRelative(99f, -195f)
                horizontalLineTo(280f)
                lineToRelative(50f, 120f)
                quadToRelative(8f, 20f, 25.5f, 33.5f)
                reflectiveQuadTo(396f, 529f)
                lineToRelative(278f, 26f)
                close()
                moveTo(293f, 759f)
                quadToRelative(2f, 0f, 9f, -5f)
                lineToRelative(97f, -144f)
                quadToRelative(-49f, -5f, -77f, -23.5f)
                reflectiveQuadTo(280f, 548f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 5f, 4f, 8f)
                reflectiveQuadToRelative(9f, 3f)
                close()
                moveToRelative(447f, 1f)
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
                lineToRelative(-278f, -26f)
                lineToRelative(278f, 26f)
                close()
            }
        }.build()
        
        return _Garden_cart!!
    }

private var _Garden_cart: ImageVector? = null

