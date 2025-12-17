package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Qr_code_scanner: ImageVector
    get() {
        if (_Qr_code_scanner != null) return _Qr_code_scanner!!
        
        _Qr_code_scanner = ImageVector.Builder(
            name = "qr_code_scanner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(9.5f)
                moveTo(11f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(5f)
                lineTo(11f, 5f)
                close()
                moveTo(9.5f, 14.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(9.5f)
                moveTo(11f, 13f)
                horizontalLineTo(5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(13f)
                lineTo(11f, 13f)
                close()
                moveTo(17.5f, 6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineTo(17.5f)
                moveTo(19f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineTo(5f)
                lineTo(19f, 5f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                close()
                moveTo(14.5f, 14.5f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(16f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(13f)
                verticalLineTo(16f)
                close()
                moveTo(14.5f, 17.5f)
                horizontalLineTo(16f)
                verticalLineTo(19f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(16f)
                verticalLineTo(16f)
                close()
                moveTo(17.5f, 14.5f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(17.5f, 17.5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(17.5f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineTo(4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                verticalLineTo(7f)
                close()
                moveTo(22f, 22f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineTo(22f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineTo(22f)
                close()
                moveTo(2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(2f)
                horizontalLineTo(2f)
                close()
            }
        }.build()
        
        return _Qr_code_scanner!!
    }

private var _Qr_code_scanner: ImageVector? = null

