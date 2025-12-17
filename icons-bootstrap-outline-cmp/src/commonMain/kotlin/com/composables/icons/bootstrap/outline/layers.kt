package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Layers: ImageVector
    get() {
        if (_Layers != null) return _Layers!!
        
        _Layers = ImageVector.Builder(
            name = "layers",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.235f, 1.559f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.47f, 0f)
                lineToRelative(-7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.882f)
                lineTo(3.188f, 8f)
                lineTo(0.264f, 9.559f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.882f)
                lineToRelative(7.5f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.47f, 0f)
                lineToRelative(7.5f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.882f)
                lineTo(12.813f, 8f)
                lineToRelative(2.922f, -1.559f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.882f)
                close()
                moveToRelative(3.515f, 7.008f)
                lineTo(14.438f, 10f)
                lineTo(8f, 13.433f)
                lineTo(1.562f, 10f)
                lineTo(4.25f, 8.567f)
                lineToRelative(3.515f, 1.874f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.47f, 0f)
                close()
                moveTo(8f, 9.433f)
                lineTo(1.562f, 6f)
                lineTo(8f, 2.567f)
                lineTo(14.438f, 6f)
                close()
            }
        }.build()
        
        return _Layers!!
    }

private var _Layers: ImageVector? = null

