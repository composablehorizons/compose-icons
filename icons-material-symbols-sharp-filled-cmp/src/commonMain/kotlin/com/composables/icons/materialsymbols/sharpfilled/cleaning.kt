package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Cleaning: ImageVector
    get() {
        if (_Cleaning != null) return _Cleaning!!
        
        _Cleaning = ImageVector.Builder(
            name = "cleaning",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 280f)
                lineToRelative(40f, -80f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                lineToRelative(-40f, 80f)
                horizontalLineTo(480f)
                verticalLineToRelative(-40f)
                lineToRelative(-80f, 80f)
                horizontalLineToRelative(-40f)
                close()
                moveTo(320f, 880f)
                verticalLineToRelative(-297f)
                lineToRelative(160f, -303f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(600f)
                horizontalLineTo(320f)
                close()
            }
        }.build()
        
        return _Cleaning!!
    }

private var _Cleaning: ImageVector? = null

