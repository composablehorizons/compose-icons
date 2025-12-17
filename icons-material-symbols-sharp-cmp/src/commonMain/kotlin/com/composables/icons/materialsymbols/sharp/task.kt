package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Task: ImageVector
    get() {
        if (_Task != null) return _Task!!
        
        _Task = ImageVector.Builder(
            name = "task",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(438f, 720f)
                lineToRelative(226f, -226f)
                lineToRelative(-58f, -58f)
                lineToRelative(-169f, 169f)
                lineToRelative(-84f, -84f)
                lineToRelative(-57f, 57f)
                lineToRelative(142f, 142f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-800f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(560f)
                horizontalLineTo(160f)
                close()
                moveToRelative(360f, -520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-440f)
                horizontalLineTo(520f)
                close()
                moveTo(240f, 160f)
                verticalLineToRelative(200f)
                verticalLineToRelative(-200f)
                verticalLineToRelative(640f)
                verticalLineToRelative(-640f)
                close()
            }
        }.build()
        
        return _Task!!
    }

private var _Task: ImageVector? = null

