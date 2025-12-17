package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Copy_all: ImageVector
    get() {
        if (_Copy_all != null) return _Copy_all!!
        
        _Copy_all = ImageVector.Builder(
            name = "copy_all",
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
                moveTo(9f, 4f)
                horizontalLineTo(18f)
                verticalLineTo(16f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                horizontalLineTo(9f)
                curveTo(7.9f, 2f, 7f, 2.9f, 7f, 4f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveTo(20f, 2.9f, 19.1f, 2f, 18f, 2f)
                close()
                moveTo(18f, 16f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                horizontalLineToRelative(9f)
                verticalLineTo(16f)
                close()
                moveTo(3f, 15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(3f, 9.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                verticalLineTo(9.5f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(20f)
                close()
                moveTo(3f, 18.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(8.5f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineTo(22f)
                close()
                moveTo(13.5f, 22f)
                lineTo(13.5f, 22f)
                lineToRelative(0f, -2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0f)
                curveTo(15.5f, 21.1f, 14.6f, 22f, 13.5f, 22f)
                close()
                moveTo(5f, 6f)
                lineTo(5f, 6f)
                lineToRelative(0f, 2f)
                horizontalLineTo(3f)
                verticalLineToRelative(0f)
                curveTo(3f, 6.9f, 3.9f, 6f, 5f, 6f)
                close()
            }
        }.build()
        
        return _Copy_all!!
    }

private var _Copy_all: ImageVector? = null

