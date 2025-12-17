package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Magic: ImageVector
    get() {
        if (_Magic != null) return _Magic!!
        
        _Magic = ImageVector.Builder(
            name = "magic",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 2.672f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 1f, 0f)
                verticalLineTo(0.843f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                close()
                moveToRelative(4.5f, 0.035f)
                arcTo(0.5f, 0.5f, 0f, false, false, 13.293f, 2f)
                lineTo(12f, 3.293f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.707f, 0.707f)
                close()
                moveTo(7.293f, 4f)
                arcTo(0.5f, 0.5f, 0f, true, false, 8f, 3.293f)
                lineTo(6.707f, 2f)
                arcTo(0.5f, 0.5f, 0f, false, false, 6f, 2.707f)
                close()
                moveToRelative(-0.621f, 2.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineTo(4.843f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                close()
                moveToRelative(8.485f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, -1f)
                horizontalLineToRelative(-1.829f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                close()
                moveTo(13.293f, 10f)
                arcTo(0.5f, 0.5f, 0f, true, false, 14f, 9.293f)
                lineTo(12.707f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, 0.707f)
                close()
                moveTo(9.5f, 11.157f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(9.328f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                close()
                moveToRelative(1.854f, -5.097f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.706f)
                lineToRelative(-0.708f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineTo(8.646f, 5.94f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                lineToRelative(0.708f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0f)
                lineToRelative(1.293f, -1.293f)
                close()
                moveToRelative(-3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.706f)
                lineToRelative(-0.708f, -0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineTo(0.646f, 13.94f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.707f)
                lineToRelative(0.708f, 0.708f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0f)
                close()
            }
        }.build()
        
        return _Magic!!
    }

private var _Magic: ImageVector? = null

