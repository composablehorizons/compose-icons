package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Health_metrics: ImageVector
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
                verticalLineToRelative(-160f)
                horizontalLineToRelative(258f)
                lineToRelative(68f, 103f)
                horizontalLineToRelative(72f)
                lineToRelative(54f, -173f)
                lineToRelative(46f, 70f)
                horizontalLineToRelative(302f)
                verticalLineToRelative(160f)
                horizontalLineTo(680f)
                verticalLineToRelative(200f)
                horizontalLineTo(280f)
                close()
                moveToRelative(148f, -370f)
                lineToRelative(-47f, -70f)
                horizontalLineTo(80f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(160f)
                horizontalLineTo(621f)
                lineToRelative(-68f, -102f)
                horizontalLineToRelative(-71f)
                lineToRelative(-54f, 172f)
                close()
            }
        }.build()
        
        return _Health_metrics!!
    }

private var _Health_metrics: ImageVector? = null

