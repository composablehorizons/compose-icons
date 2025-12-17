package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Unsubscribe: ImageVector
    get() {
        if (_Unsubscribe != null) return _Unsubscribe!!
        
        _Unsubscribe = ImageVector.Builder(
            name = "unsubscribe",
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
                moveTo(18.5f, 11.5f)
                curveToRelative(0.92f, 0f, 1.75f, 0.26f, 2.49f, 0.69f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.89f, -2f, -1.99f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(8.55f)
                curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                close()
                moveToRelative(-5.61f, -1.45f)
                curveToRelative(-0.56f, 0.28f, -1.23f, 0.28f, -1.79f, 0f)
                lineToRelative(-5.61f, -2.8f)
                curveToRelative(-0.3f, -0.15f, -0.49f, -0.46f, -0.49f, -0.8f)
                curveToRelative(0f, -0.66f, 0.7f, -1.1f, 1.29f, -0.8f)
                lineTo(12f, 8.5f)
                lineToRelative(5.71f, -2.85f)
                curveToRelative(0.59f, -0.3f, 1.29f, 0.13f, 1.29f, 0.8f)
                curveToRelative(0f, 0.34f, -0.19f, 0.65f, -0.49f, 0.8f)
                lineToRelative(-5.62f, 2.8f)
                close()
                moveTo(18.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveToRelative(2f, 3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.build()
        
        return _Unsubscribe!!
    }

private var _Unsubscribe: ImageVector? = null

