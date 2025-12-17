package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PCircle: ImageVector
    get() {
        if (_PCircle != null) return _PCircle!!
        
        _PCircle = ImageVector.Builder(
            name = "p-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                arcTo(7f, 7f, 0f, false, false, 1f, 8f)
                moveToRelative(15f, 0f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(5.5f, 4.002f)
                horizontalLineToRelative(2.962f)
                curveTo(10.045f, 4.002f, 11f, 5.104f, 11f, 6.586f)
                curveToRelative(0f, 1.494f, -0.967f, 2.578f, -2.55f, 2.578f)
                horizontalLineTo(6.784f)
                verticalLineTo(12f)
                horizontalLineTo(5.5f)
                close()
                moveToRelative(2.77f, 4.072f)
                curveToRelative(0.893f, 0f, 1.419f, -0.545f, 1.419f, -1.488f)
                reflectiveCurveToRelative(-0.526f, -1.482f, -1.42f, -1.482f)
                horizontalLineTo(6.778f)
                verticalLineToRelative(2.97f)
                close()
            }
        }.build()
        
        return _PCircle!!
    }

private var _PCircle: ImageVector? = null

