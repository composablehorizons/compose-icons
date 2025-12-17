package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Area_chart: ImageVector
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
                moveTo(120f, 800f)
                verticalLineToRelative(-520f)
                lineToRelative(160f, 120f)
                lineToRelative(200f, -280f)
                lineToRelative(200f, 160f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(520f)
                horizontalLineTo(120f)
                close()
                moveToRelative(200f, -120f)
                lineToRelative(160f, -220f)
                lineToRelative(280f, 218f)
                verticalLineToRelative(-318f)
                horizontalLineTo(652f)
                lineTo(496f, 235f)
                lineTo(298f, 513f)
                lineToRelative(-98f, -73f)
                verticalLineToRelative(144f)
                lineToRelative(120f, 96f)
                close()
            }
        }.build()
        
        return _Area_chart!!
    }

private var _Area_chart: ImageVector? = null

