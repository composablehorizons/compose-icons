package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Collection: ImageVector
    get() {
        if (_Collection != null) return _Collection!!
        
        _Collection = ImageVector.Builder(
            name = "collection",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveTo(0f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 13f)
                verticalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 6f)
                close()
                moveToRelative(1.5f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 1f, 13f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _Collection!!
    }

private var _Collection: ImageVector? = null

