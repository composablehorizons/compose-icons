package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Hls: ImageVector
    get() {
        if (_Hls != null) return _Hls!!
        
        _Hls = ImageVector.Builder(
            name = "hls",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 600f)
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
                moveToRelative(280f, 0f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(60f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(60f)
                horizontalLineTo(400f)
                close()
                moveToRelative(220f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(60f)
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
                horizontalLineTo(620f)
                close()
            }
        }.build()
        
        return _Hls!!
    }

private var _Hls: ImageVector? = null

