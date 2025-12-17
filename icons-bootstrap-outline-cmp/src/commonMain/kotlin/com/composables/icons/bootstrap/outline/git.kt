package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Git: ImageVector
    get() {
        if (_Git != null) return _Git!!
        
        _Git = ImageVector.Builder(
            name = "git",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.698f, 7.287f)
                lineTo(8.712f, 0.302f)
                arcToRelative(1.03f, 1.03f, 0f, false, false, -1.457f, 0f)
                lineToRelative(-1.45f, 1.45f)
                lineToRelative(1.84f, 1.84f)
                arcToRelative(1.223f, 1.223f, 0f, false, true, 1.55f, 1.56f)
                lineToRelative(1.773f, 1.774f)
                arcToRelative(1.224f, 1.224f, 0f, false, true, 1.267f, 2.025f)
                arcToRelative(1.226f, 1.226f, 0f, false, true, -2.002f, -1.334f)
                lineTo(8.58f, 5.963f)
                verticalLineToRelative(4.353f)
                arcToRelative(1.226f, 1.226f, 0f, true, true, -1.008f, -0.036f)
                verticalLineTo(5.887f)
                arcToRelative(1.226f, 1.226f, 0f, false, true, -0.666f, -1.608f)
                lineTo(5.093f, 2.465f)
                lineToRelative(-4.79f, 4.79f)
                arcToRelative(1.03f, 1.03f, 0f, false, false, 0f, 1.457f)
                lineToRelative(6.986f, 6.986f)
                arcToRelative(1.03f, 1.03f, 0f, false, false, 1.457f, 0f)
                lineToRelative(6.953f, -6.953f)
                arcToRelative(1.03f, 1.03f, 0f, false, false, 0f, -1.457f)
            }
        }.build()
        
        return _Git!!
    }

private var _Git: ImageVector? = null

