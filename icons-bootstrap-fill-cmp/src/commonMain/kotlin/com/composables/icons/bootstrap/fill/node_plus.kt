package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.NodePlus: ImageVector
    get() {
        if (_NodePlus != null) return _NodePlus!!
        
        _NodePlus = ImageVector.Builder(
            name = "node-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 13f)
                arcToRelative(5f, 5f, 0f, true, false, -4.975f, -5.5f)
                horizontalLineTo(4f)
                arcTo(1.5f, 1.5f, 0f, false, false, 2.5f, 6f)
                horizontalLineToRelative(-1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 7.5f)
                verticalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 10f)
                horizontalLineToRelative(1f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4f, 8.5f)
                horizontalLineToRelative(2.025f)
                arcTo(5f, 5f, 0f, false, false, 11f, 13f)
                moveToRelative(0.5f, -7.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
            }
        }.build()
        
        return _NodePlus!!
    }

private var _NodePlus: ImageVector? = null

