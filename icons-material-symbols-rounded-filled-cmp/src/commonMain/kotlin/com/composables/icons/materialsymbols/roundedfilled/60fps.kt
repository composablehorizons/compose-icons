package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.`60fps`: ImageVector
    get() {
        if (_60fps != null) return _60fps!!
        
        _60fps = ImageVector.Builder(
            name = "60fps",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 760f)
                horizontalLineTo(200f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(140f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(400f, 260f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(340f, 320f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveTo(200f, 520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                close()
                moveToRelative(400f, 120f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-320f)
                horizontalLineTo(600f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                horizontalLineToRelative(160f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _60fps!!
    }

private var _60fps: ImageVector? = null

