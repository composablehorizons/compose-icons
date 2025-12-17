package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Holiday_village: ImageVector
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
                horizontalLineTo(360f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                horizontalLineTo(80f)
                close()
                moveToRelative(200f, -280f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
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
            }
        }.build()
        
        return _Holiday_village!!
    }

private var _Holiday_village: ImageVector? = null

