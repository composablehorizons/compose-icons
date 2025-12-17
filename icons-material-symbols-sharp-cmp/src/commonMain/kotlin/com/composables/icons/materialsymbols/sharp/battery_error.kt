package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Battery_error: ImageVector
    get() {
        if (_Battery_error != null) return _Battery_error!!
        
        _Battery_error = ImageVector.Builder(
            name = "battery_error",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(348f)
                quadToRelative(-22f, 6f, -42f, 15.5f)
                reflectiveQuadTo(600f, 546f)
                verticalLineToRelative(-306f)
                horizontalLineTo(360f)
                verticalLineToRelative(560f)
                horizontalLineToRelative(148f)
                quadToRelative(5f, 22f, 14.5f, 42f)
                reflectiveQuadTo(545f, 880f)
                horizontalLineTo(280f)
                close()
                moveToRelative(80f, -80f)
                close()
                moveToRelative(296f, 80f)
                lineToRelative(-56f, -56f)
                lineToRelative(84f, -84f)
                lineToRelative(-84f, -84f)
                lineToRelative(56f, -56f)
                lineToRelative(84f, 84f)
                lineToRelative(84f, -84f)
                lineToRelative(56f, 56f)
                lineToRelative(-83f, 84f)
                lineToRelative(83f, 84f)
                lineToRelative(-56f, 56f)
                lineToRelative(-84f, -83f)
                lineToRelative(-84f, 83f)
                close()
            }
        }.build()
        
        return _Battery_error!!
    }

private var _Battery_error: ImageVector? = null

