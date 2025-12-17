package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeOpen: ImageVector
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
                moveTo(8.47f, 1.318f)
                arcToRelative(1f, 1f, 0f, false, false, -0.94f, 0f)
                lineToRelative(-6f, 3.2f)
                arcTo(1f, 1f, 0f, false, false, 1f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(5.75f, 3.45f)
                lineTo(8f, 8.917f)
                lineToRelative(1.25f, 0.75f)
                lineTo(15f, 6.217f)
                verticalLineTo(5.4f)
                arcToRelative(1f, 1f, 0f, false, false, -0.53f, -0.882f)
                close()
                moveTo(15f, 7.383f)
                lineToRelative(-4.778f, 2.867f)
                lineTo(15f, 13.117f)
                close()
                moveToRelative(-0.035f, 6.88f)
                lineTo(8f, 10.082f)
                lineToRelative(-6.965f, 4.18f)
                arcTo(1f, 1f, 0f, false, false, 2f, 15f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 0.965f, -0.738f)
                close()
                moveTo(1f, 13.116f)
                lineToRelative(4.778f, -2.867f)
                lineTo(1f, 7.383f)
                verticalLineToRelative(5.734f)
                close()
                moveTo(7.059f, 0.435f)
                arcToRelative(2f, 2f, 0f, false, true, 1.882f, 0f)
                lineToRelative(6f, 3.2f)
                arcTo(2f, 2f, 0f, false, true, 16f, 5.4f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.059f, -1.765f)
                close()
            }
        }.build()
        
        return _EnvelopeOpen!!
    }

private var _EnvelopeOpen: ImageVector? = null

