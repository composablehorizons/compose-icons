package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Get_app: ImageVector
    get() {
        if (_Get_app != null) return _Get_app!!
        
        _Get_app = ImageVector.Builder(
            name = "get_app",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.17f)
                lineTo(12f, 13.17f)
                lineTo(9.83f, 11f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                moveToRelative(2f, -2f)
                horizontalLineTo(9f)
                verticalLineToRelative(6f)
                horizontalLineTo(5f)
                lineToRelative(7f, 7f)
                lineToRelative(7f, -7f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                close()
                moveToRelative(4f, 15f)
                horizontalLineTo(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Get_app!!
    }

private var _Get_app: ImageVector? = null

