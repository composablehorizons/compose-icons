package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Right_click: ImageVector
    get() {
        if (_Right_click != null) return _Right_click!!
        
        _Right_click = ImageVector.Builder(
            name = "right_click",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(179f, 860f)
                quadToRelative(-17f, 17f, -39.5f, 17f)
                reflectiveQuadTo(100f, 860f)
                quadToRelative(-17f, -17f, -17f, -39f)
                reflectiveQuadToRelative(17f, -39f)
                lineToRelative(132f, -132f)
                lineToRelative(-91f, -30f)
                quadToRelative(-14f, -5f, -13.5f, -19f)
                reflectiveQuadToRelative(14.5f, -19f)
                lineToRelative(303f, -91f)
                quadToRelative(11f, -4f, 20f, 5f)
                reflectiveQuadToRelative(5f, 20f)
                lineToRelative(-91f, 303f)
                quadToRelative(-5f, 14f, -19f, 14.5f)
                reflectiveQuadTo(341f, 820f)
                lineToRelative(-30f, -91f)
                lineToRelative(-132f, 131f)
                close()
                moveToRelative(542f, -380f)
                quadToRelative(0f, 75f, -42f, 136.5f)
                reflectiveQuadTo(568f, 704f)
                quadToRelative(-16f, 6f, -31f, 0f)
                reflectiveQuadToRelative(-21f, -22f)
                quadToRelative(-6f, -16f, 0.5f, -31f)
                reflectiveQuadToRelative(22.5f, -21f)
                quadToRelative(45f, -17f, 73.5f, -58f)
                reflectiveQuadToRelative(28.5f, -92f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-51f, 0f, -92f, 28.5f)
                reflectiveQuadTo(331f, 422f)
                quadToRelative(-6f, 16f, -20.5f, 22.5f)
                reflectiveQuadToRelative(-30.5f, 0.5f)
                quadToRelative(-16f, -6f, -22.5f, -21f)
                reflectiveQuadToRelative(-0.5f, -31f)
                quadToRelative(26f, -68f, 86.5f, -110.5f)
                reflectiveQuadTo(481f, 240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                close()
            }
        }.build()
        
        return _Right_click!!
    }

private var _Right_click: ImageVector? = null

