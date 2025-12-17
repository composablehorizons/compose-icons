package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Vignette: ImageVector
    get() {
        if (_Vignette != null) return _Vignette!!
        
        _Vignette = ImageVector.Builder(
            name = "vignette",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 1f)
                arcToRelative(7f, 7f, 0f, true, false, 0f, 14f)
                arcTo(7f, 7f, 0f, false, false, 8f, 1f)
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcTo(8f, 8f, 0f, false, true, 0f, 8f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 4.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(0f, 7f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                moveToRelative(1.683f, -6.281f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.866f, 0.5f)
                moveToRelative(-3.5f, 6.062f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.866f, 0.5f)
                moveToRelative(4.598f, -4.598f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.866f)
                moveToRelative(-6.062f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.866f)
                moveTo(11.5f, 8.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(-7f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                moveToRelative(6.281f, 1.683f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.866f)
                moveToRelative(-6.062f, -3.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.5f, -0.866f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.866f)
                moveToRelative(4.598f, 4.598f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.866f, 0.5f)
                moveToRelative(-3.5f, -6.062f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.866f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.866f, 0.5f)
            }
        }.build()
        
        return _Vignette!!
    }

private var _Vignette: ImageVector? = null

