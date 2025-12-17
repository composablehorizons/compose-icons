package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.QrCode: ImageVector
    get() {
        if (_QrCode != null) return _QrCode!!
        
        _QrCode = ImageVector.Builder(
            name = "qr-code",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
                moveTo(5f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                close()
                moveTo(4f, 12f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 10f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(-5f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                close()
                moveToRelative(11f, -9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(0f)
                close()
                moveToRelative(5f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(1f)
                close()
                moveTo(8f, 1f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(1f)
                close()
                moveToRelative(0f, 5f)
                verticalLineTo(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                close()
                moveTo(6f, 8f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineTo(6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                verticalLineTo(8f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                verticalLineTo(8f)
                horizontalLineTo(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                close()
                moveToRelative(10f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(2f, 3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineTo(9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-4f, -1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                verticalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineTo(7f)
                close()
                moveToRelative(9f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
            }
        }.build()
        
        return _QrCode!!
    }

private var _QrCode: ImageVector? = null

