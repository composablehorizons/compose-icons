package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.`1x_mobiledata_badge`: ImageVector
    get() {
        if (_1x_mobiledata_badge != null) return _1x_mobiledata_badge!!
        
        _1x_mobiledata_badge = ImageVector.Builder(
            name = "1x_mobiledata_badge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(180f, 0f)
                horizontalLineToRelative(80f)
                lineToRelative(70f, -127f)
                lineToRelative(70f, 127f)
                horizontalLineToRelative(80f)
                lineTo(650f, 480f)
                lineToRelative(110f, -200f)
                horizontalLineToRelative(-80f)
                lineToRelative(-70f, 127f)
                lineToRelative(-70f, -127f)
                horizontalLineToRelative(-80f)
                lineToRelative(110f, 200f)
                lineToRelative(-110f, 200f)
                close()
                moveTo(40f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(720f)
                horizontalLineTo(40f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineTo(120f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
            }
        }.build()
        
        return _1x_mobiledata_badge!!
    }

private var _1x_mobiledata_badge: ImageVector? = null

