package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hls_off: ImageVector
    get() {
        if (_Hls_off != null) return _Hls_off!!
        
        _Hls_off = ImageVector.Builder(
            name = "hls_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(713f, 600f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(47f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-40f)
                horizontalLineTo(620f)
                verticalLineToRelative(-140f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(140f)
                horizontalLineTo(713f)
                close()
                moveToRelative(-593f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-60f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(100f)
                horizontalLineToRelative(-60f)
                close()
                moveTo(791f, 904f)
                lineTo(56f, 169f)
                lineToRelative(56f, -57f)
                lineToRelative(735f, 736f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(400f, 600f)
                verticalLineToRelative(-143f)
                lineToRelative(60f, 60f)
                verticalLineToRelative(23f)
                horizontalLineToRelative(24f)
                lineToRelative(60f, 60f)
                horizontalLineTo(400f)
                close()
            }
        }.build()
        
        return _Hls_off!!
    }

private var _Hls_off: ImageVector? = null

