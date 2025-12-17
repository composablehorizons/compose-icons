package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SuitSpade: ImageVector
    get() {
        if (_SuitSpade != null) return _SuitSpade!!
        
        _SuitSpade = ImageVector.Builder(
            name = "suit-spade",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.184f, 11.246f)
                arcTo(3.5f, 3.5f, 0f, false, true, 1f, 9f)
                curveToRelative(0f, -1.602f, 1.14f, -2.633f, 2.66f, -4.008f)
                curveTo(4.986f, 3.792f, 6.602f, 2.33f, 8f, 0f)
                curveToRelative(1.398f, 2.33f, 3.014f, 3.792f, 4.34f, 4.992f)
                curveTo(13.86f, 6.367f, 15f, 7.398f, 15f, 9f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -6.184f, 2.246f)
                arcToRelative(20f, 20f, 0f, false, false, 1.582f, 2.907f)
                curveToRelative(0.231f, 0.35f, -0.02f, 0.847f, -0.438f, 0.847f)
                horizontalLineTo(6.04f)
                curveToRelative(-0.419f, 0f, -0.67f, -0.497f, -0.438f, -0.847f)
                arcToRelative(20f, 20f, 0f, false, false, 1.582f, -2.907f)
            }
        }.build()
        
        return _SuitSpade!!
    }

private var _SuitSpade: ImageVector? = null

