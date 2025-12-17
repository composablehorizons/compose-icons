package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.`1x_mobiledata_badge`: ImageVector
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
                moveTo(120f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 120f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 200f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 840f)
                horizontalLineTo(120f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(-560f)
                horizontalLineTo(120f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-560f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(160f, -80f)
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
            }
        }.build()
        
        return _1x_mobiledata_badge!!
    }

private var _1x_mobiledata_badge: ImageVector? = null

