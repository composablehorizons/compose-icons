package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hard_drive: ImageVector
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
                moveTo(680f, 640f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(740f, 580f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(620f, 580f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(680f, 640f)
                close()
                moveToRelative(200f, -280f)
                horizontalLineTo(80f)
                lineToRelative(160f, -160f)
                horizontalLineToRelative(480f)
                lineToRelative(160f, 160f)
                close()
                moveTo(80f, 760f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(320f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Hard_drive!!
    }

private var _Hard_drive: ImageVector? = null

