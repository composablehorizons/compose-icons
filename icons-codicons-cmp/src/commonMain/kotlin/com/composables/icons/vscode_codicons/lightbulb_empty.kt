package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.LightbulbEmpty: ImageVector
    get() {
        if (_LightbulbEmpty != null) return _LightbulbEmpty!!
        
        _LightbulbEmpty = ImageVector.Builder(
            name = "lightbulb-empty",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 6.5f)
                curveTo(4.5f, 4.567f, 6.067f, 3f, 8f, 3f)
                curveTo(9.933f, 3f, 11.5f, 4.567f, 11.5f, 6.5f)
                curveTo(11.5f, 7.47709f, 11.1003f, 8.35991f, 10.4542f, 8.99541f)
                curveTo(10.2612f, 9.18524f, 10.0912f, 9.43189f, 10.0095f, 9.73139f)
                lineTo(9.66356f, 11f)
                horizontalLineTo(6.33644f)
                lineTo(5.99046f, 9.73139f)
                curveTo(5.90878f, 9.43189f, 5.73883f, 9.18524f, 5.54584f, 8.99541f)
                curveTo(4.89973f, 8.35991f, 4.5f, 7.47709f, 4.5f, 6.5f)
                close()
                moveTo(6.60917f, 12f)
                horizontalLineTo(9.39083f)
                lineTo(9.21859f, 12.6316f)
                curveTo(9.15926f, 12.8491f, 8.96168f, 13f, 8.7362f, 13f)
                horizontalLineTo(7.2638f)
                curveTo(7.03832f, 13f, 6.84074f, 12.8491f, 6.78141f, 12.6316f)
                lineTo(6.60917f, 12f)
                close()
                moveTo(8f, 2f)
                curveTo(5.51472f, 2f, 3.5f, 4.01472f, 3.5f, 6.5f)
                curveTo(3.5f, 7.75601f, 4.01523f, 8.89258f, 4.8446f, 9.70834f)
                curveTo(4.94136f, 9.80352f, 5.00044f, 9.9019f, 5.02569f, 9.9945f)
                lineTo(5.81665f, 12.8947f)
                curveTo(5.99463f, 13.5473f, 6.58737f, 14f, 7.2638f, 14f)
                horizontalLineTo(8.7362f)
                curveTo(9.41263f, 14f, 10.0054f, 13.5473f, 10.1834f, 12.8947f)
                lineTo(10.9743f, 9.9945f)
                curveTo(10.9996f, 9.9019f, 11.0586f, 9.80352f, 11.1554f, 9.70834f)
                curveTo(11.9848f, 8.89258f, 12.5f, 7.75601f, 12.5f, 6.5f)
                curveTo(12.5f, 4.01472f, 10.4853f, 2f, 8f, 2f)
                close()
            }
        }.build()
        
        return _LightbulbEmpty!!
    }

private var _LightbulbEmpty: ImageVector? = null

