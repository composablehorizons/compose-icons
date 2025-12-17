package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Power: ImageVector
    get() {
        if (_Power != null) return _Power!!
        
        _Power = ImageVector.Builder(
            name = "power",
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
                moveTo(8f, 13.65f)
                lineToRelative(3.5f, 3.52f)
                verticalLineTo(19f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.83f)
                lineToRelative(3.5f, -3.51f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 7f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                horizontalLineTo(8f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-0.01f)
                curveTo(6.89f, 7f, 6f, 7.89f, 6f, 8.98f)
                verticalLineToRelative(5.52f)
                lineTo(9.5f, 18f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-3f)
                lineToRelative(3.5f, -3.5f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 6.66f)
                lineToRelative(-3.5f, 3.51f)
                verticalLineTo(19f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1.83f)
                lineTo(8f, 13.65f)
                verticalLineTo(9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4.66f)
                close()
            }
        }.build()
        
        return _Power!!
    }

private var _Power: ImageVector? = null

