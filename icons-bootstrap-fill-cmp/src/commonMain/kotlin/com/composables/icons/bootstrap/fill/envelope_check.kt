package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeCheck: ImageVector
    get() {
        if (_EnvelopeCheck != null) return _EnvelopeCheck!!
        
        _EnvelopeCheck = ImageVector.Builder(
            name = "envelope-check",
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
                moveTo(16f, 12.5f)
                arcToRelative(3.5f, 3.5f, 0f, true, true, -7f, 0f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, 7f, 0f)
                moveToRelative(-1.993f, -1.679f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.686f, 0.172f)
                lineToRelative(-1.17f, 1.95f)
                lineToRelative(-0.547f, -0.547f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineToRelative(0.774f, 0.773f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.174f, -0.144f)
                lineToRelative(1.335f, -2.226f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.172f, -0.686f)
            }
        }.build()
        
        return _EnvelopeCheck!!
    }

private var _EnvelopeCheck: ImageVector? = null

