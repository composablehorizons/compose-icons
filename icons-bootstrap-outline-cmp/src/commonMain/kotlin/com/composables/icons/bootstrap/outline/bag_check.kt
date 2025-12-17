package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BagCheck: ImageVector
    get() {
        if (_BagCheck != null) return _BagCheck!!
        
        _BagCheck = ImageVector.Builder(
            name = "bag-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.854f, 8.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineTo(7.5f, 10.793f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.5f, 2.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 8f, 1f)
                moveToRelative(3.5f, 3f)
                verticalLineToRelative(-0.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -7f, 0f)
                verticalLineTo(4f)
                horizontalLineTo(1f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(4f)
                close()
                moveTo(2f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _BagCheck!!
    }

private var _BagCheck: ImageVector? = null

