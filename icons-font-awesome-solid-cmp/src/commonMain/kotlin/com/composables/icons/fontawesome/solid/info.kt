package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Info: ImageVector
    get() {
        if (_Info != null) return _Info!!
        
        _Info = ImageVector.Builder(
            name = "info",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 192f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 424.229f)
                horizontalLineToRelative(20f)
                verticalLineTo(279.771f)
                horizontalLineTo(20f)
                curveToRelative(-11.046f, 0f, -20f, -8.954f, -20f, -20f)
                verticalLineTo(212f)
                curveToRelative(0f, -11.046f, 8.954f, -20f, 20f, -20f)
                horizontalLineToRelative(112f)
                curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
                verticalLineToRelative(212.229f)
                horizontalLineToRelative(20f)
                curveToRelative(11.046f, 0f, 20f, 8.954f, 20f, 20f)
                verticalLineTo(492f)
                curveToRelative(0f, 11.046f, -8.954f, 20f, -20f, 20f)
                horizontalLineTo(20f)
                curveToRelative(-11.046f, 0f, -20f, -8.954f, -20f, -20f)
                verticalLineToRelative(-47.771f)
                curveToRelative(0f, -11.046f, 8.954f, -20f, 20f, -20f)
                close()
                moveTo(96f, 0f)
                curveTo(56.235f, 0f, 24f, 32.235f, 24f, 72f)
                reflectiveCurveToRelative(32.235f, 72f, 72f, 72f)
                reflectiveCurveToRelative(72f, -32.235f, 72f, -72f)
                reflectiveCurveTo(135.764f, 0f, 96f, 0f)
                close()
            }
        }.build()
        
        return _Info!!
    }

private var _Info: ImageVector? = null

