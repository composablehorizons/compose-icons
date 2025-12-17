package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Forward: ImageVector
    get() {
        if (_Forward != null) return _Forward!!
        
        _Forward = ImageVector.Builder(
            name = "forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.77f, 12.11f)
                lineToRelative(4.012f, -2.953f)
                arcToRelative(0.647f, 0.647f, 0f, false, false, 0f, -1.114f)
                lineTo(9.771f, 5.09f)
                arcToRelative(0.644f, 0.644f, 0f, false, false, -0.971f, 0.557f)
                verticalLineTo(6.65f)
                horizontalLineTo(2f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(6.8f)
                verticalLineToRelative(1.003f)
                curveToRelative(0f, 0.505f, 0.545f, 0.808f, 0.97f, 0.557f)
            }
        }.build()
        
        return _Forward!!
    }

private var _Forward: ImageVector? = null

