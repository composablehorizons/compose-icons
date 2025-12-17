package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Timer_10_select: ImageVector
    get() {
        if (_Timer_10_select != null) return _Timer_10_select!!
        
        _Timer_10_select = ImageVector.Builder(
            name = "timer_10_select",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 640f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-320f)
                horizontalLineTo(400f)
                verticalLineToRelative(320f)
                close()
                moveTo(280f, 760f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(560f)
                horizontalLineTo(280f)
                close()
                moveToRelative(-160f, 0f)
                verticalLineToRelative(-440f)
                horizontalLineTo(40f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(560f)
                horizontalLineTo(120f)
                close()
                moveToRelative(560f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-40f)
                horizontalLineTo(680f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(760f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineTo(680f)
                close()
            }
        }.build()
        
        return _Timer_10_select!!
    }

private var _Timer_10_select: ImageVector? = null

