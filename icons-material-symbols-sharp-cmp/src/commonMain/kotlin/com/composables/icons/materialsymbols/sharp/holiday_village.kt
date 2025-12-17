package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Holiday_village: ImageVector
    get() {
        if (_Holiday_village != null) return _Holiday_village!!
        
        _Holiday_village = ImageVector.Builder(
            name = "holiday_village",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(80f, 800f)
                verticalLineToRelative(-400f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(400f)
                horizontalLineTo(80f)
                close()
                moveToRelative(80f, -80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-287f)
                lineTo(320f, 273f)
                lineTo(160f, 433f)
                verticalLineToRelative(287f)
                close()
                moveToRelative(120f, -200f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(360f, 280f)
                verticalLineToRelative(-433f)
                lineTo(433f, 160f)
                horizontalLineToRelative(113f)
                lineToRelative(174f, 174f)
                verticalLineToRelative(466f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(160f, 0f)
                verticalLineToRelative(-499f)
                lineTo(659f, 160f)
                horizontalLineToRelative(113f)
                lineToRelative(108f, 108f)
                verticalLineToRelative(532f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(-640f, -80f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-320f)
                close()
            }
        }.build()
        
        return _Holiday_village!!
    }

private var _Holiday_village: ImageVector? = null

