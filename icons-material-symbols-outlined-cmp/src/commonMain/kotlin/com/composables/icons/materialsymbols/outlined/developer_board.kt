package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Developer_board: ImageVector
    get() {
        if (_Developer_board != null) return _Developer_board!!
        
        _Developer_board = ImageVector.Builder(
            name = "developer_board",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(160f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-160f)
                horizontalLineTo(240f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(240f, -280f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-120f)
                horizontalLineTo(480f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(-240f, 80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(240f, 200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(240f)
                close()
                moveTo(160f, 200f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Developer_board!!
    }

private var _Developer_board: ImageVector? = null

