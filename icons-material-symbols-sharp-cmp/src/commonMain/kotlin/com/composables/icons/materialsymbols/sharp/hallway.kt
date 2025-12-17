package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Hallway: ImageVector
    get() {
        if (_Hallway != null) return _Hallway!!
        
        _Hallway = ImageVector.Builder(
            name = "hallway",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(200f)
                lineToRelative(160f, -160f)
                lineToRelative(160f, 160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(40f, -80f)
                horizontalLineToRelative(480f)
                lineTo(570f, 520f)
                lineTo(450f, 680f)
                lineToRelative(-90f, -120f)
                lineToRelative(-120f, 160f)
                close()
                moveToRelative(164f, -560f)
                horizontalLineToRelative(152f)
                lineToRelative(-76f, -76f)
                lineToRelative(-76f, 76f)
                close()
                moveTo(200f, 800f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _Hallway!!
    }

private var _Hallway: ImageVector? = null

