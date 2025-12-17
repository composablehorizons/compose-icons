package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Html: ImageVector
    get() {
        if (_Html != null) return _Html!!
        
        _Html = ImageVector.Builder(
            name = "html",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 600f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineTo(60f)
                verticalLineToRelative(100f)
                horizontalLineTo(0f)
                close()
                moveToRelative(310f, 0f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(60f)
                horizontalLineToRelative(-70f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(170f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(260f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-180f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(140f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(320f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(800f)
                close()
            }
        }.build()
        
        return _Html!!
    }

private var _Html: ImageVector? = null

