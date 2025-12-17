package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.`4g_mobiledata`: ImageVector
    get() {
        if (_4g_mobiledata != null) return _4g_mobiledata!!
        
        _4g_mobiledata = ImageVector.Builder(
            name = "4g_mobiledata",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                verticalLineToRelative(-120f)
                horizontalLineTo(120f)
                verticalLineToRelative(-280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                horizontalLineTo(560f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(660f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(180f)
                verticalLineToRelative(240f)
                horizontalLineTo(480f)
                close()
            }
        }.build()
        
        return _4g_mobiledata!!
    }

private var _4g_mobiledata: ImageVector? = null

