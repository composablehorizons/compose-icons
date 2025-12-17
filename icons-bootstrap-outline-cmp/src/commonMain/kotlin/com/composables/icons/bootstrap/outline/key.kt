package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Key: ImageVector
    get() {
        if (_Key != null) return _Key!!
        
        _Key = ImageVector.Builder(
            name = "key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                arcToRelative(4f, 4f, 0f, false, true, 7.465f, -2f)
                horizontalLineTo(14f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.354f, 0.146f)
                lineToRelative(1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineTo(13f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineTo(11f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineTo(9f, 9.207f)
                lineToRelative(-0.646f, 0.647f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 10f)
                horizontalLineToRelative(-0.535f)
                arcTo(4f, 4f, 0f, false, true, 0f, 8f)
                moveToRelative(4f, -3f)
                arcToRelative(3f, 3f, 0f, true, false, 2.712f, 4.285f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.163f, 9f)
                horizontalLineToRelative(0.63f)
                lineToRelative(0.853f, -0.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.646f, -0.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineToRelative(0.646f, 0.647f)
                lineToRelative(0.793f, -0.793f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-6.63f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.451f, -0.285f)
                arcTo(3f, 3f, 0f, false, false, 4f, 5f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 8f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
        }.build()
        
        return _Key!!
    }

private var _Key: ImageVector? = null

