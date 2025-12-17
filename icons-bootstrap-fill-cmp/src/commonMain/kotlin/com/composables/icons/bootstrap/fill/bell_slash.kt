package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.164f, 14f)
                horizontalLineTo(15f)
                curveToRelative(-1.5f, -1f, -2f, -5.902f, -2f, -7f)
                quadToRelative(0f, -0.396f, -0.06f, -0.776f)
                close()
                moveToRelative(6.288f, -10.617f)
                arcTo(5f, 5f, 0f, false, false, 8.995f, 2.1f)
                arcToRelative(1f, 1f, 0f, true, false, -1.99f, 0f)
                arcTo(5f, 5f, 0f, false, false, 3f, 7f)
                curveToRelative(0f, 0.898f, -0.335f, 4.342f, -1.278f, 6.113f)
                close()
                moveTo(10f, 15f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                close()
                moveToRelative(-9.375f, 0.625f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, 0.75f, 0.75f)
                lineToRelative(14.75f, -14.75f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

