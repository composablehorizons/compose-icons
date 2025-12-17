package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Bars3: ImageVector
    get() {
        if (_Bars3 != null) return _Bars3!!
        
        _Bars3 = ImageVector.Builder(
            name = "bars-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3.75f, 6f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 6.75f)
                close()
                moveTo(3f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 12f)
                close()
                moveToRelative(0f, 5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Bars3!!
    }

private var _Bars3: ImageVector? = null

