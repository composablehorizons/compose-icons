package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Move_down: ImageVector
    get() {
        if (_Move_down != null) return _Move_down!!
        
        _Move_down = ImageVector.Builder(
            name = "move_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 840f)
                lineToRelative(-56f, -56f)
                lineToRelative(63f, -66f)
                quadToRelative(-106f, -12f, -176.5f, -91.5f)
                reflectiveQuadTo(40f, 440f)
                quadToRelative(0f, -117f, 81.5f, -198.5f)
                reflectiveQuadTo(320f, 160f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                quadToRelative(-83f, 0f, -141.5f, 58.5f)
                reflectiveQuadTo(120f, 440f)
                quadToRelative(0f, 72f, 46f, 127f)
                reflectiveQuadToRelative(117f, 69f)
                lineToRelative(-59f, -59f)
                lineToRelative(56f, -57f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                close()
                moveToRelative(240f, -40f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, -360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                horizontalLineTo(600f)
                verticalLineToRelative(120f)
                close()
            }
        }.build()
        
        return _Move_down!!
    }

private var _Move_down: ImageVector? = null

