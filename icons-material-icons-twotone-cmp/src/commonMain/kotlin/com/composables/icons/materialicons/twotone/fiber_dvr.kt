package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fiber_dvr: ImageVector
    get() {
        if (_Fiber_dvr != null) return _Fiber_dvr!!
        
        _Fiber_dvr = ImageVector.Builder(
            name = "fiber_dvr",
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
                moveTo(20f, 11.56f)
                verticalLineToRelative(-0.89f)
                curveToRelative(0f, -0.76f, -0.58f, -1.33f, -1.33f, -1.33f)
                horizontalLineToRelative(-3.11f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(1.33f)
                verticalLineToRelative(-1.78f)
                horizontalLineToRelative(1.02f)
                lineToRelative(0.76f, 1.78f)
                horizontalLineTo(20f)
                lineToRelative(-0.8f, -1.87f)
                curveToRelative(0.44f, -0.22f, 0.8f, -0.71f, 0.8f, -1.24f)
                close()
                moveToRelative(-1.33f, 0f)
                horizontalLineToRelative(-1.78f)
                verticalLineToRelative(-0.89f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(0.89f)
                close()
                moveTo(7.11f, 9.33f)
                horizontalLineTo(4f)
                verticalLineToRelative(5.33f)
                horizontalLineToRelative(3.11f)
                curveToRelative(0.76f, 0f, 1.33f, -0.58f, 1.33f, -1.33f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -0.75f, -0.57f, -1.33f, -1.33f, -1.33f)
                close()
                moveToRelative(0f, 4f)
                horizontalLineTo(5.33f)
                verticalLineToRelative(-2.67f)
                horizontalLineToRelative(1.78f)
                verticalLineToRelative(2.67f)
                close()
                moveToRelative(7f, -4f)
                horizontalLineToRelative(-1.34f)
                lineToRelative(-0.89f, 3.05f)
                lineTo(11f, 9.33f)
                horizontalLineTo(9.66f)
                lineToRelative(1.56f, 5.34f)
                horizontalLineToRelative(1.33f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                horizontalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.11f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14f)
                close()
            }
        }.build()
        
        return _Fiber_dvr!!
    }

private var _Fiber_dvr: ImageVector? = null

