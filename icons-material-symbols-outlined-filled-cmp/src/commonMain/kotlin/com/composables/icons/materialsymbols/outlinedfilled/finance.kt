package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Finance: ImageVector
    get() {
        if (_Finance != null) return _Finance!!
        
        _Finance = ImageVector.Builder(
            name = "finance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(40f, -120f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(360f)
                horizontalLineTo(240f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(560f)
                horizontalLineTo(440f)
                close()
                moveToRelative(200f, 0f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(200f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Finance!!
    }

private var _Finance: ImageVector? = null

