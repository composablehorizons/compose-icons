package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Arrow_cool_down: ImageVector
    get() {
        if (_Arrow_cool_down != null) return _Arrow_cool_down!!
        
        _Arrow_cool_down = ImageVector.Builder(
            name = "arrow_cool_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                lineTo(200f, 600f)
                lineToRelative(56f, -57f)
                lineToRelative(184f, 184f)
                verticalLineToRelative(-287f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(287f)
                lineToRelative(184f, -183f)
                lineToRelative(56f, 56f)
                lineTo(480f, 880f)
                close()
                moveToRelative(-40f, -520f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
            }
        }.build()
        
        return _Arrow_cool_down!!
    }

private var _Arrow_cool_down: ImageVector? = null

