package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Logout: ImageVector
    get() {
        if (_Logout != null) return _Logout!!
        
        _Logout = ImageVector.Builder(
            name = "logout",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 7f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(18.17f, 11f)
                horizontalLineTo(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10.17f)
                lineToRelative(-2.58f, 2.58f)
                lineTo(17f, 17f)
                lineToRelative(5f, -5f)
                close()
                moveTo(4f, 5f)
                horizontalLineToRelative(8f)
                verticalLineTo(3f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Logout!!
    }

private var _Logout: ImageVector? = null

