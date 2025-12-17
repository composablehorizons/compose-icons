package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Vibration: ImageVector
    get() {
        if (_Vibration != null) return _Vibration!!
        
        _Vibration = ImageVector.Builder(
            name = "vibration",
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
                moveTo(8f, 5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(14f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(3f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(0f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineTo(0f)
                close()
                moveToRelative(16.5f, -6f)
                horizontalLineToRelative(-9f)
                curveTo(6.67f, 3f, 6f, 3.67f, 6f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(16f, 19f)
                horizontalLineTo(8f)
                verticalLineTo(5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(14f)
                close()
                moveTo(3f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineTo(3f)
                close()
            }
        }.build()
        
        return _Vibration!!
    }

private var _Vibration: ImageVector? = null

