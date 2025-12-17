package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ArrowUpCircle: ImageVector
    get() {
        if (_ArrowUpCircle != null) return _ArrowUpCircle!!
        
        _ArrowUpCircle = ImageVector.Builder(
            name = "arrow-up-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, false, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, false, 16f, 0f)
                moveToRelative(-7.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5.707f)
                lineTo(5.354f, 7.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, -0.708f)
                lineToRelative(3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(8.5f, 5.707f)
                close()
            }
        }.build()
        
        return _ArrowUpCircle!!
    }

private var _ArrowUpCircle: ImageVector? = null

