package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Phone_in_talk: ImageVector
    get() {
        if (_Phone_in_talk != null) return _Phone_in_talk!!
        
        _Phone_in_talk = ImageVector.Builder(
            name = "phone_in_talk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(760f, 478f)
                quadToRelative(0f, -117f, -81.5f, -198.5f)
                reflectiveQuadTo(480f, 198f)
                verticalLineToRelative(-80f)
                quadToRelative(75f, 0f, 140.5f, 28.5f)
                reflectiveQuadToRelative(114f, 77f)
                quadToRelative(48.5f, 48.5f, 77f, 114f)
                reflectiveQuadTo(840f, 478f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-160f, 0f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                verticalLineToRelative(-80f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(680f, 478f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(198f, 362f)
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
            }
        }.build()
        
        return _Phone_in_talk!!
    }

private var _Phone_in_talk: ImageVector? = null

