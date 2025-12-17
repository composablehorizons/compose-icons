package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Stop: ImageVector
    get() {
        if (_Stop != null) return _Stop!!
        
        _Stop = ImageVector.Builder(
            name = "stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 3f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 4.5f)
                verticalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 11.5f, 13f)
                horizontalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3f, 11.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 3f)
                close()
            }
        }.build()
        
        return _Stop!!
    }

private var _Stop: ImageVector? = null

