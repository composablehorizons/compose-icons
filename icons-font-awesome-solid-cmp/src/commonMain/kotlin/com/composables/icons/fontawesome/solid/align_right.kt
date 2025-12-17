package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) return _AlignRight!!
        
        _AlignRight = ImageVector.Builder(
            name = "align-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 224f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                close()
                moveToRelative(416f, 192f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(416f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
                moveToRelative(3.17f, -384f)
                horizontalLineTo(172.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 160f, 44.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 172.83f, 96f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 448f, 83.17f)
                verticalLineTo(44.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 435.17f, 32f)
                close()
                moveToRelative(0f, 256f)
                horizontalLineTo(172.83f)
                arcTo(12.82f, 12.82f, 0f, false, false, 160f, 300.83f)
                verticalLineToRelative(38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 172.83f, 352f)
                horizontalLineToRelative(262.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 448f, 339.17f)
                verticalLineToRelative(-38.34f)
                arcTo(12.82f, 12.82f, 0f, false, false, 435.17f, 288f)
                close()
            }
        }.build()
        
        return _AlignRight!!
    }

private var _AlignRight: ImageVector? = null

