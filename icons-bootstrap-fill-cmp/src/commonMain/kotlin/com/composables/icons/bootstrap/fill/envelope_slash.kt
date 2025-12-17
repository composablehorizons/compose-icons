package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeSlash: ImageVector
    get() {
        if (_EnvelopeSlash != null) return _EnvelopeSlash!!
        
        _EnvelopeSlash = ImageVector.Builder(
            name = "envelope-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0.05f, 3.555f)
                arcTo(2f, 2f, 0f, false, true, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, true, 1.95f, 1.555f)
                lineTo(8f, 8.414f)
                close()
                moveTo(0f, 4.697f)
                verticalLineToRelative(7.104f)
                lineToRelative(5.803f, -3.558f)
                close()
                moveTo(6.761f, 8.83f)
                lineToRelative(-6.57f, 4.026f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(6.256f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, 1.606f, -3.446f)
                lineToRelative(-0.367f, -0.225f)
                lineTo(8f, 9.586f)
                close()
                moveTo(16f, 4.697f)
                verticalLineToRelative(4.974f)
                arcTo(4.5f, 4.5f, 0f, false, false, 12.5f, 8f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -1.965f, 0.45f)
                lineToRelative(-0.338f, -0.207f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.975f, 10.025f)
                arcToRelative(3.5f, 3.5f, 0f, true, false, -4.95f, 4.95f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4.95f, -4.95f)
                moveToRelative(-4.243f, 0.707f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 3.147f, -0.318f)
                lineToRelative(-3.465f, 3.465f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0.318f, -3.147f)
                moveToRelative(0.39f, 3.854f)
                lineToRelative(3.464f, -3.465f)
                arcToRelative(2.501f, 2.501f, 0f, false, true, -3.465f, 3.465f)
                close()
            }
        }.build()
        
        return _EnvelopeSlash!!
    }

private var _EnvelopeSlash: ImageVector? = null

