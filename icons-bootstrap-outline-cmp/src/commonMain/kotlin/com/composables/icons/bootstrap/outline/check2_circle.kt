package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Check2Circle: ImageVector
    get() {
        if (_Check2Circle != null) return _Check2Circle!!
        
        _Check2Circle = ImageVector.Builder(
            name = "check2-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 8f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 8.25f, -4.764f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.866f)
                arcTo(6.5f, 6.5f, 0f, true, false, 14.5f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, -11f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.354f, 3.354f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(8f, 9.293f)
                lineTo(5.354f, 6.646f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineToRelative(3f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                close()
            }
        }.build()
        
        return _Check2Circle!!
    }

private var _Check2Circle: ImageVector? = null

