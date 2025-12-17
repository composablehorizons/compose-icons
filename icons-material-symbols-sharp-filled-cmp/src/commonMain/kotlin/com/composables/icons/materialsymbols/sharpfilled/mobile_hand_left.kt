package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_hand_left: ImageVector
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
                lineToRelative(-132f, -132f)
                lineToRelative(-136f, 68f)
                verticalLineToRelative(-331f)
                horizontalLineTo(280f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(520f)
                verticalLineToRelative(800f)
                horizontalLineTo(464f)
                close()
                moveToRelative(-184f, 0f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                lineToRelative(120f, -120f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(380f)
                lineToRelative(200f, -100f)
                lineToRelative(40f, 40f)
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

