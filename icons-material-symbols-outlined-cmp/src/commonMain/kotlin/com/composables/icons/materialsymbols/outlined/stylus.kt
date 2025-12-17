package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Stylus: ImageVector
    get() {
        if (_Stylus != null) return _Stylus!!
        
        _Stylus = ImageVector.Builder(
            name = "stylus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(167f, 840f)
                quadToRelative(-21f, 5f, -36.5f, -10.5f)
                reflectiveQuadTo(120f, 793f)
                lineToRelative(40f, -191f)
                lineToRelative(198f, 198f)
                lineToRelative(-191f, 40f)
                close()
                moveToRelative(191f, -40f)
                lineTo(160f, 602f)
                lineToRelative(458f, -458f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(84f, 84f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineTo(358f, 800f)
                close()
                moveToRelative(317f, -600f)
                lineTo(261f, 614f)
                lineToRelative(85f, 85f)
                lineToRelative(414f, -414f)
                lineToRelative(-85f, -85f)
                close()
            }
        }.build()
        
        return _Stylus!!
    }

private var _Stylus: ImageVector? = null

