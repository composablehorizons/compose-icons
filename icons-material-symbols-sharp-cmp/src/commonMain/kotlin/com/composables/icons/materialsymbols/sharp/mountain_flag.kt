package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mountain_flag: ImageVector
    get() {
        if (_Mountain_flag != null) return _Mountain_flag!!
        
        _Mountain_flag = ImageVector.Builder(
            name = "mountain_flag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 605f)
                close()
                moveToRelative(-132f, -88f)
                lineToRelative(55f, 37f)
                lineToRelative(77f, -39f)
                lineToRelative(77f, 39f)
                lineToRelative(53f, -35f)
                lineToRelative(-40f, -79f)
                horizontalLineTo(386f)
                lineToRelative(-38f, 77f)
                close()
                moveTo(209f, 800f)
                horizontalLineToRelative(541f)
                lineTo(646f, 591f)
                lineToRelative(-83f, 55f)
                lineToRelative(-83f, -41f)
                lineToRelative(-83f, 41f)
                lineToRelative(-85f, -56f)
                lineToRelative(-103f, 210f)
                close()
                moveTo(80f, 880f)
                lineToRelative(256f, -520f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(280f)
                lineToRelative(-40f, 80f)
                lineToRelative(40f, 80f)
                horizontalLineTo(520f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                lineTo(880f, 880f)
                horizontalLineTo(80f)
                close()
            }
        }.build()
        
        return _Mountain_flag!!
    }

private var _Mountain_flag: ImageVector? = null

