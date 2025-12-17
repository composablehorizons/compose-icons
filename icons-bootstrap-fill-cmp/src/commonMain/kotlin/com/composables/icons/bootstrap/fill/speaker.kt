package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Speaker: ImageVector
    get() {
        if (_Speaker != null) return _Speaker!!
        
        _Speaker = ImageVector.Builder(
            name = "speaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 4f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                moveToRelative(-2.5f, 6.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -3f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(6f, 4f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 4f, 0f)
                moveTo(8f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 0f, 7f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 0f, -7f)
            }
        }.build()
        
        return _Speaker!!
    }

private var _Speaker: ImageVector? = null

