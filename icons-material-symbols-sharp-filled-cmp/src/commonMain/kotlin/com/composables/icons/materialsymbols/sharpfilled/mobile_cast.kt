package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Mobile_cast: ImageVector
    get() {
        if (_Mobile_cast != null) return _Mobile_cast!!
        
        _Mobile_cast = ImageVector.Builder(
            name = "mobile_cast",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(280f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                verticalLineToRelative(-80f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(0f, -134f, -93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                verticalLineToRelative(-80f)
                quadToRelative(83f, 0f, 156f, 31.5f)
                reflectiveQuadTo(483f, 637f)
                quadToRelative(54f, 54f, 85.5f, 127f)
                reflectiveQuadTo(600f, 920f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-40f, -680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveTo(680f, 920f)
                quadToRelative(0f, -100f, -38f, -187.5f)
                reflectiveQuadTo(538.5f, 580f)
                quadTo(473f, 515f, 386f, 477.5f)
                reflectiveQuadTo(200f, 440f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(204f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(484f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Mobile_cast!!
    }

private var _Mobile_cast: ImageVector? = null

