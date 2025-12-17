package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Fax: ImageVector
    get() {
        if (_Fax != null) return _Fax!!
        
        _Fax = ImageVector.Builder(
            name = "fax",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 160f)
                verticalLineTo(77.25f)
                arcToRelative(32f, 32f, 0f, false, false, -9.38f, -22.63f)
                lineTo(425.37f, 9.37f)
                arcTo(32f, 32f, 0f, false, false, 402.75f, 0f)
                horizontalLineTo(160f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(448f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(320f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(192f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
                moveTo(288f, 432f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveToRelative(0f, -128f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveToRelative(128f, 128f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveToRelative(0f, -128f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, -16f)
                horizontalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, true, 16f, 16f)
                close()
                moveToRelative(0f, -112f)
                horizontalLineTo(192f)
                verticalLineTo(64f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(48f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(48f)
                close()
                moveTo(64f, 128f)
                horizontalLineTo(32f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, 32f)
                verticalLineToRelative(320f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, 32f)
                horizontalLineToRelative(32f)
                arcToRelative(32f, 32f, 0f, false, false, 32f, -32f)
                verticalLineTo(160f)
                arcToRelative(32f, 32f, 0f, false, false, -32f, -32f)
                close()
            }
        }.build()
        
        return _Fax!!
    }

private var _Fax: ImageVector? = null

