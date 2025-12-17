package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Step_over: ImageVector
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
                moveTo(163f, 480f)
                quadToRelative(14f, -119f, 104f, -199.5f)
                reflectiveQuadTo(479f, 200f)
                quadToRelative(73f, 0f, 135f, 29.5f)
                reflectiveQuadTo(720f, 310f)
                verticalLineToRelative(-110f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(168f)
                quadToRelative(-32f, -54f, -86.5f, -87f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-88f, 0f, -155f, 57f)
                reflectiveQuadToRelative(-81f, 143f)
                horizontalLineToRelative(-81f)
                close()
            }
        }.build()
        
        return _Step_over!!
    }

private var _Step_over: ImageVector? = null

