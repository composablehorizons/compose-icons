package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Percent: ImageVector
    get() {
        if (_Percent != null) return _Percent!!
        
        _Percent = ImageVector.Builder(
            name = "percent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.442f, 2.558f)
                arcToRelative(0.625f, 0.625f, 0f, false, true, 0f, 0.884f)
                lineToRelative(-10f, 10f)
                arcToRelative(0.625f, 0.625f, 0f, true, true, -0.884f, -0.884f)
                lineToRelative(10f, -10f)
                arcToRelative(0.625f, 0.625f, 0f, false, true, 0.884f, 0f)
                moveTo(4.5f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(0f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
                moveToRelative(7f, 6f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, 3f)
                moveToRelative(0f, 1f)
                arcToRelative(2.5f, 2.5f, 0f, true, false, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 5f)
            }
        }.build()
        
        return _Percent!!
    }

private var _Percent: ImageVector? = null

