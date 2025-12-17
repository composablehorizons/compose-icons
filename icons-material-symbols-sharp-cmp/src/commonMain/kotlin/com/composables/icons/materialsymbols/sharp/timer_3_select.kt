package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Timer_3_select: ImageVector
    get() {
        if (_Timer_3_select != null) return _Timer_3_select!!
        
        _Timer_3_select = ImageVector.Builder(
            name = "timer_3_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 760f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-100f)
                horizontalLineTo(160f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(220f)
                lineToRelative(-60f, 60f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(220f)
                horizontalLineTo(160f)
                close()
                moveToRelative(440f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(600f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(680f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Timer_3_select!!
    }

private var _Timer_3_select: ImageVector? = null

