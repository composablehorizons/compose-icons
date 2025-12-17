package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.AlignTop: ImageVector
    get() {
        if (_AlignTop != null) return _AlignTop!!
        
        _AlignTop = ImageVector.Builder(
            name = "align-top",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 15f)
                lineTo(10f, 15f)
                lineTo(10f, 3f)
                lineTo(6f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                close()
                moveToRelative(13f, -1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(-13f, 0f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-13f)
                close()
            }
        }.build()
        
        return _AlignTop!!
    }

private var _AlignTop: ImageVector? = null

