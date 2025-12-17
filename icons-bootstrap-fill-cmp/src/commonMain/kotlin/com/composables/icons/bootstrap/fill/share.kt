package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Share: ImageVector
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
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

