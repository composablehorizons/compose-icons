package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Download: ImageVector
    get() {
        if (_Download != null) return _Download!!
        
        _Download = ImageVector.Builder(
            name = "download",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(216f, 0f)
                horizontalLineToRelative(80f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                verticalLineToRelative(168f)
                horizontalLineToRelative(87.7f)
                curveToRelative(17.8f, 0f, 26.7f, 21.5f, 14.1f, 34.1f)
                lineTo(269.7f, 378.3f)
                curveToRelative(-7.5f, 7.5f, -19.8f, 7.5f, -27.3f, 0f)
                lineTo(90.1f, 226.1f)
                curveToRelative(-12.6f, -12.6f, -3.7f, -34.1f, 14.1f, -34.1f)
                horizontalLineTo(192f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                close()
                moveToRelative(296f, 376f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(376f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                horizontalLineToRelative(146.7f)
                lineToRelative(49f, 49f)
                curveToRelative(20.1f, 20.1f, 52.5f, 20.1f, 72.6f, 0f)
                lineToRelative(49f, -49f)
                horizontalLineTo(488f)
                curveToRelative(13.3f, 0f, 24f, 10.7f, 24f, 24f)
                close()
                moveToRelative(-124f, 88f)
                curveToRelative(0f, -11f, -9f, -20f, -20f, -20f)
                reflectiveCurveToRelative(-20f, 9f, -20f, 20f)
                reflectiveCurveToRelative(9f, 20f, 20f, 20f)
                reflectiveCurveToRelative(20f, -9f, 20f, -20f)
                close()
                moveToRelative(64f, 0f)
                curveToRelative(0f, -11f, -9f, -20f, -20f, -20f)
                reflectiveCurveToRelative(-20f, 9f, -20f, 20f)
                reflectiveCurveToRelative(9f, 20f, 20f, 20f)
                reflectiveCurveToRelative(20f, -9f, 20f, -20f)
                close()
            }
        }.build()
        
        return _Download!!
    }

private var _Download: ImageVector? = null

