package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.QrCode: ImageVector
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
                moveTo(4.75f, 4.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineTo(6f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 7.5f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 6f)
                verticalLineTo(3.5f)
                close()
                moveToRelative(1.5f, 0f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                horizontalLineTo(3.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.25f, 11.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 10f)
                verticalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 14f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2f, 12.5f)
                verticalLineTo(10f)
                close()
                moveToRelative(1.5f, 2.5f)
                verticalLineTo(10f)
                horizontalLineTo(6f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.25f, 4.25f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.5f, 1.5f)
                verticalLineTo(6f)
                arcTo(1.5f, 1.5f, 0f, false, false, 10f, 7.5f)
                horizontalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 14f, 6f)
                verticalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 12.5f, 2f)
                horizontalLineTo(10f)
                close()
                moveToRelative(2.5f, 1.5f)
                horizontalLineTo(10f)
                verticalLineTo(6f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 9.417f)
                arcToRelative(0.917f, 0.917f, 0f, true, true, 1.833f, 0f)
                arcToRelative(0.917f, 0.917f, 0f, false, true, -1.833f, 0f)
                close()
                moveTo(8.5f, 13.083f)
                arcToRelative(0.917f, 0.917f, 0f, true, true, 1.833f, 0f)
                arcToRelative(0.917f, 0.917f, 0f, false, true, -1.833f, 0f)
                close()
                moveTo(13.083f, 8.5f)
                arcToRelative(0.917f, 0.917f, 0f, true, false, 0f, 1.833f)
                arcToRelative(0.917f, 0.917f, 0f, false, false, 0f, -1.833f)
                close()
                moveTo(12.166f, 13.084f)
                arcToRelative(0.917f, 0.917f, 0f, true, true, 1.833f, 0f)
                arcToRelative(0.917f, 0.917f, 0f, false, true, -1.833f, 0f)
                close()
                moveTo(11.25f, 10.333f)
                arcToRelative(0.917f, 0.917f, 0f, true, false, 0f, 1.833f)
                arcToRelative(0.917f, 0.917f, 0f, false, false, 0f, -1.833f)
                close()
            }
        }.build()
        
        return _QrCode!!
    }

private var _QrCode: ImageVector? = null

