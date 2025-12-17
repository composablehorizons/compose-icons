package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Iso: ImageVector
    get() {
        if (_Iso != null) return _Iso!!
        
        _Iso = ImageVector.Builder(
            name = "iso",
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
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5.5f, 7.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(7.5f)
                verticalLineTo(9f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7.5f)
                close()
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                lineTo(19f, 5f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-2f, -2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-5f)
                verticalLineTo(17f)
                horizontalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Iso!!
    }

private var _Iso: ImageVector? = null

