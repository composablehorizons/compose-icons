package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PcDisplayHorizontal: ImageVector
    get() {
        if (_PcDisplayHorizontal != null) return _PcDisplayHorizontal!!
        
        _PcDisplayHorizontal = ImageVector.Builder(
            name = "pc-display-horizontal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 0f)
                arcTo(1.5f, 1.5f, 0f, false, false, 0f, 1.5f)
                verticalLineToRelative(7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 1.5f, 10f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineTo(1f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 16f, 8.5f)
                verticalLineToRelative(-7f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14.5f, 0f)
                close()
                moveToRelative(0f, 1f)
                horizontalLineToRelative(13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-13f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(12f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                moveToRelative(2f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                moveTo(1.5f, 12f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                moveTo(1f, 14.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0f, true, true, 0f, 0.5f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
            }
        }.build()
        
        return _PcDisplayHorizontal!!
    }

private var _PcDisplayHorizontal: ImageVector? = null

