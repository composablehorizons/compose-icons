package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Collection: ImageVector
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
                moveTo(0f, 13f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 13f)
                verticalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, -1.5f)
                horizontalLineToRelative(-13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 6f)
                close()
                moveTo(2f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-11f)
                arcTo(0.5f, 0.5f, 0f, false, false, 2f, 3f)
                moveToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcTo(0.5f, 0.5f, 0f, false, false, 4f, 1f)
            }
        }.build()
        
        return _Collection!!
    }

private var _Collection: ImageVector? = null

