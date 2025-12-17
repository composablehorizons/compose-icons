package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.NodeMinus: ImageVector
    get() {
        if (_NodeMinus != null) return _NodeMinus!!
        
        _NodeMinus = ImageVector.Builder(
            name = "node-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcToRelative(5f, 5f, 0f, false, true, -9.975f, 0.5f)
                horizontalLineTo(4f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 10f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 0f, 8.5f)
                verticalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1.5f, 6f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4f, 7.5f)
                horizontalLineToRelative(2.025f)
                arcTo(5f, 5f, 0f, false, true, 16f, 8f)
                moveToRelative(-2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 14f, 8f)
            }
        }.build()
        
        return _NodeMinus!!
    }

private var _NodeMinus: ImageVector? = null

