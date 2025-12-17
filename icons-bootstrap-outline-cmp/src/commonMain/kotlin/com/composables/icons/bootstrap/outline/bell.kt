package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Bell: ImageVector
    get() {
        if (_Bell != null) return _Bell!!
        
        _Bell = ImageVector.Builder(
            name = "bell",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 16f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                moveTo(8f, 1.918f)
                lineToRelative(-0.797f, 0.161f)
                arcTo(4f, 4f, 0f, false, false, 4f, 6f)
                curveToRelative(0f, 0.628f, -0.134f, 2.197f, -0.459f, 3.742f)
                curveToRelative(-0.16f, 0.767f, -0.376f, 1.566f, -0.663f, 2.258f)
                horizontalLineToRelative(10.244f)
                curveToRelative(-0.287f, -0.692f, -0.502f, -1.49f, -0.663f, -2.258f)
                curveTo(12.134f, 8.197f, 12f, 6.628f, 12f, 6f)
                arcToRelative(4f, 4f, 0f, false, false, -3.203f, -3.92f)
                close()
                moveTo(14.22f, 12f)
                curveToRelative(0.223f, 0.447f, 0.481f, 0.801f, 0.78f, 1f)
                horizontalLineTo(1f)
                curveToRelative(0.299f, -0.199f, 0.557f, -0.553f, 0.78f, -1f)
                curveTo(2.68f, 10.2f, 3f, 6.88f, 3f, 6f)
                curveToRelative(0f, -2.42f, 1.72f, -4.44f, 4.005f, -4.901f)
                arcToRelative(1f, 1f, 0f, true, true, 1.99f, 0f)
                arcTo(5f, 5f, 0f, false, true, 13f, 6f)
                curveToRelative(0f, 0.88f, 0.32f, 4.2f, 1.22f, 6f)
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

