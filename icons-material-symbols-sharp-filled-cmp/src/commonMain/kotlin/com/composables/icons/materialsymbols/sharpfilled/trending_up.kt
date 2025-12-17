package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Trending_up: ImageVector
    get() {
        if (_Trending_up != null) return _Trending_up!!
        
        _Trending_up = ImageVector.Builder(
            name = "trending_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(136f, 720f)
                lineToRelative(-56f, -56f)
                lineToRelative(296f, -298f)
                lineToRelative(160f, 160f)
                lineToRelative(208f, -206f)
                horizontalLineTo(640f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-104f)
                lineTo(536f, 640f)
                lineTo(376f, 480f)
                lineTo(136f, 720f)
                close()
            }
        }.build()
        
        return _Trending_up!!
    }

private var _Trending_up: ImageVector? = null

