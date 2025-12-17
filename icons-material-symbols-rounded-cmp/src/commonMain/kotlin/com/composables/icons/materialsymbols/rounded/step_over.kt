package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Step_over: ImageVector
    get() {
        if (_Step_over != null) return _Step_over!!
        
        _Step_over = ImageVector.Builder(
            name = "step_over",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 760f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(208f, -360f)
                quadToRelative(-32f, -54f, -86.5f, -87f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-77f, 0f, -138f, 44f)
                reflectiveQuadToRelative(-87f, 113f)
                quadToRelative(-6f, 17f, -18.5f, 30f)
                reflectiveQuadTo(207f, 480f)
                quadToRelative(-18f, 0f, -29f, -14.5f)
                reflectiveQuadToRelative(-6f, -31.5f)
                quadToRelative(28f, -102f, 112.5f, -168f)
                reflectiveQuadTo(479f, 200f)
                quadToRelative(73f, 0f, 135f, 29.5f)
                reflectiveQuadTo(720f, 310f)
                verticalLineToRelative(-70f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(760f, 200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 240f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 480f)
                horizontalLineTo(560f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(560f, 400f)
                horizontalLineToRelative(128f)
                close()
            }
        }.build()
        
        return _Step_over!!
    }

private var _Step_over: ImageVector? = null

