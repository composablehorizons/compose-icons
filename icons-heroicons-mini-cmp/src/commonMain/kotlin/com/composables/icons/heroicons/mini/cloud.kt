package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 12.5f)
                arcTo(4.5f, 4.5f, 0f, false, false, 5.5f, 17f)
                horizontalLineTo(15f)
                arcToRelative(4f, 4f, 0f, false, false, 1.866f, -7.539f)
                arcToRelative(3.504f, 3.504f, 0f, false, false, -4.504f, -4.272f)
                arcTo(4.5f, 4.5f, 0f, false, false, 4.06f, 8.235f)
                arcTo(4.502f, 4.502f, 0f, false, false, 1f, 12.5f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

