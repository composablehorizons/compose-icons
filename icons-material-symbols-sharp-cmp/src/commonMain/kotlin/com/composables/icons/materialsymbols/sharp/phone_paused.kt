package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Phone_paused: ImageVector
    get() {
        if (_Phone_paused != null) return _Phone_paused!!
        
        _Phone_paused = ImageVector.Builder(
            name = "phone_paused",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 400f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(38f, 440f)
                quadToRelative(-125f, 0f, -247.5f, -54f)
                reflectiveQuadTo(328f, 632f)
                quadTo(228f, 532f, 174f, 410f)
                reflectiveQuadToRelative(-54f, -248f)
                verticalLineToRelative(-42f)
                horizontalLineToRelative(236f)
                lineToRelative(37f, 201f)
                lineToRelative(-114f, 115f)
                quadToRelative(22f, 39f, 49f, 74f)
                reflectiveQuadToRelative(58f, 65f)
                quadToRelative(29f, 29f, 63.5f, 55.5f)
                reflectiveQuadTo(524f, 680f)
                lineToRelative(116f, -116f)
                lineToRelative(200f, 41f)
                verticalLineToRelative(235f)
                horizontalLineToRelative(-42f)
                close()
                moveTo(241f, 360f)
                lineToRelative(66f, -66f)
                lineToRelative(-17f, -94f)
                horizontalLineToRelative(-89f)
                quadToRelative(5f, 45f, 15f, 84.5f)
                reflectiveQuadToRelative(25f, 75.5f)
                close()
                moveToRelative(358f, 358f)
                quadToRelative(40f, 17f, 80.5f, 27f)
                reflectiveQuadToRelative(80.5f, 13f)
                verticalLineToRelative(-88f)
                lineToRelative(-94f, -19f)
                lineToRelative(-67f, 67f)
                close()
                moveTo(241f, 360f)
                close()
                moveToRelative(358f, 358f)
                close()
            }
        }.build()
        
        return _Phone_paused!!
    }

private var _Phone_paused: ImageVector? = null

