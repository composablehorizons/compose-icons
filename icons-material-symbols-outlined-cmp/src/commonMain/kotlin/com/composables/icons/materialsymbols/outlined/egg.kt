package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Egg: ImageVector
    get() {
        if (_Egg != null) return _Egg!!
        
        _Egg = ImageVector.Builder(
            name = "egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -77f, 25.5f, -155f)
                reflectiveQuadToRelative(66f, -141.5f)
                quadTo(332f, 200f, 382f, 160f)
                reflectiveQuadToRelative(98f, -40f)
                quadToRelative(49f, 0f, 98.5f, 40f)
                reflectiveQuadToRelative(90f, 103.5f)
                quadTo(709f, 327f, 734.5f, 405f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 560f)
                quadToRelative(0f, -57f, -19.5f, -120f)
                reflectiveQuadToRelative(-49f, -116.5f)
                quadTo(582f, 270f, 547f, 235f)
                reflectiveQuadToRelative(-67f, -35f)
                quadToRelative(-31f, 0f, -66.5f, 35f)
                reflectiveQuadToRelative(-65f, 88.5f)
                quadTo(319f, 377f, 299.5f, 440f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(480f, 760f)
                close()
                moveToRelative(40f, -40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(520f, 720f)
                close()
                moveToRelative(-40f, -240f)
                close()
            }
        }.build()
        
        return _Egg!!
    }

private var _Egg: ImageVector? = null

