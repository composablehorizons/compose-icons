package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Divide: ImageVector
    get() {
        if (_Divide != null) return _Divide!!
        
        _Divide = ImageVector.Builder(
            name = "divide",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 4f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, -2.5f, 0f)
                arcToRelative(1.25f, 1.25f, 0f, false, true, 2.5f, 0f)
                close()
                moveTo(3f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 10f)
                close()
                moveTo(10f, 17.25f)
                arcToRelative(1.25f, 1.25f, 0f, true, false, 0f, -2.5f)
                arcToRelative(1.25f, 1.25f, 0f, false, false, 0f, 2.5f)
                close()
            }
        }.build()
        
        return _Divide!!
    }

private var _Divide: ImageVector? = null

