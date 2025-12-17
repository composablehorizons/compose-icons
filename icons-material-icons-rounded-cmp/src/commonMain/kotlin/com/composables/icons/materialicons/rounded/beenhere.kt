package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Beenhere: ImageVector
    get() {
        if (_Beenhere != null) return _Beenhere!!
        
        _Beenhere = ImageVector.Builder(
            name = "beenhere",
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
                moveTo(19f, 1f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                lineTo(3f, 15.93f)
                curveToRelative(0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f)
                lineToRelative(7.57f, 5.04f)
                curveToRelative(0.34f, 0.22f, 0.77f, 0.22f, 1.11f, 0f)
                lineToRelative(7.56f, -5.04f)
                curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-0.7f, 6.7f)
                lineToRelative(-7.59f, 7.59f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineTo(5.71f, 11.7f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineTo(10f, 13.17f)
                lineToRelative(6.88f, -6.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.4f, 1.02f, 0.01f, 1.41f)
                close()
            }
        }.build()
        
        return _Beenhere!!
    }

private var _Beenhere: ImageVector? = null

