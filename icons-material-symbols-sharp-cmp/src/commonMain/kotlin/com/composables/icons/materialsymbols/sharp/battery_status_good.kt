package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_status_good: ImageVector
    get() {
        if (_Battery_status_good != null) return _Battery_status_good!!
        
        _Battery_status_good = ImageVector.Builder(
            name = "battery_status_good",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(638f, 847f)
                lineTo(524f, 734f)
                lineToRelative(57f, -56f)
                lineToRelative(57f, 56f)
                lineToRelative(141f, -141f)
                lineToRelative(57f, 56f)
                lineToRelative(-198f, 198f)
                close()
                moveToRelative(-278f, -47f)
                close()
                moveToRelative(-80f, 80f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(320f)
                quadToRelative(-21f, 0f, -41f, 3.5f)
                reflectiveQuadTo(600f, 494f)
                verticalLineToRelative(-254f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(94f)
                quadToRelative(8f, 23f, 19.5f, 43f)
                reflectiveQuadTo(501f, 880f)
                horizontalLineTo(280f)
                close()
            }
        }.build()
        
        return _Battery_status_good!!
    }

private var _Battery_status_good: ImageVector? = null

