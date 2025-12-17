package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Cloud: ImageVector
    get() {
        if (_Cloud != null) return _Cloud!!
        
        _Cloud = ImageVector.Builder(
            name = "cloud",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 9.75f)
                arcToRelative(6f, 6f, 0f, false, true, 11.573f, -2.226f)
                arcToRelative(3.75f, 3.75f, 0f, false, true, 4.133f, 4.303f)
                arcTo(4.5f, 4.5f, 0f, false, true, 18f, 20.25f)
                horizontalLineTo(6.75f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -2.23f, -10.004f)
                arcToRelative(6.072f, 6.072f, 0f, false, true, -0.02f, -0.496f)
                close()
            }
        }.build()
        
        return _Cloud!!
    }

private var _Cloud: ImageVector? = null

