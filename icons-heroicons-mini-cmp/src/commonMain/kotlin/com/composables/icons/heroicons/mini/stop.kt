package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 3f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3f, 5.25f)
                verticalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 5.25f, 17f)
                horizontalLineToRelative(9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 17f, 14.75f)
                verticalLineToRelative(-9.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 14.75f, 3f)
                horizontalLineToRelative(-9.5f)
                close()
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null

