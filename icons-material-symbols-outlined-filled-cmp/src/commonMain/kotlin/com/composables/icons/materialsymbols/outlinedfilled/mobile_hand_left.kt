package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_hand_left: ImageVector
    get() {
        if (_Mobile_hand_left != null) return _Mobile_hand_left!!
        
        _Mobile_hand_left = ImageVector.Builder(
            name = "mobile_hand_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 880f)
                lineToRelative(204f, -245f)
                lineToRelative(-66f, -67f)
                quadToRelative(-30f, -30f, -72f, -36f)
                reflectiveQuadToRelative(-80f, 13f)
                lineToRelative(-50f, 26f)
                verticalLineToRelative(-331f)
                horizontalLineTo(280f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 80f)
                horizontalLineToRelative(360f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(464f)
                close()
                moveToRelative(-184f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(380f)
                lineToRelative(166f, -83f)
                quadToRelative(15f, -8f, 31.5f, -5.5f)
                reflectiveQuadTo(545f, 625f)
                lineToRelative(15f, 15f)
                lineToRelative(-176f, 211f)
                quadToRelative(-11f, 14f, -27.5f, 21.5f)
                reflectiveQuadTo(322f, 880f)
                horizontalLineToRelative(-42f)
                close()
                moveToRelative(260f, -600f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(580f, 240f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(540f, 200f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(500f, 240f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(540f, 280f)
                close()
            }
        }.build()
        
        return _Mobile_hand_left!!
    }

private var _Mobile_hand_left: ImageVector? = null

