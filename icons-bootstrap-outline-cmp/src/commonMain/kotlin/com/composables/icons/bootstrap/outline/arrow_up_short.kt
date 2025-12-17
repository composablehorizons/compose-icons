package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ArrowUpShort: ImageVector
    get() {
        if (_ArrowUpShort != null) return _ArrowUpShort!!
        
        _ArrowUpShort = ImageVector.Builder(
            name = "arrow-up-short",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineTo(5.707f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-3f, -3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.708f, 0.708f)
                lineTo(7.5f, 5.707f)
                verticalLineTo(11.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
            }
        }.build()
        
        return _ArrowUpShort!!
    }

private var _ArrowUpShort: ImageVector? = null

