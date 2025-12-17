package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Edit_attributes: ImageVector
    get() {
        if (_Edit_attributes != null) return _Edit_attributes!!
        
        _Edit_attributes = ImageVector.Builder(
            name = "edit_attributes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(80f, 480f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(280f, 280f)
                horizontalLineToRelative(400f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 680f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(400f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                horizontalLineTo(280f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(70f, -56f)
                lineToRelative(93f, -93f)
                quadToRelative(9f, -9f, 9f, -21f)
                reflectiveQuadToRelative(-9f, -21f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                lineToRelative(-79f, 79f)
                lineToRelative(-19f, -19f)
                quadToRelative(-9f, -9f, -21f, -9f)
                reflectiveQuadToRelative(-21f, 9f)
                quadToRelative(-9f, 9f, -9f, 21f)
                reflectiveQuadToRelative(9f, 21f)
                lineToRelative(33f, 33f)
                quadToRelative(12f, 12f, 28f, 12f)
                reflectiveQuadToRelative(28f, -12f)
                close()
                moveToRelative(130f, -64f)
                close()
            }
        }.build()
        
        return _Edit_attributes!!
    }

private var _Edit_attributes: ImageVector? = null

