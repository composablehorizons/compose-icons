package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Ethernet: ImageVector
    get() {
        if (_Ethernet != null) return _Ethernet!!
        
        _Ethernet = ImageVector.Builder(
            name = "ethernet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 13.5f)
                verticalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineTo(12f)
                verticalLineTo(4.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                arcTo(0.5f, 0.5f, 0f, false, false, 10f, 3f)
                horizontalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(4f)
                horizontalLineToRelative(-1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineTo(6f)
                horizontalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(11f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                moveTo(3.75f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                moveToRelative(2f, 0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                moveToRelative(1.75f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
                moveTo(9.75f, 11f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                moveToRelative(1.75f, 0.25f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.25f, -0.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                close()
                moveTo(1f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                close()
            }
        }.build()
        
        return _Ethernet!!
    }

private var _Ethernet: ImageVector? = null

