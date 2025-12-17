package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Move_up: ImageVector
    get() {
        if (_Move_up != null) return _Move_up!!
        
        _Move_up = ImageVector.Builder(
            name = "move_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 800f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(40f, 520f)
                quadToRelative(0f, -107f, 70.5f, -186.5f)
                reflectiveQuadTo(287f, 242f)
                lineToRelative(-63f, -66f)
                lineToRelative(56f, -56f)
                lineToRelative(160f, 160f)
                lineToRelative(-160f, 160f)
                lineToRelative(-56f, -57f)
                lineToRelative(59f, -59f)
                quadToRelative(-71f, 14f, -117f, 69f)
                reflectiveQuadToRelative(-46f, 127f)
                quadToRelative(0f, 83f, 58.5f, 141.5f)
                reflectiveQuadTo(320f, 720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                horizontalLineTo(320f)
                close()
                moveToRelative(200f, -360f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(280f)
                horizontalLineTo(520f)
                close()
                moveToRelative(0f, 360f)
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
        
        return _Move_up!!
    }

private var _Move_up: ImageVector? = null

