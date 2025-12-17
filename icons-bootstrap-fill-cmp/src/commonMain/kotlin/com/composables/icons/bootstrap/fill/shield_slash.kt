package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.ShieldSlash: ImageVector
    get() {
        if (_ShieldSlash != null) return _ShieldSlash!!
        
        _ShieldSlash = ImageVector.Builder(
            name = "shield-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.093f, 3.093f)
                curveToRelative(-0.465f, 4.275f, 0.885f, 7.46f, 2.513f, 9.589f)
                arcToRelative(11.8f, 11.8f, 0f, false, false, 2.517f, 2.453f)
                curveToRelative(0.386f, 0.273f, 0.744f, 0.482f, 1.048f, 0.625f)
                curveToRelative(0.28f, 0.132f, 0.581f, 0.24f, 0.829f, 0.24f)
                reflectiveCurveToRelative(0.548f, -0.108f, 0.829f, -0.24f)
                arcToRelative(7f, 7f, 0f, false, false, 1.048f, -0.625f)
                arcToRelative(11.3f, 11.3f, 0f, false, false, 1.733f, -1.525f)
                close()
                moveToRelative(12.215f, 8.215f)
                lineTo(3.128f, 1.128f)
                arcTo(61f, 61f, 0f, false, true, 5.073f, 0.56f)
                curveTo(6.157f, 0.265f, 7.31f, 0f, 8f, 0f)
                reflectiveCurveToRelative(1.843f, 0.265f, 2.928f, 0.56f)
                curveToRelative(1.11f, 0.3f, 2.229f, 0.655f, 2.887f, 0.87f)
                arcToRelative(1.54f, 1.54f, 0f, false, true, 1.044f, 1.262f)
                curveToRelative(0.483f, 3.626f, -0.332f, 6.491f, -1.551f, 8.616f)
                moveToRelative(0.338f, 3.046f)
                lineToRelative(-13f, -13f)
                lineToRelative(0.708f, -0.708f)
                lineToRelative(13f, 13f)
                close()
            }
        }.build()
        
        return _ShieldSlash!!
    }

private var _ShieldSlash: ImageVector? = null

