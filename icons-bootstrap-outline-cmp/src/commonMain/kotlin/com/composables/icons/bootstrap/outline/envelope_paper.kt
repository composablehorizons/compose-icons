package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopePaper: ImageVector
    get() {
        if (_EnvelopePaper != null) return _EnvelopePaper!!
        
        _EnvelopePaper = ImageVector.Builder(
            name = "envelope-paper",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(1.133f)
                lineToRelative(-0.941f, 0.502f)
                arcTo(2f, 2f, 0f, false, false, 0f, 5.4f)
                verticalLineTo(14f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, false, -1.059f, -1.765f)
                lineTo(14f, 3.133f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(10f, 4.267f)
                lineToRelative(0.47f, 0.25f)
                arcTo(1f, 1f, 0f, false, true, 15f, 5.4f)
                verticalLineToRelative(0.817f)
                lineToRelative(-1f, 0.6f)
                close()
                moveToRelative(-1f, 3.15f)
                lineToRelative(-3.75f, 2.25f)
                lineTo(8f, 8.917f)
                lineToRelative(-1.25f, 0.75f)
                lineTo(3f, 7.417f)
                verticalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(8f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                close()
                moveToRelative(-11f, -0.6f)
                lineToRelative(-1f, -0.6f)
                verticalLineTo(5.4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.53f, -0.882f)
                lineTo(2f, 4.267f)
                close()
                moveToRelative(13f, 0.566f)
                verticalLineToRelative(5.734f)
                lineToRelative(-4.778f, -2.867f)
                close()
                moveToRelative(-0.035f, 6.88f)
                arcTo(1f, 1f, 0f, false, true, 14f, 15f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.965f, -0.738f)
                lineTo(8f, 10.083f)
                close()
                moveTo(1f, 13.116f)
                verticalLineTo(7.383f)
                lineToRelative(4.778f, 2.867f)
                lineTo(1f, 13.117f)
                close()
            }
        }.build()
        
        return _EnvelopePaper!!
    }

private var _EnvelopePaper: ImageVector? = null

