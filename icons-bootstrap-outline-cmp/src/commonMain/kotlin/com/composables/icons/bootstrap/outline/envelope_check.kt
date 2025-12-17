package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.EnvelopeCheck: ImageVector
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
                moveTo(2f, 2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(8.01f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.966f, -0.741f)
                lineToRelative(5.64f, -3.471f)
                lineTo(8f, 9.583f)
                lineToRelative(7f, -4.2f)
                verticalLineTo(8.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
                verticalLineTo(4f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveToRelative(3.708f, 6.208f)
                lineTo(1f, 11.105f)
                verticalLineTo(5.383f)
                close()
                moveTo(1f, 4.217f)
                verticalLineTo(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(0.217f)
                lineToRelative(-7f, 4.2f)
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

