package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Trending_down: ImageVector
    get() {
        if (_Trending_down != null) return _Trending_down!!
        
        _Trending_down = ImageVector.Builder(
            name = "trending_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(104f)
                lineTo(536f, 434f)
                lineTo(376f, 594f)
                lineTo(80f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(160f, -160f)
                lineToRelative(264f, 264f)
                verticalLineToRelative(-104f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Trending_down!!
    }

private var _Trending_down: ImageVector? = null

