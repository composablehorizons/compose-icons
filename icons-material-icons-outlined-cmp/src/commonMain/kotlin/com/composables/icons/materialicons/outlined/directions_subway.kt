package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Directions_subway: ImageVector
    get() {
        if (_Directions_subway != null) return _Directions_subway!!
        
        _Directions_subway = ImageVector.Builder(
            name = "directions_subway",
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
                moveTo(12f, 2f)
                curveToRelative(-4f, 0f, -8f, 0.5f, -8f, 4f)
                verticalLineToRelative(9.5f)
                curveTo(4f, 17.43f, 5.57f, 19f, 7.5f, 19f)
                lineTo(6f, 20.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-0.5f)
                lineTo(16.5f, 19f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineTo(6f)
                curveToRelative(0f, -3.5f, -3.58f, -4f, -8f, -4f)
                close()
                moveToRelative(5.66f, 3f)
                horizontalLineTo(6.43f)
                curveToRelative(0.61f, -0.52f, 2.06f, -1f, 5.57f, -1f)
                curveToRelative(3.71f, 0f, 5.12f, 0.46f, 5.66f, 1f)
                close()
                moveTo(11f, 7f)
                verticalLineToRelative(3f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineToRelative(5f)
                close()
                moveToRelative(2f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineTo(7f)
                close()
                moveToRelative(3.5f, 10f)
                horizontalLineToRelative(-9f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 8.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 14f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 17f, 14.5f)
                close()
            }
        }.build()
        
        return _Directions_subway!!
    }

private var _Directions_subway: ImageVector? = null

