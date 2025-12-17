package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Stylus: ImageVector
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
                moveTo(168f, 839f)
                quadToRelative(-21f, 5f, -36.5f, -10.5f)
                reflectiveQuadTo(121f, 792f)
                lineToRelative(35f, -170f)
                lineToRelative(182f, 182f)
                lineToRelative(-170f, 35f)
                close()
                moveToRelative(235f, -84f)
                lineTo(205f, 557f)
                lineToRelative(413f, -413f)
                quadToRelative(23f, -23f, 57f, -23f)
                reflectiveQuadToRelative(57f, 23f)
                lineToRelative(84f, 84f)
                quadToRelative(23f, 23f, 23f, 57f)
                reflectiveQuadToRelative(-23f, 57f)
                lineTo(403f, 755f)
                close()
            }
        }.build()
        
        return _Stylus!!
    }

private var _Stylus: ImageVector? = null

