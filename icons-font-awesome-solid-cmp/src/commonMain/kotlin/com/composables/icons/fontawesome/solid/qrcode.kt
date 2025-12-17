package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Qrcode: ImageVector
    get() {
        if (_Qrcode != null) return _Qrcode!!
        
        _Qrcode = ImageVector.Builder(
            name = "qrcode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 224f)
                horizontalLineToRelative(192f)
                verticalLineTo(32f)
                horizontalLineTo(0f)
                verticalLineToRelative(192f)
                close()
                moveTo(64f, 96f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                horizontalLineTo(64f)
                verticalLineTo(96f)
                close()
                moveToRelative(192f, -64f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(192f)
                verticalLineTo(32f)
                horizontalLineTo(256f)
                close()
                moveToRelative(128f, 128f)
                horizontalLineToRelative(-64f)
                verticalLineTo(96f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                close()
                moveTo(0f, 480f)
                horizontalLineToRelative(192f)
                verticalLineTo(288f)
                horizontalLineTo(0f)
                verticalLineToRelative(192f)
                close()
                moveToRelative(64f, -128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                horizontalLineTo(64f)
                verticalLineToRelative(-64f)
                close()
                moveToRelative(352f, -64f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(-96f)
                verticalLineToRelative(-32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-64f)
                verticalLineTo(288f)
                horizontalLineToRelative(96f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-32f)
                close()
                moveToRelative(-64f, 0f)
                horizontalLineToRelative(32f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(-32f)
                verticalLineToRelative(-32f)
                close()
            }
        }.build()
        
        return _Qrcode!!
    }

private var _Qrcode: ImageVector? = null

