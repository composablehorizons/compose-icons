package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopePaper: ImageVector
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
                moveTo(6.5f, 9.5f)
                lineTo(3f, 7.5f)
                verticalLineToRelative(-6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 4.5f, 0f)
                horizontalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, true, 13f, 1.5f)
                verticalLineToRelative(6f)
                lineToRelative(-3.5f, 2f)
                lineTo(8f, 8.75f)
                close()
                moveTo(1.059f, 3.635f)
                lineTo(2f, 3.133f)
                verticalLineToRelative(3.753f)
                lineTo(0f, 5.713f)
                verticalLineTo(5.4f)
                arcToRelative(2f, 2f, 0f, false, true, 1.059f, -1.765f)
                moveTo(16f, 5.713f)
                lineToRelative(-2f, 1.173f)
                verticalLineTo(3.133f)
                lineToRelative(0.941f, 0.502f)
                arcTo(2f, 2f, 0f, false, true, 16f, 5.4f)
                close()
                moveToRelative(0f, 1.16f)
                lineToRelative(-5.693f, 3.337f)
                lineTo(16f, 13.372f)
                verticalLineToRelative(-6.5f)
                close()
                moveToRelative(-8f, 3.199f)
                lineToRelative(7.941f, 4.412f)
                arcTo(2f, 2f, 0f, false, true, 14f, 16f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.941f, -1.516f)
                close()
                moveToRelative(-8f, 3.3f)
                lineToRelative(5.693f, -3.162f)
                lineTo(0f, 6.873f)
                verticalLineToRelative(6.5f)
                close()
            }
        }.build()
        
        return _EnvelopePaper!!
    }

private var _EnvelopePaper: ImageVector? = null

