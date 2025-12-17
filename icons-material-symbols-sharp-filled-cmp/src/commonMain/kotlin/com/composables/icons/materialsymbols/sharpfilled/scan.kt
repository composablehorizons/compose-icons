package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Scan: ImageVector
    get() {
        if (_Scan != null) return _Scan!!
        
        _Scan = ImageVector.Builder(
            name = "scan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 360f)
                horizontalLineToRelative(200f)
                lineTo(520f, 160f)
                verticalLineToRelative(200f)
                close()
                moveTo(160f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                close()
                moveTo(40f, 600f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(880f)
                verticalLineToRelative(80f)
                horizontalLineTo(40f)
                close()
                moveToRelative(120f, -160f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(400f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineTo(160f)
                close()
            }
        }.build()
        
        return _Scan!!
    }

private var _Scan: ImageVector? = null

