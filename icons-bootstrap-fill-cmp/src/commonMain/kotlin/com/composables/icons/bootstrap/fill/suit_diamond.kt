package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SuitDiamond: ImageVector
    get() {
        if (_SuitDiamond != null) return _SuitDiamond!!
        
        _SuitDiamond = ImageVector.Builder(
            name = "suit-diamond",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.45f, 7.4f)
                lineTo(7.2f, 1.067f)
                arcToRelative(1f, 1f, 0f, false, true, 1.6f, 0f)
                lineTo(13.55f, 7.4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.2f)
                lineTo(8.8f, 14.933f)
                arcToRelative(1f, 1f, 0f, false, true, -1.6f, 0f)
                lineTo(2.45f, 8.6f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.2f)
            }
        }.build()
        
        return _SuitDiamond!!
    }

private var _SuitDiamond: ImageVector? = null

