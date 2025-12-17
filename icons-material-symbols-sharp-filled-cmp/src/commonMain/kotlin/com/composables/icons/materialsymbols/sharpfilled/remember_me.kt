package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Remember_me: ImageVector
    get() {
        if (_Remember_me != null) return _Remember_me!!
        
        _Remember_me = ImageVector.Builder(
            name = "remember_me",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -360f)
                quadToRelative(54f, 0f, 104.5f, 12.5f)
                reflectiveQuadTo(680f, 608f)
                verticalLineToRelative(-368f)
                horizontalLineTo(280f)
                verticalLineToRelative(368f)
                quadToRelative(45f, -23f, 95.5f, -35.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
            }
        }.build()
        
        return _Remember_me!!
    }

private var _Remember_me: ImageVector? = null

