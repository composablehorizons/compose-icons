package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Looks_two: ImageVector
    get() {
        if (_Looks_two != null) return _Looks_two!!
        
        _Looks_two = ImageVector.Builder(
            name = "looks_two",
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
                moveTo(19f, 5f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(14f)
                verticalLineTo(5f)
                close()
                moveToRelative(-4f, 6f)
                curveToRelative(0f, 1.11f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.11f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, 0.89f, 2f, 2f)
                verticalLineToRelative(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5f, 21f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(5f, 5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                close()
                moveToRelative(8f, 2f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                curveToRelative(1.1f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.11f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Looks_two!!
    }

private var _Looks_two: ImageVector? = null

