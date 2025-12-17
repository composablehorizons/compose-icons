package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Cast_connected: ImageVector
    get() {
        if (_Cast_connected != null) return _Cast_connected!!
        
        _Cast_connected = ImageVector.Builder(
            name = "cast_connected",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveToRelative(0f, -4f)
                verticalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -3.87f, -3.13f, -7f, -7f, -7f)
                close()
                moveToRelative(18f, -7f)
                horizontalLineTo(5f)
                verticalLineToRelative(1.63f)
                curveToRelative(3.96f, 1.28f, 7.09f, 4.41f, 8.37f, 8.37f)
                horizontalLineTo(19f)
                verticalLineTo(7f)
                close()
                moveTo(1f, 10f)
                verticalLineToRelative(2f)
                curveToRelative(4.97f, 0f, 9f, 4.03f, 9f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -6.08f, -4.93f, -11f, -11f, -11f)
                close()
                moveToRelative(22f, -7f)
                horizontalLineTo(1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(3f)
                close()
            }
        }.build()
        
        return _Cast_connected!!
    }

private var _Cast_connected: ImageVector? = null

