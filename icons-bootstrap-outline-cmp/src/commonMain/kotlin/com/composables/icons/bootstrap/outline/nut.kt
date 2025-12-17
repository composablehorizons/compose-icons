package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Nut: ImageVector
    get() {
        if (_Nut != null) return _Nut!!
        
        _Nut = ImageVector.Builder(
            name = "nut",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.42f, 2f)
                lineToRelative(3.428f, 6f)
                lineToRelative(-3.428f, 6f)
                horizontalLineTo(4.58f)
                lineTo(1.152f, 8f)
                lineTo(4.58f, 2f)
                close()
                moveTo(4.58f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.868f, 0.504f)
                lineToRelative(-3.428f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 0.992f)
                lineToRelative(3.428f, 6f)
                arcTo(1f, 1f, 0f, false, false, 4.58f, 15f)
                horizontalLineToRelative(6.84f)
                arcToRelative(1f, 1f, 0f, false, false, 0.868f, -0.504f)
                lineToRelative(3.429f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -0.992f)
                lineToRelative(-3.429f, -6f)
                arcTo(1f, 1f, 0f, false, false, 11.42f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.848f, 5.933f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 2.5f, 4.33f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -2.5f, -4.33f)
                moveToRelative(-1.78f, 3.915f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, 6.061f, -3.5f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.062f, 3.5f)
                close()
            }
        }.build()
        
        return _Nut!!
    }

private var _Nut: ImageVector? = null

