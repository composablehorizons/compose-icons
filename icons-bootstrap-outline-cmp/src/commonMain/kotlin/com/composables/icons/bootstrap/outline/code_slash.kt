package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.CodeSlash: ImageVector
    get() {
        if (_CodeSlash != null) return _CodeSlash!!
        
        _CodeSlash = ImageVector.Builder(
            name = "code-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.478f, 1.647f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.956f, -0.294f)
                lineToRelative(-4f, 13f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.956f, 0.294f)
                close()
                moveTo(4.854f, 4.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineTo(1.707f, 8f)
                lineToRelative(3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                moveToRelative(6.292f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineTo(14.293f, 8f)
                lineToRelative(-3.147f, 3.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineToRelative(3.5f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.708f)
                lineToRelative(-3.5f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
            }
        }.build()
        
        return _CodeSlash!!
    }

private var _CodeSlash: ImageVector? = null

