package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hard_drive: ImageVector
    get() {
        if (_Hard_drive != null) return _Hard_drive!!
        
        _Hard_drive = ImageVector.Builder(
            name = "hard_drive",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 680f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-240f)
                horizontalLineTo(160f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(520f, -60f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 560f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 500f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 560f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 620f)
                close()
                moveToRelative(200f, -260f)
                horizontalLineTo(767f)
                lineToRelative(-80f, -80f)
                horizontalLineTo(273f)
                lineToRelative(-80f, 80f)
                horizontalLineTo(80f)
                lineToRelative(160f, -160f)
                horizontalLineToRelative(480f)
                lineToRelative(160f, 160f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Hard_drive!!
    }

private var _Hard_drive: ImageVector? = null

