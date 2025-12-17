package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 1f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveTo(11f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0.603f, 1.628f)
                lineToRelative(-6.718f, 3.12f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 1.504f)
                lineToRelative(6.718f, 3.12f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.488f, 0.876f)
                lineToRelative(-6.718f, -3.12f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 0f, -3.256f)
                lineToRelative(6.718f, -3.12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11f, 2.5f)
                moveToRelative(-8.5f, 4f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
                moveToRelative(11f, 5.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, -3f)
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

