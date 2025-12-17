package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Chart_data: ImageVector
    get() {
        if (_Chart_data != null) return _Chart_data!!
        
        _Chart_data = ImageVector.Builder(
            name = "chart_data",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 640f)
                lineToRelative(122f, -122f)
                lineToRelative(80f, 80f)
                lineToRelative(142f, -141f)
                verticalLineToRelative(63f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-200f)
                horizontalLineTo(520f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(63f)
                lineToRelative(-85f, 85f)
                lineToRelative(-80f, -80f)
                lineToRelative(-178f, 179f)
                lineToRelative(56f, 56f)
                close()
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(720f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-560f)
                horizontalLineTo(200f)
                verticalLineToRelative(560f)
                close()
                moveToRelative(0f, -560f)
                verticalLineToRelative(560f)
                verticalLineToRelative(-560f)
                close()
            }
        }.build()
        
        return _Chart_data!!
    }

private var _Chart_data: ImageVector? = null

