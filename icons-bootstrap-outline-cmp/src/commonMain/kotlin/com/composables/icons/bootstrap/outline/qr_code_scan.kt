package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.QrCodeScan: ImageVector
    get() {
        if (_QrCodeScan != null) return _QrCodeScan!!
        
        _QrCodeScan = ImageVector.Builder(
            name = "qr-code-scan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 0.5f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(1f)
                verticalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
                moveToRelative(12f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveTo(0.5f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(15f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveToRelative(15f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineTo(15f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                moveTo(4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 2f)
                horizontalLineTo(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(3f, 3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                close()
                moveToRelative(2f, 8f)
                horizontalLineTo(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 9f)
                horizontalLineTo(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveToRelative(-4f, 1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(3f)
                close()
                moveToRelative(8f, -6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineTo(9f)
                close()
                moveToRelative(1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineTo(3f)
                close()
                moveTo(8f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                verticalLineTo(8f)
                close()
                moveToRelative(2f, 2f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                close()
                moveToRelative(4f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                close()
                moveToRelative(-4f, 2f)
                verticalLineToRelative(-1f)
                horizontalLineTo(8f)
                verticalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _QrCodeScan!!
    }

private var _QrCodeScan: ImageVector? = null

