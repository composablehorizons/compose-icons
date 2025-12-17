package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PcHorizontal: ImageVector
    get() {
        if (_PcHorizontal != null) return _PcHorizontal!!
        
        _PcHorizontal = ImageVector.Builder(
            name = "pc-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(7f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
                moveToRelative(11.5f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveTo(1f, 7.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(1.25f, 9f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0f, 0.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0f, -0.5f)
            }
        }.build()
        
        return _PcHorizontal!!
    }

private var _PcHorizontal: ImageVector? = null

