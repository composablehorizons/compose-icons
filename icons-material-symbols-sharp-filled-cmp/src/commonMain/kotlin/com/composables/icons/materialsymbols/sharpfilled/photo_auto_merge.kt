package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Photo_auto_merge: ImageVector
    get() {
        if (_Photo_auto_merge != null) return _Photo_auto_merge!!
        
        _Photo_auto_merge = ImageVector.Builder(
            name = "photo_auto_merge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(145f, 889f)
                lineTo(70f, 294f)
                lineToRelative(130f, -16f)
                verticalLineToRelative(482f)
                horizontalLineToRelative(530f)
                lineToRelative(7f, 56f)
                lineToRelative(-592f, 73f)
                close()
                moveToRelative(135f, -209f)
                verticalLineToRelative(-600f)
                horizontalLineToRelative(315f)
                quadToRelative(-8f, 20f, -11.5f, 40f)
                reflectiveQuadToRelative(-3.5f, 41f)
                quadToRelative(0f, 15f, 1.5f, 30f)
                reflectiveQuadToRelative(6.5f, 29f)
                horizontalLineToRelative(-8f)
                quadToRelative(-46f, 0f, -78f, 32.5f)
                reflectiveQuadTo(470f, 330f)
                quadToRelative(0f, 46f, 32f, 78f)
                reflectiveQuadToRelative(78f, 32f)
                quadToRelative(40f, 0f, 70f, -25f)
                reflectiveQuadToRelative(38f, -65f)
                quadToRelative(26f, 15f, 54f, 23f)
                reflectiveQuadToRelative(57f, 8f)
                quadToRelative(20f, 0f, 40.5f, -4f)
                reflectiveQuadToRelative(40.5f, -12f)
                verticalLineToRelative(315f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-32f)
                quadToRelative(-45f, -42f, -102f, -65f)
                reflectiveQuadToRelative(-118f, -23f)
                quadToRelative(-62f, 0f, -118.5f, 23f)
                reflectiveQuadTo(360f, 568f)
                verticalLineToRelative(32f)
                close()
                moveToRelative(347f, -340f)
                lineToRelative(71f, -200f)
                horizontalLineToRelative(44f)
                lineToRelative(72f, 200f)
                horizontalLineToRelative(-43f)
                lineToRelative(-15f, -44f)
                horizontalLineToRelative(-72f)
                lineToRelative(-15f, 44f)
                horizontalLineToRelative(-42f)
                close()
                moveToRelative(67f, -74f)
                horizontalLineToRelative(52f)
                lineToRelative(-26f, -82f)
                lineToRelative(-26f, 82f)
                close()
            }
        }.build()
        
        return _Photo_auto_merge!!
    }

private var _Photo_auto_merge: ImageVector? = null

