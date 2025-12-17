package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowRightCircle: ImageVector
    get() {
        if (_ArrowRightCircle != null) return _ArrowRightCircle!!
        
        _ArrowRightCircle = ImageVector.Builder(
            name = "arrow-right-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 0f)
                arcToRelative(8f, 8f, 0f, true, true, 0f, 16f)
                arcTo(8f, 8f, 0f, false, true, 8f, 0f)
                moveTo(4.5f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5.793f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(10.293f, 7.5f)
                close()
            }
        }.build()
        
        return _ArrowRightCircle!!
    }

private var _ArrowRightCircle: ImageVector? = null

