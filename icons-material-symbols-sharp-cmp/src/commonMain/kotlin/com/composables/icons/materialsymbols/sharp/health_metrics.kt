package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Health_metrics: ImageVector
    get() {
        if (_Health_metrics != null) return _Health_metrics!!
        
        _Health_metrics = ImageVector.Builder(
            name = "health_metrics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 880f)
                verticalLineToRelative(-200f)
                horizontalLineTo(80f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(400f)
                horizontalLineTo(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
                moveTo(160f, 440f)
                horizontalLineToRelative(221f)
                lineToRelative(47f, 70f)
                lineToRelative(54f, -172f)
                horizontalLineToRelative(71f)
                lineToRelative(68f, 102f)
                horizontalLineToRelative(179f)
                verticalLineToRelative(-80f)
                horizontalLineTo(600f)
                verticalLineToRelative(-200f)
                horizontalLineTo(360f)
                verticalLineToRelative(200f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(200f, 360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-80f)
                horizontalLineTo(578f)
                lineToRelative(-46f, -70f)
                lineToRelative(-54f, 173f)
                horizontalLineToRelative(-72f)
                lineToRelative(-68f, -103f)
                horizontalLineTo(160f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(120f, -320f)
                close()
            }
        }.build()
        
        return _Health_metrics!!
    }

private var _Health_metrics: ImageVector? = null

