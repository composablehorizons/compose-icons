package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Gpp_bad: ImageVector
    get() {
        if (_Gpp_bad != null) return _Gpp_bad!!
        
        _Gpp_bad = ImageVector.Builder(
            name = "gpp_bad",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(396f, 620f)
                lineToRelative(84f, -84f)
                lineToRelative(84f, 84f)
                lineToRelative(56f, -56f)
                lineToRelative(-84f, -84f)
                lineToRelative(84f, -84f)
                lineToRelative(-56f, -56f)
                lineToRelative(-84f, 84f)
                lineToRelative(-84f, -84f)
                lineToRelative(-56f, 56f)
                lineToRelative(84f, 84f)
                lineToRelative(-84f, 84f)
                lineToRelative(56f, 56f)
                close()
                moveToRelative(84f, 260f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                close()
            }
        }.build()
        
        return _Gpp_bad!!
    }

private var _Gpp_bad: ImageVector? = null

