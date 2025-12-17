package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Blur_short: ImageVector
    get() {
        if (_Blur_short != null) return _Blur_short!!
        
        _Blur_short = ImageVector.Builder(
            name = "blur_short",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(600f, 600f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-72f, 0f, -127f, -45f)
                reflectiveQuadToRelative(-69f, -115f)
                horizontalLineTo(280f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 440f)
                horizontalLineToRelative(124f)
                quadToRelative(5f, -22f, 13.5f, -42.5f)
                reflectiveQuadTo(440f, 360f)
                horizontalLineTo(200f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 280f)
                horizontalLineToRelative(400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(800f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(600f, 680f)
                close()
            }
        }.build()
        
        return _Blur_short!!
    }

private var _Blur_short: ImageVector? = null

