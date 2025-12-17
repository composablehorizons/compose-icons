package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Area_chart: ImageVector
    get() {
        if (_Area_chart != null) return _Area_chart!!
        
        _Area_chart = ImageVector.Builder(
            name = "area_chart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 640f)
                lineTo(464f, 346f)
                lineTo(305f, 565f)
                lineTo(120f, 420f)
                verticalLineToRelative(-140f)
                lineToRelative(160f, 120f)
                lineToRelative(200f, -280f)
                lineToRelative(200f, 160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(360f)
                close()
                moveTo(120f, 800f)
                verticalLineToRelative(-280f)
                lineToRelative(200f, 160f)
                lineToRelative(160f, -220f)
                lineToRelative(360f, 281f)
                verticalLineToRelative(59f)
                horizontalLineTo(120f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null

