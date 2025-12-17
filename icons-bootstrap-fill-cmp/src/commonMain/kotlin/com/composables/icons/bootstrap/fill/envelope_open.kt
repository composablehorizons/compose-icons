package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeOpen: ImageVector
    get() {
        if (_EnvelopeOpen != null) return _EnvelopeOpen!!
        
        _EnvelopeOpen = ImageVector.Builder(
            name = "envelope-open",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.941f, 0.435f)
                arcToRelative(2f, 2f, 0f, false, false, -1.882f, 0f)
                lineToRelative(-6f, 3.2f)
                arcTo(2f, 2f, 0f, false, false, 0f, 5.4f)
                verticalLineToRelative(0.314f)
                lineToRelative(6.709f, 3.932f)
                lineTo(8f, 8.928f)
                lineToRelative(1.291f, 0.718f)
                lineTo(16f, 5.714f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.059f, -1.765f)
                close()
                moveTo(16f, 6.873f)
                lineToRelative(-5.693f, 3.337f)
                lineTo(16f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveToRelative(-0.059f, 7.611f)
                lineTo(8f, 10.072f)
                lineTo(0.059f, 14.484f)
                arcTo(2f, 2f, 0f, false, false, 2f, 16f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.941f, -1.516f)
                moveTo(0f, 13.373f)
                lineToRelative(5.693f, -3.163f)
                lineTo(0f, 6.873f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

