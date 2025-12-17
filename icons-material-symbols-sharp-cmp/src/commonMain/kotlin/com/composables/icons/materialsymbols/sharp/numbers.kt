package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Numbers: ImageVector
    get() {
        if (_Numbers != null) return _Numbers!!
        
        _Numbers = ImageVector.Builder(
            name = "numbers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 800f)
                lineToRelative(40f, -160f)
                horizontalLineTo(120f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -160f)
                horizontalLineTo(180f)
                lineToRelative(20f, -80f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -160f)
                horizontalLineToRelative(80f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(160f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(660f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(160f)
                lineToRelative(-20f, 80f)
                horizontalLineTo(600f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(-80f)
                lineToRelative(40f, -160f)
                horizontalLineTo(360f)
                lineToRelative(-40f, 160f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(140f, -240f)
                horizontalLineToRelative(160f)
                lineToRelative(40f, -160f)
                horizontalLineTo(420f)
                lineToRelative(-40f, 160f)
                close()
            }
        }.build()
        
        return _Numbers!!
    }

private var _Numbers: ImageVector? = null

