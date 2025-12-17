package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Envelope: ImageVector
    get() {
        if (_Envelope != null) return _Envelope!!
        
        _Envelope = ImageVector.Builder(
            name = "envelope",
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
                lineToRelative(-6.57f, 4.027f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 1.808f, -1.144f)
                lineToRelative(-6.57f, -4.027f)
                lineTo(8f, 9.586f)
                close()
                moveToRelative(3.436f, -0.586f)
                lineTo(16f, 11.801f)
                verticalLineTo(4.697f)
                close()
            }
        }.build()
        
        return _Envelope!!
    }

private var _Envelope: ImageVector? = null

