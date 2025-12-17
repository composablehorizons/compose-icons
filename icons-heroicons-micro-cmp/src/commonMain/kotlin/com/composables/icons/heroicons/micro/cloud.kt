package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 9.5f)
                arcTo(3.5f, 3.5f, 0f, false, false, 4.5f, 13f)
                horizontalLineTo(12f)
                arcToRelative(3f, 3f, 0f, false, false, 0.917f, -5.857f)
                arcToRelative(2.503f, 2.503f, 0f, false, false, -3.198f, -3.019f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -6.628f, 2.171f)
                arcTo(3.5f, 3.5f, 0f, false, false, 1f, 9.5f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

