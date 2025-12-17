package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Mouse2: ImageVector
    get() {
        if (_Mouse2 != null) return _Mouse2!!
        
        _Mouse2 = ImageVector.Builder(
            name = "mouse2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5.188f)
                curveTo(3f, 2.341f, 5.22f, 0f, 8f, 0f)
                reflectiveCurveToRelative(5f, 2.342f, 5f, 5.188f)
                verticalLineToRelative(5.625f)
                curveTo(13f, 13.658f, 10.78f, 16f, 8f, 16f)
                reflectiveCurveToRelative(-5f, -2.342f, -5f, -5.188f)
                verticalLineTo(5.189f)
                close()
                moveToRelative(4.5f, -4.155f)
                curveTo(5.541f, 1.289f, 4f, 3.035f, 4f, 5.188f)
                verticalLineTo(5.5f)
                horizontalLineToRelative(3.5f)
                close()
                moveToRelative(1f, 0f)
                verticalLineTo(5.5f)
                horizontalLineTo(12f)
                verticalLineToRelative(-0.313f)
                curveToRelative(0f, -2.152f, -1.541f, -3.898f, -3.5f, -4.154f)
                moveTo(12f, 6.5f)
                horizontalLineTo(4f)
                verticalLineToRelative(4.313f)
                curveTo(4f, 13.145f, 5.81f, 15f, 8f, 15f)
                reflectiveCurveToRelative(4f, -1.855f, 4f, -4.188f)
                close()
            }
        }.build()
        
        return _Mouse2!!
    }

private var _Mouse2: ImageVector? = null

