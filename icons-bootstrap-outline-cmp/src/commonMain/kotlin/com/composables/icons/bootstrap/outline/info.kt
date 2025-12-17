package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Info: ImageVector
    get() {
        if (_Info != null) return _Info!!
        
        _Info = ImageVector.Builder(
            name = "info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.93f, 6.588f)
                lineToRelative(-2.29f, 0.287f)
                lineToRelative(-0.082f, 0.38f)
                lineToRelative(0.45f, 0.083f)
                curveToRelative(0.294f, 0.07f, 0.352f, 0.176f, 0.288f, 0.469f)
                lineToRelative(-0.738f, 3.468f)
                curveToRelative(-0.194f, 0.897f, 0.105f, 1.319f, 0.808f, 1.319f)
                curveToRelative(0.545f, 0f, 1.178f, -0.252f, 1.465f, -0.598f)
                lineToRelative(0.088f, -0.416f)
                curveToRelative(-0.2f, 0.176f, -0.492f, 0.246f, -0.686f, 0.246f)
                curveToRelative(-0.275f, 0f, -0.375f, -0.193f, -0.304f, -0.533f)
                close()
                moveTo(9f, 4.5f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
            }
        }.build()
        
        return _Info!!
    }

private var _Info: ImageVector? = null

