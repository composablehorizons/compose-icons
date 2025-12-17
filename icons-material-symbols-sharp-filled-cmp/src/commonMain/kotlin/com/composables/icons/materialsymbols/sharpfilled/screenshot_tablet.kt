package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Screenshot_tablet: ImageVector
    get() {
        if (_Screenshot_tablet != null) return _Screenshot_tablet!!
        
        _Screenshot_tablet = ImageVector.Builder(
            name = "screenshot_tablet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(40f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(640f)
                horizontalLineTo(40f)
                close()
                moveToRelative(200f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(240f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(280f, -40f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(100f)
                horizontalLineTo(520f)
                verticalLineToRelative(60f)
                close()
                moveTo(280f, 440f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-60f)
                horizontalLineTo(280f)
                verticalLineToRelative(160f)
                close()
            }
        }.build()
        
        return _Screenshot_tablet!!
    }

private var _Screenshot_tablet: ImageVector? = null

