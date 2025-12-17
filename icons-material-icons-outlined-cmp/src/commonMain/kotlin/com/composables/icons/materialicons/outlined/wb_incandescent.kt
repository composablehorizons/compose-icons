package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wb_incandescent: ImageVector
    get() {
        if (_Wb_incandescent != null) return _Wb_incandescent!!
        
        _Wb_incandescent = ImageVector.Builder(
            name = "wb_incandescent",
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
                moveTo(3.55f, 19.09f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.79f, -1.8f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(11f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(1f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
                moveToRelative(12f, -6.95f)
                verticalLineToRelative(3.96f)
                lineToRelative(1f, 0.58f)
                curveToRelative(1.24f, 0.72f, 2f, 2.04f, 2f, 3.46f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.42f, 0.77f, -2.74f, 2f, -3.46f)
                lineToRelative(1f, -0.58f)
                verticalLineTo(4.05f)
                horizontalLineToRelative(2f)
                moveToRelative(2f, -2f)
                horizontalLineTo(9f)
                verticalLineToRelative(4.81f)
                curveTo(7.21f, 7.9f, 6f, 9.83f, 6f, 12.05f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -2.22f, -1.21f, -4.15f, -3f, -5.19f)
                verticalLineTo(2.05f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveToRelative(-2.76f, 7.71f)
                lineToRelative(1.79f, 1.8f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.8f, -1.79f)
                close()
            }
        }.build()
        
        return _Wb_incandescent!!
    }

private var _Wb_incandescent: ImageVector? = null

