package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Photo_auto_merge: ImageVector
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
                moveTo(224f, 879f)
                quadToRelative(-33f, 4f, -59f, -16f)
                reflectiveQuadToRelative(-30f, -53f)
                lineTo(80f, 373f)
                quadToRelative(-5f, -32f, 15.5f, -58f)
                reflectiveQuadToRelative(54.5f, -31f)
                lineToRelative(50f, -6f)
                verticalLineToRelative(362f)
                quadToRelative(0f, 51f, 34.5f, 85.5f)
                reflectiveQuadTo(320f, 760f)
                horizontalLineToRelative(410f)
                quadToRelative(0f, 27f, -21f, 44f)
                reflectiveQuadToRelative(-48f, 21f)
                lineTo(224f, 879f)
                close()
                moveToRelative(136f, -199f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                horizontalLineToRelative(235f)
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
                verticalLineToRelative(235f)
                quadToRelative(0f, 34f, -23.5f, 57f)
                reflectiveQuadTo(800f, 680f)
                horizontalLineTo(360f)
                close()
                moveToRelative(0f, -80f)
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

