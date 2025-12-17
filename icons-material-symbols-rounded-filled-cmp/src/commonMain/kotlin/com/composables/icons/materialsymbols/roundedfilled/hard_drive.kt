package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Hard_drive: ImageVector
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
                quadToRelative(25f, 0f, 42.5f, -17f)
                reflectiveQuadToRelative(17.5f, -43f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(-26f, 0f, -43f, 17.5f)
                reflectiveQuadTo(620f, 580f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                close()
                moveTo(80f, 360f)
                lineToRelative(136f, -136f)
                quadToRelative(11f, -11f, 25.5f, -17.5f)
                reflectiveQuadTo(273f, 200f)
                horizontalLineToRelative(413f)
                quadToRelative(17f, 0f, 31.5f, 6.5f)
                reflectiveQuadTo(743f, 224f)
                lineToRelative(137f, 136f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, 400f)
                quadToRelative(-34f, 0f, -57f, -23f)
                reflectiveQuadToRelative(-23f, -57f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(800f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 34f, -23.5f, 57f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Hard_drive!!
    }

private var _Hard_drive: ImageVector? = null

