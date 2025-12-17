package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AlignLeft: ImageVector
    get() {
        if (_AlignLeft != null) return _AlignLeft!!
        
        _AlignLeft = ImageVector.Builder(
            name = "align-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.83f, 352f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 288f, 339.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 275.17f, 288f)
                horizontalLineTo(12.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 0f, 300.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 12.83f, 352f)
                close()
                moveToRelative(0f, -256f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 288f, 83.17f)
                verticalLineTo(44.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 275.17f, 32f)
                horizontalLineTo(12.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 0f, 44.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 12.83f, 96f)
                close()
                moveTo(432f, 160f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(0f, 256f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _AlignLeft!!
    }

private var _AlignLeft: ImageVector? = null

