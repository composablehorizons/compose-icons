package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronBarUp: ImageVector
    get() {
        if (_ChevronBarUp != null) return _ChevronBarUp!!
        
        _ChevronBarUp = ImageVector.Builder(
            name = "chevron-bar-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.646f, 11.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineTo(8f, 8.207f)
                lineToRelative(3.646f, 3.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                moveTo(2.4f, 5.2f)
                curveToRelative(0f, 0.22f, 0.18f, 0.4f, 0.4f, 0.4f)
                horizontalLineToRelative(10.4f)
                arcToRelative(0.4f, 0.4f, 0f, false, false, 0f, -0.8f)
                horizontalLineTo(2.8f)
                arcToRelative(0.4f, 0.4f, 0f, false, false, -0.4f, 0.4f)
            }
        }.build()
        
        return _ChevronBarUp!!
    }

private var _ChevronBarUp: ImageVector? = null

