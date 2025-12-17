package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Trending_flat: ImageVector
    get() {
        if (_Trending_flat != null) return _Trending_flat!!
        
        _Trending_flat = ImageVector.Builder(
            name = "trending_flat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 660f)
                lineToRelative(-57f, -56f)
                lineToRelative(84f, -84f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(607f)
                lineToRelative(-83f, -84f)
                lineToRelative(57f, -56f)
                lineToRelative(179f, 180f)
                lineToRelative(-180f, 180f)
                close()
            }
        }.build()
        
        return _Trending_flat!!
    }

private var _Trending_flat: ImageVector? = null

