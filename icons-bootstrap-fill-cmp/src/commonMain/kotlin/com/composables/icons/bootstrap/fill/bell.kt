package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Bell: ImageVector
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
                moveToRelative(0.995f, -14.901f)
                arcToRelative(1f, 1f, 0f, true, false, -1.99f, 0f)
                arcTo(5f, 5f, 0f, false, false, 3f, 6f)
                curveToRelative(0f, 1.098f, -0.5f, 6f, -2f, 7f)
                horizontalLineToRelative(14f)
                curveToRelative(-1.5f, -1f, -2f, -5.902f, -2f, -7f)
                curveToRelative(0f, -2.42f, -1.72f, -4.44f, -4.005f, -4.901f)
            }
        }.build()
        
        return _Bell!!
    }

private var _Bell: ImageVector? = null

