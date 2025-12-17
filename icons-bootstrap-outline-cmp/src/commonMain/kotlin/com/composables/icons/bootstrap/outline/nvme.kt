package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Nvme: ImageVector
    get() {
        if (_Nvme != null) return _Nvme!!
        
        _Nvme = ImageVector.Builder(
            name = "nvme",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 4f)
                horizontalLineToRelative(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                horizontalLineToRelative(-1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 11f)
                verticalLineTo(7.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 7f)
                horizontalLineToRelative(1f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, -0.5f)
                horizontalLineToRelative(-1f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0f, 6f)
                verticalLineTo(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                close()
                moveToRelative(1f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(1.25f, 1.25f, 0f, true, true, 0f, 2.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                horizontalLineTo(15f)
                verticalLineTo(9.415f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -2.83f)
                verticalLineTo(5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-2f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(5f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                close()
                moveToRelative(3f, -0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                close()
                moveTo(9f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Nvme!!
    }

private var _Nvme: ImageVector? = null

