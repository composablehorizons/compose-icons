package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Code: ImageVector
    get() {
        if (_Code != null) return _Code!!
        
        _Code = ImageVector.Builder(
            name = "code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.854f, 4.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.708f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(2.707f, 8f)
                close()
                moveToRelative(4.292f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, -0.708f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineToRelative(-3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(13.293f, 8f)
                close()
            }
        }.build()
        
        return _Code!!
    }

private var _Code: ImageVector? = null

