package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Upload: ImageVector
    get() {
        if (_Upload != null) return _Upload!!
        
        _Upload = ImageVector.Builder(
            name = "upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 384f)
                horizontalLineToRelative(-80f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(192f)
                horizontalLineToRelative(-87.7f)
                curveToRelative(-17.8f, 0f, -26.7f, -21.5f, -14.1f, -34.1f)
                lineTo(242.3f, 5.7f)
                curveToRelative(7.5f, -7.5f, 19.8f, -7.5f, 27.3f, 0f)
                lineToRelative(152.2f, 152.2f)
                curveToRelative(12.6f, 12.6f, 3.7f, 34.1f, -14.1f, 34.1f)
                horizontalLineTo(320f)
                verticalLineToRelative(168f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                close()
                moveToRelative(216f, -8f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 13.3f, -10.7f, 24f, -24f, 24f)
                horizontalLineTo(24f)
                curveToRelative(-13.3f, 0f, -24f, -10.7f, -24f, -24f)
                verticalLineTo(376f)
                curveToRelative(0f, -13.3f, 10.7f, -24f, 24f, -24f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 30.9f, 25.1f, 56f, 56f, 56f)
                horizontalLineToRelative(80f)
                curveToRelative(30.9f, 0f, 56f, -25.1f, 56f, -56f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(136f)
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
        
        return _Upload!!
    }

private var _Upload: ImageVector? = null

