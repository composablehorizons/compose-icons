package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Priority: ImageVector
    get() {
        if (_Priority != null) return _Priority!!
        
        _Priority = ImageVector.Builder(
            name = "priority",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 840f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                horizontalLineToRelative(240f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                horizontalLineTo(360f)
                close()
                moveToRelative(80f, -200f)
                lineToRelative(240f, -240f)
                lineToRelative(-56f, -56f)
                lineToRelative(-184f, 184f)
                lineToRelative(-88f, -88f)
                lineToRelative(-56f, 56f)
                lineToRelative(144f, 144f)
                close()
            }
        }.build()
        
        return _Priority!!
    }

private var _Priority: ImageVector? = null

